public class Juridica extends Pessoa {

    private String cnpj;

//    public String getCnpj() {
//        return cnpj;
//    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public String info() {
        return "\n" + "CNPJ: " + (cnpj);
    }
}
