package com.customtag;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class NameTag extends TagSupport{

	
	
	public int getNoOfTimes() {
		return noOfTimes;
	}

	public void setNoOfTimes(int noOfTimes) {
		this.noOfTimes = noOfTimes;
	}

	public String getNameToPrint() {
		return nameToPrint;
	}

	public void setNameToPrint(String nameToPrint) {
		this.nameToPrint = nameToPrint;
	}

	private int noOfTimes;
	private String nameToPrint;
	
	@Override
	public int doStartTag() throws JspException {
		// TODO Auto-generated method stub
	
		
		JspWriter out = pageContext.getOut();
		
		try {
			
			out.println("Welcome<br/>" + nameToPrint);
		

			//out.println("Kumar<br/>");
			}
		catch (IOException e) {
			
			
			e.printStackTrace();
			// TODO: handle exception
		}
		
		
		
		for(int i =1;i<noOfTimes;i++)
		{
			
			try
			{
				out.print("<h1> " + nameToPrint +"</h1>");
			}
			catch (IOException e) {
				// TODO: handle exception
			
			e.printStackTrace();			}
		}
		
		return super.doStartTag();
	}
	
	
	
}
