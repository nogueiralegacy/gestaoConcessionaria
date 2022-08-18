package negocio;

import java.io.IOException;

public interface VeiculoRepository {

    /**
     * Recupera o veiculo para a placa informada.
     * 
     * @param placa A placa do veiculo.
     * @return O veiculo para a placa fornecida ou {@code null}
     *         caso não exista veiculo para a placa fornecida.
     * @throws IOException Expecionalidade de I/O.
     */
    public Veiculo porPlaca(String placa) throws IOException;

    /**
     * Armazenar o veiculo fornecido.
     * 
     * @param veiculo O veiculo a ser armazenado.
     * @return O veiculo armazenado possivelmente com identificador atribuido
     *         pelo mencanismo de persistência ou {@code null} caso ocorra
     *         falha na persistência.
     */
    public Veiculo persiste(Veiculo veiculo);

}
