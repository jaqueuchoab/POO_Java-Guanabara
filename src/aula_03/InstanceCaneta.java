package aula_03;

public class InstanceCaneta {
    public static void main(String[] args) {
        Caneta instanceCaneta = new Caneta();
        instanceCaneta.modelo = "Bic";
        instanceCaneta.cor = "Preto";
        // Atribuição não permitida pois o atributo ponta é privado.
        // instanceCaneta.ponta = 0.5;
        /* Atribuição a um atributo protegido permitida pois a class
        *  Caneta está sendo utilizada por um método main dentro de
        *  uma class q utiliza a Caneta class. (????)
        * */
        instanceCaneta.carga = 80;
        /* Apesar do atributo 'tampada' ser privado há métodos públicos
        *  que permitem que o atributo seja manipulado pela própria class,
        *  assim permitindo tampar ou destampar a caneta.
        * */
        instanceCaneta.destampar();
        instanceCaneta.status();
    }
}
