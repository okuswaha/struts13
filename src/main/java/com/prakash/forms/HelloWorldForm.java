package com.prakash.forms;

import org.apache.struts.action.ActionForm;

/**
 * Created by okuswaha on 5/17/2017.
 */
public class HelloWorldForm extends ActionForm{
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
