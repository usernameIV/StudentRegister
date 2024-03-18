package Registração;

public class Endereço {

    private String rua;
    private String bairro;
    private String cidade;
    private String estado;
    private String cep;

    public Endereço(String rua, String bairro, String cidade, String estado, String cep) {
        this.rua = rua;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
    }
    public void printDetails() {
        System.out.println("Rua: " + rua);
        System.out.println("Bairro: " + bairro);
        System.out.println("Cidade: " + cidade);
        System.out.println("Estado: " + estado);
        System.out.println("CEP: " + cep);
    }
}
