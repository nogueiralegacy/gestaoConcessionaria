package test;

import org.junit.Test;
import persistencia.CSVColaboradorVendedorRepository;

import java.io.IOException;

import static junit.framework.Assert.assertEquals;

public class CSVColaboradorVendedorRepositoryTest {

        @Test
        public void testporId() throws IOException {
            CSVColaboradorVendedorRepository repo = new CSVColaboradorVendedorRepository();
            assertEquals("456231029-22", repo.porId(001).getCpf());
        }

        @Test
        public void testporId2() throws IOException {
            CSVColaboradorVendedorRepository repo = new CSVColaboradorVendedorRepository();
            assertEquals("461796989-22", repo.porId(007).getCpf());
        }
}
