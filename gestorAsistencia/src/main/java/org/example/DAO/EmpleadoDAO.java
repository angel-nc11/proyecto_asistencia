package org.example.DAO;

import org.example.Model.EmpleadoModel;
import org.example.Model.JDBCUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class EmpleadoDAO {
    public void InsertarEmpleado(EmpleadoModel empleadoModel) {
        String sql = "INSERT INTO empleados " +
                "(nombre_completo,correo,telefono,dpi,direccion,tipo_empleado_id, fecha_contratacion) " +
                "VALUES (?,?,?,?,?,?,?)";
        try(Connection conn = JDBCUtil.getConnection();
        PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS))
        {
            ps.setString(1, empleadoModel.getNombre_completo());
            ps.setString(2, empleadoModel.getCorreo());
            ps.setString(3, empleadoModel.getTelefono());
            ps.setString(4, empleadoModel.getDpi());
            ps.setString(5, empleadoModel.getDireccion());
            ps.setInt(6, empleadoModel.getTipo_empleado_id());
            ps.setString(7, empleadoModel.getFecha_contratación());

            int filas = ps.executeUpdate();
            if (filas > 0) {
                try (ResultSet rs = ps.getGeneratedKeys()) {
                    if (rs.next()) {
                        int id = rs.getInt(1);
                        empleadoModel.setId(id);

                        System.out.println("empleado insertado exitosamente");
                        System.out.println("-- "+empleadoModel.getNombre_completo());
                    }
                }
            }

        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
