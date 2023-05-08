import javax.print.Doc;
import java.util.ArrayList;
import java.util.List;

public class DoctorService {

    List<Doctor> doctorList = new ArrayList<>();



    public DoctorService(){
        Doctor doctor1 = new Doctor(11,"Dr.Leonardo","Neurologist");
        Doctor doctor2 = new Doctor(22,"Dr.Donatello","Psychiatrist");
        Doctor doctor3 = new Doctor(33,"Dr.Raphael","General Surgeon");
        this.doctorList.add(doctor1);
        this.doctorList.add(doctor2);
        this.doctorList.add(doctor3);
    }

    public void printDoctor(){
        System.out.println("----------Doctors-------------");
        for (Doctor dr:this.doctorList){
            //System.out.println(dr.toString());
            System.out.println("Number: " + dr.getId() + " Name: " + dr.getName()+"Department: "+dr.getDepartment());
            System.out.println("Calender:");
            for (String date:dr.getDates()){
                System.out.println(date);
            }
        }
        System.out.println("------------------------------");
    }

    public Doctor getDoctorById(int id){
        for (Doctor dr:this.doctorList) {
            if(dr.getId()==id){
                return dr;
            }
        }return null;
    }






}
