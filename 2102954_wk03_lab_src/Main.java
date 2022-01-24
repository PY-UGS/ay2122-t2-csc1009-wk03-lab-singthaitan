import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);
        double interestrate, loanamount;
        int years;
        System.out.print("Enter annual interest rate, for example, 8.25: ");
        interestrate = input.nextDouble();
        System.out.print("Enter number of years as an integer: ");
        years = input.nextInt();
        System.out.print("Enter loan amount, for example, 120000.95: ");
        loanamount = input.nextDouble();

        Loan newLoan = new Loan(interestrate,years,loanamount);
        System.out.println("The loan was created on "+ newLoan.getLoanDate());
        System.out.println("The monthly payment is " + Math.round(newLoan.getMonthlyPayment()*100.0)/100.0);
        System.out.println("The total payment is " + Math.round(newLoan.getTotalPayment()*100.0)/100.0);
    }
}
