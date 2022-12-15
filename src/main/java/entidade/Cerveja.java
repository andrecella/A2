package entidade;

public class Cerveja { 
    private String nome;
    private String fabricante;
    private String tipo;

    public Cerveja(String nome, String fabricante, String tipo) {
        this.nome = nome;
        this.fabricante = fabricante;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
