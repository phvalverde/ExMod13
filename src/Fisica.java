public class Fisica extends Pessoa {

    private String cpf;
    private String certidaoNascimento;

//    public String getCpf() {
//        return cpf;
//    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

//    public String getCertidaoNascimento() {
//        return certidaoNascimento;
//    }

    public void setCertidaoNascimento(String certidaoNascimento) {
        this.certidaoNascimento = certidaoNascimento;
    }

    @Override
    public String info() {
        return "\n" + "CPF: " + (cpf) + "\n" +
                "Certidão: " + (certidaoNascimento);
    }
}
