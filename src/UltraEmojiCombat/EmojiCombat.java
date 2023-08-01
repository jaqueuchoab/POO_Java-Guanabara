package UltraEmojiCombat;

public class EmojiCombat {
    public static void main(String[] args) {
        // Vetor de lutadores
        Lutador lutadores[] = new Lutador[6];
        // Declarando cada lutador em sua devida posição
        lutadores[0] = new Lutador("PrettyBoy", "França", 31, 1.75f,
                68.9f,11, 2, 1);
        lutadores[1] = new Lutador("Lolo", "States", 29, 1.68f,
                57.8f, 14, 3, 2);
        lutadores[2] = new Lutador("Cambe", "Brasil", 31, 1.68f,
                78.9f, 4, 7, 1);
        lutadores[3] = new Lutador("Luno", "Coreia", 56, 1.80f,
                56.9f, 2, 2, 0);

        // Agregação
        Luta UEC = new Luta();
        UEC.marcarLuta(lutadores[0], lutadores[1]);
        UEC.lutar();
        lutadores[0].status();
        lutadores[1].status();
    }
}
