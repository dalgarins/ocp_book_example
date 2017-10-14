package chapter3.example2.enum_types;


enum PrinterType {
    DOMATRIX, INKJET, LASER;
}

public class EnumTest {
    
    PrinterType printerType;
    
    public EnumTest(PrinterType printerType) {
       this.printerType = printerType;
    }
    
    public void feature(){
        switch(printerType){
            case DOMATRIX:
                System.out.println("Matrix");
                break;
            case INKJET:
                System.out.println("Injeccion de tinta");
                break;
            case LASER:
                System.out.println("Laser");
                break;
        }
    }

    public static void main(String[] args) {

        EnumTest test = new EnumTest(PrinterType.DOMATRIX);
        test.feature();
               
    }
    
}
