package DataObject;

import com.github.javafaker.Faker;

public interface LogInData {
    Faker faker = new Faker();

    String
         emailInput = "ketiziraqashvili@yahoo.com",
         passwordInputLogIn = "Qwerty123!",
         fakeEmail = faker.bothify("?????#@gmail.com"),
         fakePassword = faker.internet().password(),
         expectedMessage = "Logged in successfully";




}
