package HomeWork1Java2;

public class Main {
    public static void main(String[] args) {
        Wall[] wall = new Wall[4];
        wall[0] = new Wall(2);
        wall[1] = new Wall(3.3);
        wall[2] = new Wall(10.2);
        wall[3] = new Wall(222);

        Treadmill[] treadmill = new Treadmill[4];
        treadmill[0] = new Treadmill(222);
        treadmill[1] = new Treadmill(333);
        treadmill[2] = new Treadmill(444);
        treadmill[3] = new Treadmill(2255);

        someAction[] j = {
                new Cat("Дори"),
                new Human("Игорь"),
                new Robot("Exo"),
                new Cat("Саша")
        };

        for (int i = 0; i < j.length; i++) {
            j[i].jump(wall[i].getHeight());
        }

        for (int i = 0; i < j.length; i++) {
            j[i].run(treadmill[i].getDistance());
        }
    }
}
