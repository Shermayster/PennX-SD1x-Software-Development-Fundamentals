package com.company;

import java.lang.reflect.Array;

public class Squarelotron {
    int[][] squarelotron;
    int size;

    Squarelotron(int n) {
        size = n;
        squarelotron = buildSquarelotron(n);
    }

    int[][] buildSquarelotron(int n) {
        int[][] tron = new int[n][n];
        int val = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                val = val + 1;
                tron[i][j] = val;
            }
        }
        return tron;
    }

    Squarelotron upsideDownFlip(int ring) {
        Squarelotron squ = new Squarelotron(size);
        try {
            if (ring > 0) {
                int numOfRings = size / 2 - ring;
                int i = 1;
                while (numOfRings > -1) {
                    int firstArr = ring + (i - 2);
                    int secondArr = size - i - (ring - 1);
                    int[] arrays = {firstArr, secondArr};
                    if (i == 1) {
                        squ.squarelotron = switchArrays(ring, squ, arrays);
                    } else {
                        squ.squarelotron = switchColumns(ring, squ, arrays);
                    }
                    i++;
                    numOfRings--;
                }
            }

        } catch (Exception e) {
            System.out.println(
                    "Error: " + e.getMessage());
        } finally {
            return squ;
        }

    }


    private int[][] switchArrays(int ring, Squarelotron squ, int[] arrays) {
        int round = ring - 1;
        while (round < size - ring + 1) {
            int roundVals = round;
            squ.squarelotron = switchArraysValues(squ.squarelotron, arrays, roundVals);
            round++;
        }
        return squ.squarelotron;
    }

    private int[][] switchColumns(int ring, Squarelotron squ, int[] arrays) {
        int val1 = ring - 1;
        int val2 = size - 1 - (ring - 1);
        squ.squarelotron = switchArraysValues(squ.squarelotron, arrays, val1);
        squ.squarelotron = switchArraysValues(squ.squarelotron, arrays, val2);
        return squ.squarelotron;
    }

    private int[][] switchArraysValues(int[][] square, int[] arrays, int val) {
        square[arrays[0]][val] = squarelotron[arrays[1]][val];
        square[arrays[1]][val] = squarelotron[arrays[0]][val];
        return square;
    }



    Squarelotron mainDiagonalFlip(int ring) {
        Squarelotron squ = new Squarelotron(size);
        try {
            int arrRing = ring - 1;
            while (arrRing < size - (ring-1)) {
                squ.squarelotron[arrRing][ring - 1] = squarelotron[ring-1][arrRing];
                squ.squarelotron[ring-1][arrRing]= squarelotron[arrRing][ring - 1];
                squ.squarelotron[arrRing][size - ring] = squarelotron[size - ring][arrRing];
                squ.squarelotron[size - ring][arrRing] = squarelotron[arrRing][size - ring];
                arrRing ++;
            }
        }
        catch (Exception e) {
            System.out.println(
                    "Error: " + e.getMessage());
        } finally {
            return squ;
        }
    }


    void rotateRight(int numberOfTurns) {
        int turns = numberOfTurns % 4;
        if(turns < 0) {
            turns = 4 + turns;
        }
        while (turns != 0) {
            squarelotron = turnRigth();
            turns --;
        }

    }

    private int[][] turnRigth() {
        Squarelotron squ = new Squarelotron(size);
        int row = 0;
        while(row < size) {
            int x = 0;
            while(x < size) {
                squ.squarelotron[row][x] = squarelotron[size -1 - x][row];
                x++;
            }
            row ++;
        }
        return squ.squarelotron;
    }
}
