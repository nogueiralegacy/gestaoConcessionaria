package test;

import negocio.Veiculo;
import org.junit.Test;
import persistencia.CSVVeiculoRepository;
import static junit.framework.Assert.assertNotNull;

public class CSVVeiculoRepositoryTest {

    @Test
    public void testPersiste() {
        CSVVeiculoRepository repo = new CSVVeiculoRepository();
        assertNotNull(repo.persiste(new Veiculo()));
    }
}
