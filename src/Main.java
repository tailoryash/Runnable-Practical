import com.yash.runnable.Attendance;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Attendance a = new Attendance();
        Thread student1 = new Thread(a);
        Thread student2 = new Thread(a);
        Thread student3 = new Thread(a);
        Thread student4 = new Thread(new Attendance());
        Thread student5 = new Thread(new Attendance());
        Thread student6 = new Thread(new Attendance());


        student1.start();
        student2.start();
        student3.start();
        student4.start();
        student5.start();
        student6.start();


        while(true){
            if(student3.isAlive() && student2.isAlive() && student1.isAlive() && student4.isAlive() && student5.isAlive() && student6.isAlive()){
                Thread.sleep(1000);
            }else{
                break;
            }
        }

        System.out.println("Total Attendance : " + Attendance.getAttendanceCount());
    }
}