public class Main {
    public static void main(String[] args) {
        /* Lutador l1 = new Lutador("Brayan",21, 90.6f, 1.77f, "brasileiro", 7, 0, 1);

        l1.status();*/

        Lutador l[] = new Lutador[6];

        l[0] = new Lutador("Brayan",15, 60.6f, 1.67f, "canadense", 3, 12, 11);
        l[1] = new Lutador("Dylan",34, 90.8f, 1.83f, "russo", 12, 3, 5);
        l[2] = new Lutador("Ferrer",54, 103.6f, 1.90f, "africana", 12, 5, 7);
        l[3] = new Lutador("Trinit",28, 115.3f, 1.85f, "europeia", 1, 1, 1);
        l[4] = new Lutador("Winnit",33, 70.0f, 1.71f, "francesa", 4, 3, 8);
        l[5] = new Lutador("Jota ",21, 77.7f, 1.77f, "brasileiro", 15, 0, 1);

        l[3].status();

        l[5].status();
        l[5].ganharLuta();
        l[5].status();
    }
}
