import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        LinkedList<Integer> LinkedList = new LinkedList<>(Arrays.asList(1,2,3,4,5));
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ввод элемента:");
        enqueue(LinkedList, scanner.nextInt());
        System.out.println(LinkedList);
        System.out.println(dequeue(LinkedList));
        System.out.println(LinkedList);
        System.out.println(first(LinkedList));
        System.out.println(LinkedList);
        scanner.close();
    }
    public static void enqueue(LinkedList<Integer> LinkedList, int element){
        LinkedList.add(element);
    }
    public static int dequeue(LinkedList<Integer> LinkedList){
        int x = LinkedList.getFirst();
        LinkedList.removeFirst();
        return x;

    }
    public static int first(LinkedList<Integer> LinkedList){
        return LinkedList.getFirst();
    }
}