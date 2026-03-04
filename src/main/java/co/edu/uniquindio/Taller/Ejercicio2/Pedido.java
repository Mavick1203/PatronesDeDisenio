package co.edu.uniquindio.Taller.Ejercicio2;

public class Pedido {
    private String platoPrincipal;
    private String entrada;
    private String postre;
    private String bebida;
    private String observaciones;

    private Pedido(Builder b) {
        this.platoPrincipal = b.platoPrincipal;
        this.entrada = b.entrada;
        this.postre = b.postre;
        this.bebida = b.bebida;
        this.observaciones = b.observaciones;
    }

    @Override
    public String toString() {
        String s = "Pedido{platoPrincipal='" + platoPrincipal + "'";

        if (entrada != null) s += ", entrada='" + entrada + "'";
        if (bebida != null) s += ", bebida='" + bebida + "'";
        if (postre != null) s += ", postre='" + postre + "'";
        if (observaciones != null) s += ", observaciones='" + observaciones + "'";

        return s + "}";
    }

    public static class Builder {
        private String platoPrincipal;
        private String entrada;
        private String postre;
        private String bebida;
        private String observaciones;

        public Builder conPlatoPrincipal(String v) {
            this.platoPrincipal = v;
            return this;
        }

        public Builder conEntrada(String v) {
            this.entrada = v;
            return this;
        }

        public Builder conPostre(String v) {
            this.postre = v;
            return this;
        }

        public Builder conBebida(String v) {
            this.bebida = v;
            return this;
        }

        public Builder conObservaciones(String v) {
            this.observaciones = v;
            return this;
        }

        public Pedido build() {
            if (platoPrincipal == null || platoPrincipal.isBlank()) {
                throw new IllegalStateException("El plato principal es obligatorio.");
            }
            return new Pedido(this);
        }
    }
}
