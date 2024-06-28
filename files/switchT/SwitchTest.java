package org.example.switchT;

public class SwitchTest {
    public static int getRandomNumber(int start, int end){
        return (int)(Math.random() * (end-start+1)) + start;
    }

    public static void main(String[] args) {

        int month = getRandomNumber(1,12);

        String monthString = "";
        switch(month) {
            case 1:monthString = "Jan"; break;
            case 2:monthString = "Feb"; break;
            case 3:monthString = "Mar"; break;
            case 4:monthString = "Apr"; break;
            case 5:monthString = "May"; break;
            case 6:monthString = "Jun"; break;
            case 7:monthString = "Jul"; break;
            case 8:monthString = "Aug"; break;
            case 9:monthString = "Sep"; break;
            case 10:monthString = "Oct"; break;
            case 11:monthString = "Nov"; break;
            case 12:monthString = "Dec"; break;
            default: monthString = "Invalid month"; break;
        }
        System.out.println(monthString);
    }
}
