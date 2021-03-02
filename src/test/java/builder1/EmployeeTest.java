package builder1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {



    @Test
    @DisplayName("Employee")
    void createEmployee() {

        Employee employee =  new Employee.EmployeeBuilder().build();

        employee.setLastname("perez");
        employee.setName("Juan");

        assertTrue(employee instanceof Employee);

        assertEquals(employee.getLastname(), "perez");
        assertEquals(employee.getName(), "Juan");
    }

}