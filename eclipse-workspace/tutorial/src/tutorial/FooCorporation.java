package tutorial;

public class FooCorporation {
    public static void main(String[] arguments) {
        double basePay = 10;
        double hoursWorked = 73;
        double finalPay = 0;
        if (basePay<8) {
            System.out.println("Base pay is too low");
        } else if(hoursWorked>60) {
            System.out.println("Too many hours entered");
        } else if(hoursWorked>40) {
            finalPay = hoursWorked*basePay + 0.5*(hoursWorked-40)*basePay;
            System.out.println("Final pay = " + finalPay);
        } else {
            finalPay = hoursWorked*basePay;
            System.out.println("Final pay = " + finalPay);
        }
        
    }
}
