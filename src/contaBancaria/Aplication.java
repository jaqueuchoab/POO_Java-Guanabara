package contaBancaria;
public class Aplication {
    public static void main(String[] args) {
        ContaBanco pessoa_1 = new ContaBanco();
        pessoa_1.setNumConta(2424);
        pessoa_1.setDono("Maria");
        pessoa_1.abrirConta("CC");

        ContaBanco pessoa_2 = new ContaBanco();
        pessoa_2.setNumConta(2323);
        pessoa_2.setDono("Ayla");
        pessoa_2.abrirConta("CP");

        pessoa_1.depositar(300);
        pessoa_2.depositar(500);
        pessoa_1.sacar(250);
        pessoa_2.sacar(250);


        pessoa_1.estadoAtual();
        pessoa_2.estadoAtual();
    }
}
