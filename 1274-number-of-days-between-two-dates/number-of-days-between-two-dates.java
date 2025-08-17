class Solution {
    static int[] monthDay = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static int[] splitDate(String date){
        int[] parts = new int[3];
        int partIndex = 0;
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < date.length(); i++){
            char ch = date.charAt(i);
            if(ch == '-'){
                parts[partIndex++] = Integer.parseInt(sb.toString());
                sb.setLength(0);
            }else{
                sb.append(ch);
            }
        }
        parts[partIndex] = Integer.parseInt(sb.toString());
        return parts;
    }

    public static int getDays(String date){
        int[] ymd = splitDate(date);
        int year = ymd[0];
        int month = ymd[1];
        int day = ymd[2];

        int days = 0;

        for(int y = 1970; y < year; y++){
            days += 365;
            if ((y % 4 == 0 && y % 100 != 0) || y % 400 == 0){
                days += 1;
            }
        }

        for(int m = 1; m < month; m++){
            days += monthDay[m - 1];
            if (m == 2 && ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)){
                days += 1;
            }
        }

        days += day;
        return days;
    }

    public int daysBetweenDates(String date1, String date2){
        return Math.abs(getDays(date1) - getDays(date2));
    }
}
