package tcore;

public class Robot implements Participant {

    private String name;
    private int number;

    private float canJumpHeight;
    private float canRunDistance;

    public Robot(String name, int number, float canJumpHeight, float canRunDistance) {
        this.name = name;
        this.number = number;
        this.canJumpHeight = canJumpHeight;
        this.canRunDistance = canRunDistance;
    }


    @Override
    public String toString() {
        return "Robot " + name;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public float getCanJumpHeight() {
        return canJumpHeight;
    }

    public float getCanRunDistance() {
        return canRunDistance;
    }

    @Override
    public float getHeight() {

        return canJumpHeight;
    }

    @Override
    public float getDistance() {

        return canRunDistance;

    }
}
