public class Match {
    Fighter fighter1;
    Fighter fighter2;
    int minWeight;
    int maxWeight;

    Match(Fighter fighter1, Fighter fighter2, int minWeight, int maxWeight){
        this.fighter1 = fighter1;
        this.fighter2 = fighter2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    void run(){
        if (isCheck()){
            while (this.fighter1.health > 0 && this.fighter2.health > 0 ){
                this.fighter2.health = this.fighter1.hit(this.fighter2);
                System.out.println("John health : "  + this.fighter2.health);
            }


        } else {
            System.out.println("The weights of the athletes do not match.");
        }

    }

    boolean isCheck(){
        return (this.fighter1.weight >= minWeight && this.fighter1.weight <= maxWeight) && (this.fighter2.weight >= minWeight && this.fighter2.weight <= maxWeight);
    }









}
