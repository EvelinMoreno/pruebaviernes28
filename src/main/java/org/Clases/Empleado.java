package org.Clases;

public class Empleado {
    //ATRIBUTO

    public String id;
    public String nombres;
    public String email;
    public String direccion;
    public String telefono;
    public String documento;
    char tipoAfiliacionCajaCompensacion;
    byte edad;
    byte numeroHijos;
    float salario;
    short numeroBeneficiarios;
    double cuotaFondoEmpleado;
    double deduccionPrestamoVivienda;
    double deduccionGimnasio;
    double demandaAlimentos;
    double deduccionSalud;
    double deduccionPensiones;
    double deduccionCajaCompensacion;
    double subsidioCajaCompensacion;
    double auxilioTransporte;
    double dotacion;
    double auxilioEscolar;

//COSTRUCTOR

    public Empleado(){}

    //METODOS

    public void saludar(){
        System.out.println("Hola, buenos dias");
    }
}

