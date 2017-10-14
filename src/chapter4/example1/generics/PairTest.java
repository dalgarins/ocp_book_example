package chapter4.example1.generics;

class Pair<T1, T2> {
    
    T1 object1;
    T2 object2;
    
    Pair(T1 obj1, T2 obj2){
        this.object1 = obj1;
        this.object2 = obj2;
    }
    
    public T1 getFirst(){
        return object1;
    }
    
    public T2 getSecond(){
        return object2;
    }
    
}

public class PairTest {

    public static void main(String[] args) {
        
        Pair<Integer, String> pair = new Pair<>(2018, "Rusia");
        System.out.println("World Cup " + pair.getFirst() + " in " + pair.getSecond());
        
    }

}
