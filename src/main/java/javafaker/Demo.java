package javafaker;

import com.github.javafaker.Faker;

public class Demo {

    protected static Faker faker = new Faker();

    public static void main(String[] args) {
        System.out.println(generateFakePersonName());
        System.out.println(generateFakeLastName());
        System.out.println(generateFakeEmailAddress());
        System.out.println(generateArtistName());
        System.out.println(generateFake());
        System.out.println(generateAnimal());
    }
    public static String generateFakePersonName(){
        Faker faker = new Faker();
        return "Hello my name is " + faker.name().firstName();
    }
    public static String generateFakeLastName(){
        return  "Surname is " + faker.name().lastName();
    }

    public static String generateFakeEmailAddress(){
        return "Email is: " + faker.internet().emailAddress();
    }

    public static String generateArtistName(){
        return faker.artist().name();
    }

    public static String generateFake(){
        return faker.chuckNorris().fact();
    }

    public static String generateAnimal(){
        return faker.animal().name(
                
        );
    }

}
