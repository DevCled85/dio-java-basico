public class NavegadorInternetImpl implements NavegadorInternet {
    @Override
    public void abrirNavegador() {
        System.out.println("Abrindo navegador da Internet...");
    }

    @Override
    public void navegar() {
        System.out.println("Navegando na Internet...");
    }

    @Override
    public void fecharNavegador() {
        System.out.println("Fechando navegador da Internet.");
    }
}
