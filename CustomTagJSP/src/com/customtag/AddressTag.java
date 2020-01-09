package com.customtag;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class AddressTag extends TagSupport{

	@Override
	public int doStartTag() throws JspException {
		// TODO Auto-generated method stub
	
		
		JspWriter out = pageContext.getOut();
		
		try {
			
			out.println("Deloitte<br/>");
		

			out.println("House no. 13-A<br/>");
			out.println("Ambala City 134003<br/>");
			out.println("Haryana-India<br/>");
		}
		catch (IOException e) {
			
			
			e.printStackTrace();
			// TODO: handle exception
		}
		
		return super.doStartTag();
	}
	
	
	
}
