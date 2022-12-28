package ar.com.example.proyectocodoacodo2022.daos;


import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import ar.com.example.proyectocodoacodo2022.connection.AdministratorConnexions;
import ar.com.example.proyectocodoacodo2022.dto.estudiantecac;

public class estudiantecacDAO {


    public estudiantecacDAO(int idPersona, String nombre, String apellido, int edad) {
    }

    /*métodos del crud*/
    public estudiantecacDAO obtenerPorIdPersona(int id) {
        String sql = "SELECT * FROM estudiante WHERE ID="+id;

        //Connection
        Connection con = AdministratorConnexions.getConnection();

        estudiantecacDAO estudiantFromDb = null;

        /*Statement*/
        try {
            Statement st = con.createStatement();

            //resultset
            ResultSet rs = st.executeQuery(sql);

            //VIENE UN SOLO REGISTRO!!!

            if(rs.next()) {//si existe, hay uno solo
                // rs > sacando los datos
                int idPersona = rs.getInt(1);//tomar la primer columna
                String nombre = rs.getString(2);
                String apellido=rs.getString(3);
                int edad=rs.getInt(4);



                //campos crear un objeto????
                estudiantFromDb = new estudiantecacDAO(idPersona,nombre,apellido,edad);
            }
        } catch (SQLException e) {
            // ERRORES
            e.printStackTrace();
        }
        return estudiantFromDb;
    }


    /*metodos del crud*/
    public List<estudiantecac> listarEstudiante() {
        String sql = ( "SELECT * FROM estudiante ");

        //Connection
        Connection con = AdministratorConnexions.getConnection();

        List<estudiantecac> list = new ArrayList<>();

        //Statement
        try {
            Statement st = con.createStatement();

            //resultset
            ResultSet rs = st.executeQuery(sql);

            //VIENE UN SOLO REGISTRO!!!

            while(rs.next()) {//
                // rs > sacando los datos
                int idPersona = rs.getInt(1);//tomar la primer columna
                String nombre = rs.getString(2);
                String apellido= rs.getString(3);
                int edad=rs.getInt(4);

                //campos crear un objeto????
                estudiantecac estudiantFromDb = new estudiantecac(idPersona,nombre,apellido,edad);


            }

            //cierro la conexion
            con.close();
        } catch (SQLException e) {
            // ERRORES
            e.printStackTrace();
        }
        return list;
    }

    /*crear un persona en la db*/
    public void crearestudiante(int idPersona, String nombre, String apellido, int edad) {

        Connection con = AdministratorConnexions.getConnection();

        if(con != null) {
            // insert en la db > SQL: INSERT INTO....
            String sql = "INSERT INTO estudiante (idPersona,nombre,apellido,edad) ";
            sql += "VALUES('"+idPersona+"',"+nombre+",CURRENT_DATE, "+apellido+", "+edad+")";

            //control de errores
            try {
                Statement st = con.createStatement();
                st.execute(sql);

                //cierre de conexion
                con.close();

            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

