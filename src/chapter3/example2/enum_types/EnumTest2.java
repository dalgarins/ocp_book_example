package chapter3.example2.enum_types;

enum PrinterType2 {
    
    DOMATRIX(5), INJECKT(10), LASER(15);
    
    private int pagePrintCapacity;
    
    private PrinterType2(int capacity){
        this.pagePrintCapacity = capacity;                
    }
    
    public int getPrintPageCapacity(){
        return this. pagePrintCapacity;
    }    
}

public class EnumTest2 {
    
    PrinterType2 printerType2;
    
    public EnumTest2(PrinterType2 printerType2) {
        this.printerType2 = printerType2;
    }

    public void feature(){
        switch(printerType2){
            case DOMATRIX:
                System.out.println("Matrix");
                break;
            case INJECKT:
                System.out.println("Inject");
                break;
            case LASER:
                System.out.println("Laser");
                break;
        }
        System.out.println("Max Pages: " + printerType2.getPrintPageCapacity());
    }
    
    public static void main(String[] args) {

        EnumTest2 enum1 = new EnumTest2(PrinterType2.DOMATRIX);
        enum1.feature();
        EnumTest2 enum2 = new EnumTest2(PrinterType2.LASER);
        enum2.feature();
        System.out.println(PrinterType2.values());
    }
    
}
