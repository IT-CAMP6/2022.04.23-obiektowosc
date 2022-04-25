public class Client {
    String name;
    String surname;
    int age;
    long pesel;

    Address address;

    Client(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    Client(int age, long pesel) {
        this.age = age;
        this.pesel = pesel;
    }

    Client() {

    }

    Client(String name, String surname, int age, long pesel) {
        this(name, surname);
        this.age = age;
        this.pesel = pesel;
    }

    int calculate(int a, int b) {
        int result = a + b;
        return result;
    }

    int calculateDaysByAge() {
        return 365 * this.age;
    }

    int calculateDaysByAge(int a, String b) {
        return 0;
    }

    int calculateDaysByAge(int a, int b) {
        return 0;
    }

    int calculateDaysByAge(int a, int b, int c) {
        return 0;
    }

    int calculateDaysByAge(int a, int b, long c) {
        return 0;
    }

    String whoYouAre() {
        if(true) {
            return "1";
        }

        return "0";
    }

    void napiszJakMaszNaNazwisko() {
        System.out.println(surname);
    }

    Client metod() {
        return new Client();
    }

    void getOlder() {
        age++;
    }

    void m1() {
        //kod
    }

    void m2() {
        //kod
    }

    void m3() {
        //kod
    }

    void zrobKilkaRzeczy() {
        m1();
        m2();
        m3();
    }
}
