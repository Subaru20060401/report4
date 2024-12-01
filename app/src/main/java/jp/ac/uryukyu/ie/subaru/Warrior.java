package jp.ac.uryukyu.ie.subaru;

public class Warrior extends LivingThing {
    public Warrior (String name, int hitPoint, int attack) {
        super(name, hitPoint, attack );
    }
    
    public void attackWithWeponSkill(LivingThing opponent){
        if (!isDead()) {
            int damage = (int) (1.5 * getAttack());
            System.out.printf("%sの攻撃！ウェポンスキルを発動！%sに%dのダメージを与えた！！\n", getName(), opponent.getName(), damage);
            opponent.wounded(damage);
        }
    }

}
