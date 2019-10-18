
public class PayDay
{
    // instance variables - replace the example below with your own
    private String name;
    private double payRate;
    private double deduction;
    private double hoursWorked;
    private double grossPay;
    private double deductedAmt;
    private double netPay;
    private String output;

    /**
     * Constructor for objects of class PayDay
     */
    public PayDay()
    {
        // initialise instance variables
        output = "";
        name = "";
        payRate = 0.00;
        deduction = 0.00;
        hoursWorked = 0.00;
        grossPay = 0.00;
        deductedAmt = 0.00;
        netPay = 0.00;
        
    }

  
    public String payDay(String name, double payRate, double hoursWorked, double deduction)
{
        // put your code here
        grossPay = hoursWorked * payRate;
        deductedAmt = deduction * grossPay;
        netPay = grossPay - deductedAmt;
        output = name + " ";
        output = output + String.format("%.2f", grossPay) + " ";
        output = output + String.format("%.2f", deductedAmt) + " ";
        output = output + String.format("%.2f", netPay);
        return output;
}  
}
