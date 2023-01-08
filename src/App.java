public class App {

    public static void main(String[] args) {

        System.out.println(" ");
        System.out.println("---- Pessoa Física ----");

        Fisica pessoa = new Fisica();
        pessoa.setNome("Anakin Skywalker");
        pessoa.setCpf("000.000.000-00");
        pessoa.setCertidaoNascimento("12/02/1999");
        imprimir(pessoa);

        System.out.println(" ");
        System.out.println("---- Pessoa Jurídica ----");

        Juridica juridica = new Juridica();
        juridica.setNome("Darth Vader Enterprises");
        juridica.setCnpj("11.111.111.0001-11");
        imprimir(juridica);
    }
    public static void imprimir(Pessoa pessoa) {
        System.out.println(pessoa.getNome() + " " + pessoa.info());

    }
}
