
/*NadLibs.java --practice using variables in Java. Part of Codecademy Java course. */

public class MadLibs {
  /*
  MadLibs.java--generates a mad
  libbed story.
  */
  	public static void main(String[] args){
      String name1 = "Jack";
      String adjective1 = "lovely",adjective2 = "lively",adjective3 = "beautiful";
      String verb1 = "read";
      String noun1 = "book",noun2 = "country",noun3 = "restaurant",noun4 = "coffee", noun5 = "tea", noun6 = "milk";
      String name2 = "Jill";
      int number = 7;
      String place1 = "New York";

      //The template for the story
      String story = "This morning "+name1+" woke up feeling "+adjective1+". 'It is going to be a "+adjective2+" day!' Outside, a bunch of "+noun1+"s were protesting to keep "+noun2+" in stores. They began to "+verb1+" to the rhythm of the "+noun3+", which made all the "+noun4+"s very "+adjective3+". Concerned, "+name1+" texted "+name2+", who flew "+name1+" to "+place1+" and dropped "+name1+" in a puddle of frozen "+noun5+". "+name1+" woke up in the year "+number+", in a world where "+noun6+"s ruled the world.";
      System.out.println(story);
    }       
}

