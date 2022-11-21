import java.util.Arrays;

public class Apartment implements UttilityBills{
    private Person [] family;

    public Apartment(Person[] family) {
        this.family = family;
    }

    public Person[] getFamily() {
        return family;
    }

    public void setFamily(Person[] family) {
        this.family = family;
    }

    @Override
    public String toString() {
        return "Apartment{" +
                "family=" + Arrays.toString(family) +
                '}';
    }

    @Override
    public String uttilityBill() {
        return "Pay a Uttility Bills!";
    }
}
