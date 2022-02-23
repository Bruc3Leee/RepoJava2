package HomeWork1Java2;

public class Robot implements someAction {

    private String name;
    private double maxDistanceOfRun = 40000;
    private double maxHeightOfJump = 20.9;


    public Robot(String name) {
        this.name = name;
    }

    @Override
    public void run(double x) {
        if(maxDistanceOfRun > x) {
            System.out.println("робот пробежал");
        } else {
            System.out.println("Робот не пробежал");
        }
    }

    @Override
    public void jump(double y) {
        if(maxHeightOfJump > y) {
            System.out.println("Робот прыгнул");
        } else {
            System.out.println("Робот не прыгнул");
        }
    }
}
