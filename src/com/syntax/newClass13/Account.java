package com.syntax.newClass13;

public class Account {

    String accountId;
    String userName;
    String password;
    double balance;
    String typeOfAccount;
    double limit;
    boolean login(String enteredUserName, String enteredpassword) {
        if (userName.equals(enteredUserName) &&
                password.equals(enteredpassword)) {
            return true;
        } else {
            return false;
        }
    }
}
