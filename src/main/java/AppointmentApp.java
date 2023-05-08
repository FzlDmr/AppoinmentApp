import java.util.Scanner;

public class AppointmentApp {
    public static void main(String[] args) {
        start();
    }

    //int disinda girilince hata veriyor bunun icin try catch kullan


    public static void start() {
        Scanner scan = new Scanner(System.in);
        AppointmentService appointmentService = new AppointmentService();
        DoctorService doctorService = new DoctorService();

        System.out.println("Welcome to the appointment system");
        int select;
        do {
            System.out.println("1-Make an appointment\n2-View appointment\n0-Exit");
            select=scan.nextInt();
            switch (select){
                case 1:
                    appointmentService.getAppointment(doctorService);
                    break;
                case 2:
                    appointmentService.printApp();
                    break;
                case 0:
                    System.out.println("We wish you a nice day");
                default:
                    System.out.println("You made an incorrect entry. Please try again");
                    break;
            }
        }while(select!=0);

    }


}
