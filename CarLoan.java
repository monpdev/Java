//program that calculates
//the monthly car payment
//a user should expect to make 
//after taking out a car loan
//part of codecademy java course
public class CarLoan {
	public static void main(String[] args) {
  int carLoan = 10000;
  //loan length = 3 yrs
  int loanLength = 3;
  //interest rate 5 percent per year
  int interestRate = 5;
  //down payment provided by a user
  int downPayment = 2000;
  
  if(loanLength <= 0 || interestRate <= 0){
    System.out.println("Error! You must take out a valid car loan.");
  } else if(downPayment >= carLoan){
    System.out.println("Down payment should be less than car loan.");
  } else{
    int remainingBalance = carLoan - downPayment;
    //monthly payment
    int months = loanLength*12;
    //monthly payment without interest included
    int monthlyBalance = remainingBalance/months;
    //interest the user needs to pay on the loan borrowed
    int interest = monthlyBalance/100;
    //final monthly payment
    int monthlyPayment = monthlyBalance +interest;
    System.out.println("Monthly Payment: " + monthlyPayment);
    
    
    
  }
	

	}
}