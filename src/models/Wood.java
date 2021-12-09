package models;

public class Wood {

    private String nome;
    private String endereço;
    private String cep;
    private String complemento;
    private String nascimento;
    private String email;
    private String numero;
    private String cidade;
    private String estado;

    public Wood(String nome,String endereço,String cep,String complemento,String nascimento,String email,String numero,String cidade,String estado ){
        this.nome = nome;
        this.endereço = endereço;
        this.cep = cep;
        this.complemento = complemento;
        this.nascimento = nascimento;
        this.email = email;
        this.numero = numero;
        this.cidade = cidade;
        this.estado = estado;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereço() {
        return endereço;
    }

    public String getCep() {
        return cep;
    }

    public String getComplemento() {
        return complemento;
    }

    public String getNascimento() {
        return nascimento;
    }

    public String getEmail() {
        return email;
    }

    public String getNumero() {
        return numero;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEstado() {
        return estado;
    }
}
