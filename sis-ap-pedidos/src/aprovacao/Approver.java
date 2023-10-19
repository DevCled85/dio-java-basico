package aprovacao;

public interface Approver {
    void setNextApprover(Approver nextApprover);
    void processRequest(PurchaseRequest request);
}
