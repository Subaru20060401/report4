package jp.ac.uryukyu.ie.subaru;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class WarriorTest {
    @Test
    void testAttackWithWeaponSkill() {
        for (int i= 1; i<3; i++) {
            Warrior warrior = new Warrior("テスト戦士", 100, 20);
            Enemy enemy = new Enemy("テストスライム", 100, 10);
            warrior.attackWithWeponSkill(enemy);
            enemy.attack(warrior);
            assertEquals(70, enemy.getHitPoint());
        }
    }
}


