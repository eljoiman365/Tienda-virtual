package com.aluracursos.tiendavirtual.principal;

import com.aluracursos.tiendavirtual.modelos.Articulo;
import com.aluracursos.tiendavirtual.modelos.ValoresNumericos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        var zapatos = new Articulo(1, "Zapatos x read", "Verde, Azul, Negro", "readline", "36/38/40/42/45", 250000);
        var pantalones = new Articulo(2, "Pantalon vaquero tipo oxford", "Negro, Gris, Azul rey", "Lewis", "/38/40/42", 12000);
        var camiseta = new Articulo(3, "Camiseta polo read-vision", "Verde, Azul, Negro,Rojo, Amarillo", "Xread", "S, M, L, XL", 70000);
        var vestido = new Articulo(4, "Vestido floreado", "Rojo vinotinto", "Victory", "M,S,L,XL,XXL", 30000);
        var gorro = new Articulo(5, "Gorro lotto", "Negro, Verde", "lotto", "S,L", 250000);

        var saldoTarjeta = new ValoresNumericos();
        saldoTarjeta.setSaldo(4000000);

        Scanner teclado = new Scanner(System.in);


        List<Articulo> carritoCompras = new ArrayList<>();


        //Menú principal:

        System.out.println("                              ** BIENVENIDO A LA TIENDA VIRTUAL DE ECOMODA **\n");

        System.out.println("Ingresa el número 6 para ingresar al catálogo o el número 10 para salir: ");

        //iteración

        double numeroSeleccion = 0;
        while (numeroSeleccion != 10) {

            numeroSeleccion = teclado.nextDouble();


            if (numeroSeleccion == zapatos.getIdentificador()) {
                zapatos.descripcionProducto();

                while (numeroSeleccion != 6) {
                    System.out.println("// Digita el número 7 para agregar al producto al carrito de compras o 6 para retornar al menú principal//");
                    numeroSeleccion = teclado.nextDouble();

                    if (numeroSeleccion == 7) {
                        carritoCompras.add(zapatos);
                        System.out.println("\n//Producto agregado con exito//\n");
                    };
                };
            } else if (numeroSeleccion == camiseta.getIdentificador()) {
                camiseta.descripcionProducto();

                while (numeroSeleccion != 6) {
                    System.out.println("// Digita el número 7 para agregar al producto al carrito de compras o 6 para retornar al menú principal//");
                    numeroSeleccion = teclado.nextDouble();

                    if (numeroSeleccion == 7) {
                        carritoCompras.add(camiseta);
                        System.out.println("\n//Producto agregado con exito//\n");
                    };
                };
            } else if (numeroSeleccion == vestido.getIdentificador()) {
                vestido.descripcionProducto();

                while (numeroSeleccion != 6) {
                    System.out.println("// Digita el número 7 para agregar al producto al carrito de compras o 6 para retornar al menú principal//");
                    numeroSeleccion = teclado.nextDouble();

                    if (numeroSeleccion == 7) {
                        carritoCompras.add(vestido);
                        System.out.println("\n//Producto agregado con exito//\n");
                    };
                };
            } else if (numeroSeleccion == gorro.getIdentificador()) {
                gorro.descripcionProducto();

                while (numeroSeleccion != 6) {
                    System.out.println("// Digita el número 7 para agregar al producto al carrito de compras o 6 para retornar al menú principal//");
                    numeroSeleccion = teclado.nextDouble();

                    if (numeroSeleccion == 7) {
                        carritoCompras.add(gorro);
                        System.out.println("\n//Producto agregado con exito//\n");
                    };
                };
            } else if (numeroSeleccion == pantalones.getIdentificador()) {
                pantalones.descripcionProducto();

                while (numeroSeleccion != 6) {
                    System.out.println("// Digita el número 7 para agregar al producto al carrito de compras o 6 para retornar al menú principal//");
                    numeroSeleccion = teclado.nextDouble();

                    if (numeroSeleccion == 7) {
                        carritoCompras.add(pantalones);
                        System.out.println("\n//Producto agregado con exito//\n");
                    } else if (numeroSeleccion == 8) {
                        carritoCompras.clear();
                        System.out.println("\n//Productos eliminados con éxito");
                    };
                };
            } else if (numeroSeleccion == 7) {
                int total = 0;
                System.out.println("""
                        :::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n
                                                             & Carrito de compras &\n""");
                for (Articulo item : carritoCompras) {

                    System.out.println("** " + item.getNombre());
                    System.out.println("** " + "Marca: " + item.getMarca());
                    System.out.println("** " + "Color: " + item.getColor());
                    System.out.println("** " + "Precio unidad: " + "$ " + item.getPrecio());
                    System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");

                    total += item.getPrecio();
                };
                System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n");
                System.out.println("//Total Carrito: " + "$ " + total);
                System.out.println("""
                      \n:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n
                      //Ingresa el número 9 para confirmar la compra
                      //El número 8 para eliminar los productos del carrito de compras
                      //Digita el 6 volver al menú principal\n
                      :::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::""");
                numeroSeleccion = teclado.nextDouble();
                if (numeroSeleccion == 9) {
                    if (saldoTarjeta.getSaldo() >= total) {
                        System.out.println("\n//Compra realizada con éxito//\n");
                        System.out.println("\n//Digita el número 6 para retornar al menú principal o 10 para salir\n");
                        continue;
                    } else System.out.println("\n//Saldo insuficiente, la transacción no ha sido éxitosa");
                    carritoCompras.clear();
                    System.out.println("\n//Digita el número 6 para retornar al menú principal o 10 para salir\n");
                    continue;
                } else if (numeroSeleccion == 8) {
                    carritoCompras.clear();
                    System.out.println("\n//Productos eliminados con éxito//\n");
                    System.out.println("//Digita el número 6 para regresar al menú principal//\n");
                };

            } if (numeroSeleccion == 6) {

                System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n");
                System.out.println("                                       & CATALOGO PRINCIPAL &\n");
                System.out.println("* " + zapatos.getIdentificador() + "   ///   " + zapatos.getNombre() + "   ///   " + "Marca: " + zapatos.getMarca() + "   ///   " + "Precio: " + "$ " + zapatos.getPrecio());
                System.out.println("* " + pantalones.getIdentificador() + "   ///   " + pantalones.getNombre() + "   ///   " + "Marca: " + pantalones.getMarca() + "   ///   " + "Precio: " + "$ " + pantalones.getPrecio());
                System.out.println("* " + camiseta.getIdentificador() + "   ///   " + camiseta.getNombre() + "   ///   " + "Marca: " + camiseta.getMarca() + "   ///   " + "Precio: " + "$ " + camiseta.getPrecio());
                System.out.println("* " + vestido.getIdentificador() + "   ///   " + vestido.getNombre() + "   ///   " + "Marca: " + vestido.getMarca() + "   ///   " + "Precio: " + "$ " + vestido.getPrecio());
                System.out.println("* " + gorro.getIdentificador() + "   ///   " + gorro.getNombre() + "   ///   " + "Marca: " + gorro.getMarca() + "   ///   " + "Precio: " + "$ " + gorro.getPrecio());

                System.out.println("\n///////////////////////////////////////////////////////////////////////////////////////////////////////\n");
                System.out.println("""
                            // Ingresa el número del producto para verlo a detalle
                            // Digita el número 7 para ver el carrito de compras o 10 para salir\n
                            :::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::"
                            """);
            };
        };
    };

};



