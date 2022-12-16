class Std{
    // instance variable
    int id;
    String name;
    static String college ="SVU";//static variable 
    Std(int id, String name){
        this.id =id;
        this.name = name;
    }
    void display(  ){
        System.out.println("ID: " + id+"\n"+"Name: " + name+"\n"+"college: " + college);
    }
}
public class staticDemo {
    public static void main(String[] args){
        Std s1 = new Std(111,"karan");
        Std s2 = new Std(112,"koustav");
        s1.display();
        System.out.println("========================================================");
        s2.display();
    }

}