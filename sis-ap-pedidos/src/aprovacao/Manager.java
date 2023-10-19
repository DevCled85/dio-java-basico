package aprovacao;

public class Manager implements Approver {
    private Approver nextApprover;

    @Override
    public void setNextApprover(Approver nextApprover) {
        this.nextApprover = nextApprover;
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        if (request.getAmount() <= 1000) {
            System.out.println("Manager approves purchase request #" + request.getRequestNumber());
        } else if (nextApprover != null) {
            nextApprover.processRequest(request);
        }
    }
}
