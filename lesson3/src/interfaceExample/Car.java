package interfaceExample;

public class Car implements Vehicle, Production{

    String type, speed, color, location;

    public Car (String type,
                String speed,
                String color,
                String location){
        this.type = type;
        this.speed = speed;
        this.color = color;
        this.location = location;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public String getSpeed() {
        return speed;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String location() {
        return location;
    }
}
