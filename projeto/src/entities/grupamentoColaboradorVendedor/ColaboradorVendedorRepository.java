package entities.grupamentoColaboradorVendedor;

import java.io.IOException;

public interface ColaboradorVendedorRepository {
    public ColaboradorVendedor getColaboradorVendedorId(int idParaBuscar) throws IOException;
}