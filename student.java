import java.util.*;
public class student {
    public static void main(String[] args) {
        Scanner obj= new Scanner(System.in);
        System.out.println("enter the marks:");
        int m=obj.nextInt();
        System.out.println("enter the name:");
        String n=obj.next();
        try {
            if (m>100) {
                throw new MarksOutOfBoundException("mark is out of the range");
            } else {
                System.out.println("name:"+n);
                System.out.println("marks:"+m);
            }           
        } catch (MarksOutOfBoundException e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }
    }
}
class MarksOutOfBoundException extends Exception {
    public MarksOutOfBoundException(String msg) {
        super(msg);
    }
}

