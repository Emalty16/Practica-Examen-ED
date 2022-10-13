/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sc303.practicaexamened.punto1;

import java.util.Scanner;

public class Recursividad {
    Scanner sc = new Scanner(System.in);
    public double calcCos(int x, int n){
        double result = 0;
        System.out.println("Digite los terminos que desea: ");
        n = sc.nextInt();
        System.out.println("Ingrese el valor de x: ");
        x = sc.nextInt();
            for(int i =1; i <n; i++){
                if( n==0){
                    return 1;                    
                }
                else{                   
        result += (Math.pow(-1,n)/factorial(2*n))*Math.pow(x,2*n);
        System.out.println(result);
        }
            }            
         return result;
    }
  
    
    public double factorial(int num){
        double result = 1.0;
        for (int i= 0; i <= num; i++){
            result = result *i;
        }
        return result;
    }
}
