/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda;

import java.util.Scanner;

/**
 *
 * @author Wendy Soto
 */
public class Principal {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Datos de la tienda
        String nameTienda;
        String direccion;
        String ruc;
        //Tienda [] tienda = new Tienda[1];

        System.out.println("Ingrese nombre de la tienda");
        nameTienda = scan.nextLine();
        System.out.println("Ingrese la direccion");
        direccion = scan.nextLine();
        System.out.println("#Ruc");
        ruc = scan.nextLine();
        //resumen
        System.out.println("  BIENVENIDOS ");;
        System.out.println(nameTienda);
        System.out.println("Direccion: " + direccion);
        System.out.println("#RUC:" + ruc);

        //productos
        int opc;
        int contProducto = 0;
        Producto[] producto = new Producto[10];

        do {
            System.out.println();
            System.out.println("     MENU: ");
            System.out.println("1.-Ingresar nuevo producto");
            System.out.println("2.-Visualizar lista de productos");
            System.out.println("3.-Salir");
            System.out.println("digite una opcion: ");
            opc = scan.nextInt();

            switch (opc) {
                case 1:
                    scan.nextLine();
                    System.out.println("Ingrese la marca del producto");
                    String marc = scan.nextLine();
                    System.out.println("Ingrese el codigo unico del pro");
                    String codigo = scan.nextLine();
                    System.out.println("Ingrese el tipo: (alimento, electrodoméstico, ropa)");
                    String tipo = scan.nextLine();
                    System.out.println("Ingrese el precio: ");
                    Double precio = scan.nextDouble();

                    producto[contProducto] = new Producto(marc, codigo, tipo, precio);
                    contProducto++;

//          producto [numProducto] = new Producto(m,codigo,tipo,precio);
//          numProducto++;   
                    break;

                case 2:

                    System.out.println("VISUALICE SUS PRODUCTOS REGISTRADOS:");
                    if (contProducto == 0) {
                        System.out.println("No hay produtos");

                    }
                    for (int i = 0; i < contProducto; i++) {
                        System.out.println("Producto " + (i + 1) + " :");
                        System.out.println("Marca: " + producto[i].getMarca());
                        System.out.println("Codigo: " + producto[i].getCodigo());
                        System.out.println("Tipo: " + producto[i].getTipo());
                        System.out.println("Precio: " + producto[i].getPrecio() + " dolares");
                        System.out.println(" ");
                    }

                    break;

                case 3:
                    System.out.println("Adios");
                    break;

                default:
                    System.out.println("Opcion incorrecta");
                    break;
            }
        } while (opc != 3);

    }

}
