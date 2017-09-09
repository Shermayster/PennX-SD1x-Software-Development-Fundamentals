package com.company;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SquarelotronTest {
    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void buildSquarelotron() throws Exception {
        int[][] testMatrix = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        Squarelotron squarelotron = new Squarelotron(4);
        assertEquals(testMatrix.length, squarelotron.squarelotron.length);
        assertArrayEquals(testMatrix, squarelotron.squarelotron);
        assertEquals(4, squarelotron.size);
    }

    @Test
    public void testUpsideDownFlipDimensionThree() throws Exception {
        int[][] originalMatrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] flipMatrix = {
                {7, 8, 9},
                {4, 5, 6},
                {1, 2, 3}
        };
        Squarelotron squarelotron3 = new Squarelotron(3);
        Squarelotron upSquarelotron = squarelotron3.upsideDownFlip(1);
        assertArrayEquals(flipMatrix, upSquarelotron.squarelotron);
        assertArrayEquals(originalMatrix, squarelotron3.squarelotron);
    }

    @Test
    public void upsideDownFlip8Ring2() throws Exception {
        int[][] originalTestMatrix4 = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        int[][] testMatrixSize4Ring1 = {{13, 14, 15, 16}, {9, 6, 7, 12}, {5, 10, 11, 8}, {1, 2, 3, 4}};
        Squarelotron squarelotron4 = new Squarelotron(4);
        Squarelotron upSquarelotron = squarelotron4.upsideDownFlip(1);
        assertArrayEquals(testMatrixSize4Ring1, upSquarelotron.squarelotron);
        assertArrayEquals(originalTestMatrix4, squarelotron4.squarelotron);
        int[][] originalTestMatrix8 = {
                {1, 2, 3, 4, 5, 6, 7, 8},
                {9, 10, 11, 12, 13, 14, 15, 16},
                {17, 18, 19, 20, 21, 22, 23, 24},
                {25, 26, 27, 28, 29, 30, 31, 32},
                {33, 34, 35, 36, 37, 38, 39, 40},
                {41, 42, 43, 44, 45, 46, 47, 48},
                {49, 50, 51, 52, 53, 54, 55, 56},
                {57, 58, 59, 60, 61, 62, 63, 64}
        };
        int[][] originalTestMatrix8Ring2 = {
                {1, 2, 3, 4, 5, 6, 7, 8},
                {9, 50, 51, 52, 53, 54, 55, 16},
                {17, 42, 19, 20, 21, 22, 47, 24},
                {25, 34, 27, 28, 29, 30, 39, 32},
                {33, 26, 35, 36, 37, 38, 31, 40},
                {41, 18, 43, 44, 45, 46, 23, 48},
                {49, 10, 11, 12, 13, 14, 15, 56},
                {57, 58, 59, 60, 61, 62, 63, 64}
        };
        Squarelotron squarelotron8 = new Squarelotron(8);
        Squarelotron upSquarelotron82 = squarelotron8.upsideDownFlip(2);
        assertArrayEquals(originalTestMatrix8Ring2, upSquarelotron82.squarelotron);
        assertArrayEquals(squarelotron8.squarelotron, originalTestMatrix8);
    }

    @Test
    public void upsideDownFlip4Ring2() throws Exception {
        int[][] originalTestMatrix4 = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};
        int[][] testMatrixSize4Ring2 = {
                {1, 2, 3, 4},
                {5, 10, 11, 8},
                {9, 6, 7, 12},
                {13, 14, 15, 16}};
        Squarelotron squarelotron4 = new Squarelotron(4);
        Squarelotron upSquarelotron2 = squarelotron4.upsideDownFlip(2);
        assertArrayEquals(testMatrixSize4Ring2, upSquarelotron2.squarelotron);
        assertArrayEquals(originalTestMatrix4, squarelotron4.squarelotron);
    }

    @Test
    public void upsideDownFlip5Ring1() throws Exception {
        Squarelotron squarelotron5 = new Squarelotron(5);
        int[][] originalTestMatrix5 = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25}
        };
        int[][] originalTestMatrix5Ring1 = {
                {21, 22, 23, 24, 25},
                {16, 7, 8, 9, 20},
                {11, 12, 13, 14, 15},
                {6, 17, 18, 19, 10},
                {1, 2, 3, 4, 5}};
        Squarelotron upSquarelotron51 = squarelotron5.upsideDownFlip(1);
        assertArrayEquals(originalTestMatrix5Ring1, upSquarelotron51.squarelotron);
        assertArrayEquals(originalTestMatrix5, squarelotron5.squarelotron);
    }

    @Test
    public void upsideDownFlip8Ring1() throws Exception {
        int[][] originalTestMatrix8 = {
                {1, 2, 3, 4, 5, 6, 7, 8},
                {9, 10, 11, 12, 13, 14, 15, 16},
                {17, 18, 19, 20, 21, 22, 23, 24},
                {25, 26, 27, 28, 29, 30, 31, 32},
                {33, 34, 35, 36, 37, 38, 39, 40},
                {41, 42, 43, 44, 45, 46, 47, 48},
                {49, 50, 51, 52, 53, 54, 55, 56},
                {57, 58, 59, 60, 61, 62, 63, 64}
        };
        int[][] originalTestMatrix8Ring1 = {
                {57, 58, 59, 60, 61, 62, 63, 64},
                {49, 10, 11, 12, 13, 14, 15, 56},
                {41, 18, 19, 20, 21, 22, 23, 48},
                {33, 26, 27, 28, 29, 30, 31, 40},
                {25, 34, 35, 36, 37, 38, 39, 32},
                {17, 42, 43, 44, 45, 46, 47, 24},
                {9, 50, 51, 52, 53, 54, 55, 16},
                {1, 2, 3, 4, 5, 6, 7, 8}};

        Squarelotron squarelotron8 = new Squarelotron(8);
        Squarelotron upSquarelotron81 = squarelotron8.upsideDownFlip(1);
        assertArrayEquals(originalTestMatrix8Ring1, upSquarelotron81.squarelotron);
        assertArrayEquals(squarelotron8.squarelotron, originalTestMatrix8);
    }

    @Test
    public void mainDiagonalFlip() throws Exception {
        int[][] originalTestMatrix8 = {
                {1, 2, 3, 4, 5, 6, 7, 8},
                {9, 10, 11, 12, 13, 14, 15, 16},
                {17, 18, 19, 20, 21, 22, 23, 24},
                {25, 26, 27, 28, 29, 30, 31, 32},
                {33, 34, 35, 36, 37, 38, 39, 40},
                {41, 42, 43, 44, 45, 46, 47, 48},
                {49, 50, 51, 52, 53, 54, 55, 56},
                {57, 58, 59, 60, 61, 62, 63, 64}
        };
        int[][] originalTestMatrix8Ring2 = {
                {1, 2, 3, 4, 5, 6, 7, 8},
                {9, 10, 18, 26, 34, 42, 50, 16},
                {17, 11, 19, 20, 21, 22, 51, 24},
                {25, 12, 27, 28, 29, 30, 52, 32},
                {33, 13, 35, 36, 37, 38, 53, 40},
                {41, 14, 43, 44, 45, 46, 54, 48},
                {49, 15, 23, 31, 39, 47, 55, 56},
                {57, 58, 59, 60, 61, 62, 63, 64}
        };
        Squarelotron squarelotron8 = new Squarelotron(8);
        Squarelotron flipSquarelotron82 = squarelotron8.mainDiagonalFlip(2);
        assertArrayEquals(originalTestMatrix8Ring2, flipSquarelotron82.squarelotron);
    }

    @Test
    public void rotateRight() throws Exception {
        int[][] originalTestMatrix8Ring1 = {
                {57, 49, 41, 33, 25, 17, 9, 1},
                {58, 50, 42, 34, 26, 18, 10, 2},
                {59, 51, 43, 35, 27, 19, 11, 3},
                {60, 52, 44, 36, 28, 20, 12, 4},
                {61, 53, 45, 37, 29, 21, 13, 5},
                {62, 54, 46, 38, 30, 22, 14, 6},
                {63, 55, 47, 39, 31, 23, 15, 7},
                {64, 56, 48, 40, 32, 24, 16, 8}
        };

        Squarelotron squarelotron8 = new Squarelotron(8);
        squarelotron8.rotateRight(5);
        assertArrayEquals(originalTestMatrix8Ring1, squarelotron8.squarelotron);
    }

    @Test
    public void rotateLeft() throws Exception {
        int[][] originalTestMatrix8Ring2 = {
                {8, 16, 24, 32, 40, 48, 56, 64},
                {7, 15, 23, 31, 39, 47, 55, 63},
                {6, 14, 22, 30, 38, 46, 54, 62},
                {5, 13, 21, 29, 37, 45, 53, 61},
                {4, 12, 20, 28, 36, 44, 52, 60},
                {3, 11, 19, 27, 35, 43, 51, 59},
                {2, 10, 18, 26, 34, 42, 50, 58},
                {1, 9, 17, 25, 33, 41, 49, 57}

        };
        Squarelotron squarelotron8 = new Squarelotron(8);
        squarelotron8.rotateRight(-5);
        assertArrayEquals(originalTestMatrix8Ring2, squarelotron8.squarelotron);
    }

}