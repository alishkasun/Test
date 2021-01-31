package tcore;

public class Wall implements Obstacle {

    private float height;

    public Wall(float height) {
        this.height = height;
    }

    @Override
    public boolean tryMe(Participant participant) {
        boolean canJump = (participant.getHeight() >= height);

        if (canJump) {
            System.out.println(participant.toString() + " can jump");
        } else {
            System.out.println(participant.toString() + " cannot jump");
        }

        return canJump;
    }

    @Override
    public String toString() {
        return "Wall with height " + height;
    }
}
