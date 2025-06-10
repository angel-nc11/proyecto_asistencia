package org.example.DAO;

import org.example.Model.JDBCUtil;
import org.example.Model.UsuarioModel;

import java.sql.*;

public class UsuarioDAO {
    public void InsertarUsuario(UsuarioModel usuarioModel){
        String sql = "INSERT INTO usuarios (usuario, correo,contrasena, tipo_usuario_id) VALUES (?,?,?,?)";
        try(Connection conn = JDBCUtil.getConnection();
        PreparedStatement stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            stmt.setString(1, usuarioModel.getUsuario());
            stmt.setString(2, usuarioModel.getCorreo());
            stmt.setString(3, usuarioModel.getContrasena());
            stmt.setInt(4, usuarioModel.getTipo_usuario_id());

            int filas = stmt.executeUpdate();

            if (filas > 0) {
                try (ResultSet generatedKeys = stmt.getGeneratedKeys()) {
                    if (generatedKeys.next()) {
                        int idGenerado = generatedKeys.getInt(1);
                        usuarioModel.setId(idGenerado);

                        System.out.println("Usuario insertado exitosamente");
                        System.out.println("-- " + usuarioModel.getUsuario() + ", " + usuarioModel.getCorreo());
                    }
                }
            }

        } catch (SQLException e) {
                    e.printStackTrace();
        }

    }
}
