package org.example.Model;

import java.sql.Date;

public class EmpleadoModel {
    private int id;
    private String nombre_completo;
    private String correo;
    private String telefono;
    private String dpi;
    private String direccion;
    private int tipo_empleado_id;
    private String fecha_contratación;
    private Date update_date;
    private String estado;

    public EmpleadoModel() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre_completo() {
        return nombre_completo;
    }

    public void setNombre_completo(String nombre_completo) {
        this.nombre_completo = nombre_completo;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDpi() {
        return dpi;
    }

    public void setDpi(String dpi) {
        this.dpi = dpi;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTipo_empleado_id() {
        return tipo_empleado_id;
    }

    public void setTipo_empleado_id(int tipo_empleado_id) {
        this.tipo_empleado_id = tipo_empleado_id;
    }

    public String getFecha_contratación() {
        return fecha_contratación;
    }

    public void setFecha_contratación(String s) {
        this.fecha_contratación = fecha_contratación;
    }

    public Date getUpdate_date() {
        return update_date;
    }

    public void setUpdate_date(Date update_date) {
        this.update_date = update_date;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }


}

