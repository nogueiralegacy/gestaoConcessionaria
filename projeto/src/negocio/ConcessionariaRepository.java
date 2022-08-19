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

    /**
     * Recupera os dados, em formato csv, de concessionaria.
     * 
     * @return Os dados , em formato csv, da concessionária ou {@code null}
     *         caso não tenha os dados de concessionária.
     *
     */
    public String dadosEmCsv() throws IOException;
}
