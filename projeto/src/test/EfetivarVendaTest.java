package test;
import application.EfetivarVenda;
import negocio.*;
import org.junit.Test;

import java.io.IOException;

import static junit.framework.Assert.*;

public class EfetivarVendaTest {

    @Test
    public void testCriaTransacaoDeVenda() throws IOException {
        TransacaoDeVenda actualTransacao = EfetivarVenda.criaTransacaoDeVenda("020672779-12", "PRW6D02", 65000, 1, 007);
        assertNotNull(actualTransacao);
        assertTrue(actualTransacao instanceof TransacaoDeVenda);
        assertTrue(actualTransacao.getCliente().getRg().contains("5791364"));
        assertTrue(actualTransacao.getColaboradorVendedor().getCpf().contains("461796989-22"));
    }
}
