package school.management;

public abstract class Person {
     String name;
    String address;

    //Non arguments constructor
    public Person(){
        this.name = "";
        this.address = "";
    }

    // Two arguments constructor
    public Person(String name, String address){
        this.name = name;
        this.address = address;
    }

    // Get name
    public String getName(){
        return name;
    }

    // Get adress
    public String getAddress(){
        return address;
    }

    // Set name
    public void setName(String name){
        this.name = name;
    }

    // Set address
    public void setAddress(String address){
        this.address = address;
    }

    @Override
    public String toString() {
        return name + "->" + address;
    }
}
