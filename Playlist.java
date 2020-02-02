
//Playlist.java-building playlist of music using Java ArrayList

import java.util.ArrayList;

class Playlist {
  
  public static void main(String[] args) {
    ArrayList <String> desertIslandPlaylist = new ArrayList <String> (); 
 
    desertIslandPlaylist.add("The Beatles-All You Need Is Love");
    desertIslandPlaylist.add("The Beatles-Here Comes The Sun");
    desertIslandPlaylist.add("U2-Sweetest Thing");
    desertIslandPlaylist.add("Green Day-Wake Me Up When September Ends");
    desertIslandPlaylist.add("Nirvana-Come As You Are");
    desertIslandPlaylist.add("Stone Temple Pilot-Plush");
    desertIslandPlaylist.add("Red Hot Chilli Pepper-Under The Bridge");
    System.out.println(desertIslandPlaylist);
    System.out.println(desertIslandPlaylist.size());  
    
//Remove songs until we have only
// 5 songs left.
    desertIslandPlaylist.remove("Green Day-Wake Me Up When September Ends");
    System.out.println("Current number of songs: " + desertIslandPlaylist.size());  
    desertIslandPlaylist.remove("U2-Sweetest Thing");
    System.out.println("Current number of songs: " + desertIslandPlaylist.size());
    
    //swap the order of 2 songs
    int firstIdx = desertIslandPlaylist.indexOf("The Beatles-All You Need Is Love");
    int secondIdx = desertIslandPlaylist.indexOf("Red Hot Chilli Pepper-Under The Bridge");
    String tempA = "The Beatles-All You Need Is Love";
    desertIslandPlaylist.set(firstIdx,"Red Hot Chilli Pepper-Under The Bridge");
     desertIslandPlaylist.set(secondIdx,tempA);

    //print out the playlist to check new
    //order
    System.out.println(desertIslandPlaylist);
    
}

}