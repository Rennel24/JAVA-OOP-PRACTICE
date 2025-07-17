import java.util.*;

public class LinkedListDemo {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        // ✅ add() - Add items
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        System.out.println("After add(): " + list);

        // ✅ addFirst(), addLast()
        list.addFirst("First");
        list.addLast("Last");
        System.out.println("After addFirst() & addLast(): " + list);

        // ✅ addAll()
        LinkedList<String> moreFruits = new LinkedList<>();
        moreFruits.add("Mango");
        moreFruits.add("Orange");
        list.addAll(moreFruits);
        System.out.println("After addAll(): " + list);

        // ✅ contains()
        System.out.println("Contains 'Apple'? " + list.contains("Apple"));

        // ✅ get(), getFirst(), getLast()
        System.out.println("Get index 2: " + list.get(2));
        System.out.println("First: " + list.getFirst());
        System.out.println("Last: " + list.getLast());

        // ✅ indexOf(), lastIndexOf()
        System.out.println("Index of Banana: " + list.indexOf("Banana"));
        System.out.println("Last index of Mango: " + list.lastIndexOf("Mango"));

        // ✅ isEmpty(), size()
        System.out.println("Is list empty? " + list.isEmpty());
        System.out.println("Size: " + list.size());

        // ✅ remove(), removeFirst(), removeLast()
        list.remove("Banana");
        list.removeFirst();
        list.removeLast();
        System.out.println("After removals: " + list);

        // ✅ offer(), offerFirst(), offerLast()
        list.offer("Kiwi");
        list.offerFirst("Start");
        list.offerLast("End");
        System.out.println("After offers: " + list);

        // ✅ peek(), peekFirst(), peekLast()
        System.out.println("Peek: " + list.peek());
        System.out.println("Peek First: " + list.peekFirst());
        System.out.println("Peek Last: " + list.peekLast());

        // ✅ poll(), pollFirst(), pollLast()
        list.poll();
        list.pollFirst();
        list.pollLast();
        System.out.println("After polling: " + list);

        // ✅ push(), pop()
        list.push("PushItem");
        System.out.println("After push: " + list);
        list.pop();
        System.out.println("After pop: " + list);

        // ✅ clone()
        LinkedList<String> clonedList = (LinkedList<String>) list.clone();
        System.out.println("Cloned list: " + clonedList);

        // ✅ forEach()
        System.out.println("Using forEach:");
        list.forEach(System.out::println);

        // ✅ replaceAll()
        list.replaceAll(e -> e.toUpperCase());
        System.out.println("After replaceAll(): " + list);

        // ✅ clear()
        list.clear();
        System.out.println("After clear(): " + list);
    }
}
