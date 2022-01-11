package Persistencia;

import Entidades.Jugador;
import Persistencia.Conexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JugadorDao {

    public static void crearJugadorBD(Jugador jugador) {
        Conexion db_connect = new Conexion();

        try(Connection connection = db_connect.get_connection()){
            PreparedStatement preparedStatement = null;
            try{
                String query="INSERT INTO jugador (`nombre`, `acumuladoPremio`) VALUES (?,?)";
                preparedStatement = connection.prepareStatement(query);
                preparedStatement.setString(1, jugador.getNombre());
                preparedStatement.setInt(2, jugador.getAcumuladoPremio());
                preparedStatement.executeUpdate();
                System.out.println("jugador creado correctamente");
            }catch (SQLException e){
                System.out.println(e);
            }
        }catch (SQLException e){
            System.out.println(e);
        }
    }


}
