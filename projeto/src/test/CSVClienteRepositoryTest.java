package test;

import org.junit.Test;
import persistencia.CSVClienteRepository;

import java.io.IOException;

import static junit.framework.Assert.*;


public class CSVClienteRepositoryTest {

    @Test
    public void testDadosEmCsvPorCpf() throws IOException {
        CSVClienteRepository repo = new CSVClienteRepository();
        assertEquals("5791364", repo.porCpf("020672779-12").getRg());
    }

    @Test
    public void testDadosEmCsvPorCpf2() throws IOException {
        CSVClienteRepository repo = new CSVClienteRepository();
        assertEquals("5791361", repo.porCpf("020672779-12").getRg());
    }
}
