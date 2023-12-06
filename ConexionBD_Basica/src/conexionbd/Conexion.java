package conexionbd;

import java.sql.*;

public class Conexion {
    
    //Metodo para conectar con la base de datos. Pasa como parametro el nombre de la BD
    public static Connection ConectarBD(String bd){
        
        Connection conexion = null;
        
        String url = "jdbc:mysql://localhost:3306/";
        String usr = "root";
        String passwd = "";
        
        System.out.println("\n\tCONECTANDO...");
        
        try {
            
            conexion = DriverManager.getConnection(url+bd, usr, passwd);
            System.out.println("\n>>> Conexion establecida");
            
        }catch(SQLException e){
            
            System.out.println("\n>> Conexion fallida");
            System.err.println("\n" + e);
        }
        
        return conexion;
    }
    
    //Metodo para desconectar la base de datos
    public static void DesconectarBD(Connection cb){
        
        try {
            
            cb.close();
            System.out.println("\n>> Desconexion realizada\n");
            
        }catch(SQLException e){
            
            System.out.println("\n>> Desconexion fallida\n");
            System.err.println("\n" + e);
            
        }
    }
}
