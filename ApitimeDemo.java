package DateTime;

import java.util.Date;

public class ApitimeDemo {
    public static void main(String[] args) {
        Date dt=new Date();
        long timeInMs=dt.getTime();
        java.sql.Date dt1=new java.sql.Date(timeInMs);
        System.out.println(dt1);
    }
}
