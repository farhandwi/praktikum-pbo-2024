class Persons{
    String name;
    String address;
    int age;
    final String country = "Indonesia";

    Persons(String name, String address, int age){
        this.name = name;
        this.address = address;
        this.age = age;
    }

    void printAttribut(){
        System.out.println(this.name);
        System.out.println(this.address);
        System.out.println(this.age);
    }

}

public class After_Constructor {
    public static void main(String[] args) throws Exception {
        Persons person1 = new Persons("Farhan", "Banyuwangi", 21);
        Persons person2 = new Persons("Akasyah", "Jakarta", 10);
        person1.printAttribut();
        person2.printAttribut();
    }
}
