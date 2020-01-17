//Magic.java program that will only give the same result
//even if the original number is changed.
//part of Web Dev Track/Codecademy

public class Magic {
	public static void main(String[] args) {
  int myNumber = 20;
	//myNumber will be refered to as the original number
  int stepOne = myNumber*myNumber;
  int stepTwo = stepOne+myNumber;
  int stepThree = stepTwo/myNumber;
  int stepFour = stepThree+17;
  int stepFive = stepFour - myNumber;
  int stepSix = stepFive/6;
  System.out.println(stepSix);


	}
}