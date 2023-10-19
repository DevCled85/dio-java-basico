package aprovacao;

public class PurchaseRequest {
    private int requestNumber;
    private double amount;

    public PurchaseRequest(int requestNumber, double amount) {
        this.requestNumber = requestNumber;
        this.amount = amount;
    }

    public int getRequestNumber() {
        return requestNumber;
    }

    public double getAmount() {
        return amount;
    }
}
