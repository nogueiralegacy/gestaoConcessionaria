package entities;

import java.io.IOException;

public interface VeiculoRepository {
    public Veiculo getVeiculoPlaca(String placa) throws IOException;
}
