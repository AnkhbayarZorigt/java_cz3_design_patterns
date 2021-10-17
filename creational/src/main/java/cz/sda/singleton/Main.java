package cz.sda.singleton;

public class Main {
    public static void main(String[] args) {
        var slytherin = new Slytherin();
        var griffindor = new Griffindor();

        slytherin.registerNewcomers();
        griffindor.registerNewcomers();

        System.out.println(EnumPeopleService.getInstance().getPeople());
    }

    static class Slytherin {
        void registerNewcomers() {
            var pplService = EnumPeopleService.getInstance();
            pplService.add("Draco Malfoy");
        }
    }

    static class Griffindor {
        void registerNewcomers() {
            var pplService = EnumPeopleService.getInstance();
            pplService.add("Harry Potter");
        }
    }
}
