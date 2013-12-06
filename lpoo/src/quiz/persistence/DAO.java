package quiz.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author marcia
 */
public abstract class DAO {
    static {
        try {
            //Registrando o driver da forma mais utilizada
        	// MySQL
            Class.forName("com.mysql.jdbc.Driver");
        	// JavaDB (Derby)
//        	Class.forName("org.apache.derb9jqhy.jdbc.ClientDriver");

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, ex.getMessage(), ex);
        }
    }

    public Connection getConnection(boolean autoCommit) throws SQLException {
        //Conectando-se ao SGBD
    	// MySQL
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/quiz_bd", "root", "");
    	// JavaDB (Derby)
        //Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/sample", "app", "12345");
        //S� queremos que a opera��o seja confirmada ap�s darmos um commit na conex�o
        conn.setAutoCommit(autoCommit);
        
        return conn;    
    }
    
}
