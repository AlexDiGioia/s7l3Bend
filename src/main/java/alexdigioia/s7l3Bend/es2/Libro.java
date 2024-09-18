package alexdigioia.s7l3Bend.es2;

import java.util.ArrayList;
import java.util.List;

public class Libro {
    private String title;
    private List<String> authors;
    private double prezzo;
    private List<LibroComponent> components;

    public Libro(String title, List<String> authors, double prezzo) {
        this.title = title;
        this.authors = authors;
        this.prezzo = prezzo;
        this.components = new ArrayList<>();
    }

    public void addComponent(LibroComponent component) {
        components.add(component);
    }

    public void removeComponent(LibroComponent component) {
        components.remove(component);
    }

    public void print() {
        System.out.println("Libro: " + title);
        System.out.println("Autori: " + String.join(", ", authors));
        System.out.println("Prezzo: " + prezzo);
        for (LibroComponent component : components) {
            component.stampa();
        }
    }

    public int getNumberOfPages() {
        int totalPages = 0;
        for (LibroComponent component : components) {
            totalPages += component.getNumeroPagine();
        }
        return totalPages;
    }
}