public class Animal{
    String type;

    public Animal(String IN_type){
        type = IN_type;
    }

    public void describe(){
        System.out.println("I am a " + type);
    }

    public void sound(){
        System.out.println("Aninmal sounds");
    }

    public void sleep(){
        System.out.println("I am a sleeping " + type);
    }

    public void move(){
        System.out.println("The " + type + " is moving");
    }
}