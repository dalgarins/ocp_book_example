package chapter7.example1.customexceptions;

public class InvalidInputException extends RuntimeException {

   public InvalidInputException(){
       super();
   }
    
   public InvalidInputException(String message){
       super(message);
   }
   
   public InvalidInputException(Throwable message){
       super(message);
   }
   
   public InvalidInputException(String message, Throwable throwable){
       super(message, throwable);
   }
}
