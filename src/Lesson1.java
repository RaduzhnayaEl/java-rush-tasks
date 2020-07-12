import java.util.ArrayList;
import java.util.Scanner;

class Omovenie {
  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    String line = sc.nextLine();
    ArrayList<String> upperCaseArray = new ArrayList<>();

    String[] s = line.split(" ");

    for (int i = 0; i < s.length; i++) {
      if (s[i].length() > 0) {
        String iUpperCase = s[i].substring(0, 1).toUpperCase() + s[i].substring(1);
        upperCaseArray.add(iUpperCase);
      }

    }
    String joinedString = String.join(" ", upperCaseArray);
    System.out.println(joinedString);

  }
}
