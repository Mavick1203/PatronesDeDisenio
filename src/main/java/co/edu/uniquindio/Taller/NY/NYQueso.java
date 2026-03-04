package co.edu.uniquindio.Taller.NY;

import co.edu.uniquindio.Taller.Queso;

public class NYQueso implements Queso {
    @Override
    public String descripcion() {
        return "NYQueso Mozarella";
    }
    @Override
    public double precio() {
        return 3.0;
    }
}
