package aprovacao;

public class Director implements Approver {
    private Approver nextApprover;

    @Override
    public void setNextApprover(Approver nextApprover) {
        this.nextApprover = nextApprover;
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        if (request.getAmount() <= 5000) {
            System.out.println("Director approves purchase request #" + request.getRequestNumber());
        } else if (nextApprover != null) {
            nextApprover.processRequest(request);
        }
    }
}
