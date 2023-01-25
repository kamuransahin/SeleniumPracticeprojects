package com.cydeo.tests.day9_javafaker_testBase_driverUtıls;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class JavaFakerPractice {

    @Test

    public void test1(){
        //Creating Faker object to reach method
        Faker faker=new Faker();

        System.out.println("faker.chuckNorris() = " + faker.chuckNorris().fact());

        String name=faker.name().firstName();
        System.out.println("name = " + name);

        String lastname=faker.name().lastName();
        System.out.println("lastname = " + lastname);

        String backToFuture=faker.backToTheFuture().character();
        System.out.println("backToFuture = " + backToFuture);

        System.out.println("faker.letterify(\"???-???\") = " + faker.letterify("???-???"));
        System.out.println("faker.numerify(\"###-###-####\") = " + faker.numerify("###-###-####"));
        System.out.println("faker.bothify(\"##?-???-###\") = " + faker.bothify("##?-???-###"));

        System.out.println("faker.finance().creditCard() = " + faker.finance().creditCard());
        System.out.println("faker.finance().creditCard().replaceAll(\"-\",\"\") = " + faker.finance().creditCard().replaceAll("-", ""));
    }
}
