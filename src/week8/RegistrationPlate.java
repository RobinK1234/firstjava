package week8;
public class RegistrationPlate {

    private final String regCode;
    private final String country;

    public RegistrationPlate(String country, String regCode) {
        this.regCode = regCode;
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    public String getRegCode() {
        return regCode;
    }



    @Override
    public String toString() {
        return country + " " + regCode;
    }

    public boolean equals(Object object) {
        if (object == null) {
            return false;

        }

        if (getClass() != object.getClass()) {

            return false;
        }
        RegistrationPlate compared = (RegistrationPlate) object;

        if (this.country == null || !this.country.equals(compared.getCountry())) {
            return false;
        }
        if (this.regCode == null || !this.regCode.equals(compared.getRegCode())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        if (this.country == null) {
            return 7;
        }
        return this.country.hashCode() + this.regCode.hashCode();
    }



}