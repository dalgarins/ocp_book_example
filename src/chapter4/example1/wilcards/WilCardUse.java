package chapter4.example1.wilcards;

import java.util.ArrayList;
import java.util.List;

public class WilCardUse {

    static void printList(List<?> list){
        for (Object obj : list) {
            System.out.println("[" + obj + "]");
        }
    }
    
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(100);
        printList(list);
        
        List<String> strList = new ArrayList<>();
        strList.add("10");
        strList.add("100");
        printList(strList);
        
        
        
        /*List<?> wildCardList = new ArrayList<Integer>();
        wildCardList.add(new Integer(8));
        System.out.println(wildCardList);*/
    }
    
}
