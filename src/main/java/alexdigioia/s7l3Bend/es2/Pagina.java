package alexdigioia.s7l3Bend.es2;

public class Pagina implements LibroComponent {
    private final String content;

    public Pagina(String content) {
        this.content = content;
    }

    @Override
    public void stampa() {
        System.out.println("Pagina content: " + content);
    }

    @Override
    public int getNumeroPagine() {
        return 1;
    }
}
