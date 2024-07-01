class Person{
    String name;
    String address;
    int age;
    final String country = "Indonesia";

    void printAttribut(){
        System.out.println(this.name);
        System.out.println(this.address);
        System.out.println(this.age);
        System.out.println(this.country);
    }

}

public class Before_Constructor {
    public static void main(String[] args) throws Exception {
        Person person1 = new Person();
        person1.name = "Farhan";
        person1.address = "Banyuwangi";
        person1.age = 20;
//        person1.country = "Malaysia"; error karena tipe data final

        person1.printAttribut();
    }
}
