import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvDate;
import com.opencsv.bean.CsvNumber;

import java.util.Date;

public class CSVBean {

    // here we only declare the variable and create their getter and setter and use annotation
    @CsvBindByName(column = "Id", required = true)
    private String id;

    @CsvBindByName(column = "Name", required = true)
    private String name;

    @CsvBindByName
    private String city;

    @CsvBindByName
    private String country;

    @CsvBindByName(column = "valid since")
    @CsvDate("dd.MM.yyyy")
    private Date userDate;

    @CsvBindByName(column = "annual salary")
    @CsvNumber("$#.##")
    private int userSalary;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Date getUserDate() {
        return userDate;
    }

    public void setUserDate(Date userDate) {
        this.userDate = userDate;
    }

    public int getUserSalary() {
        return userSalary;
    }

    public void setUserSalary(int userSalary) {
        this.userSalary = userSalary;
    }

    @Override
    public String toString() {
        return "CSVBean{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                '}';
    }

    public CSVBean() {
    }

     //create parameterized constructor
    public CSVBean(String id, String name, String city, String country) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.country = country;
    }
}
