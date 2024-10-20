package com.aluracursos.tiendavirtual.modelos;

public class Articulo{

    private String nombre;
    private String color;
    private String marca;
    private String talla;
    private int precio;
    private int identificador;


    public Articulo(int identificador,String nombre, String color, String marca, String talla, int precio) {
        this.setIdentificador(identificador);
        this.setNombre(nombre);
        this.setColor(color);
        this.setMarca(marca);
        this.setTalla(talla);
        this.setPrecio(precio);
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getTalla() {
        return talla;
    }

    public String getNombre() {
        return nombre;
    }

    public int getIdentificador() {
        return identificador;
    }

    public int getPrecio() {
        return precio;
    }

    public String getColor() {
        return color;
    }

    public String getMarca() {
        return marca;
    }
    public void fichaArticulo(){
        System.out.println("""
                ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
                
                Descripción del producto
                
                *%s
                *Marca: %s
                *Colores disponibles: %s
                *Precio: $ %d
                *Talla disponibles: %s
                
                ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
                """.formatted(getNombre(),getMarca(),getColor(),getPrecio(),getTalla()));

    };

    public void descripcionProducto (){
        System.out.println(
                """
                :::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
                
                                                    *** Descripción del producto ***
                
                // %s
                // Marca: %s
                // Color: %s
                // Talla: %s
                // Precio: $ %d
                
                :::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
                """.formatted(getNombre(),getMarca(),getColor(),getTalla(),getPrecio()));
    };
};