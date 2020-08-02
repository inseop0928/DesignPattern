package pattern.strategy.ex1;


public class Robot {
    private String name;
    private MovingStrategy movingStrategy;
    private AttackStrategy attackStrategy;


    public Robot(String name){
        this.name = name;
    }

    public void setMovingStrategy(MovingStrategy movingStrategy) {
        this.movingStrategy = movingStrategy;
    }

    public void setAttackStrategy(AttackStrategy attackStrategy) {
        this.attackStrategy = attackStrategy;
    }

    public void move(){
        movingStrategy.moving();
    }

    public void attack(){
        attackStrategy.attack();
    }


}
