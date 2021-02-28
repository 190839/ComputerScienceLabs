
class loadingAnimation{

  public static void start(int ms){
    if (ms<1000){
      ms = 1000;
    }
    int s = ms/1000;
    for (int i=0; i<s; i++){
      System.out.print(" [/]\r");
      functions.wait(250);
      System.out.print(" [|]\r");
      functions.wait(250);
      System.out.print(" [\\]\r");
      functions.wait(250);
      System.out.print(" [-]\r");
      functions.wait(250);
    }
    System.out.print("      \r");
  }



}