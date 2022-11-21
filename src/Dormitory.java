import java.util.Arrays;

public class Dormitory implements RentalPayments{
  private Person[] people;

    public Dormitory(Person[] people) {
        this.people = people;
    }

    public Person[] getPeople() {
        return people;
    }

    public void setPeople(Person[] people) {
        this.people = people;
    }

    @Override
    public String toString() {
        return "Dormitory{" +
                "people=" + Arrays.toString(people) +
                '}';
    }

    @Override
    public String rentalPeyment() {
        return "Pay a Rental!";
    }
}
