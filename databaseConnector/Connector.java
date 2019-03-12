package databaseConnector;

import ORFinderAPP.Query;
import java.sql.*;

public class Connector {
    private Connection connection;

    public void getQuery(String name) throws SQLException {
        Statement statement;
        ResultSet resultSet;
        String header;
        String sequence;
        Query query;

        makeConnection();

        statement = connection.createStatement();
        resultSet = statement.executeQuery(String.format("SELECT * FROM header " +
                "WHERE name = %s", name));

        while (resultSet.next()) {
            header = resultSet.getString("name");
            sequence = resultSet.getString("sequence");

            query = new Query(header, sequence);
        }
    }

    private void makeConnection() throws SQLException {
        String url = "jdbc:mysql://hannl-hlo-bioinformatica-mysqlsrv.mysql.database.azure.com:3306/owe7_pg2" +
                "?useUnicode=true&serverTimezone=UTC";
        String user = "owe7_pg2@hannl-hlo-bioinformatica-mysqlsrv.mysql.database.azure.com";
        String password = "blaat1234";

        connection = DriverManager.getConnection(url, user, password);
    }
}
