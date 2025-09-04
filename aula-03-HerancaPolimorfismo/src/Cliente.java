public class Cliente extends Usuario{

    private Long numeroCliente;

    public Cliente(Long id,String situacao, DadosPessoais dadosPessoais, String nomeUsuario,String senha, Long numeroCliente ){
        super(id, situacao, dadosPessoais, nomeUsuario, senha);
        this.numeroCliente = numeroCliente;
    }
    public Long getNumeroCliente() {
        return numeroCliente;
    }

    public void setNumeroCliente(Long numeroCliente) {
        this.numeroCliente = numeroCliente;
    }
}
