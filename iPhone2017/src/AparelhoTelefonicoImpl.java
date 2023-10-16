public class AparelhoTelefonicoImpl implements AparelhoTelefonico {
    @Override
    public void fazerLigacao() {
        System.out.println("Realizando ligação...");
    }

    @Override
    public void enviarMensagem() {
        System.out.println("Enviando mensagem de texto...");
    }

    @Override
    public void receberChamada() {
        System.out.println("Recebendo chamada telefônica...");
    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo mensagem de texto...");
    }
}
