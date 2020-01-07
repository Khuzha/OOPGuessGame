public class Player {
    int answer = 0;

    int guess (int range, int myNum) {
        answer = (int) (Math.random() * range);
        System.out.println("Игрок " + myNum + ": \"Думаю, что это число - " + answer + "\"");
        return answer;
    }
}
