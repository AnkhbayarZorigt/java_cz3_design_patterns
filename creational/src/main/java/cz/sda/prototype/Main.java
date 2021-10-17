package cz.sda.prototype;

import cz.sda.prototype.service.PeopleServiceManager;

public class Main {
    public static void main(String[] args) {
        //        // s pouzitim prototype patternu
        System.out.println("creating manager");
        var svcManager = new PeopleServiceManager("h2:inmem");
        System.out.println("creating people");
        var griffindorService = svcManager.createPeopleService("griffindor");
        griffindorService.save("Harry Potter");
        var slytherinService = svcManager.createPeopleService("slytherin");
        slytherinService.save("Draco Malfoy");
        var hufflepuffService = svcManager.createPeopleService("hufflepuff");
        hufflepuffService.save("Luna Lovegood");
        var ravenclawService = svcManager.createPeopleService("ravenclaw");
        ravenclawService.save("Cederic Griggory");

        // bez pouzitia prototyp patternu
        //        System.out.println("creating people");
        //        var griffindorService = new PeopleService(new DbConnection("h2:inmem"), "griffindor");
        //        griffindorService.save("Harry Potter");
        //        var slytherinService = new PeopleService(new DbConnection("h2:inmem"), "slytherin");
        //        slytherinService.save("Draco Malfoy");
        //        var hufflepuffService = new PeopleService(new DbConnection("h2:inmem"), "hufflepuff");
        //        hufflepuffService.save("Luna Lovegood");
        //        var ravenclawService = new PeopleService(new DbConnection("h2:inmem"), "ravenclaw");
        //        ravenclawService.save("Cederic Griggory");
    }
}
