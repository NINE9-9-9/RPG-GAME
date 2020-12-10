package mode.fight;


public class Monster {


    public int attack = 15;

    public int defence = 7;

    public int hp = 75;

    public int HP = 100;

    public int mp = 0;

    public int MP = 0;

    public int lv = 1;

    public int speed = 11;

    public int exp = 20;

    public int monster = 0;

    public int gold;

    public boolean dropWeapon = false;

  //  public Weapon weapon = null;


    public Monster(int type) {

        if(type == 0) {

            this.HP = 50;
            this.hp = this.HP;
            this.MP = 0;
            this.mp = this.MP;
            this.attack=20;
            this.defence=10;
            this.speed=11;
            this.lv=1;
            this.exp=20;
            this.monster=type;


            this.gold = (int)(Math.random()*exp*2+exp/2);


        }
        else if(type == -1) {

            this.HP = 50;
            this.hp = this.HP;
            this.MP = 50;
            this.mp = this.MP;
            this.attack=20;
            this.defence=20;
            this.speed=10;
            this.lv=1;
            this.exp=30;
            this.monster=type;


            this.gold = (int)(Math.random()*exp*2+exp/2);


        }
        else if(type == 1) {

            this.HP = 100;
            this.hp = this.HP;
            this.MP = 100;
            this.mp = this.MP;
            this.attack=45;
            this.defence=35;
            this.speed=21;
            this.lv=6;
            this.exp=30;
            this.monster=type;


            this.gold = (int)(Math.random()*exp*2+exp/2);


        } else if(type == 2) {

            this.HP = 160;
            this.hp = this.HP;
            this.MP = 200;
            this.mp = this.MP;
            this.attack=75;
            this.defence=65;
            this.speed=33;
            this.lv=11;
            this.exp=50;
            this.monster=type;

            this.gold = (int)(Math.random()*exp*2+exp/2);


        } else if(type == 3) {

            this.HP = 500;
            this.hp = this.HP;
            this.MP = 300;
            this.mp = this.MP;
            this.attack=105;
            this.defence=95;
            this.speed=45;
            this.lv=16;
            this.exp=100;
            this.monster=type;

            this.gold = (int)(Math.random()*exp*2+exp/2);


        } else if(type == 4) {

            this.HP = 1200;
            this.hp = this.HP;
            this.MP = 400;
            this.mp = this.MP;
            this.attack=135;
            this.defence=125;
            this.speed=57;
            this.lv=21;
            this.exp=150;
            this.monster=type;



            this.gold = (int)(Math.random()*exp*2+exp/2);


        } else if(type == 5) {



            this.HP = 180;
            this.hp = this.HP;
            this.MP = 150;
            this.mp = this.MP;
            this.attack=40;
            this.defence=20;
            this.speed=19;
            this.lv=5;
            this.exp=50;
            this.monster=type;


            this.gold = (int)(Math.random()*exp*2+exp/2);



        } else if(type == 6) {


            this.HP = 500;
            this.hp = this.HP;
            this.MP = 500;
            this.mp = this.MP;
            this.attack=80;
            this.defence=40;
            this.speed=31;
            this.lv=10;
            this.exp=100;
            this.monster=type;


            this.gold = (int)(Math.random()*exp*2+exp/2);


        } else if(type == 7) {


            this.HP = 800;
            this.hp = this.HP;
            this.MP = 420;
            this.mp = this.MP;
            this.attack=120;
            this.defence=70;
            this.speed=43;
            this.lv=15;
            this.exp=150;
            this.monster=type;

            this.gold = (int)(Math.random()*exp*2+exp/2);

        } else if(type == 8) {


            this.HP = 1500;
            this.hp = this.HP;
            this.MP = 540;
            this.mp = this.MP;
            this.attack=300;
            this.defence=100;
            this.speed=55;
            this.lv=20;
            this.exp=150;
            this.monster=type;

            this.gold = (int)(Math.random()*exp*2+exp/2);

        } else if(type == 9) {

            this.HP = 3699;
            this.hp = this.HP;
            this.MP = 999;
            this.mp = this.MP;
            this.attack=540;
            this.defence=450;
            this.speed=99;
            this.lv=36;
            this.exp=999;
            this.monster=type;
            this.gold = (int)(Math.random()*exp*2+exp/2);



        }
        else if(type == 10)
        {

            this.HP = 1500;
            this.hp = this.HP;
            this.MP = 540;
            this.mp = this.MP;
            this.attack=200;
            this.defence=200;
            this.speed=55;
            this.lv=20;
            this.exp=150;
            this.monster=type;


            this.gold = (int)(Math.random()*exp*2+exp/2);

        }
        else if(type ==11)
        {

            this.HP = 1800;
            this.hp = this.HP;
            this.MP = 630;
            this.mp = this.MP;
            this.attack=270;
            this.defence=240;
            this.speed=55;
            this.lv=21;
            this.exp=160;
            this.monster=type;


            this.gold = (int)(Math.random()*exp*2+exp/2);

        }
        else if(type == 12)
        {

            this.HP = 2100;
            this.hp = this.HP;
            this.MP = 720;
            this.mp = this.MP;
            this.attack=300;
            this.defence=270;
            this.speed=55;
            this.lv=22;
            this.exp=170;
            this.monster=type;

            this.gold = (int)(Math.random()*exp*2+exp/2);


        }
        else if(type == 13)
        {

            this.HP = 2400;
            this.hp = this.HP;
            this.MP = 800;
            this.mp = this.MP;
            this.attack=360;
            this.defence=300;
            this.speed=55;
            this.lv=23;
            this.exp=180;
            this.monster=type;
            this.gold = (int)(Math.random()*exp*2+exp/2);

        }


    }

}
