package main.com.JavaProgrammingMasterclassUpdatedToJava17.Polymorphism.Demo;

public class NextMain {
    public static void main(String[] args) {
        Movie movie = Movie.getMovie("A","jaws");
        movie.watchMovie();

        var airplane =Movie.getMovie("C","Airplane");
        airplane.watchMovie();

    }
}
