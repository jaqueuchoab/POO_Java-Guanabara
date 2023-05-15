package aula_04;
public class Caneta {
    private String modelo;
    private float ponta;
    private boolean tampada;
    private String cor;

    // Método Constructor: pré coniguração dos atributos cor e se deve estar tampada ou não;
    public Caneta(String modelo, String cor, float ponta) {
        this.cor = "Preto";
        this.tampar();
    }

    // Métodos de get e set para os atributos de modelo e ponta;
    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String newModelo) {
        this.modelo = newModelo;
    }

    public float getPonta() {
        return this.ponta;
    }

    public void setPonta(float newPonta) {
        this.ponta = newPonta;
    }

    public void tampar() {
        this.tampada = true;
    }

    public void destampar() {
        this.tampada = false;
    }

    public void status() {
        System.out.println("Sobre a Caneta: ");
        System.out.println("Cor: " + this.cor);
        System.out.println("Tampada: " + this.tampada);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ponta: " + this.ponta);
    }
}
