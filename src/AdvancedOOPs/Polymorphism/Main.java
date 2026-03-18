package AdvancedOOPs.Polymorphism;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Movie theMovie = Movie.getMovie("S", "Star Wars");
//        theMovie.watchMovie();

        Scanner s = new Scanner(System.in);
        while(true){
            System.out.print("Enter an option(A for Adventure, B for Comedy," +
                    " C for Science Fiction): ");
            String type = s.nextLine();
            if("Qq".contains(type)){
                break;
            }
            System.out.println("Enter Movie Title: ");
            String title = s.nextLine();
            Movie movie = Movie.getMovie(type, title);
            movie.watchMovie();
        }
    }
}
