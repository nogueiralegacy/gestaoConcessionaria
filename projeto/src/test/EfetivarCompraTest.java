package test;
import application.EfetivarCompra;
import negocio.*;
import org.junit.Test;

import java.io.IOException;

import static junit.framework.Assert.*;

public class EfetivarCompraTest {

    @Test
    public void testCriaTransacaoDeCompra() throws IOException {
        TransacaoDeCompra actualTransacao = EfetivarCompra.criaTransacaoDeCompra("020672779-12", "PRW6D02", 65000, 1);
        assertNotNull(actualTransacao);
        assertTrue(actualTransacao instanceof TransacaoDeCompra);
        assertTrue(actualTransacao.getCliente().getRg().contains("5791364"));
    }
}
