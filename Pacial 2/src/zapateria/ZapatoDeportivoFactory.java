package zapateria;

public class ZapatoDeportivoFactory implements ZapatoFactory {
    @Override
    public ZapatoFormal crearZapatoFormal() {
        throw new UnsupportedOperationException("Esta fábrica no produce zapatos formales.");
    }

    @Override
    public ZapatoDeportivo crearZapatoDeportivo() {
        return new ZapatoDeportivoVerano();  // o ZapatoDeportivoInvierno
    }
}
