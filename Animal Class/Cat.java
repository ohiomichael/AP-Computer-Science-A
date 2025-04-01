public class Cat extends Animal{
    
    private String name;
    protected String breed;

    public Cat(String IN_name, String IN_breed){
        super("cat");
        name = IN_name;
        breed = IN_breed;
    }

    public void describe(){
        System.out.println("This is: " + name + ", a breed of cat called " + breed);
    }

    public void sound(){
        System.out.println("Sound: Meow");
    }

    public void sleep(){
        System.out.println("Sleeping: " + name + " is having purffect dreams");
    }

    public void move(){
        System.out.println("Moving: this little kitty moves fast");
    }
}
