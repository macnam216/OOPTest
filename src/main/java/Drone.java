import java.util.ArrayList;

public class Drone extends Bee implements IBee {

    ArrayList<Drone> listDrone = new ArrayList<>();



    public Drone() {
    }

    public Drone(int healthPoint) {
        super(healthPoint);
    }

    public void setListDrone(ArrayList<Drone> listDrone) {
        this.listDrone = listDrone;
    }
    @Override
    public void creatBeeList() {
        listDrone.clear();
        System.out.println("List Drone: ");
        for (int i = 0; i < 10; i++) {
            int point = super.randomHealthPoint();
            listDrone.add(new Drone(point));
            System.out.print(listDrone.get(i).getHealthPoint() + " ");
        }
        System.out.println();
    }

    @Override
    public void damage() {
        for (int i = 0; i < 10; i++) {
            int point = super.randomAttack();
            listDrone.get(i).setHealthPoint(listDrone.get(i).getHealthPoint()
                    - point);
            int currentPoint = listDrone.get(i).getHealthPoint();
            if (currentPoint < 0) {
                currentPoint = 0;
            }
            System.out.print(currentPoint + " ");
            if (currentPoint < 50) {
                System.out.println("dead");
            } else {
                System.out.println("alive");
            }
        }
    }





}