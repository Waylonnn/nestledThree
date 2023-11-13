import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double degreeF;
        double degreeC;
        int sent;
        int sentt;
        String cont;
        Scanner scan = new Scanner(System.in);
        do  {
            sentt = 0;
            sent = 0;
            System.out.println("Enter A Degree Amount in Celsius:");
            degreeC = scan.nextInt();
            degreeF = (9/5) * degreeC + 32;
            System.out.println("Degrees in Fahrenheit: " + degreeF);
            while(sentt == 0){
                System.out.println("Would you like to enter another degree? (Y/N to quit)");
                cont = scan.nextLine();
                if (cont.equalsIgnoreCase("N")) {
                    sent = 1;
                    sentt = 1;
                } else if (cont.equalsIgnoreCase("Y")){
                    sentt = 1;
                } else{
                    System.out.println("Invalid Input.");
                }
            }
        } while (sent == 0);
    }
}