/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.modul1045burhannudin;

/**
 *
 * @author P15s
 */
public class Modul1045burhannudin {

    public static void main(String[] args) {
      int bil = 10;
 String b[] = {"a", "b", "c"};
 try {
 System.out.println(bil / 2);
 System.out.println(b[2]);
 } catch (ArithmeticException ai) {
 System.out.println("Error Aritmetik");
 System.out.println(ai.getMessage());
 } catch (ArrayIndexOutOfBoundsException n) {
 
 System.out.println("Error karena melebihi kapasitas array");
 System.out.println(n.getMessage());
 } catch (Exception e) {
 System.out.println("Ada error");
 System.out.println(e.getMessage());
    }
    }
}

