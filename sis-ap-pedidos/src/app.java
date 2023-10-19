import aprovacao.Approver;
import aprovacao.CEO;
import aprovacao.Director;
import aprovacao.Manager;
import aprovacao.PurchaseRequest;

public class app {
     public static void main(String[] args) {
        Approver manager = new Manager();
        Approver director = new Director();
        Approver ceo = new CEO();

        manager.setNextApprover(director);
        director.setNextApprover(ceo);

        PurchaseRequest request1 = new PurchaseRequest(1, 500);
        PurchaseRequest request2 = new PurchaseRequest(2, 3500);
        PurchaseRequest request3 = new PurchaseRequest(3, 10000);

        manager.processRequest(request1);
        manager.processRequest(request2);
        manager.processRequest(request3);
    }
}
