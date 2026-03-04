package co.edu.uniquindio.Taller;

public class Pizza implements IngredientesFactory {
    public Pizza() {
        super();
    }

    @Override
    public Salsa CrearSalsa() {
        return null;
    }

    @Override
    public Queso CrearQueso() {
        return null;
    }

    @Override
    public Masa CrearMasa() {
        return null;
    }
}
