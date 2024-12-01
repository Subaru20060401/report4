package jp.ac.uryukyu.ie.subaru;

/**
 * ヒーロークラス。
 *  String name; //敵の名前
 *  int hitPoint; //敵のHP
 *  int attack; //敵の攻撃力
 *  boolean dead; //敵の生死状態。true=死亡。
 * Created by tnal on 2016/11/13.
 */

public class LivingThing {
    private String name;
    private int hitPoint;
    private int attack;
    private boolean dead;

    public LivingThing(String name, int hitPoint, int attack) {
        this.name = name;
        this.hitPoint = hitPoint;
        this.attack = attack;
        this.dead = false;
    }
    
    public boolean isDead() {
        return dead;
    }

    public String getName() {
        return name;
    }

    public int getHitPoint() {
        return this.hitPoint;
    }
  
     public void setHitPoint(int var1) {
        this.hitPoint = var1;
    }
    
    public int getAttack() {
        return this.attack;
    }

    public void attack(LivingThing opponent) {
        if (this.hitPoint > 0) {
            int damage = (int) (Math.random() * this.attack);
            System.out.printf("%sの攻撃！%sに%dのダメージを与えた！%n", name, opponent.getName(), damage);
            opponent.wounded(damage);
        }

    }

    public void wounded(int damage) {
        this.hitPoint -= damage;
        if (this.hitPoint <= 0) {
            dead = true;
            System.out.printf("%sは倒れた。%n", name);
        }
    }

}
