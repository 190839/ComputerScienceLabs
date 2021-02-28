class Main {
  public static void main(String[] args) {


    array test = new array(3);

    System.out.println(test.output());


  }
}



class array{

  private static String[] words = {"One", "Two", "Three", "Four", "Five"};
  private static int l = words.length;
  private static String chosen;

  public static void array(){

  }

  public array(int x){
    for (int i=0; i<l; i++){
      try{
        if (x==(i+1)){
          chosen = words[i];
        }
      }catch(Exception e){
        System.out.println("\n\nInvalid Number\n\n");
        chosen = "Inavlid Number";
      }
    }
    output();
  }

  public static String output(){
    String y = chosen;
    return y;
  }




}