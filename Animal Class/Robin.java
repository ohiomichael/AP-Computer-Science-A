public class Robin extends Bird {
    private String name;

    public Robin(String IN_name){
        super("Robin");
        name = IN_name;
    }
    
    public void describe(){
        System.out.println("Describe: This is  " + name + " a robin");
    }

    public void sound(){
        System.out.println("Sound: the robin makes a caw caw");
    }

    public void sleep(){
        System.out.println("Sleep: the sleepy robin " + name + " is sleeping now");
    }
}
