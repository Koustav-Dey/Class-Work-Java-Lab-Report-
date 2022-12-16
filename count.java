public class count {
    // int counter = 0; // Create memory every time when object created and destory the memory with the end of object execution
    static int counter = 0; // Static crerate a memory single time
    count(){
        counter++;
        System.out.println(counter);
    }
    public static void main(String[] args){
        count s1 = new count();
        count s2 = new count();
        count s3 = new count();

        System.out.println(counter);

    }
}
