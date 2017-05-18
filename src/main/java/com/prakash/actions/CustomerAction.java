package com.prakash.actions;

import com.prakash.forms.CustomerForm;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by okuswaha on 5/18/2017.
 */
public class CustomerAction extends Action{
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        CustomerForm customerForm = (CustomerForm) form;
        customerForm.setCustomerId("12345");
        customerForm.setCustomerName("Om Prakash Kuswaha");
        customerForm.setCustomerAddress("123 blamcklsdu , askdlgufl");
        return mapping.findForward("success");
    }
}
