public class App {

    public static void main(String[] args) {

        //Instanciando uma classe e criando um objeto a partir dela
        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("Daniel");
        pessoa1.setIdade(20);

        System.out.println(pessoa1.getNome());
        System.out.println(pessoa1.getIdade());

        Carro meuCarro = new Carro();
        meuCarro.setModelo("Nissan March");
        meuCarro.setCor("Preto");
        meuCarro.setAno(2018);

        Carro novoCarro = new Carro("Fiat Uno", "Vermelho", 2010);

        System.out.println(novoCarro.getModelo());
        System.out.println(novoCarro.getCor());
        System.out.println(novoCarro.getAno());
    }

}