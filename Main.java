import java.util.Scanner;
/**
 *
 * @jacoe0850 
 */
public class Main {

  public static void main(String[] args) {
   // make scanner for input
    Scanner input = new Scanner(System.in);
    // ask for intergers
    System.out.println("Please enter three integers on separate lines");
    int num = input.nextInt();
    int num1 = input.nextInt();
    int num2 = input.nextInt();
    // decides maximum number
    if(num >= num && num >= num2){
      System.out.println("Maximum:" + " " + num);
    } else if(num1 >= num && num1 >= num2){
    System.out.println("Maximum: " + " " + num1);
  } else if(num2 >= num && num2 >= num1){
  System.out.println("Maximum" + " " + num2);
}

  }
}
