public class Main {
    public static void main(String[] args) {
        iPhone2017 iphone = new iPhone2017("iPhone 2017", 64, 128);

        // Demonstrando funcionalidades do Reprodutor Musical
        if (iphone instanceof ReprodutorMusical) {
            ReprodutorMusical reprodutor = (ReprodutorMusical) iphone;
            reprodutor.reproduzirMusica();
            reprodutor.pausarMusica();
            reprodutor.avancarMusica();
            reprodutor.retrocederMusica();
        }

        // Demonstrando funcionalidades do Aparelho Telefônico
        if (iphone instanceof AparelhoTelefonico) {
            AparelhoTelefonico telefone = (AparelhoTelefonico) iphone;
            telefone.fazerLigacao();
            telefone.enviarMensagem();
            telefone.receberChamada();
            telefone.receberMensagem();
        }

        // Demonstrando funcionalidades do Navegador na Internet
        if (iphone instanceof NavegadorInternet) {
            NavegadorInternet navegador = (NavegadorInternet) iphone;
            navegador.abrirNavegador();
            navegador.navegar();
            navegador.fecharNavegador();
        }
    }
}
