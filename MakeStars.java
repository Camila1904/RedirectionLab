import java.util.Scanner;
public class MakeStars {
  public static void main (String[]args) {
    //use the standard input (terminal input)
     //as the string that you read from
    Scanner n = new Scanner(System.in);
    while (n.hasNextLine()) {
      String line = n.nextLine();
      for (int i=0; i<line.length();i++) {
        if (line.charAt(i)!= ' ') {
          System.out.println('*');
        }
        else {
          System.out.println(' ');
        }
      }
      System.out.println();
    }
  }
}
