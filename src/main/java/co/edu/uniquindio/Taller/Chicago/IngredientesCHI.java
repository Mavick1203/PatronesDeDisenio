package co.edu.uniquindio.Taller.Chicago;

import co.edu.uniquindio.Taller.IngredientesFactory;
import co.edu.uniquindio.Taller.Masa;
import co.edu.uniquindio.Taller.Queso;
import co.edu.uniquindio.Taller.Salsa;

public class IngredientesCHI implements IngredientesFactory {
    @Override
    public Salsa CrearSalsa() {return new CHISalsa();}
    @Override
    public Queso CrearQueso() {return new CHIQueso();}
    @Override
    public Masa CrearMasa() {return new CHIMasa();}
}

