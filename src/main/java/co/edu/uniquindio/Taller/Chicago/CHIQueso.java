package co.edu.uniquindio.Taller.Chicago;

import co.edu.uniquindio.Taller.Queso;

public class CHIQueso implements Queso {
    @Override
    public String descripcion() {
        return "CHI QuesoCheddar";
    }
    @Override
    public double precio() {
        return 3.5;
    }
}
