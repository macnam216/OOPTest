import java.util.Random;
public class Bee {


    private int healthPoint;

    public Bee() {

    }
    public Bee(int healthPoint) {
        this.healthPoint = healthPoint;
    }



    public int getHealthPoint() {
        return healthPoint;
    }

    public void setHealthPoint(int healthPoint) {
        this.healthPoint = healthPoint;
    }

    public int randomHealthPoint() {
        Random ran = new Random();
        int min = 0;
        int max = 100;
        return ran.nextInt((max - min) + 1) + min;
    }

    public int randomAttack() {
        Random ran = new Random();
        int min = 0;
        int max = 80;
        return ran.nextInt((max - min) + 1) + min;
    }

}
