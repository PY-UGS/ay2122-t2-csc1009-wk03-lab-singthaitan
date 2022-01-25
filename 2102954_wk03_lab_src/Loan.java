import java.util.Date;

public class Loan {
    private double annualInterestRate = 2.5; //The annual interest rate of the loan (default:2.5)
    private int numberOfYears = 1; //The number of years for the loan (default:1)
    private double loanAmount = 1000; // The loan amount (default:1000)
    private Date loanDate = new Date(); // The date this loan was created

    //Constructs a default Loan object
    public Loan()
    {

    }
    //Constructs a loan with specified interest rate, years, and loan amount
    public Loan(double annualInterestRate, int numberOfYears, double loanAmount)
    {
        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = numberOfYears;
        this.loanAmount = loanAmount;
    }
    //Returns the annual interest rate of this loan.
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }
    //Returns the number of years of this loan
    public int getNumberOfYears() {
        return numberOfYears;
    }
    //Returns the amount of this loan
    public double getLoanAmount() {
        return loanAmount;
    }
    //Returns the date of creation of this loan
    public Date getLoanDate() {
        return loanDate;
    }
    //Sets a new annual interest rate for this loan
    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }
    //Sets a new number of years for this loan
    public void setNumberOfYears(int numberOfYears) {
        this.numberOfYears = numberOfYears;
    }
    //Sets a new amount for this loan
    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }
    //Returns the monthly payment for this loan
    public double getMonthlyPayment()
    {
        double annualRate = getAnnualInterestRate()/100;

        double monthlyInterestRate = annualRate / 12.0;

        double loanAmount = getLoanAmount();
        int years = getNumberOfYears();
        // The Math.pow() method is used calculate values raised to a power

        double monthlyPayment = (loanAmount*monthlyInterestRate) / (1- (Math.pow(1+monthlyInterestRate, (years*-12))));

        return monthlyPayment;
    }
    //Returns the total payment for this loan
    public double getTotalPayment()
    {
        double totalPayment = getMonthlyPayment() * this.numberOfYears * 12;
        return totalPayment;
    }
}
