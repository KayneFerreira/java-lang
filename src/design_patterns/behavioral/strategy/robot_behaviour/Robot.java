package design_patterns.behavioral.strategy.robot_behaviour;

public class Robot {

    private Behaviour behaviour;

    public Robot(Behaviour behaviour) {
        this.behaviour = behaviour;
    }

    public void setBehaviour(Behaviour behaviour) {
        this.behaviour = behaviour;
    }

    public void move() {
        behaviour.move();
    }
}
