class Manager {

    Profile profile;

    public Manager() {
        profile = new Profile(15);
    }

    public void printAge() {
        System.out.println("AGE: " + profile.getAge());
    }

}


public class Profile {

    private static int age;

    Profile(int age) {
        Profile.age = age;
    }

    public int getAge() {
        return Profile.age;
    }



    public static void main(String[] args) {

        Manager manager = new Manager();

        manager.printAge();

    }

}
