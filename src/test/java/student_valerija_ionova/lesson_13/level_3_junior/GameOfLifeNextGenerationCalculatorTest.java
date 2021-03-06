package student_valerija_ionova.lesson_13.level_3_junior;

import org.junit.Test;

import static org.junit.Assert.*;
//Task11 Правило 1: Любая живая клетка с меньше чем двумя живыми соседями умирает в следующем поколении.
//Правило 2: Любая живая клетка с больше чем тремя живыми соседями умирает в следующем поколении.
//Task3 Правило 3: Любая живая клетка с двумя или тремя живыми соседями остаётся живой в следующем поколении.
//Task17 Правило 4: Любая мёртвая клетка с тремя живыми соседями становится живой в следующем поколении.

public class GameOfLifeNextGenerationCalculatorTest {

    GameOfLifeNextGenerationCalculator gameOfLifeNextGenerationCalculator = new GameOfLifeNextGenerationCalculator();

    boolean[][] currentGeneration = {{false, true, false, true, false},
                                     {false, false, false,true, false},
                                     {true, true, false, false, false},
                                     {true, true, false, false, false},
                                     {false, true, false, true, false}};

    @Test
    public void rule4TrueIfThreeAliveAround(){
        boolean [][] newGenerationField;
        newGenerationField = gameOfLifeNextGenerationCalculator.calculate(currentGeneration);
        assertTrue(newGenerationField[4][0]);
    }

    @Test
    public void rule3TrueIfTwoAliveAround(){
        boolean [][] newGenerationField;
        newGenerationField = gameOfLifeNextGenerationCalculator.calculate(currentGeneration);
        assertTrue(newGenerationField[4][1]);
    }

    @Test
    public void rule3TrueIfTThreeAliveAround(){
        boolean [][] newGenerationField;
        newGenerationField = gameOfLifeNextGenerationCalculator.calculate(currentGeneration);
        assertTrue(newGenerationField[2][1]);
    }

    @Test
    public void rule1FalseIfLessThanTwoAroundAreAlive1(){
        boolean [][] newGenerationField;
        newGenerationField = gameOfLifeNextGenerationCalculator.calculate(currentGeneration);
        assertFalse(newGenerationField[1][3]);
    }

    @Test
    public void rule1FalseIfLessThanTwoAroundAreAlive0(){
        boolean [][] newGenerationField;
        newGenerationField = gameOfLifeNextGenerationCalculator.calculate(currentGeneration);
        assertFalse(newGenerationField[4][3]);
    }

    @Test
    public void rule2FalseIfMoreThanThreeAroundAreAlive4(){
        boolean [][] newGenerationField;
        newGenerationField = gameOfLifeNextGenerationCalculator.calculate(currentGeneration);
        assertFalse(newGenerationField[3][0]);
    }



}