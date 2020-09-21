package functionsobjects.persons;

public class PersonsAPI {

    //  Method which show Persons who working at company from arrayList
    public static void showPersonWhoWorkInCompany(final String companyName, final Person... persons) {
        for (Person person : persons) {
            if (person.company.name.equals(companyName)) {
                System.out.println(person.name + " who is " + person.age + " years old working at " + companyName);
            }
        }
    }
//
//    //  Method which show oldest and youngest Person from arrayList
//    public static void showOldestAndYoungestPerson(Person... persons) {
//        Person personForPrint = new Person();
//
//        for (Person person : persons) {
//            if (person.age > personForPrint.age) {
//                personForPrint = person;
//            }
//        }
//        System.out.println(personForPrint.name + " is Oldest Person and he is " + personForPrint.age + " years old");
//        for (Person person : persons) {
//            if (person.age < personForPrint.age) {
//                personForPrint = person;
//            }
//        }
//        System.out.println(personForPrint.name + " is Youngest Person and he is " + personForPrint.age + " years old");
//    }


}
