
package boletin76;

import java.util.Scanner;


public class Boletin76 {

    
    public static void main(String[] args) {
        System.out.println("introdudca cantidade ");
        articulo obx=new articulo();
        Scanner dato=new Scanner(System.in);
        obx.setVenta(dato.nextInt());
        obx.tipo();
    
    }
    
}
