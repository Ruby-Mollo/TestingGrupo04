package tudelft.leapyear;

public class LeapYear {

    public boolean isLeapYear(int year) {
        if ( year % 400 == 0)
            return true;
        if ( year % 100 == 0)
            return false;
<<<<<<< HEAD
        return ( year % 4 == 0 ) ? true : false;
=======
        return ( year % 4 == 0 ) ? false : true;
>>>>>>> 9e40de3bcd0ebc318ff0fb8549da862dff7507b5
    }
}
