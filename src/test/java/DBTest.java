import org.junit.jupiter.api.Test;
import org.testng.Assert;

import java.sql.Connection;
import java.sql.SQLException;

class DBTest {
    static Connection a = null;


    @Test
    public void givenUpdatedData_shouldRetrieve_correctRecords() {
        try {
            a = DB.connected();
            String expected = DB.reteriveData(a);
            Assert.assertEquals("30000", expected);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Test
    void givenData_shouldRetrieveData_byName() {
        try {
            a = DB.connected();
            String expected = DB.reteriveDataByName(a);
            Assert.assertEquals("30000", expected);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Test
    void givenParticularDateRange_shouldReturn_correctRecords() {
        try {
            a = DB.connected();
            String expected = DB.particularDateRange(a);
            Assert.assertEquals("Apirya", expected);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Test
    void givenGender_shouldReturn_SumSalary() {
        try {
            a = DB.connected();
            String expected = DB.sumByGroup(a);
            Assert.assertEquals("110000.0", expected);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}


