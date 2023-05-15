package aula_04;

public class MetodosEspeciais {
    public static void main(String[] args) {
        // Definindo atributos diretamente na class Constructor;
        Caneta canetaInstance = new Caneta("Bic", "Azul", 2.5f );
        // Setando atributos por métodos de acesso;
        canetaInstance.setModelo("Bic");
        canetaInstance.setPonta(1);
        canetaInstance.status();
    }
}
