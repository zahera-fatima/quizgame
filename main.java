import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        //void Score ()

            int count = 0;
            Scanner scan = new Scanner(System.in);
            System.out.println("How many months have 28 days?");
            String in = scan.nextLine();
            if (in.equalsIgnoreCase("all")) {
                System.out.println("correct");
                count++;
            } else {
                System.out.println("incorrect");
            }
            System.out.println("What does come down but never goes up?");
            in = scan.nextLine();
            if (in.equalsIgnoreCase("Rain")) {
                System.out.println("correct");
                count++;
            } else {
                System.out.println("incorrect");
            }
            System.out.println("What is middle of Paris?");
            in = scan.nextLine();
            if (in.equalsIgnoreCase("r")) {
                System.out.println("correct");
                count++;
            } else {
                System.out.println("incorrect");
            }
            System.out.println("Divide 30 by half and add 10. what ia the answer?");
            in = scan.nextLine();
            if (in.equalsIgnoreCase("70")) {
                System.out.println("correct");
                count++;
            } else {
                System.out.println("incorrect");
            }
            System.out.println("Mary's father has 5 daughters:1.nana, 2. nene, 3. nini, 4. nono. What is the name of the fifth daughter?");
            in = scan.nextLine();
            if (in.equalsIgnoreCase("Mary")) {
                System.out.println("correct");
                count++;
            } else {
                System.out.println("incorrect");
            }
        System.out.println("Your Score is " +count);
            if (count==5){
                System.out.println("YOU WON... ");
            }
            else {
                System.out.println("GOOD TRY.... TRY LATER!!!!");
            }
    }
}


