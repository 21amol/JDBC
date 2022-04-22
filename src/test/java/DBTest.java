import junit.framework.TestCase;
import org.testng.Assert;

import java.sql.Connection;
import java.sql.SQLException;

public class DBTest extends TestCase {
    static Connection a = null;

    public void testReteriveData() {
        try {
            DB db = new DB();
            a = DB.connected();
            String actual = DB.reteriveData(a);
            Assert.assertEquals("Admin", actual);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
