public class Film {
    String name;

    public Film(String name) {
        this.name = name;
    }

    public void setDuration(String name) {
        this.name = name;
        class Duration {
            void display() {
                System.out.println("-- Duration" + name);
            }
        }
        Duration duration = new Duration();
        duration.display();

    }

    public void setDirector(String name) {
        this.name = name;
        class Director {
            void display() {
                System.out.println("-- Director:" + name);
            }
        }
        Director director = new Director();
        director.display();
    }
}