package co.edu.uniquindio.Taller.NY;

import co.edu.uniquindio.Taller.Masa;

public class NYMasa implements Masa {
    @Override
    public String descripcion() {
        return "NY Masa Fina";
    }
    @Override
    public double precio() {
        return 4.0;
    }
}
