package conexionbd;

import java.sql.*;

public class ConexionBD {

    public static void main(String[] args) {
        
        /*Variable del tipo Connection donde se guarda el nombre de la BD en el que se pasa como parametro el nombre de la BD al metodo ConectarBD
        en la clase Conexion.*/
        Connection bd = Conexion.ConectarBD("universidad");
        
        System.out.println("---------------------------------------------");
        
        System.out.println("\nConsultas terminadas");
        Conexion.DesconectarBD(bd);
    }
    
}
