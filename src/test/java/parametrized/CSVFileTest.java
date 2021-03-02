package parametrized;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class CSVFileTest {

    @ParameterizedTest
    @CsvFileSource(resources = "/users-data.csv", numLinesToSkip = 1)
    void readCSVFile(String name, String role, Long id){
        System.out.println("Usuario name: " + name + " role: " + role + ",id: " + id);
    }

}
