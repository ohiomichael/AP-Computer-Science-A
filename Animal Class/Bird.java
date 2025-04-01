public class Bird extends Animal{
    protected String breed;

    public Bird(String IN_breed){
        super("Bird");
        breed = IN_breed;
    }

    public void move(){
        System.out.println("Move: the " + breed + " bird is moving.");
    }
}
