package HomeWork1Java2;

public class Human implements someAction {

    private String name;
    private double maxDistanceOfRun = 1000;
    private double maxHeightOfJump = 10.4;


    public Human(String name) {
        this.name = name;
    }


    @Override
    public void run(double x) {
        if(maxDistanceOfRun > x) {
            System.out.println("Человек пробежал");
        } else {
            System.out.println("Человек не пробежал");
        }
    }

    @Override
    public void jump(double y) {
        if(maxHeightOfJump > y) {
            System.out.println("человек прыгнул");
        } else {
            System.out.println("Человек не прыгнул");
        }
    }
}
