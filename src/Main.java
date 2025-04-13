public class Main {
    public static void main(String[] args) {
        System.out.println("Testing MyArrayList:");
        MyList<String> arrayList = new MyArrayList<>();
        arrayList.add("Banana");
        arrayList.add("Apple");
        arrayList.add("Cherry");

        System.out.println("Before sorting:");
        for (String item : arrayList) {
            System.out.println(item);
        }

        arrayList.sort();
        System.out.println("After sorting:");
        for (String item : arrayList) {
            System.out.println(item);
        }

        System.out.println("Index of Apple: " + arrayList.indexOf("Apple"));
        System.out.println("Contains Banana: " + arrayList.exists("Banana"));
        arrayList.remove(1);
        System.out.println("After removing index 1:");
        for (String item : arrayList) {
            System.out.println(item);
        }

        System.out.println("\nTesting MyLinkedList:");
        MyList<Integer> linkedList = new MyLinkedList<>();
        linkedList.add(15);
        linkedList.add(5);
        linkedList.add(30);

        System.out.println("Before sorting:");
        for (Integer num : linkedList) {
            System.out.println(num);
        }

        linkedList.sort();
        System.out.println("After sorting:");
        for (Integer num : linkedList) {
            System.out.println(num);
        }

        System.out.println("Index of 5: " + linkedList.indexOf(5));
        System.out.println("Contains 10: " + linkedList.exists(10));
        linkedList.remove(1);
        System.out.println("After removing index 1:");
        for (Integer num : linkedList) {
            System.out.println(num);
        }
    }
}
