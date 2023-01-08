public abstract class Pessoa {

    private String nome;

    public abstract String info();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}