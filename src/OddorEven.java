import java.util.Scanner;
public class OddorEven {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int number = Integer.parseInt(sc.nextLine());

        if(number % 2 == 0){
            System.out.println("Entered Number is a Even Number:" + number);
        }
        else
        {
            System.out.println("Entered Number is a Odd Number:" + number);
        }

    }
}
