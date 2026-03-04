package co.edu.uniquindio.Taller.NY;

import co.edu.uniquindio.Taller.IngredientesFactory;
import co.edu.uniquindio.Taller.Masa;
import co.edu.uniquindio.Taller.Queso;
import co.edu.uniquindio.Taller.Salsa;

public class IngredientesNY implements IngredientesFactory {
    @Override
    public Salsa CrearSalsa() {return new NYSalsa();}
    @Override
    public Queso CrearQueso() {return new NYQueso();}
    @Override
    public Masa CrearMasa() {return new NYMasa();}
}
