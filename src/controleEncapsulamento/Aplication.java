package controleEncapsulamento;

public class Aplication {
    public static void main(String[] args) {
        ControleRemoto sony_tv = new ControleRemoto();
        sony_tv.ligar();
        sony_tv.abrirMenu();
        sony_tv.maisVolume();
        sony_tv.abrirMenu();
    }
}
