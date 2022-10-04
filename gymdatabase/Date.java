package gymdatabase;
/*
 *  @author Bradley Kolczynkski
 */




import java.util.Calendar;




public class Date implements Comparable<Date>{

		
	private int year;
	private int month;
	private int day;
	// below is for leap years, divide year by 4, if not divisible not leap  year, if it is divide by 100, if divisible divide by 400 and if divisible then leap year, else not.
	public static final int QUADRENNIAL = 4;
	public static final int CENTENNIAL = 100;
	public static final int QUATERCENTENNIAL = 400;
	public static final int DAYS_IN_APRIL = 30;
    public static final int DAYS_IN_JUNE = 30;
    public static final int DAYS_IN_SEPTEMBER = 30;
    public static final int DAYS_IN_NOVEMBER = 30;

    public static final int JANUARY = 1;
    public static final int FEBRUARY = 2;
    public static final int MARCH = 3;
    public static final int APRIL = 4;
    public static final int MAY = 5;
    public static final int JUNE = 6;
    public static final int JULY = 7;
    public static final int AUGUST = 8;
    public static final int SEPTEMBER = 9;
    public static final int OCTOBER = 10;
    public static final int NOVEMBER = 11;
    public static final int DECEMBER = 12;

    public static final int MIN_YEAR = 1;
    public static final int MAX_YEAR = 2022;

    public static final int MAX_MONTH = 12;
    public static final int MIN_MONTH = 1;
    public static final int DAYS_IN_FEBRUARY_LEAP = 29;
    public static final int DAYS_IN_FEBRUARY_NONLEAP = 28;
    public static final int MIN_DAY = 1;
    public static final int MAX_DAYS_FOR_APRIL_JUNE_SEPTEMBER_NOVEMBER = 30;
    public static final int MAX_DAYS_FOR_MAY_DECEMBER_OCTOBER_JULY_AUGUST_MARCH_JANUARY = 31;
	
	public Date() {
		
		
		Calendar calendar = Calendar.getInstance();
		
		calendar.add(Calendar.MONTH, 1);
		
		this.year = calendar.get(Calendar.YEAR);
		this.month = calendar.get(Calendar.MONTH);
		this.day = calendar.get(Calendar.DAY_OF_MONTH);
		
	}
	
	public Date(String date) {
		
		String dateInput = date;
		
		this.month = Integer.parseInt(dateInput.substring(0, dateInput.indexOf("/")));
		this.day = Integer.parseInt(dateInput.substring(dateInput.indexOf("/")+1,dateInput.lastIndexOf("/")));
		this.year = Integer.parseInt(dateInput.substring(dateInput.lastIndexOf("/")+1, dateInput.length()));
		
	}
	
	public int getDay() {
		return this.day;
		
	}
	
	public int getYear() {
		return this.year;
	}
	
	public int getMonth() {
		return this.month;
	}
	
	@Override
	public int compareTo(Date date) {
		
		int day = this.day;
		int month = this.month;
		int year = this.year;
		
		int dayC = date.day;
		int monthC = date.month;
		int yearC = date.year;
		
		if(year > yearC) {
			return 1;
		}
		 else if (year == yearC) {

	            if (month > monthC) {

	                return 1;

	            } else if (month == monthC) {

	                if (day > dayC) {

	                    return 1;

	                } else if (day < dayC) {

	                    return -1;

	                } else if (day == dayC) {

	                    return 0;
	                }
	            } else if (month < monthC) {

	                return -1;
	            }

	            return -1;

	        } else if (year < yearC) {

	            return -1;

	        }
			
		return 0;
			
		}
		
		
	
	public boolean isValid() {
		
		try {
			boolean monthValid = false;
			boolean yearValid = false;
			boolean dayValid = false;
			
			Date current = new Date();
			
			if(year < MIN_YEAR || year > MAX_YEAR) {
				yearValid = false;
			}
			else {
				yearValid = true;
			}
			
			if(month > MAX_MONTH || month < MIN_MONTH) {
				monthValid = false;
			}
			else {
				monthValid = true;
			}
			if (month == MAY || month == DECEMBER || month == OCTOBER || month == MARCH || month == AUGUST || month == JULY || month == JANUARY) {

                if (day > MAX_DAYS_FOR_MAY_DECEMBER_OCTOBER_JULY_AUGUST_MARCH_JANUARY || day < MIN_DAY) {

                    dayValid = false;

                } 
                else {

                    dayValid = true;

                }

            } 
			else if (month == APRIL || month == JUNE || month == SEPTEMBER || month == NOVEMBER) {

                if (day > MAX_DAYS_FOR_APRIL_JUNE_SEPTEMBER_NOVEMBER || day < MIN_DAY) {

                    dayValid = false;

                } 
                else {

                    dayValid = true;

                }

            } 
			else if (month == FEBRUARY) {

                if (leapYear() == false && day <= DAYS_IN_FEBRUARY_NONLEAP && day >= MIN_DAY) {

                    dayValid = true;

                } else if (leapYear() == true && day <= DAYS_IN_FEBRUARY_LEAP && day >= MIN_DAY) {

                    dayValid = true;

                } else {

                    dayValid = false;

                }

            }

            if (monthValid == true && yearValid == true && dayValid == true) {

                return true;

            } else {

                return false;
            }
            
		}
		catch(Exception e) {
		
		
		
		return false;
		}
	}
	
	
	private boolean leapYear() {
		int isYearValid = year;
		if(isYearValid % 4 == 0) {
			if(isYearValid % 100 == 0) {
				if(isYearValid % 400 == 0) {
					return true;
				}
				else {
					return false;
				}
			}
			else {
				return true;
			}
		}
		else {
			return false;
		}
	}
	
	
	

}
