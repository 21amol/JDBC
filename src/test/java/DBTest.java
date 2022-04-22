import org.junit.jupiter.api.Test;
import org.testng.Assert;

import java.sql.Connection;
import java.sql.SQLException;

class DBTest {
    static Connection a = null;

    @Test
    public void givenUpdatedData_shouldRetrieve_correctRecords() {
        try {
            DB db = new DB();
            a = db.connected();
            String expected = db.reteriveData(a);
            Assert.assertEquals("30000", expected);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

