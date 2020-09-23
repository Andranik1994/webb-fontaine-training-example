package functionsobjects;

import functionsobjects.persons.Company;
import functionsobjects.persons.DataProvider;
import functionsobjects.persons.Person;
import functionsobjects.persons.PersonsAPI;

import java.util.Arrays;

public class Task8 {

    public static void main(String[] args) {
        System.out.println("---Task_8---");

        // Create Random Persons Array With DataProvider.
        Person[] people = DataProvider.providePersonsWithCompanies(10);

        // Print people Array.
        System.out.println(Arrays.toString(people));

        // Init Company and provide Company Name. I do this type (Only Name because random company is unlikely to find in random people array)
        Company company = new Company();
        System.out.print("Input working Company name ");
        company.name = FunctionsObjects.scanner.next();

        // Call Persons API who work in Company
        PersonsAPI.showPersonWhoWorkInCompany(company.name, people);

        // Get youngest person from People array
        Person youngestPerson = PersonsAPI.getYoungestPerson(people);

        // Get oldest person from People array
        Person oldestPerson = PersonsAPI.getOldestPerson(people);

        // Get most popular year value
        int mostRepeatedValue = PersonsAPI.getMostAgeValue(people);

        // Order people by age.
        PersonsAPI.orderByAge(people);

        // Order people by name.
        PersonsAPI.orderByName(people);

        // Order people by Working company Name.
        PersonsAPI.orderByCompanyName(people);

        System.out.println();
    }
}
