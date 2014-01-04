package DataAcces;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author patrick.vanieperen
 */
public class DatabaseBewerkingen {

    /**
 * Controleren of een database bestaat op de server
 * @param dbName
 * @return true indien de naam bestaat anders return false.
 */
public boolean checkDBExists(String dbName)
{
    try{
        //Open de verbinding
        Connection conn = openSQLConnection();
        try (ResultSet resultSet = conn.getMetaData().getCatalogs())
            {
                while (resultSet.next())
                {               
                    String databaseName = resultSet.getString(1);       //controleer of de naam voorkomt
                    if(databaseName.equalsIgnoreCase(dbName))
                    {
                        return true;
                    }
                }
            }
        }
        catch(SQLException ex)
        {
         JOptionPane.showMessageDialog(null, "Er is iets misgegaan met het openen van de connectie is de SQL server gestart ?" + ex.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);    
        }
      return false;
}
    
    
    /**
 * Open een verbinding met de SQL server
 * @return de open verbinding
 */
public Connection openSQLConnection()
{
    String url = "jdbc:mysql://localhost:3306/";
    String user= "root";
    String passw= "sql";
    try
    {
         //registreer JDBC Driver
        Class.forName("java.sql.Driver");

        //Open de verbinding
        return DriverManager.getConnection(url, user, passw);
    }
   catch (ClassNotFoundException | SQLException ex)
    {
        JOptionPane.showMessageDialog(null, "Er is iets misgegaan met het openen van de connectie" + ex.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);  
    }
    return null;
   }   
}
