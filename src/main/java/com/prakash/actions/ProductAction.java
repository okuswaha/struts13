package com.prakash.actions;

import com.prakash.forms.ProductForm;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by okuswaha on 5/18/2017.
 */
public class ProductAction extends Action{
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        ProductForm productForm = (ProductForm) form;
        productForm.setProductId("123");
        productForm.setProductName("VSC");
        productForm.setProductDesc("Vehicle Service Agreement");
        return mapping.findForward("success");
    }
}
