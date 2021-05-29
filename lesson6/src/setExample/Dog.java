package setExample;

public class Dog implements Animal{
    public void eat(String food_name){
        System.out.println(food_name + " Dog");
    }

    public void bark (String type){
        System.out.println(type);
    }

    public static void main(String[] args){
        Animal baby2 = new Dog();
        //Mammal baby2 = new Dog();
        Dog baby2 = new Dog();
        baby2.eat("Meat");
        baby2.bark("Softly");
    }
}
