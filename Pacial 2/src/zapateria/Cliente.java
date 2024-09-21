package zapateria;

public class Cliente { private ZapatoFactory fabrica;

    public Cliente(ZapatoFactory fabrica) {
        this.fabrica = fabrica;
    }

    public void crearZapatos() {
        ZapatoFormal zapatoFormal = fabrica.crearZapatoFormal();
        if (zapatoFormal != null) {
            zapatoFormal.descripcion();
        }

        ZapatoDeportivo zapatoDeportivo = fabrica.crearZapatoDeportivo();
        if (zapatoDeportivo != null) {
            zapatoDeportivo.descripcion();
        }
    }
}
