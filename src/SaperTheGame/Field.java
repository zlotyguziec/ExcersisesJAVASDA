package SaperTheGame;


public class Field {

    private boolean bomb;
    private int numberOfNearbyBombs;
    private final int xPosition;
    private final int yPosition;
    private boolean revealed;
    private boolean checked;

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }

    public boolean isRevealed() {
        return revealed;
    }

    public void setRevealed(boolean revealed) {
        this.revealed = revealed;
    }

    public int getNumberOfNearbyBombs() {
        return numberOfNearbyBombs;
    }

    public void setNumberOfNearbyBombs(int numberOfNearbyBombs) {
        this.numberOfNearbyBombs = numberOfNearbyBombs;
    }

    public boolean isBomb() {
        return bomb;
    }

    public void setBomb(boolean bomb) {
        this.bomb = bomb;
    }

    public int getxPosition() {
        return xPosition;
    }

    public int getyPosition() {
        return yPosition;
    }

    public Field(int xPosition, int yPosition) {
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        bomb = false;
        numberOfNearbyBombs = 0;
        revealed = false;
        checked = false;
    }


}
