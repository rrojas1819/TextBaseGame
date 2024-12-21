package main;

public abstract class Entity {

    protected int hp;
    protected int dmg;
    protected int def;
    protected int debuff, debuffTime;


    //Default Entity
    public Entity() {
        hp = 100;
        dmg = 10;
        def = 5;
        debuff=0;
    }

    public Entity(int HP, int DMG, int DEF) {
        hp = HP;
        dmg = DMG;
        def = DEF;
        debuff=0;
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

    /***
     * Returns true if successful, returns false if fails
     ***/
    public boolean receiveDebuff(int amt,int time){
    //Time for rn is irrevent
        debuffTime=time;
        debuff = amt;
        dmg-= debuff;
        if(dmg < 5){
            dmg+=debuff;
            return false;
        }
        return true;
    }

    public void increasedDmg(int add) {
        dmg += add;
    }

    public int getHealth() {
        return hp;
    }

}