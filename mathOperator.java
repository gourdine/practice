/******************************************************************************************************

Write a function that takes three Integer numbers Number1, Number2, and Number3, and
determines if there is a mathematical operation that will make Number1 (operation) Number2
equal to Number3. If one or more of the 4 common mathematical operations (+,-,*,/) can
complete the function, return the String representation of the mathematical function. If none of
the 4 mathematical operations can make the statement true, return the String "None".

Author: Kareem Gourdine

*******************************************************************************************************/

public class Main {
  static String mathOperator(int x, int y, int z) {
    if(x + y == z) { 
        if (x * y == z) 
            return "+*";
    return "+";
    }
    if(x * y == z) 
        return  "*";
    if(x - y == z)
        return "-";
    if( x / y == z)
        return "/";
    return "None";
  }

  public static void main(String[] args) {
    String test1, test2, test3, test4, test5, test6;
    test1 = mathOperator(1,2,3);
    test2 = mathOperator(2,2,4);
    test3 = mathOperator(3,-3,-9);
    test4 = mathOperator(1,2,-1);
    test5 = mathOperator(3,3,1);
    test6 = mathOperator(7,1,11);
    
    System.out.println(test1);
    System.out.println(test2);
    System.out.println(test3);
    System.out.println(test4);
    System.out.println(test5);
    System.out.println(test6);
  }
}
