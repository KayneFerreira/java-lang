package design_patterns.behavioral.strategy.robot_behaviour;

public class AggressiveBehaviour implements Behaviour {

    @Override
    public void move() {
        System.out.println("O robô está se movendo agressivamente!");
    }
}
