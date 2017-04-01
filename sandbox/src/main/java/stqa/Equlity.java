package stqa;

/**
 * Created by tatyanas on 4/1/17.
 */
public class Equlity {
  public static void main(String[] args){
    String s1 = "firefox";
    String s2 = new String((s1));

    System.out.println(s1 == s2);
    System.out.println(s1.equals(s2));
  }
}
