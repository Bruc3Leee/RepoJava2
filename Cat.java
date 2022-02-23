package HomeWork1Java2;

public class Cat implements someAction {

    private String name;
    private double maxDistanceOfRun = 500;
    private double maxHeightOfJump = 3.3;


    public Cat(String name) {
        this.name = name;

    }

    @Override
    public void run(double x) {
        if(maxDistanceOfRun > x) {
            System.out.println("Котик пробежал");
        } else {
            System.out.println("не вышло");
        }
    }

    @Override
    public void jump(double y) {
        if(maxHeightOfJump > y) {
            System.out.println("Кот прыгнул");
        } else {
            System.out.println("кот не прыгнул");
        }
    }
}
