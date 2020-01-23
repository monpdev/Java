//Calculator.java
//Basic calculator to calculate 
//add, subtract, multiply, divide, modulo
//for integers

public class Calculator{
  
  public Calculator(){
    
  }
  
  public int add(int a,int b){
    return a+b;
  }
  
  public int subtract(int a,int b){
    return a-b;
  }
  
  public int multiply(int a, int b){
    return a*b;
  }
  
  public int divide(int a, int b){
    return a/b;
  }
    
  public int modulo(int a, int b){
    return a%b;
  }
  
  public static void main(String[] args){
    Calculator myCalculator = new Calculator();
    System.out.println("5+7 = " + myCalculator.add(5,7));
     System.out.println("45-11 = " + myCalculator.subtract(45,11));
     System.out.println("20x3 = " + myCalculator.multiply(20,3));
     System.out.println("20/3 = " + myCalculator.divide(20,3));
     System.out.println("20%3 = " + myCalculator.modulo(20,3));
    
    
  }


}