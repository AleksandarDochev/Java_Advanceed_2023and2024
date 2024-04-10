package parrots;

public class Parrot {
//    First, write a Java class Parrot with the following fields:
//            •	name: String
//•	species: String
//•	available: boolean - true by default

    private String name;
    private String species;
    private boolean available;

    //The class constructor should receive (name, species).
    //Alt + Insert ->Constructor

    public Parrot(String name, String species) {
        this.name = name;
        this.species = species;
        this.available = true; //this should be true by default

    }
    //The class should also have the following methods:
    //•	getName()
    //•	getSpecies()
    //•	isAvailable()
    //•	setAvailable()
    //•	Override the toString() method in the format:
    //"Parrot ({species}): {name}"

    //Alt + Insert ->
    //only do getter for name and species

    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }
    //only do setter for isAvailable , because  "is"


    public void setAvailable(boolean available) {
        this.available = available;
    }

    //ALT + insert to String_>all
    //•	Override the toString() method in the format:
    //"Parrot ({species}): {name}"
    @Override
    public String toString() {
        return "Parrot{" +
                "name='" + name + '\'' +
                ", species='" + species + '\'' +
                ", available=" + available +
                '}';
    }
}
