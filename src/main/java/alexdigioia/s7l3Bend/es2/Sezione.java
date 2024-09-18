package alexdigioia.s7l3Bend.es2;

import java.util.ArrayList;
import java.util.List;

public class Sezione implements LibroComponent {
    private final String title;
    private final List<LibroComponent> components = new ArrayList<>();

    public Sezione(String title) {
        this.title = title;
    }

    public void addComponent(LibroComponent component) {
        components.add(component);
    }

    public void removeComponent(LibroComponent component) {
        components.remove(component);
    }

    @Override
    public void stampa() {
        System.out.println("Sezione: " + title);
        for (LibroComponent component : components) {
            component.stampa();  // Stampa tutti i componenti della sezione
        }
    }

    @Override
    public int getNumeroPagine() {
        int totalPages = 0;
        for (LibroComponent component : components) {
            totalPages += component.getNumeroPagine();
        }
        return totalPages;
    }
}