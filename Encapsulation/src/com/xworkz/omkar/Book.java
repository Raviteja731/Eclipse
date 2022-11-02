package com.xworkz.omkar;

public class Book {

	private String bookName = "Ramayan";
	double length;
	double weight;
	String writtenBy;
	int startedWriting;
	int finishedWriting;
	String printedCompany;
	String location;
	int pinCode;
	String type;
	int price;
	
	public Book(double length, double weight, String writtenBy, int startedWriting, int finishedWriting,
			String printedCompany, String location, int pinCode, String type, int price) {
		this.length = length;
		this.weight = weight;
		this.writtenBy = writtenBy;
		this.startedWriting = startedWriting;
		this.finishedWriting = finishedWriting;
		this.printedCompany = printedCompany;
		this.location = location;
		this.pinCode = pinCode;
		this.type = type;
		this.price = price;
	}
	public String getBookName()
	{
		return this.bookName;
	}
	void setBookName(String bookName)
	{
		this.bookName=bookName;
	}
	public void showOff()
	{
		System.out.println(this.writtenBy);
		System.out.println(this.type);
		System.out.println(this.length);
		System.out.println(this.startedWriting);
		System.out.println(this.finishedWriting);
		System.out.println(this.location);
		System.out.println(this.pinCode);
		System.out.println(this.price);
		System.out.println(this.printedCompany);
		System.out.println(this.weight);
	}
}
