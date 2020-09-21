package functionsobjects.persons;

import java.util.Objects;

public class Company {

    public int workingPlace;
    public String name;
    public String SEOName;
    public String address;

    @Override
    public String toString() {
        return "Company -- " +
                "name = " + name +
                ", workingPlace = " + workingPlace +
                ", SEOName = " + SEOName +
                ", address = " + address +
                "\n\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Company company = (Company) o;
        return workingPlace == company.workingPlace &&
                Objects.equals(name, company.name) &&
                Objects.equals(SEOName, company.SEOName) &&
                Objects.equals(address, company.address);
    }

}
