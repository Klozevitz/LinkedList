public class Main_17 {
    public static void main(String[] args) {
        int[] array = new int[] {12, 43, 100, 4, 24, 6, 63};
        String[] arrayOfStrings = {"tube", "youtube", "alabama", "africa",
                "antarctica", "arctica", "rambler"};
        NodeString head = new NodeString(arrayOfStrings[0]);
        ListString list = new ListString(head);
        for (int i = 1; i < array.length; i++) {
            list.push(arrayOfStrings[i]);
        }
        //list.printList();

        System.out.println(Task01.task5(list));


        /*Node head = new Node(array[0]);
        List list = new List(head);
        for (int i = 1; i < array.length; i++) {
            list.push(array[i]);
        }
        //list.printList();
        System.out.println();
        list = Task01.Task4(list);
        list.printList();*/
    }
}
