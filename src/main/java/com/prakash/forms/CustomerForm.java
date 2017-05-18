package com.prakash.forms;

import org.apache.struts.action.ActionForm;

/**
 * Created by okuswaha on 5/18/2017.
 */
public class CustomerForm extends ActionForm {
    private String customerId;
    private String customerName;
    private String CustomerAddress;

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerAddress() {
        return CustomerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        CustomerAddress = customerAddress;
    }
}
