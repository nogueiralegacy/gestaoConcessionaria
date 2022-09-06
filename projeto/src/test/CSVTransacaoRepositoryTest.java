package test;

import negocio.Cliente;
import negocio.TransacaoDeVenda;
import org.junit.Test;
import persistencia.CSVTransacaoRepository;

import java.io.IOException;
import static junit.framework.Assert.assertNotNull;

public class CSVTransacaoRepositoryTest {

    @Test
    public void testePersiste() throws IOException {
        CSVTransacaoRepository repo = new CSVTransacaoRepository();
        assertNotNull(repo.persiste(new TransacaoDeVenda()));
    }
}
