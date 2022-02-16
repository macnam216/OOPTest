public class Main {

    public static void main(String[] args) {
        Worker worker = new Worker();
        worker.creatBeeList();
        worker.damage();

        Queen queen = new Queen();
        queen.creatBeeList();
        queen.damage();

        Drone drone = new Drone();
        drone.creatBeeList();
        drone.damage();
    }
}