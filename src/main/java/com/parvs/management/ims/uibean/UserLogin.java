package com.parvs.management.ims.uibean;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import org.ocpsoft.rewrite.annotation.Join;
import org.ocpsoft.rewrite.el.ELBeanName;
import org.primefaces.context.RequestContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

import com.parvs.management.ims.constants.ViewConstants;
import com.parvs.management.ims.impl.DaoFactory;
import com.parvs.management.ims.model.User;
import com.parvs.management.ims.service.UserLoginService;


@Scope(value = "session")
@Component(value = "userLogin")
@ELBeanName(value = "userLogin")
@Join(path = "/login", to = "/login.xhtml")
public class UserLogin implements Serializable{
	
 private static final long serialVersionUID = 1L;

	@Autowired
	public UserLoginService userLoginService;
	@Autowired
	private User user;
	

    @RequestMapping("/*")
	public String login() {
    	String l_user;
    	l_user = userLoginService.authenticateUser(user);
    	if(ViewConstants.USERROLE_ADMIN .equals(l_user))
    	{
    		return "adminDashboard?faces-redirect=true";
    	}else if (ViewConstants.USERROLE_EMPLOYEE.equals(l_user)) {
    		return "employeeDashboard?faces-redirect=true";
		}
		return null;
      
    }  
    
	public User getUser() {
		return user;
	}
	
	
	public void setUser(User user) {
		this.user = user;
	}

}
