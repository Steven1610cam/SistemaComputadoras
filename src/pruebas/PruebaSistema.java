package pruebas;

import modelo.Computadora;
import modelo.SistemaOperativo;
import modelo.Usuario;

public class PruebaSistema {
    public static void main(String[] args) {
        
        System.out.println("Código: 7502410019 - Nombre: Daniel Steven Arroyo Flórez");
        System.out.println("******************************");
        
        
        SistemaOperativo so1 = new SistemaOperativo("Windows", "10", "Microsoft");
        SistemaOperativo so2 = new SistemaOperativo("Ubuntu", "22.04", "Canonical");

        
        Computadora comp1 = new Computadora();
        comp1.setMarca("Dell");
        comp1.setModelo("XPS 13");
        comp1.setProcesador("Intel i7");
        comp1.setSistemaOperativo(so1);
        
        Computadora comp2 = new Computadora("Apple", "MacBook Pro", "M1", so2);
        
        
        Usuario user1 = new Usuario("Daniel Steven Arroyo Flórez", "darroyof@unicartagena.edu.co", "password123");

        
        System.out.println(user1);
        System.out.println(comp1);
        System.out.println(comp2);
    }
}
