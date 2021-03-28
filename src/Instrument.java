import java.util.Random;

public class Instrument {

    public static void main(String[] args) {
        Instrument[] instruments = new Instrument[10];

        Random rand = new Random();

        for (int i = 0; i < 10; i++) {
            int randomNum = rand.nextInt((3 - 1) + 1) + 1;

            if (randomNum == 1)
                instruments[i] = new Piano();
            else if (randomNum == 2)
                instruments[i] = new Instrument();
            else if (randomNum == 3)
                instruments[i] = new Instrument();

            instruments[i].play();
        }

        for (int i = 0; i < 10; i++) {
            if (instruments[i] instanceof Piano)
                System.out.println("Piano is stored at index " + i);
        }

    }

    private void play() {
    }

    private static class Piano extends Instrument {
    }

    private static class Flute {
    }

    private static class Guitar {
    }
}
