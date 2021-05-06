package polymorphismExample;

public class Boat extends Vehicle{

    public Boat(){
        super("Boat start",
                "Boat stop",
                "Boat speed",
                "Boat direction");
    }

    @Override
    public void speed() {
        System.out.println("Boat: 35 mph");
    }
}
