package com.yash.runnable;

public class Attendance implements Runnable{
    public static int attendanceCount = 0;
    @Override
    public void run() {
        synchronized (this){
            ++attendanceCount;
        }
        System.out.println(attendanceCount + "- Attendance done");

    }
    public static int getAttendanceCount() {
        return attendanceCount;
    }
}
