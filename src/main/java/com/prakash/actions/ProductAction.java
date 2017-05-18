package com.prakash.actions;

import com.prakash.forms.ProductForm;
import org.apache.struts.actions.DispatchAction;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by okuswaha on 5/18/2017.
 */
public class ProductAction extends DispatchAction{
    private static final String UPDATE = "update";
    private static final String ADD = "add";
    private static final String DELETE= "delete";

    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        ProductForm productForm = (ProductForm) form;
        productForm.setProductId("123");
        productForm.setProductName("VSC");
        productForm.setProductDesc("Vehicle Service Agreement");
        String forward = request.getParameter("forward");
        ActionForward actionForward = mapping.findForward("success");
        if(ADD.equals(forward)){
            actionForward = mapping.findForward(ADD);
        }
        if(DELETE.equals(forward)){
            actionForward = mapping.findForward(DELETE);
        }
        if(UPDATE.equals(forward)){
            actionForward = mapping.findForward(UPDATE);
        }
        return actionForward;
    }

/*    public ActionForward addProduct(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        ProductForm productForm = (ProductForm) form;
        productForm.setProductId("123");
        productForm.setProductName("VSC");
        productForm.setProductDesc("Vehicle Service Agreement");
        return mapping.findForward(ADD);
    }

    public ActionForward updateProduct(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        ProductForm productForm = (ProductForm) form;
        productForm.setProductId("123");
        productForm.setProductName("VSC");
        productForm.setProductDesc("Vehicle Service Agreement");
        return mapping.findForward(UPDATE);
    }

    public ActionForward deleteProduct(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        ProductForm productForm = (ProductForm) form;
        productForm.setProductId("123");
        productForm.setProductName("VSC");
        productForm.setProductDesc("Vehicle Service Agreement");
        return mapping.findForward(DELETE);
    }
    */
}
