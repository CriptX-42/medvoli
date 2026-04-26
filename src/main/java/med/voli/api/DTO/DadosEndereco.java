package med.voli.api.DTO;

public record DadosEndereco(String logradouro,
                            String bairro,
                            String cep,
                            String cidade,
                            String uf,
                            String numero,
                            String complemento) {
}
