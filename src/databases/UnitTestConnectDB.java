package databases;

import parser.Student;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

public class UnitTestConnectDB {
    //public static User user = new User("Joe","3564","03/05/91");
    public static void main(String[] args) throws Exception {
        ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
        ConnectToSqlDB.connectToSqlDatabase();
       // Student student= new Student();
        Student st1=new Student("joe ","park","A","324NY");
        Student st2=new Student("peter ","park","B","567NY");
        Student st3=new Student("nattan ","scott","C","452NJ");
        ArrayList<Student> list =new ArrayList <>();
        list.add(st1);
        list.add(st2);
        list.add(st3);
        connectToSqlDB.insertDataFromArrayListToSqlTable(list,"Students","firstName");
       // connectToSqlDB.createTableFromStringToMySql2("myTable","Name","ID","DOB");
//        connectToSqlDB.insertProfileToSqlTable("myTable",user.getStName(),user.getStID(),user.getStDOB());
//        connectToSqlDB.readDataBase("myTable","Name","id","DOB");
    }
}
