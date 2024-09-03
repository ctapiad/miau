
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author administrador
 */
public class CamionPP {
    
    public static void main(String[] args) {
        Camion objCam1 = new Camion("Mazda","3","Bencinero",2020,1500);
        System.out.println(objCam1.getMarca());
        
        
        Camion objCam2 = new Camion("Marca","Modelo","tipoCombustible",0000,0000);
        objCam2.setMarca("Kia");
        objCam2.setModelo("Morning");
        objCam2.setAño(2022);
        objCam2.setTipoCombustible("Bencinero");
        objCam2.setCilindrada(1.500);
        System.out.println(objCam2.getMarca()+" "+objCam2.getModelo()+" "+ objCam2.getTipoCombustible()+" "+ objCam2.getAño()+" "+ objCam2.getCilindrada());
        System.out.println(objCam2.toString());
        
        
//        Camion objCam3 = new Camion("Marca","Modelo","tipoCombustible",0000,0000);
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Ingrese marca");
//        String marca = scanner.next();
//        objCam3.setMarca(marca);
//        System.out.println(objCam3.getMarca());


        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese marca");
        String marca = scanner.next();
        System.out.println("Ingrese modelo");
        String modelo = scanner.next();
        System.out.println("Ingrese tipo de combustible");
        String combustible = scanner.next();
        System.out.println("Ingrese año");
        int año = scanner.nextInt();
        System.out.println("Ingrese cilindrada");
        double cilindrada = scanner.nextDouble();
        Camion objCam3 = new Camion(marca,modelo,combustible,año,cilindrada);
        System.out.println(objCam3.toString());
    }
    
}
