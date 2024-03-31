package com.phonebook.RAtests;

import com.phonebook.dto.ContactDto;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.containsString;

public class AddContactTests extends TestBase{

    @Test
    public void addContactSuccessTest() {
        ContactDto dto = ContactDto.builder()
                .name("Adam")
                .lastName("Kross")
                .email("vxoss@gm.com")
                .phone("1234567890")
                .address("Urartu")
                .description("hambal")
                .build();
      //  MessageDto message =
                given()
                .contentType(ContentType.JSON)
                .header(AUTH, token)
                .body(dto)
                .when()
                .post("contacts")
                .then()
                .assertThat().statusCode(200)
                .assertThat().body("message",containsString("Contact was added!"));
              //  .extract().response().as(MessageDto.class);
       // System.out.println(message.getMessage());

    }
}

   // Contact was added! ID: d8dec11b-4fe9-4c51-8949-ac658f988ced
