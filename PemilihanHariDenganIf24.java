import java.util.Scanner;

    public class PemilihanHariDenganIf24 {
        public static void main (String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.print("Input number (1-7): ");
            int number = sc.nextInt();

            if (number >= 1 && number <= 5) {
                System.out.println("Weekday");
            } else if (number == 6 || number == 7) {
                System.out.println("Weekday");
            } else {
                System.out.println("Invalid Number");
    
        
            }

        }
    
}
