package tcore;

public class RunningTrack implements Obstacle {

    private float distance;

    public RunningTrack(float distance) {
        this.distance = distance;
    }

    public float getDistance() {
        return distance;
    }

    @Override
    public boolean tryMe(Participant participant) {
        boolean canRunDistance = (participant.getDistance() >= distance);

        if (canRunDistance) {
            System.out.println(participant.toString() + " can run");
        } else {
            System.out.println(participant.toString() + " cannot run");
        }

        return canRunDistance;
    }

    @Override
    public String toString() {
        return "Running track with distance " + distance;
    }
}
