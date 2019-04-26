public class HelloSpring {
    private String name;

    public HelloSpring(){

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void sayHello(){
        System.out.println(name);
    }
    public void init(){
        System.out.println("Bean will be init");
    }
    public void destroy(){
        System.out.println("Bean will be destroyed");
    }
}
