<<<<<<< HEAD
<<<<<<< HEAD

public class Memory {
    //HashMap<String, Double> memory = new HashMap<String,Double>();
    String[][] memory = new String[100][2];
    public Memory(){
        for(int i = 0; i<100; i++){
            memory[i][0] = String.valueOf(i);
        }
    }
    
    public String[][] get(){
        return memory;
    }
    
=======
public class Memory {

>>>>>>> 76b42c5 (fix: pull)
=======

public class Memory {
    //HashMap<String, Double> memory = new HashMap<String,Double>();
    String[][] memory = new String[100][2];
    public Memory(){
        for(int i = 0; i<100; i++){
            memory[i][0] = String.valueOf(i);
        }
    }
    
    public String[][] get(){
        return memory;
    }
    
>>>>>>> 4d26aad (fix: pull)
}
