package databases;

import parser.Student;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

public class UnitTestConnectDB {
    public static void main(String[] args) throws Exception {
        ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
        ConnectToSqlDB.connectToSqlDatabase();

    }
}
