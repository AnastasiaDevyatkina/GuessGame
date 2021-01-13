public class Player {
    int number = 0; //Здесь храниться вариант числа
    public void guess(){
        number = (int) (Math.random() * 10);
        System.out.println("Думаю это число" + number);
    }

    public static class GameLauncher{
        public static void main(String[] args) {
        GuessGame game = new GuessGame();
        game.startGame();
        }
    }
}
