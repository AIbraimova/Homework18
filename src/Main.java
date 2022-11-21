import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Person person1 = new Person("Aiperi");
        Person person2 = new Person("Aigerim");
        Person person3 = new Person("Akbermet");
        Person[] people = {person1, person2, person3};
        Apartment apartment = new Apartment(people);
        System.out.println(apartment);
        int counter = 0;
        System.out.println(apartment.uttilityBill());
        for (Person person : apartment.getFamily()) {
            apartment.getFamily();
            counter++;
        }
        System.out.println(counter);
        int counter1=0;

        Person person01 = new Person("Jenish");
        Person person02 = new Person("Adilet");
        Person[] people2 = {person01, person02};
        Hotel hotel = new Hotel(people2);
        System.out.println(hotel.rentalPeyment());
        System.out.println(hotel);
        for (Person per: hotel.getPeople()) {
            hotel.getPeople();
            counter1++;

        }
        System.out.println(counter1);

        int counter3 = 0;
        Person person4 = new Person("Kanykei");
        Person person5 = new Person("Ilim");
        Person person6 = new Person("Kutman");
        Person person7 = new Person("Jumadil");
        Person [] people3 = {person4,person5,person7,person6};
        Dormitory dormitory = new Dormitory(people3);
        System.out.println(dormitory.rentalPeyment());
        System.out.println(dormitory);
        for (Person perso:dormitory.getPeople()){
           
            counter3++;
        }
        System.out.println(counter3);


    }



}