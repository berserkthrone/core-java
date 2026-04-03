package Array.LinkedLists;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

//        LinkedList<String> placesToVisit = new LinkedList<>();
        var placesToVisit = new LinkedList<String>();

        placesToVisit.add("Sydney");
        placesToVisit.add(0, "Canberra");
        System.out.println(placesToVisit);

        addMoreElements(placesToVisit);
        System.out.println(placesToVisit);

//        removeElements(placesToVisit);
//        System.out.println(placesToVisit);

//        retrieveElements(placesToVisit);
//        System.out.println(placesToVisit);
//
//        printItinerary(placesToVisit);
//        System.out.println(placesToVisit);
//
//        printItinerary2(placesToVisit);
//        System.out.println(placesToVisit);

        testIterator(placesToVisit);

    }

    public static void addMoreElements(LinkedList<String> list){
        list.addFirst("Darwin");
        list.addLast("Hobart");

        list.offer("Melbourne");
        list.offerFirst("Brisbane");
        list.offerLast("Toowoomba");

        list.push("Alice Springs");
    }

//    private static void removeElements(LinkedList<String> list){
//
//        list.remove(4);
//        list.remove("Brisbane");
//
//        System.out.println(list);
//        String s1 = list.remove();
//        System.out.println(s1 + " was removed");
//    }

    private static void retrieveElements(LinkedList<String> list){

        System.out.println("Retrieved Elements = " + list.get(4));

        System.out.println("First Elements = " + list.getFirst());
        System.out.println("Last Elements = " + list.getLast());

        System.out.println("Darwin is at position: " + list.indexOf("Darwin"));

    }

    private static void printItinerary(LinkedList<String> list){

        System.out.println("Trip starts at " + list.getFirst());
        for(int i = 1; i < list.size();i++){
            System.out.println("---->From: " + list.get(i -1) +
                    " to " + list.get(i));
        }
        System.out.println("Trip ends at " + list.getLast());
    }


    private static void printItinerary2(LinkedList<String> list){

        System.out.println("Trip starts at " + list.getFirst());
        String previousTown = list.getFirst();
        for(String town: list){
            System.out.println("----->From: " + previousTown + " to " + town);
            previousTown = town;
        }
        System.out.println("Trip ends at " + list.getLast());
    }

    private static void testIterator(LinkedList<String> list){

        var iterator = list.listIterator();
        while(iterator.hasNext()){
//            System.out.println(iterator.next());
            if(iterator.next().equals("Brisbane")){
                iterator.add("Lake Wivenhoe");
            }
        }
        while(iterator.hasPrevious()){
            System.out.println(iterator.previous());
        }
        System.out.println(list);
    }
}
