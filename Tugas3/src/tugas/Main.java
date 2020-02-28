
package tugas;

import fly.*;
import sound.*;
import attack.*;
import defend.*;
public class Main {
    public static void main(String[] args) {
        Duck superDuck = new Duck(new RocketFly(), new NormalSound(), new HandGunAttack(), new WallDefend());
        System.out.println("Super Duck Behaviour :");
        System.out.print("Fly   : ");superDuck.fly();
        System.out.print("Sound : ");superDuck.sound();
        System.out.print("Attack: ");superDuck.attack();
        System.out.print("Defend: ");superDuck.defend();
        
        System.out.println("");
        System.out.println("Noob Duck Behaviour :");
        Duck noobDuck = new Duck(new WingsFly(), new KwekSound(), new SwordAttack(), new TamengDefend());
        System.out.print("Fly   : ");noobDuck.fly();
        System.out.print("Sound : ");noobDuck.sound();
        System.out.print("Attack: ");noobDuck.attack();
        System.out.print("Defend: ");noobDuck.defend();
        
        System.out.println("");
        System.out.println("Super Duck Change Fly and Attack Behaviour :");
        superDuck.setFlyBehaviour(new PlanesFly());
        superDuck.setAttackBehaviour(new SwordAttack());
        System.out.print("Fly   : ");superDuck.fly();
        System.out.print("Sound : ");superDuck.sound();
        System.out.print("Attack: ");superDuck.attack();
        System.out.print("Defend: ");superDuck.defend();
        
        System.out.println("");
        System.out.println("Noob Duck Change Attack and Defend Behaviour :");
        noobDuck.setAttackBehaviour(new SamuraiAttack());
        noobDuck.setDefendBehaviour(new WallDefend());        
        System.out.print("Fly   : ");noobDuck.fly();
        System.out.print("Sound : ");noobDuck.sound();
        System.out.print("Attack: ");noobDuck.attack();
        System.out.print("Defend: ");noobDuck.defend();
    }
}
