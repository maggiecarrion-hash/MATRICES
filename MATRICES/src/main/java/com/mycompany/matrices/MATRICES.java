/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.matrices;

/**
 *
 * @author YoungOchoa
 */
public class MATRICES {

    public static void main(String[] args) {
        int[][] matriz={
            {1,4,6},
            {12,18,21},
            {22,34,38}
                
        };
        int contadorpar=0;
        for(int x=0;x < matriz.length; x++) {
        for(int y=0;y < matriz.length; y++) {
        if (matriz[x][y]%2==0) {
            contadorpar++;
            
        }
        }
        
            
        }
        
        System.out.println("contador de numero par"+contadorpar);
    }
}
