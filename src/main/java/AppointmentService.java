import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppointmentService {
    Scanner scan = new Scanner(System.in);
    List<Appointment> appointments = new ArrayList<>();


    public void getAppointment(DoctorService doctorService) {
        doctorService.printDoctor();
        System.out.println("Select the doctor you want to make an appointment with:(Number)");
        int selectDoctor = scan.nextInt();
        if (doctorService.getDoctorById(selectDoctor) != null) {
            Doctor doctor = doctorService.getDoctorById(selectDoctor);
            if (!doctor.getDates().isEmpty()) {
                System.out.println("Please enter your name");
                scan.nextLine();
                String name = scan.nextLine();
                System.out.println("Dear " + name + ", dates you can make an appointment");
                for (int i = 0; i < doctor.getDates().size(); i++) {
                    System.out.println((i + 1) + " - " + doctor.getDates().get(i));
                }
                System.out.println("Enter the number of the date you want to make an appointment");
                int select = scan.nextInt();
                if (select > 0 && select < +doctor.getDates().size()) {

                    Appointment appointment = new Appointment(name, doctor, doctor.getDates().get(select - 1));
                    this.appointments.add(appointment);
                    System.out.println("Dear " + name + " Your appointment date: " + doctor.getDates().get(select - 1));
                    System.out.println("appointment number : " + appointment.getId() + " You can view your appointment information with");
                    doctor.getDates().remove(select - 1);

                } else {
                    System.out.println("Incorrect entry");
                }
            } else {
                System.out.println(doctor.getName() + " Appointments are full, Please try again");
            }
        } else {
            System.out.println("You entered wrong");
        }

    }
    public void printApp(){
        boolean isExist = true;
        System.out.println("Enter appointment number");
        int appId = scan.nextInt();
        for(Appointment app: this.appointments){
            if (app.getId()==appId){
                isExist=true;
                System.out.println("--------------------------------");
                System.out.println(appId + " Appointment information");
                System.out.println("Patient name: " + app.getName());
                System.out.println("Department: " + app.getDoctor().getName());
                System.out.println("Doctor: " + app.getDoctor().getName());
                System.out.println("Appointment date: "+ app.getDate());
                System.out.println("--------------------------------");
                break;
            }else{
                isExist=false;
            }
        }
        if (!isExist){
            System.out.println("Appointment not found");
        }
    }








}
