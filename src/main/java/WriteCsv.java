
import org.supercsv.cellprocessor.constraint.NotNull;
import org.supercsv.cellprocessor.constraint.StrRegEx;
import org.supercsv.cellprocessor.ift.CellProcessor;
import org.supercsv.io.CsvBeanWriter;
import org.supercsv.io.ICsvBeanWriter;
import org.supercsv.prefs.CsvPreference;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class WriteCsv {

    private static List<CSVBean> csvBean = new ArrayList<CSVBean>();

    //To add data

    static {
        csvBean.add(new CSVBean("21","baner", "pune","India"));
        csvBean.add(new CSVBean("22","baner", "california","USA"));
    }

private static CellProcessor[]  getProcessor()
{
    final String emailRegex = "[a-z0-9\\._]+@[a-z0-9\\.]+";

    StrRegEx.registerMessage(emailRegex,"must be a valid email address");

    final CellProcessor[] processors = new CellProcessor[]
            {
                    new NotNull(),
                    new NotNull(),
                    new NotNull(),
                    new NotNull(),

            };

return processors;
}

    public static void main(String[] args) {
        ICsvBeanWriter writer = null;
        try
        {
            writer=new CsvBeanWriter(new FileWriter("/Users/confluxsys/work/Practice/SarveshProject/sample.csv"), CsvPreference.STANDARD_PREFERENCE);
            final String[] header = new String[] {"Id","Name","City","Country"};
            final CellProcessor[] processors = getProcessor();
            writer.writeHeader(header);
            for(CSVBean c : csvBean){
                writer.write(c, header, processors);
            }

        }catch (IOException e)
        {
            e.printStackTrace();
        }finally {
            try{
                writer.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
