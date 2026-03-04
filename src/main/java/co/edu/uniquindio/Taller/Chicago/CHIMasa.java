package co.edu.uniquindio.Taller.Chicago;

import co.edu.uniquindio.Taller.Masa;

public class CHIMasa implements Masa {
    @Override
    public String descripcion() {
        return "CHI Masa Gruesa";
    }
    @Override
    public double precio() {
        return 5.0;
    }
}
