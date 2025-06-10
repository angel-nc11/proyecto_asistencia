package org.example;

import org.example.DAO.EmpleadoDAO;
import org.example.DAO.UsuarioDAO;
import org.example.Model.EmpleadoModel;
import org.example.Model.UsuarioModel;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        UsuarioModel usuario = new UsuarioModel();
        EmpleadoModel empleado = new EmpleadoModel();

        usuario.setUsuario("admin");
        usuario.setCorreo("admin@gmail.com");
        usuario.setContrasena("admin123");
        usuario.setTipo_usuario_id(2);

        UsuarioDAO usuarioDAO = new UsuarioDAO();
        usuarioDAO.InsertarUsuario(usuario);


        empleado.setNombre_completo("Ramiro Hernandez");
        empleado.setCorreo("ramio@gmail.com");
        empleado.setTelefono("5577-99644");
        empleado.setDpi("24571578714");
        empleado.setDireccion("Sanarate, El Progreso");
        empleado.setTipo_empleado_id(3);
        empleado.setFecha_contratación("2021-04-10");

        EmpleadoDAO empleadoDAO = new EmpleadoDAO();
        empleadoDAO.InsertarEmpleado(empleado);


    }
}