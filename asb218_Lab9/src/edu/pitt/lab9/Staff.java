package edu.pitt.lab9;

public class Staff extends Person
{
	private String school;
	private double pay;

	public Staff(String name, String address, double pay)
	{
		super(name, address);
		this.pay = pay;
	}

	public void setSchool(String school)
	{
		this.school = school;
	}

	public String getSchool()
	{
		return this.school;
	}

	public void setPay(double pay)
	{
		this.pay = pay;
	}

	public double getPay()
	{
		return this.pay;
	}

	@Override
	public String toString()
	{
		return getName() + getAddress() + school + pay;
	}
}
