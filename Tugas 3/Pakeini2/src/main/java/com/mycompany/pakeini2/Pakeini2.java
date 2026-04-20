/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pakeini2;

/**
 *
 * @author Farras
 */
import java.util.Scanner; 
public class Pakeini2 {
    public static void main(String[] args) {
        int nilai1; 
System.out.println("program mulai"); 
Scanner input = new Scanner(System.in);                 
System.out.print("Inputkan Nilai  : "); 
nilai1 = input.nextInt(); 
if (nilai1 > 0) 
System.out.println("bilangan positif"); 
else if (nilai1 < 0) 
System.out.println("bilangan negatif"); 
else 
System.out.println("bilangan nol"); 
System.out.println("program selesai"); 
} 
} 
   
