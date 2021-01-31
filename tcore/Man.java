package tcore;

public class Man implements Participant {

    private String name;
    private int age;

    private float canJumpHeight;
    private float canRunDistance;

    public Man(String name, int age, float canJumpHeight, float canRunDistance) {
        this.name = name;
        this.age = age;
        this.canJumpHeight = canJumpHeight;
        this.canRunDistance = canRunDistance;
    }


    @Override
    public String toString() {
        return "Man " + name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
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
