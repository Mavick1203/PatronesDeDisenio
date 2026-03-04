package co.edu.uniquindio.Taller;

import co.edu.uniquindio.Taller.Ejercicio2.Pedido;

public class Main {
    public static void main(String[] args){
        Pedido p1 = new Pedido.Builder()
                .conPlatoPrincipal("Bandeja Paisa")
                .conEntrada("Empanadas")
                .conBebida("Jugo de lulo")
                .conPostre("Tres leches")
                .build();

        // Pedido mínimo
        Pedido p2 = new Pedido.Builder()
                .conPlatoPrincipal("Sancocho")
                .conObservaciones("Sin cilantro")
                .build();

        System.out.println(p1);
        System.out.println(p2);

        // Esto debe fallar:
        // Pedido p3 = new Pedido.Builder().conBebida("Agua").build();

    }
}
