
package Clases;

import java.util.Scanner;


public class pruebaCuenta {
    
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        CuentaBancaria c1 = new CuentaBancaria();
        
        c1.setTitular();
        c1.setNumCuenta();
        c1.setSaldo();
        
        
        System.out.println("__________________________________");
        
        System.out.println("Número de cuenta:"+ c1.getNumCuenta());
        System.out.println("Titular de cuenta:"+ c1.getTitular());
        System.out.println("Saldo de cuenta: $"+ c1.getSaldo());
        
        System.out.println("");
        System.out.println("Deposito de saldo a la cuenta, ingrese el monto: ");
        
        double valor1 = e.nextDouble();
        c1.saldoAgregado(valor1);
        
        
        System.out.println("Saldo de cuenta ahora es: $"+ c1.getSaldo());
        System.out.println("");
        
        System.out.println("Ingrese el monto que quiere retirar de cuenta: ");
        
        valor1 = e.nextDouble();
        
        c1.saldoRetirado(valor1);

        
        System.out.println("Saldo de cuenta ahora es: $"+ c1.getSaldo());

    }
    
}
