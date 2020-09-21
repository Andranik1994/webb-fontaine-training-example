package functionsobjects.persons;

import functionsobjects.FunctionsObjects;

import java.util.Random;

public class DataProvider {

    public static Person[] people;

    public static Company[] companies;

    public static Company company;

    static String[] names = {"Peter", "Andrew", "James", "Philip", "Bartholomew", "Matthew", "Thomas", "James", "Simon", "Judas", "Judas Iscariot"};
    static String[] companyNames = {"WF", "Google", "Facebook", "Alibaba", "Picsart", "Majestic", "Yandex", "Mail.ru", "Amazon", "Oracle"};
    static String[] address = {
            "Attorney St",
            "Audubon Ave",
            "Bank St",
            "Barclay St",
            "Barrow St",
            "Barry Rd",
            "Baruch Dr",
            "Battery Pl",
            "Baxter St",
            "Bayard St",
            "Beach St",
            "Beak St",
            "Bear Rd",
            "Beaver St",
            "Bedford St",
            "Beekman Pl",
            "Beekman St",
            "Bennett Ave",
            "Benson St",
            "Bethune St",
            "Bialystoker Pl",
            "Bleecker St",
            "Bloomfield St",
            "Bogardus Pl",
            "Bond St",
            "Bradhurst Ave",
            "Bridge St",
            "Broad St",
            "Broadway Terrace",
            "Brooklyn Bridge",
            "Broome St",
            "Cabrini Blvd",
            "Canal St",
            "Cannon St",
            "Carder Rd"
    };

    static Company[] provideCompanies(int quantity) {
        companies = new Company[quantity];
        for (int i = 0; i < quantity; ++i) {
            Company company = new Company();
            company.workingPlace = (new Random().nextInt(300));
            company.address = FunctionsObjects.getRandomStringFrom(address);
            company.name = FunctionsObjects.getRandomStringFrom(companyNames);
            company.SEOName = FunctionsObjects.getRandomStringFrom(names);
            companies[i] = company;
        }
        return companies;
    }

    public static Person[] providePersonsWithCompanies(int quantity) {
        people = new Person[quantity];
        for (int i = 0; i < quantity; ++i) {
            Person person = new Person();
            person.company = FunctionsObjects.getRandomCompanyFrom(provideCompanies(quantity));
            person.age = (new Random().nextInt(70));
            person.name = FunctionsObjects.getRandomStringFrom(names);
            people[i] = person;
        }
        return people;
    }


}
