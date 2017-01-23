/*
  Gör en definition av en klass som är lämplig för att kunna representera ett datum på 2000-talet och en veckodag. Ge också en metod som givet ett datum returnerar dess veckodag.
  Tips: Den 1 jan 2000 var en lördag.
  (Räkna med skottår vart 4:e år, men strunta i övriga småvariationer. )
*/
import java.lang.*;

public class Four {

  MyDate date;

  public Four() {}

  public MyDate makeDate(int year, int month, int day) {
    try {
      date = new MyDate(year, month, day);
    } catch (InvalidDateException e) {
      System.out.println(e.getMessage());
    }

    return date;
  }

  public void printDate() {
    if (date == null) {
      System.out.println("No date yet");
    } else {
      System.out.println(date.toString());
    }
  }

  public void incDay() {
    try {
      date.incDay();
    } catch (InvalidDateException e) {
      System.out.println(e.getMessage());
    }
  }

  public void incMonth() {
    try {
      date.incMonth();
    } catch (InvalidDateException e) {
      System.out.println(e.getMessage());
    }
  }

  public void incYear() {
    try {
      date.incYear();
    } catch (InvalidDateException e) {
      System.out.println(e.getMessage());
    }
  }

  class InvalidDateException extends Exception {

      public InvalidDateException(){}

      //Constructor that accepts a message
      public InvalidDateException(String message) {
         super(message);
      }
  }


  class MyDate implements Cloneable {
    private int year;
    private int month;
    private int day;
    private String weekday;

    public MyDate(int year, int month, int day) throws InvalidDateException{

      this.year = year-2000;    //Gör saker snyggare längre ner i koden :P
      this.month = month;
      this.day = day;

      if (year < 2000 || year > 2999) {
        throw new InvalidDateException("The year is invalid, choose one from 2000 - 2999");
      }

      if (month < 1 || month > 12) {
        throw new InvalidDateException("The Month is invalid, choose one from 1 - 12");
      }

      if (isDayInvalid()) {
        throw new InvalidDateException("This is not a vaild date for the selected month");
      }

      this.weekday = findWeekday();
    }

    private boolean isDayInvalid() {
      if (day > 31) {
        return true;
      }

      switch (month) {
        case 2: return day > ((year%4 == 0) ? 29 : 28);
        case 4:
        case 6:
        case 9:
        case 11: return day > 30;
        default: return false;
      }
    }

    public void incDay() throws InvalidDateException {
      day++;
      if (isDayInvalid()) {
        day = 1;
        incMonth();
      } else {
        weekday = findWeekday();
      }
    }

    public void incMonth() throws InvalidDateException {
      month++;
      if (month%13 == 0) {
        month = 1;
        incYear();
      } else {
        weekday = findWeekday();
      }
    }

    public void incYear() throws InvalidDateException {
      year++;
      if (year == 1000) {
        year = 999;
        throw new InvalidDateException("Date overflow");
      }
      weekday = findWeekday();
    }

    private String findWeekday() {
      /* Känns onödigt svårt */
      int totalDays = daysFromYear() + daysFromMonth() + day;
      switch (totalDays%7) {
        case 0: return "Fredag";
        case 1: return "Lördag";
        case 2: return "Söndag";
        case 3: return "Måndag";
        case 4: return "Tisdag";
        case 5: return "Onsdag";
        case 6: return "Torsdag";
      }
      return "Bugger off!";
    }

    private int daysFromYear() {
      if (year == 0) {
        return 0;
      }
      int tmpDays = 0;
      int leapYears = (year - year%4) / 4 + 1;    //Lite bättre utan 2000år kanske
      tmpDays = (leapYears * 366) + ((year - leapYears) * 365); // Still ganska dåligt tal
      tmpDays -= (year%4 == 0) ? 1 : 0;
      return tmpDays;
    }

    private int daysFromMonth() {
      int tmpDays = 0;
      switch(month) {
        case 12:  tmpDays += 30;
        case 11:  tmpDays += 31;
        case 10:  tmpDays += 30;
        case 9:   tmpDays += 31;
        case 8:   tmpDays += 31;
        case 7:   tmpDays += 30;
        case 6:   tmpDays += 31;
        case 5:   tmpDays += 30;
        case 4:   tmpDays += 31;
        case 3:   tmpDays += (year%4 == 0) ? 29 : 28;
        case 2:   tmpDays += 31;
      }
      return tmpDays;

    }

    @Override
    public Object clone() throws CloneNotSupportedException {
      MyDate clone = (MyDate)super.clone();
      return clone;
    }

    @Override
    public String toString() {
      String pt1 = "Date: " + (2000 + year) + "-" + month + "-" + day;
      String pt2 = ((pt1.length() < 16) ? "\t\t" : "\t" ) + weekday;;
      return pt1 + pt2;
    }
  }
}
