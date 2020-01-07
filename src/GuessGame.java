public class GuessGame {

    void startGame() {

        Player p1 = new Player();
        Player p2 = new Player();
        Player p3 = new Player();

        int guessp1 = 0;
        int guessp2 = 0;
        int guessp3 = 0;

        int range = 100;
        int targetNumber = (int) (Math.random() * range);
        System.out.println("Я загадываю число от 0 до " + (range - 1));
        System.out.println("Число, которое нужно угадать, - " + targetNumber);

        boolean ready = false;

        while (!ready) {

            int answer1 = p1.guess(range, 1);
            int answer2 = p2.guess(range, 2);
            int answer3 = p3.guess(range, 3);

            if (answer1 == targetNumber) {
                System.out.println("Угадал игрок 1");
                ready = true;
            } else if (answer2 == targetNumber) {
                System.out.println("Угадал игрок 2");
                ready = true;
            } else if (answer3 == targetNumber) {
                System.out.println("Угадал игрок 3");
                ready = true;
            } else {
                System.out.println("Никто не угадал, все пробуют заново.");
            }
        }

    }

}
