import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Doctor {
    private int id;
    private String name;
    private String department;
    private List<String> dates = new ArrayList<>();


    public Doctor(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
        LocalDate day = LocalDate.now();
        for (int i = 0; i < 7 ; i++) {
            day=day.plusDays(1);
            this.dates.add(day.toString());
        }
    }

    public List<String> getDates() {
        return dates;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
