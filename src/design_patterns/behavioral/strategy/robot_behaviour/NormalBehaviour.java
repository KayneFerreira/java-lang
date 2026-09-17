package design_patterns.behavioral.strategy.robot_behaviour;

public class NormalBehaviour implements Behaviour {

    @Override
    public void move() {
        System.out.println("O robo está se movendo normalmente!");
    }

}
