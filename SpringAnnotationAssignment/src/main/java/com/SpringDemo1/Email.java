package com.SpringDemo1;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;

public class Email  implements Serializable{

	@Autowired
	private To to;
@Autowired
	private From from;
	
	@Autowired(required=false)
private Body body;
	


@Autowired(required=false)
private Subject subject;


public Email() {
	// TODO Auto-generated constructor stub
}

public To getTo() {
	return to;
}



public void setTo(To to) {
	this.to = to;
}



public From getFrom() {
	return from;
}



public void setFrom(From from) {
	this.from = from;
}



public Body getBody() {
	return body;
}



public void setBody(Body body) {
	this.body = body;
}



public Subject getSubject() {
	return subject;
}



public void setSubject(Subject subject) {
	this.subject = subject;
}



@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((body == null) ? 0 : body.hashCode());
	result = prime * result + ((from == null) ? 0 : from.hashCode());
	result = prime * result + ((subject == null) ? 0 : subject.hashCode());
	result = prime * result + ((to == null) ? 0 : to.hashCode());
	return result;
}



@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Email other = (Email) obj;
	if (body == null) {
		if (other.body != null)
			return false;
	} else if (!body.equals(other.body))
		return false;
	if (from == null) {
		if (other.from != null)
			return false;
	} else if (!from.equals(other.from))
		return false;
	if (subject == null) {
		if (other.subject != null)
			return false;
	} else if (!subject.equals(other.subject))
		return false;
	if (to == null) {
		if (other.to != null)
			return false;
	} else if (!to.equals(other.to))
		return false;
	return true;
}



@Override
public String toString() {
	return "Email [to=" + to + ", from=" + from + ", body=" + body + ", subject=" + subject + "]";
}



public Email(To to, From from, Body body, Subject subject) {
	super();
	this.to = to;
	this.from = from;
	this.body = body;
	this.subject = subject;
}







}
