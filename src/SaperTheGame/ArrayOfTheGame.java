package SaperTheGame;

import java.util.Random;

public class ArrayOfTheGame {


    private static boolean gameLost;
    private static int bombsNumber;
    private final int lenghtX;
    private final int lenghtY;
    private final Field[][] arrayOfFields;

    public ArrayOfTheGame(int lenghtX, int lenghtY) {
        this.lenghtX = lenghtX;
        this.lenghtY = lenghtY;
        arrayOfFields = new Field[lenghtX][lenghtY];
        gameLost = false;
    }

    public static boolean isGameLost() {
        return gameLost;
    }

    public static void setBombsNumber(int bombsNumber) {
        ArrayOfTheGame.bombsNumber = bombsNumber;
    }


    public void fillArrayOfFields() {
        for (int i = 0; i < lenghtX; i++) {
            for (int j = 0; j < lenghtY; j++) {
                arrayOfFields[i][j] = new Field(i, j);
            }
        }
    }

//    public void fillBombs(int bombsNumber) {
//        setBombsNumber(bombsNumber);
//        Field[] arrayOfBombs = new Field[bombsNumber];
//        Random gen = new Random();
//        for (int i = 0; i < bombsNumber; i++) {
//            arrayOfBombs[i] = new Field(gen.nextInt(lenghtX), gen.nextInt(lenghtY));
//            for (int j = 0; j < i; j++) {
//                if (arrayOfBombs[j].equals(arrayOfBombs[i])) {
//                    i--;
//                    break;
//                }
//            }
//        }
//        for (Field arrayOfBomb : arrayOfBombs) {
//            arrayOfFields[arrayOfBomb.getxPosition()][arrayOfBomb.getyPosition()].setBomb(true);
//        }
//    }

    public boolean isBombsOk(int bombsNumber) {
        return bombsNumber <= lenghtY * lenghtX;
    }


    public void fillBombs(int bombsNumber) {
        if (isBombsOk(bombsNumber)) {
            setBombsNumber(bombsNumber);
            Random gen = new Random();
            for (int i = 0; i < bombsNumber; i++) {
                int x = gen.nextInt(lenghtX);
                int y = gen.nextInt(lenghtY);
                if (!arrayOfFields[x][y].isBomb()) {
                    arrayOfFields[x][y].setBomb(true);
                } else {
                    i--;
                }
            }
        } else {
            System.out.println("Za dużo bomb! Trzeba powtórzyć operację:");
        }
    }

    public boolean isBomb(int x, int y) {
        return arrayOfFields[x][y].isBomb();
    }

    public boolean isIndexingOk(int xIndex, int yIndex) {
        return xIndex < 0 || xIndex >= lenghtX || yIndex < 0 || yIndex >= lenghtY;
    }

    public void fillFieldsWithNumbers() {
        for (int i = 0; i < lenghtX; i++) {
            for (int j = 0; j < lenghtY; j++) {
                for (int x = -1; x <= 1; x++) {
                    for (int y = -1; y <= 1; y++) {
                        if (isIndexingOk(x + i, y + j)) {
                            continue;
                        }
                        if (arrayOfFields[x + i][y + j].isBomb()) {
                            arrayOfFields[i][j].setNumberOfNearbyBombs(arrayOfFields[i][j].getNumberOfNearbyBombs() + 1);
                        }
                    }
                }


            }
        }
    }

    //TODO: POPRAWIĆ GDY ZA DUZO BOMB MA POPROSIC OD NOWA, CYRK Z X I Y, STATIC I DINAMIC
    public void revealField(int x, int y) {
        if (isBomb(x, y)) {
            for (int i = 0; i < lenghtX; i++) {
                for (int j = 0; j < lenghtY; j++) {
                    arrayOfFields[i][j].setRevealed(true);
                }
            }
            //printFields();
            System.out.println("bomba gra skonczona");
            gameLost = true;
        } else {
//            for (int i = -1; i <= 1; i++) {
//                for (int j = -1; j <= 1; j++) {
//                    if (!isIndexingOk(x + i, y + j)) {
//                        continue;
//                    }
//                    if (arrayOfFields[x + i][y + j].isBomb()) {
//                        arrayOfFields[x][y].setNumberOfNearbyBombs(arrayOfFields[x][y].getNumberOfNearbyBombs() + 1);
//                    }
//                    for (int k = -1; k <= 1; k++) {
//                        for (int l = -1; l <= 1; l++) {
//                            if (!isIndexingOk(x + i + k, y + j + l)){
//                                continue;
//                            }
//                                if (arrayOfFields[x + i + k][y + j + l].isBomb()) {
//                                    arrayOfFields[x + i][y + j].setNumberOfNearbyBombs(arrayOfFields[x + i][y + j].getNumberOfNearbyBombs() + 1);
//                                }
//                        }
//                    }
//                }
//            }
            arrayOfFields[x][y].setRevealed(true);
            if (arrayOfFields[x][y].getNumberOfNearbyBombs() == 0) {
                for (int i = -1; i <= 1; i++) {
                    for (int j = -1; j <= 1; j++) {
                        if (isIndexingOk(x + i, y + j)) {
                            continue;
                        }
                        arrayOfFields[x + i][y + j].setRevealed(true);
                    }
                }
            }

        }
    }

    public void printFields() {
        System.out.print("  ");
        for (int i = 0; i < lenghtY; i++) {
            if (i >= 10) {
                System.out.print(i);
            } else {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        for (int i = 0; i < lenghtX; i++) {
            if (i >= 10) {
                System.out.print(i);
            } else {
                System.out.print(i + " ");
            }
            for (int j = 0; j < lenghtY; j++) {
                if (arrayOfFields[i][j].isRevealed()) {
                    if (arrayOfFields[i][j].isBomb()) {
                        System.out.print("* ");
                    } else if (arrayOfFields[i][j].getNumberOfNearbyBombs() == 0) {
                        System.out.print("@ ");
                    } else {
                        System.out.print(arrayOfFields[i][j].getNumberOfNearbyBombs() + " ");
                    }
                } else {
                    System.out.print("+ ");
                }
            }
            System.out.println();
        }
    }

    public boolean isGameWon() {
        int revealedTotal = 0;
        for (int i = 0; i < lenghtX; i++) {
            for (int j = 0; j < lenghtY; j++) {
                if (arrayOfFields[i][j].isRevealed()) {
                    revealedTotal++;
                }
            }
        }
        return lenghtX * lenghtY - revealedTotal == bombsNumber;
    }


}
