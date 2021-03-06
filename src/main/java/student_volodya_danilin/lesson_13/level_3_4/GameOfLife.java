package student_volodya_danilin.lesson_13.level_3_4;

import java.util.concurrent.TimeUnit;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class GameOfLife {
    private GameOfLifeConsoleUI ui = new GameOfLifeConsoleUI();
    private GameOfLifeRandomFieldGenerator generator = new GameOfLifeRandomFieldGenerator();
    private GameOfLifeNextGenerationCalculator calculator = new GameOfLifeNextGenerationCalculator();

    public static void main(String[] args) {
        GameOfLife game = new GameOfLife();
        game.run();
    }

    public void run() {
        boolean[][] field = generator.generateRandomField(10, 10);
        while(true) {
            ui.show(field);
            sleepForSeconds(5);
            field = calculator.calculate(field);
        }
    }

    private void sleepForSeconds(int seconds) {
        try {
            TimeUnit.SECONDS.sleep(seconds);
        } catch (InterruptedException e) {
            System.out.println("Exception occurred!");
            System.exit(1);
        }
    }
}
