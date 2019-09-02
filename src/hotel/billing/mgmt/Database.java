
package hotel.billing.mgmt;
import java.sql.*;
import javax.swing.JOptionPane;
import net.ucanaccess.commands.*;
import net.ucanaccess.complex.*;
import net.ucanaccess.console.*;
import net.ucanaccess.converters.*;
import net.ucanaccess.ext.*;
import net.ucanaccess.jdbc.*;
import net.ucanaccess.triggers.*;
import net.ucanaccess.util.*;
import net.proteanit.sql.*;

/**
 *
 * @author MOHAN
 */
public class Database {
    public Connection con=null;
    public Statement statement=null;
    public PreparedStatement ps=null;
    public ResultSet rs=null;
    
    public Database()
    {
       try
        {
            String location="C:\\Hotel Billing Mgmt\\hoteldb.accdb";
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            con=DriverManager.getConnection("jdbc:ucanaccess://" + location);
            statement=con.createStatement();
        }
        catch(Exception e1) 
        {
            JOptionPane.showMessageDialog(null, e1);
        }         
    }
}
