package Array.LinkedLists.Challenge;

import java.util.LinkedList;
import java.util.Scanner;

record Place(String name,int distance){

    @Override
    public String toString() {
        return String.format("%s (%dKm)", name, distance);
    }
}



public class Main {

    public static void main(String[] args) {

        LinkedList<Place> placesToVisit = new LinkedList<>();

        Place adelaide = new Place("Adelaide", 1374);
        addPlace(placesToVisit, adelaide);
        addPlace(placesToVisit, new Place("adelaide", 1374));
        addPlace(placesToVisit, new Place("Brisbane", 917));
        addPlace(placesToVisit, new Place("Perth", 3923));
        addPlace(placesToVisit, new Place("Alice Springs", 2771));
        addPlace(placesToVisit, new Place("Darwin", 3972));
        addPlace(placesToVisit, new Place("Melbourne", 877));

        placesToVisit.addFirst(new Place("Sydney", 0));
        System.out.println(placesToVisit);


        var iterator = placesToVisit.listIterator();
        Scanner scanner  = new Scanner(System.in);
        boolean quitLoop = false;
        boolean forward = true;

        printMenu();

        while(!quitLoop){
            System.out.print("Enter Value: ");
            String menuItem = scanner.nextLine().toLowerCase().substring(0,1);
        }
    }

    private static void addPlace(LinkedList<Place> list, Place place){

        if(list.contains(place)){
            System.out.println("Found duplicate: " + place);
            return;
        }

        for(Place p:list){
            if(p.name().equalsIgnoreCase(place.name())){
                System.out.println("Found duplicate: " + place);
                return;
            }
        }

        int matchedIndex = 0;
        for(var listPlace : list){
            if(place.distance() <listPlace.distance()){
                list.add(matchedIndex,place);
                return;
            }
            matchedIndex++;
        }
        list.add(place);
    }

    private static void printMenu(){
        System.out.println("""
                Available actions(select word or letter):
                (F)orward
                (B)ackward
                (L)ist Places
                (M)enu
                (Q)uit""");
    }
}
