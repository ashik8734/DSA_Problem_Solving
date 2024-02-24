 import java.util.*;

 public class LList {
 public static void main(String[] args){
    LinkedList <String> list=new LinkedList<>();
    list.add("a");
    list.add("v");
    list.add("b");
    list.addLast("last");
    list.addFirst("z");
    list.add("c");
    
    String a=list.get(2);
    System.out.println(a);
    list.remove(2);
    System.out.println(list);
    }
 }
 