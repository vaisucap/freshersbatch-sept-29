package com.corejava.collections;

public class Contact {
	    private String name;
	    private String gender;
	    public Contact(String name, String gender)
	    {
	        super();
	        this.name = name;
	        this.gender = gender;
	    }
	    public String getName()
	    {
	        return name;
	    }
	    public String getGender()
	    {
	        return gender;
	    }
	    public String toString()
	    {
	        return "Contact[ name = "+name+" , gender = "+gender+" ]";
	    }
	}

