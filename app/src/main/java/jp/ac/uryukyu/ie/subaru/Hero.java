package jp.ac.uryukyu.ie.subaru;

public class Hero extends LivingThing{
    
    public Hero (String name, int hitPoint, int attack) {
        super(name, hitPoint, attack);
    }
    
    public void wounded(int damage){
        super.wounded(damage);
        if (this.isDead()) {
            System.out.printf("勇者%sは道半ばで力尽きてしまった。%n", getName());
        }
    }

}