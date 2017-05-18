package com.prakash.forms;

import org.apache.struts.action.ActionForm;

/**
 * Created by okuswaha on 5/18/2017.
 */
public class ProductForm extends ActionForm {
    private String productId;
    private String productName;
    private String productDesc;

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDesc() {
        return productDesc;
    }

    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc;
    }
}
