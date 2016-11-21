package controllers;

import play.*;
import play.db.jpa.JPA;
import play.mvc.*;

import java.util.*;

import models.*;

import javax.persistence.Query;

public class Application extends Controller {

    public static void index() {
        render();
    }

    public static void allAccounts() {
        List<Account> accounts = Account.findAll();
        render(accounts);
    }

    public  static void addAccount(){

        Account account = new Account();

        account.setName("Arij Hussain");

        account.save();


    }



}