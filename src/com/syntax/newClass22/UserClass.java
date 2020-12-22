package com.syntax.newClass22;

public class UserClass {
    /*Write program: userClass  that has a constructor
       that initializes instance variable name and mobile number.
       Create a subclass  userInfo that will have user address variable
       and it also being initialized through constructor call.
       Print users name, mobile number and address in userDetails method.
       Test your code.*/
    private String name, mobileNumber;

    UserClass(String name, String mobileNumber) {
        this.name = name;
        this.mobileNumber = mobileNumber;
    }

    public String getName() {
        return name;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }
}
