package main;

public abstract class Entity {

    protected int hp;
    protected int dmg;
    protected int def;


    //Default Entity
    public Entity() {
        hp = 100;
        dmg = 10;
        def = 5;
    }

    public Entity(int HP, int DMG, int DEF) {
        hp = HP;
        dmg = DMG;
        def = DEF;
    }


    public void takeDamage(int damage) {
       hp -= damage;
    }

    public void attack(Entity target) {
            target.takeDamage(dmg);
    }


    public void block(int damage){
        if (damage <= def){
            def -= damage;
        } else {
            int leftoverDamage = damage - def;
            def = 0;
            hp -= leftoverDamage;
        }
    }


    public void increasedDmg(int add) {
        dmg += add;
    }

    public int getHealth() {
        return hp;
    }

}