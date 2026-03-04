package co.edu.uniquindio.Taller.NY;

import co.edu.uniquindio.Taller.Salsa;

public class NYSalsa implements Salsa {
    @Override
    public String descripcion() {
        return "Salsa de Tomate";

    }
    @Override
    public double precio() {
        return 2.0;
    }
}
