class FeeAcc {
    void processPayment(FeeAcc account, double amount) {
        if (account instanceof HostelFeeAccount) {
            System.out.println("Paid in two installments (hostel account)");
        }
        else {
            System.out.println("Paid in one go (day-scholar account)");
        }
    }
}
class HostelFeeAccount extends FeeAcc {
}
public class question5 {
    public static void main(String[] args) {
        FeeAcc[] accounts = {
                new HostelFeeAccount(),
                new HostelFeeAccount(),
                new FeeAcc(),
                new FeeAcc()
        };
        double amount = 60000;
        int hostelCount = 0;
        int dayScholarCount = 0;
        FeeAcc processor = new FeeAcc();
        for (FeeAcc account : accounts) {
            processor.processPayment(account, amount);
            if (account instanceof HostelFeeAccount) {
                hostelCount++;
            }
            else {
                dayScholarCount++;
            }
        }
        System.out.println(
                "Hostel accounts processed: " + hostelCount +
                        " | Day-scholar accounts processed: " + dayScholarCount
        );
    }
}