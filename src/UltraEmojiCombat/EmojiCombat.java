package UltraEmojiCombat;

public class EmojiCombat {
    public static void main(String[] args) {
        // Vetor de lutadores
        Lutador lutadores[] = new Lutador[6];
        // Declarando cada lutador em sua devida posição
        lutadores[0] = new Lutador("PrettyBoy", "França", 31, 1.75f,
                68.9f,11, 2, 1);
        lutadores[1] = new Lutador("Lolo", "States", 20, 1.70f,
                90.9f, 8, 3, 2);
        lutadores[2] = new Lutador("Cambe", "Brasil", 31, 1.68f,
                78.9f, 4, 7, 1);
        lutadores[3] = new Lutador("Luno", "Coreia", 56, 1.80f,
                56.9f, 2, 2, 0);
        // Jogo
        lutadores[0].ganharLuta();
        lutadores[1].perderLuta();
        lutadores[2].empatarLuta();
        lutadores[3].empatarLuta();
        // Status
        lutadores[0].status();
        lutadores[1].status();
        lutadores[2].status();
        lutadores[3].status();
    }
}
