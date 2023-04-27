
package Clases;


public class CuentaBancaria {
    
    private int numCuenta;
    private String titular;
    private double saldo;

    public CuentaBancaria(int numCuenta, String titular, double saldo) {
        this.numCuenta = numCuenta;
        this.titular = titular;
        this.saldo = saldo;
    }

    public int getNumCuenta() {
        return numCuenta;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void saldoRetirado(double resta){
        
        this.saldo=saldo-resta;
    }
    public void saldoAgregado(double suma){
        
        this.saldo = saldo+ suma;
    }
    
}
