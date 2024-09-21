package zapateria;

public class ZapatoFormalFactory implements ZapatoFactory {
    @Override
    public ZapatoFormal crearZapatoFormal() {
        return new ZapatoFormalInvierno();  // o ZapatoFormalVerano
    }

    @Override
    public ZapatoDeportivo crearZapatoDeportivo() {
        throw new UnsupportedOperationException("Esta fábrica no produce zapatos deportivos.");
    }

}
