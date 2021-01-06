import java.util.Scanner;
public class PigLatin {
  public static String pigLatinSimple(String s) {
    if (s.charAt(0) == 'a' || s.charAt(0) == 'e' ||s.charAt(0) == 'i' ||s.charAt(0) == 'o' ||s.charAt(0) == 'u') {
      return (s + "hay");
    }
    else {
      return (s.substring(1) + s.substring(0,1) + "ay");
    }
  }
  public static String pigLatin(String s) {
    String diagraphs[] = {"bl", "br", "ch", "ck", "cl", "cr", "dr", "fl", "fr", "gh", "gl", "gr", "ng", "ph", "pl", "pr", "qu", "sc", "sh", "sk", "sl", "sm", "sn", "sp", "st", "sw", "th", "tr", "tw", "wh", "wr"};
    for (int i=0; i<diagraphs.length;i++) {
      if ((s.length() >1) && (s.substring(0,2).equals(diagraphs[i]))){
        return (s.substring(2) + diagraphs[i] + "ay");
      }
    }
    if (s.charAt(0) == 'a' || s.charAt(0) == 'e' ||s.charAt(0) == 'i' ||s.charAt(0) == 'o' ||s.charAt(0) == 'u') {
      return (s + "hay");
    }
    else {
      return (s.substring(1) + s.substring(0,1) + "ay");
    }
  }
  public static String pigLatinBest(String s) {
    s = s.toLowerCase();
    if (!Character.isAlphabetic(s.charAt(0))) {
      return s;
    }
    if (!Character.isAlphabetic(s.charAt(s.length()-1))) {
      return pigLatin(s.substring(0,s.length()-1)) + s.charAt(s.length()-1);
    }
    else {
      return pigLatin(s);
    }
  }
  public static void main(String[]args) {
    Scanner n = new Scanner(System.in);
    while (n.hasNextLine()) {
      String line = n.nextLine();
      String word[] = line.split(" ");
      for (int i=0;i<word.length;i++) {
        System.out.print(pigLatinBest(word[i]) + ' ');
      }
      System.out.println();
    }
  }
  //public static void main(String[] args) {
    //System.out.println(PigLatin.pigLatinSimple("mock"));
    //System.out.println(PigLatin.pigLatinSimple("pie"));
    //System.out.println(PigLatin.pigLatinSimple("david"));
    //System.out.println(PigLatin.pigLatinSimple("aaron"));
    //System.out.println(PigLatin.pigLatin("the"));
    //System.out.println(PigLatin.pigLatin("check"));
    //System.out.println(PigLatin.pigLatin("skies"));
    //System.out.println(PigLatin.pigLatin("emu"));
    //System.out.println(PigLatin.pigLatin("grade"));
    //System.out.println(PigLatin.pigLatinBest("*emu"));
    //System.out.println(PigLatin.pigLatinBest("4chan"));
    //System.out.println(PigLatin.pigLatinBest("fish!"));
    //System.out.println(PigLatin.pigLatinBest("the."));
    //System.out.println(PigLatin.pigLatinBest("amazing%"));
  //}
}
