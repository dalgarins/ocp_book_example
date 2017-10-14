package chapter3.example2.interfaces;

/**
 *
 * @author NoaD
 */
@FunctionalInterface
public interface Functional {
    
    int fo();
    
    boolean equals(Object obj);
    
    int hashCode();
    
    default int foo(){return 0;}
}
