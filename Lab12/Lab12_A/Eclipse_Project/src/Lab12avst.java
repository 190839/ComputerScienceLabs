// Lab12avst.java     This is the student starting version.
// This assignment pertains to some of the "Magpie" AP Lab Materials
//***************************************************************************
// The "Magpie" AP Lab is created for the College Board APCS
// curriculum by Laurie White.
// Leon Schram has altered some of the "Magpie" files to focus on 
// specific CS topics as the "Magpie" Lab is integrated into the curriculum.

 
import java.util.Scanner;
import java.util.ArrayList;

public class Lab12avst
{
	public static void main(String[] args)
	{
		MagpieLab12a maggie = new MagpieLab12a();

		System.out.println (maggie.getGreeting());
		Scanner in = new Scanner (System.in);
		String statement = in.nextLine();

		while (!statement.equals("Bye"))
		{
			System.out.println (maggie.getResponse(statement));
			statement = in.nextLine();
		}
	}
}


class MagpieLab12a
{
	public String getGreeting()
	{
		return "Hello, let's talk.";
	}
	
	////////////////////////////////////////////////////////

	public String getResponse(String statement)
	{
		final ArrayList<String> FamilyResponses = new ArrayList<String>();
		FamilyResponses.add("Tell me more about your family.");
		FamilyResponses.add("Do have a brother?");
		FamilyResponses.add("Do you have a sister?");
		FamilyResponses.add("What is your father's name?");
		FamilyResponses.add("What is your mother name?");					//5
		FamilyResponses.add("How many people are in your family?");
		FamilyResponses.add("Do you have any cousins?");
		FamilyResponses.add("Where is your family from?");
		FamilyResponses.add("What's your last name?");
		FamilyResponses.add("What's your favourite family activity?");		//10
		FamilyResponses.add("I have a big family too. Mom & Dad AI have been great so far :)");
		
		String response = "";
		if (statement.indexOf("no") >= 0)
		{
			response = "Why so negative?";
		}
		else if (statement.indexOf("mother") >= 0
				|| statement.indexOf("father") >= 0
				|| statement.indexOf("sister") >= 0
				|| statement.indexOf("brother") >= 0
				|| statement.indexOf("family") >= 0
				|| statement.indexOf("parent") >= 0)
		{
			final int NUMBER_OF_RESPONSES = FamilyResponses.size();
			double r = Math.random();
			int whichResponse = (int)(r * (NUMBER_OF_RESPONSES));
			
			response = FamilyResponses.get(whichResponse);
			}
		else
		{
			response = getRandomResponse();
		}
		return response;
	}
	
	/////////////////////////////////////////////////////////

	private String getRandomResponse()
	{
		
		String[] RandResponses = new String[]{
			"Interesting, tell me more.",
			"Hmmm.",
			"Do you really think so?",
			"You don't say.",
			"Ok.",											//5
			"Do you like board games?",
			"Have you ever built a computer before?",
			"What kind of watch do you wear most often?",
			"How is your day so far?",
			"Do you have a favourite pen?\nMine is the Cross Century II folowed closely by\nthe Baron Fig Squire."
		};
		
		final int NUMBER_OF_RESPONSES = RandResponses.length;
		double r = Math.random();
		int whichResponse = (int)(r * (NUMBER_OF_RESPONSES));
		String response = "";
		
		response = RandResponses[whichResponse];
	
		
		return response;
	}
}
