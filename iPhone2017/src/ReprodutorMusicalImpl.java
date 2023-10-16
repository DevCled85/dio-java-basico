public class ReprodutorMusicalImpl implements ReprodutorMusical {
    @Override
    public void reproduzirMusica() {
        System.out.println("Reproduzindo música...");
    }

    @Override
    public void pausarMusica() {
        System.out.println("Música pausada.");
    }

    @Override
    public void avancarMusica() {
        System.out.println("Avançando para a próxima música.");
    }

    @Override
    public void retrocederMusica() {
        System.out.println("Retrocedendo para a música anterior.");
    }
}
