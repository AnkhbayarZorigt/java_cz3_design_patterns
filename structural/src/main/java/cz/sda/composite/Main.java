package cz.sda.composite;

public class Main {
    public static void main(String[] args) {
        var ceo = new CEO("Darth Sidius (Emperor)");
        var manager = new Manager("Darth Vader");
        var subManager = new Manager("Stormtrooper commander");
        var worker1 = new Worker("Stormtrooper 1");
        var worker2 = new Worker("Stormtrooper 2");
        var worker3 = new Worker("Stormtrooper 3");

        ceo.add(manager);
        manager.add(subManager);
        subManager.add(worker1);
        subManager.add(worker2);
        subManager.add(worker3);

        ceo.printSubordinates();
        System.out.println("------------------------------");
        worker2.printSuperiors();
        System.out.println("------------------------------");
        manager.moveToSuperior(subManager, ceo);
        ceo.printSubordinates();
        System.out.println("------------------------------");
        worker2.printSuperiors();
    }
}
