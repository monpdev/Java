class Language{
  protected String name;
  protected int numSpeakers;
  protected String regionsSpoken;
  protected String wordOrder;
  
  //Language.java --Build a model to track inherited traits across families
  //Part of java course/codecademy
  
  //constructor
  Language(String langName,int speakers, String regions, String wdOrder){
    this.name = langName;
    this.numSpeakers = speakers;
    this.regionsSpoken = regions;
    this.wordOrder = wdOrder;
  }
  
  //getInfo() method
  public void getInfo(){
    System.out.println(this.name +" is spoken by "+ this.numSpeakers+ " people mainly in "+ this.regionsSpoken + ". The langauge follows the word order: "+ this.wordOrder);
    
  }
  
  
  public static void main(String[] args){
    Language spanish = new Language("Spanish",555000000,"Spain, Latin America, and Equatorial Guinea","subject-verb-object");
    spanish.getInfo();
    
    Mayan tzotzil = new Mayan("Tzotzil",400000);
    tzotzil.getInfo();
    
    SinoTibetan mandarin = new SinoTibetan("Mandarin Chinese", 1110000000);
    mandarin.getInfo();
    
    SinoTibetan burmese = new SinoTibetan("Burmese",43000000);
    burmese.getInfo();
    
  }
}