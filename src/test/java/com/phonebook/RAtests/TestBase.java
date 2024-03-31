package com.phonebook.RAtests;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeMethod;

public class TestBase {

    public static final String token =
            "eyJhbGciOiJIUzI1NiJ9.eyJyb2xlcyI6WyJST0xFX1VTRVIiXSwic3ViIjoiZXNpbWluY2hAZ20uY29tIiwiaXNzIjoiUmVndWxhaXQiLCJleHAiOjE3MTEwMTIwODQsImlhdCI6MTcxMDQxMjA4NH0.VZPf1LIxdwf6S-CrhLPKCxFTO-GRFrX_4RCrOuV0nIs";

    public static final String AUTH = "Authorization";


    @BeforeMethod
    public void init() {
        RestAssured.baseURI = "https://contactapp-telran-backend.herokuapp.com";
        RestAssured.basePath = "v1";
    }
}
