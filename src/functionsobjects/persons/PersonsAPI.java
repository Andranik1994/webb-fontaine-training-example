package functionsobjects.persons;

import java.util.Arrays;

public class PersonsAPI {

    //  Method which show Persons who working at company from arrayList
    public static void showPersonWhoWorkInCompany(final String companyName, final Person... people) {
        boolean isCompany = false;
        for (Person person : people) {
            if (person.company.name.equals(companyName)) {
                System.out.println(person.name + " who is " + person.age + " years old working at " + companyName);
                isCompany = true;
            }
        }
        if (!isCompany) {
            System.out.println("There is person who working on this company or there is no such type of company!");
        }
    }

    //  Method which return oldest Person from arrayList
    public static Person getOldestPerson(Person... people) {
        Person finalPerson = people[0];
        for (int i = 1; i < people.length; ++i) {
            if (people[i].age > finalPerson.age) {
                finalPerson = people[i];
            }
        }
        System.out.println(finalPerson.name + " is Oldest Person and he is " + finalPerson.age + " years old");
        return finalPerson;
    }

    //  Method which return youngest Person from array of Persons
    public static Person getYoungestPerson(Person... people) {
        Person finalPerson = people[0];
        for (int i = 1; i < people.length; ++i) {
            if (people[i].age < finalPerson.age) {
                finalPerson = people[i];
            }
        }
        System.out.println(finalPerson.name + " is Youngest Person and he is " + finalPerson.age + " years old");
        return finalPerson;
    }

    //  Method which return most repeated Age from array of Persons
    public static int getMostAgeValue(Person... people) {
        int count = 1;
        int tempCount;
        int popular = people[0].age;
        int temp;
        for (int i = 0; i < (people.length - 1); i++) {
            temp = people[i].age;
            tempCount = 0;
            for (int j = 1; j < people.length; j++) {
                if (temp == people[j].age)
                    tempCount++;
            }
            if (tempCount > count) {
                popular = temp;
                count = tempCount;
            }
        }

        System.out.println("Most popular number from people is = " + popular);
        return popular;
    }

    //  Method which order Array of people by age
    public static void orderByAge(Person... people) {
        boolean flag = true;
        while (flag) {
            flag = false;
            for (int i = 0; i < people.length - 1; ++i) {
                if (people[i].age > people[i + 1].age) {
                    Person tempPerson = people[i];
                    people[i] = people[i + 1];
                    people[i + 1] = tempPerson;
                    flag = true;
                    break;
                }
            }
        }
    }

    //  Method which order Array of people by name
    public static void orderByName(Person... people) {
        for (int i = 0; i < people.length-1; i++) {
            for (int j = i + 1; j < people.length; j++) {
                if (people[i].name.compareTo(people[j].name) > 0) {
                    Person temp = people[i];
                    people[i] = people[j];
                    people[j] = temp;
                }
            }
        }
    }

    //  Method which order Array of people by company name
    public static void orderByCompanyName(Person... people) {
        for (int i = 0; i < people.length-1; i++) {
            for (int j = i + 1; j < people.length; j++) {
                if (people[i].company.name.compareTo(people[j].company.name) > 0) {
                    Person temp = people[i];
                    people[i] = people[j];
                    people[j] = temp;
                }
            }
        }
    }


}
