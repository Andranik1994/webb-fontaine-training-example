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

        // Init Company and provide Company Name
        Company company = new Company();
        company.name = FunctionsObjects.scanner.next();

        // Call Persons API who work in
        PersonsAPI.showPersonWhoWorkInCompany(company.name, people);

        System.out.println();
    }
}
