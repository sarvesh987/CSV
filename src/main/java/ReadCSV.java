import com.opencsv.bean.CsvToBeanBuilder;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

public class ReadCSV {

    //Reading data from csv file , uses for each loop to retrieve data in proper manner

    public static void main(String[] args) throws IllegalStateException, FileNotFoundException{
            try{

                List<CSVBean> csvReader = (new CsvToBeanBuilder(new FileReader("/Users/confluxsys/work/Practice/SarveshProject/sample.csv")).withType(CSVBean.class).build().parse());

    for(CSVBean cr : csvReader)
    {
        System.out.println(cr.getId()+"*****"+cr.getName()+"*****"+cr.getCity()
                +"*****"+cr.getCountry()+"*****"+cr.getUserSalary()+"*****"+cr.getUserDate());
    }


            }catch (FileNotFoundException e)
            {
                e.printStackTrace();
            }

    }

}
