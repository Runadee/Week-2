public class Main {
    public static void main(String[] args) {

        Fighter fighter1 = new Fighter("Jack",70,20,150);
        Fighter fighter2 = new Fighter("John",80,55,135);

        Match match = new Match(fighter1,fighter2,100,200);
        match.run();

    }
}
