public class Fighter {
    String name;
    int health;
    int damage;
    int weight;

    Fighter(String name, int health,int damage, int weight ){
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;

    }

   int hit(Fighter foe){
       System.out.println(this.name + " => "+ foe.name + " caused "+ this.damage + " damage.");
       return Math.max(foe.health - this.damage, 0);
   }






}
