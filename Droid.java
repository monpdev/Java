//Droid.java using java class
//objec and method concept to
//create robot (Droid)
//part of Codecademy JAVA course
public class Droid{
  int batteryLevel;
  String name;
  
  public void energyReport(){
   System.out.println("Batter Level of "+ name +" is "+batteryLevel) ;
  }
  
  public String toString(){
    return "Hello, I am the droid:" + name+".";
  }
  
  public void performTask(String task){
    System.out.println(name+ " is performing task:"+task);
    batteryLevel = batteryLevel-10;
  }
  
  public Droid(String droidName){
    name = droidName;
    batteryLevel = 100;
  }
  
  public static void main(String[] args){
    Droid Codey = new Droid("Codey");
    Droid Margot = new Droid("Margot");
    System.out.println(Codey.batteryLevel);
    Codey.performTask("Run");
    Margot.performTask("Talk");
   Codey.energyReport();
    Margot.energyReport();
  }
  
}