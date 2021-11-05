package interface_demo;

public class PersonTest {
    public static void main(String[] args) {
        Person person1 = new BasketCoach("Tom",34 );
        person1.eat();
        System.out.println(person1);
        person1.eat();


        person1 =new PingPangCoach("Jack",35);
        System.out.println(person1);
        person1.eat();


        PingPangCoach pingPangCoach = (PingPangCoach) person1;
        pingPangCoach.teach();
        pingPangCoach.speakEnglish();


    }
}
