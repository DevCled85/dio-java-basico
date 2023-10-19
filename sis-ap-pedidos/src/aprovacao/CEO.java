package aprovacao;

public class CEO implements Approver {
    @Override
    public void setNextApprover(Approver nextApprover) {
        // O CEO é o último na cadeia e não tem um próximo aprovador.
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        System.out.println("CEO approves purchase request #" + request.getRequestNumber());
    }
}
