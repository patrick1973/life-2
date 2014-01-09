package DataAcces;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author patrick.vanieperen
 */
public class DatabaseBewerkingen {
  
    public void laadSqlDatabase()
    {
        Connection con = openSQLConnection();
        if (con != null)
        {
        }
    }

    public void maakSqlDatabase(String naam)
    {
        if (!checkDBExists(naam))
        {
            int response = JOptionPane.showConfirmDialog(null, "Database bestaat niet, wilt u een nieuwe Database aanmaken? ", "Maak een keuze", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
            if (response == JOptionPane.YES_OPTION)
            {
                try
                {
                    Connection conn = openSQLConnection();
                    if (conn != null)
                    {
                        // maak de SQL statments aan
                        Statement st = conn.createStatement();
                        String createDatabase = "CREATE DATABASE " + naam + ";";

                        // maak de database aan
                        st.executeUpdate(createDatabase);
                        // selecteer de database
                        st.executeUpdate("USE " + naam + ";");
                        // maak een tabel PERSOON aan
                        JOptionPane.showMessageDialog(null, "Database : "+ naam + " is aangemaakt");
                    }
                }
                catch (SQLException ex)
                {
                    JOptionPane.showMessageDialog(null, "SQL problemen : " + ex.getMessage(), "error", JOptionPane.ERROR_MESSAGE);
                }
            }
        } else
        {
             int response1 = JOptionPane.showConfirmDialog(null, "Database bestaat al, wilt u de database verwijderen? " + naam, "Maak een keuze", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
            if (response1 == JOptionPane.YES_OPTION)
            {
                DropDatabase(naam);
            }
        }
    }
    

/**
 * Deze methode is gemaakt om een database van de server te verwijderen
 * indien deze bestaat.
 * @param naamDatabase, de naam van de database die verwijderd moet worden.
 */
    public void DropDatabase(String naamDatabase) {
        if (checkDBExists(naamDatabase)) {
            try {
                // open de verbinding
                Connection con = openSQLConnection();
                String dropDb = "DROP DATABASE " + naamDatabase;
                // Execute query
                Statement st = con.createStatement();
                st.execute(dropDb);
                JOptionPane.showMessageDialog(null, "Database verwijderd", "INFO", JOptionPane.INFORMATION_MESSAGE);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Iets ging er mis->  " + ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Database bestaat niet ", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    
 /**
 * Controleren of een database bestaat op de server
 * @param dbName
 * @return true indien de naam bestaat anders return false.
 */
    public boolean checkDBExists(String dbName) {
        try {
            //Open de verbinding
            Connection conn = openSQLConnection();
            if (conn != null) // indien de SQLserver niet online is moet de onderstaande operatie niet uitgevoerd worden. dit resulteerd in Nulpointer
            {
            try (ResultSet resultSet = conn.getMetaData().getCatalogs()) {
                while (resultSet.next()) {
                    String databaseName = resultSet.getString(1);       //controleer of de naam voorkomt
                    if (databaseName.equalsIgnoreCase(dbName)) {
                        return true;
                    }
                }
            }
        } 
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Er is iets misgegaan met het openen van de connectie is de SQL server gestart ?" + ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return false;
    }
    
    
    /**
     * Open een verbinding met de SQL server Let op de user en het pass word die
     * zijn hardcoded.
     *
     * @return de open verbinding
     */
    private Connection openSQLConnection() {
        String url = "jdbc:mysql://localhost:3306/";
        String user = "root";
        String passw = "sql";
        try {
            //registreer JDBC Driver
            Class.forName("java.sql.Driver");

            //Open de verbinding
            return DriverManager.getConnection(url, user, passw);
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Er is iets misgegaan met het openen van de connectie : " + ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }
}
