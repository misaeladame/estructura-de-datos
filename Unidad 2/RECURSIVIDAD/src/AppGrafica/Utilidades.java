/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppGrafica;

/**
 *
 * @author friosa
 */
public class Utilidades {
    static public int Fact(int n) {
        if (n == 0)
            return 1;
        else
            return n * Fact(n-1);
    }
    static public int Suma(int n) {
        if (n == 0)
            return 0;
        else
            return Suma(n-1) + n;
    }
    static public void Suma(int n, int[] suma) {
        if (n == 0)
            return;
        else {
            suma[0] += n;
            Suma(n-1,suma);
        } 
    }
    static public double Suma(double x, int nt) {
        if (nt == 1)
            return 3.0 * Math.pow(x, 4.0);
        else 
            return Suma(x,nt-1) + (nt+2)*Math.pow(x,nt+3.0);
    }
    static public void Suma(double x, int nt, double[] suma) {
        if (nt == 1) {
            suma[0] += 3.0 * Math.pow(x, 4.0);
            return;
        }
        else {
            suma[0] += (nt+2)*Math.pow(x,nt+3.0); 
            Suma(x,nt-1,suma); 
        }
    }
    static public int Suma (int n1, int n2) {
        if (n1 > n2)
            return 0;
        else 
            if (n1 < 0 || n2 < 0)
                return 0;
            else
                if (n1 == n2)
                    return n1%5 == 0 ? n1 : 0;
                else
                    if (n1 % 5 == 0)
                        return n1 + Suma(n1+1, n2);
                    else
                        return 0 + Suma(n1+1, n2);        
    }
    
    static public int NoDiv(int n1, int n2) {
        if (n1 > n2)
            return 0;
        else 
            if (n1 < 0 || n2 < 0)
                return 0;
            else
                if (n1 == n2)
                    return n1%5 == 0 ? 1 : 0;
                else
                    if (n1 % 5 == 0)
                        return 1 + NoDiv(n1+1, n2);
                    else
                        return 0 + NoDiv(n1+1, n2);
    }
    
    static public double Sumando(double n1, double n2) {
        if(n2==0 && n1 == 0)
            return 0;
        else
            return Sumando(n1+1.0, n2) + n1 + n2;
    }
    
    
}






