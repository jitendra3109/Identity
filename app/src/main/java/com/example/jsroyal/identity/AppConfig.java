package com.example.jsroyal.identity;

/**
 * Created by jsroyal on 5/4/17.
 */

public class AppConfig {
    //URL to our login.php file
    public static final String LOGIN_URL = "http://api.whitepanda.in/api/writers/login";

    //Keys for email and password as defined in our $_POST['key'] in login.php
    public static final String KEY_EMAIL = "username";
    public static final String KEY_PASSWORD = "password";

    //If server response is equal to this that means login is successful
    public static final String LOGIN_SUCCESS = "success";

}

