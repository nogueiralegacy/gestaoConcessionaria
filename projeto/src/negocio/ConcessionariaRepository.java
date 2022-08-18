package negocio;

import java.io.IOException;

public interface ConcessionariaRepository {
    /**
     * Intancia a concessionária.
     * 
     * 
     * @return A concessionária.
     * @throws IOException Situação excepcional de I/O.
     */
    public Concessionaria getIntance() throws IOException;
}
