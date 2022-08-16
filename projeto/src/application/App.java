package application;

import entities.Cliente;
import entities.Papel;

public class App {
    public static void main(String[] args) throws Exception {
        Papel vendedor = Cliente.getInstance();
        System.out.println(vendedor.getRg());
        System.out.println("Hello, World!");
    }
}
