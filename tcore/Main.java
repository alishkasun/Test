package tcore;

public class Main {

    public static void main(String[] args) {
        Participant[] participants =
                {
                        new Man("Alex", 38, 1, 10),
                        new Man("Peter", 35, 2, 2),
                        new Cat("Kai", 3, 1.6f, 15),
                        new Cat("Vila", 8, 0.5f, 11),
                        new Robot("Alisa",2, 0, 110),
                        new Robot("Elena",9, 0, 0),
                };

        Obstacle[] obstacles = {
                new Wall(1.5f),
                new Wall(2f),
                new RunningTrack(5),
                new RunningTrack(15)
        };


        for (Participant participant :participants) {
            for (Obstacle obstacle : obstacles) {
                boolean isDone = obstacle.tryMe(participant);

                if (!isDone) {
                    System.out.println("Participant " + participant.toString() + " failed obstacle " + obstacle.toString() + ". Stop trial");
                    break;
                }
            }
        }
    }

//    private static void runCat() {
//        Cat cat = new Cat("Kai", 2, "black");
//        System.out.println("Имя кота" + " " + cat.name + "\n возраст: " + cat.age + "\n цвет кота" + " " + cat.color);
//        System.out.println(cat.name + " " + "can run and jump");
//        Cat.jump();
//    }



//    private static void runRobot() {
//        Robot robot = new Robot("Alisa", 485, "black");
//        System.out.println("Имя робота" + " " + robot.name + "\n номер робота: " + robot.number + "\n цвет робота" + " " + robot.color);
//        System.out.println(robot.name + " " + "can run and jump");
//    }

}