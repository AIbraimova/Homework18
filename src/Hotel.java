import java.util.Arrays;

public class Hotel implements RentalPayments{
    public Person [] people;

    public Hotel(Person[] people) {
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
        return "Hotel{" +
                "people=" + Arrays.toString(people) +
                '}';
    }

    @Override
    public String rentalPeyment() {
        return "Pay a Rental!";
    }
}
