package main;

public abstract class Entity {

    protected int hp;
    protected int dmg;

    //Default Entity
    public Entity(){
        hp = 100;
        dmg = 10;
    }
    public Entity(int HP,int DMG){
        hp = HP;
        dmg = DMG;
    }


    public void increasedDmg(int add){
        dmg += add;
    }

    public int getHealth(){return hp;}

}
