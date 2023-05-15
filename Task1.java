import java.util.Arrays;
import java.util.LinkedList;

public class Task1{
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>(Arrays.asList(1,2,3,4,5));
        System.out.println(reverse(linkedList));
    }   
    public static LinkedList<Integer> reverse(LinkedList<Integer> linkedList) {
        LinkedList<Integer> rev_linkedlist = new LinkedList<>();
        for(int i=linkedList.size()-1;i>=0;i--){
            rev_linkedlist.add(linkedList.get(i));
        }
        return rev_linkedlist;       
    }  
}