package core;

public class Date {
	int day;
	int year;
	int month;
	public Date(){
		
	}
public Date(int day,int year,int month){
	this.day=day;
	this.year=year;
	this.month=month;
}
public int getDay() {
	return day;
}
public void setDay(int day) {
	this.day = day;
}
public int getYear() {
	return year;
}
public void setYear(int year) {
	this.year = year;
}
public int getMonth() {
	return month;
}
public void setMonth(int month) {
	this.month = month;
}
public  void displayDate()
{
	System.out.println(day+"/"+month+"/"+year);
}
public static void main(String args[])
{
	Date d1 = new Date();
	d1.setDay(31);
	d1.setMonth(5);
	d1.setYear(2018);
	d1.displayDate();
}

	}
