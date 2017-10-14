package chapter2.example2.test;

class Base {
    
}

class DeriveOne extends Base {
    
}

class DeriveTwo extends Base {
    
}

public class ArrayStore {

    public static void main(String[] args) {

        Base[] array = new DeriveOne[3];
        array[0] = new DeriveOne();
        array[2] = new DeriveTwo();
        System.out.println(array.length);
    }
    
}
