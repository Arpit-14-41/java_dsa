import java.util.*;
public class q1 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        try {
            System.out.println("Enter your lucky number:");
            int num = obj.nextInt();

           
            if (num < 0) {
                throw new NumberFormatException("Negative number not allowed");
            }
            System.out.println("Lucky number is: " + num);

        } catch (NumberFormatException e) {
            System.out.println("Exception: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input! Please enter a valid number.");
        }
        obj.close();
    }
}