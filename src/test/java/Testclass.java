import org.testng.Assert;
import org.testng.annotations.Test;
import org.mockito.Mock;

import static org.mockito.Mockito.when;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;

public class Testclass extends  WriteDataIntoCsv{

    // write some test here
    WriteDataIntoCsv writeDataIntoCsv = new WriteDataIntoCsv();

    @Test
    public void methodT() {
        String expected = "admin";
        String actual2 = writeDataIntoCsv.actual1;
        Assert.assertEquals(actual2, expected);

        assertNotNull(actual2);
       // when(actual2.isEmpty()).thenReturn();
       // when(actual2.compareTo(expected)).thenReturn(Integer.valueOf(expected));

    }

}
