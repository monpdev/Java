//FizzBuzz.java prints Fizz for multiples of 3
//prints Buzz for multiples of 5
//prints FizzBuzz for multiples of 5 &3
//part of java course/Codecademy

class FizzBuzz{
  public static void main(String[] args){
    for(int i = 1; i <= 100; i++){
    if(i%3 == 0 && i%5 == 0){
      System.out.println("FizzBuzz");
    } else if(i%5 == 0){
      System.out.println("Buzz");
    } else if(i%3 == 0 ){
      System.out.println("Fizz");
    }else{
      System.out.println(i);
    }
  }
  
}
}