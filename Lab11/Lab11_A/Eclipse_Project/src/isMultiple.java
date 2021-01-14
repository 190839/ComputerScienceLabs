import java.util.*;
import java.util.ArrayList;

class isMultiple{

  public static void isMultiple(){
    
  }

  public static boolean isMultiple(int first){
    boolean isMultipleNum;
    if (first%2 == 0){
      isMultipleNum = true;
    }else{
      isMultipleNum = false;
    }

    return isMultipleNum;
  }

  public static boolean isMultiple(int first, int second){
    boolean isMultipleNum;
    if (first%second == 0){
      isMultipleNum = true;
    }else{
      isMultipleNum = false;
    }

    return isMultipleNum;
  }




}