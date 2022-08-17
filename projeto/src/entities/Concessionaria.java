package entities;

public class Concessionaria {

    // TODO enviar atributos para arquivo.
    public static Empresa getInstance() {
        Empresa empresa = new Empresa();
        empresa.nome = "Concessionaria INF";
        empresa.contato.setEmail("vendas@concessionariainf@gmil.com");
        empresa.contato.setTelefone("62111111111");
        empresa.endereco.setBairro("Campus Samambaia");
        empresa.endereco.setCep("111111-11");
        empresa.endereco.setCidade("Goiânia");
        empresa.endereco.setEstado("GO");
        empresa.endereco.setRua("Rua 1");
        empresa.endereco.setNumero(1);
        empresa.endereco.setComplemento("Do lado da rua 2");
        empresa.cnpj = "12345678-91";

        return empresa;
    }

}
