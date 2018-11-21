public class Main {
    public static void main(String[] args) {
        Film film = new Film("Cube");

        System.out.println(film.name);
        System.out.println("Genre thrille");
        film.setDirector("\tVincenzo Natali");
        film.setDuration(" 90 min");

        Film filmTwo = new Film("Iron man");
        System.out.println(filmTwo.name);
        System.out.println("Genre adventure");
        film.setDirector("\tJon Favreau");
        film.setDuration(" 126 min");

        Film filmThird = new Film("Scarface");
        System.out.println(filmThird.name);
        System.out.println("Genre crime");
        film.setDirector("\tBrian De Palma");
        film.setDuration(" 170 min");

    }
}
