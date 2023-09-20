package com.example.u1ex_salarioempleados;

public class CalculaSalario {
    private String nombre;
    private String apellido;
    private double salarioDiario;
    private int diasTrabajados;

    public CalculaSalario(String nombre, String apellido, double salarioDiario, int diasTrabajados) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.salarioDiario = salarioDiario;
        this.diasTrabajados = diasTrabajados;
    }


    public String salarioCalculado(){
        double salario = this.getSalarioDiario()*this.getDiasTrabajados();
        double isr = salario*0.3;
        return "Hola " + this.getNombre() + " tu salario es: \n\nSalario: $" +  salario + "\nMenos ISR: $" + isr + "\nTotal: $" + (salario-isr);
    }


    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setSalarioDiario(double salarioDiario) {
        this.salarioDiario = salarioDiario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalarioDiario() {
        return salarioDiario;
    }

    public void setSalarioDiario(int salarioDiario) {
        this.salarioDiario = salarioDiario;
    }

    public int getDiasTrabajados() {
        return diasTrabajados;
    }

    public void setDiasTrabajados(int diasTrabajados) {
        this.diasTrabajados = diasTrabajados;
    }
}
