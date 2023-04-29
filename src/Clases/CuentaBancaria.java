
package Clases;

import java.util.Scanner;


public class CuentaBancaria {
    
    private int numCuenta;
    private String titular;
    private double saldo;

    Scanner e = new Scanner(System.in);

    public int getNumCuenta() {
        return numCuenta;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setNumCuenta() {
        System.out.println("Ingresa el numero de cuenta: ");

        this.numCuenta = e.nextInt();
    }

    public void setTitular() {
       System.out.println("Ingresa el titular de la cuenta: ");

        this.titular = e.nextLine();
    }

    public void setSaldo() {
        System.out.println("Ingresa el saldo de la cuenta: ");

        this.saldo = e.nextDouble();
    }

    public void saldoRetirado(double resta){
        
        this.saldo=saldo-resta;
    }
    public void saldoAgregado(double suma){
        
        this.saldo = saldo+ suma;
    }
    
}
