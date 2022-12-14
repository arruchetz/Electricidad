package com.danielgararr.chispas;

import com.danielgararr.chispas.*;
import com.danielgararr.chispas.Domain.usecase.AddCustomerUseCase;
import com.danielgararr.chispas.Domain.usecase.GetCustomerUseCase;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("*DATOS AUTONOMOS*");
        Autonomo autonomo = new Autonomo();
        System.out.print("Dni:");
        autonomo.setDni(entrada.next());
        System.out.print("Nombre:");
        autonomo.setNombre(entrada.next());
        System.out.print("Apellidos:");
        autonomo.setApellidos(entrada.next());
        System.out.print("Direccion postal:");
        autonomo.setMailingAddress(entrada.next());
        System.out.print("Poblacion:");
        autonomo.setPoblacion(entrada.next());
        System.out.print("Provincia:");
        autonomo.setProvincia(entrada.next());
        System.out.print("Email:");
        autonomo.setEmail(entrada.next());
        System.out.print("Telefono:");
        autonomo.setTelefono(entrada.next());

        System.out.println("*DATOS SOCIEDADES*");
        Sociedad sociedad = new Sociedad();
        System.out.print("Cif:");
        sociedad.setCif(entrada.next());
        System.out.print("Nombre:");
        sociedad.setNombre(entrada.next());
        System.out.print("Direccion postal:");
        sociedad.setDirpostal(entrada.next());
        System.out.print("Poblacion:");
        sociedad.setPoblacion(entrada.next());
        System.out.print("Provincia:");
        sociedad.setProvincia(entrada.next());
        System.out.print("Email:");
        sociedad.setEmail(entrada.next());
        System.out.print("Telefono:");
        sociedad.setTelefono(entrada.next());

        System.out.println("*DATOS PRODUCTOS*");
        Producto producto = new Producto();
        producto.setIdproducto(1);
        System.out.print("Nombre:");
        producto.setNombre(entrada.next());
        System.out.print("Marca:");
        producto.setMarca(entrada.next());
        System.out.print("Modelo:");
        producto.setModelo(entrada.next());
        System.out.print("Precio:");
        producto.setPrecio(entrada.nextInt());
        System.out.print("IVA:");
        producto.setIva(entrada.nextInt());

        System.out.println("*DATOS SERVICIOS*");
        Servicio servicio = new Servicio();
        producto.setIdproducto(2);
        System.out.print("Nombre:");
        servicio.setNombre(entrada.next());
        System.out.print("Precio:");
        servicio.setPrecio(entrada.nextInt());
        System.out.print("Tipo IVA:");
        servicio.setIva(entrada.nextInt());

        System.out.println("*DATOS FACTURA AUTONOMO*");
        Factura factura = new Factura();
        factura.setId(1);
        System.out.print("Fecha:");
        factura.setFecha(entrada.next());
        factura.setCliente(sociedad);
        factura.setProducto(producto);
        factura.setServicio(servicio);
        System.out.print("Base Imponible:");
        factura.setBaseimp(entrada.next());
        System.out.print("Total:");
        factura.setTotal(entrada.next());

        System.out.println("*DATOS FACTURA SOCIEDAD*");
        Factura factura1 = new Factura();
        factura1.setId(2);
        System.out.print("Fecha:");
        factura1.setFecha(entrada.next());
        factura1.setCliente(sociedad);
        factura1.setProducto(producto);
        factura1.setServicio(servicio);
        System.out.print("Base Imponible:");
        factura1.setBaseimp(entrada.next());
        System.out.print("Total:");
        factura1.setTotal(entrada.next());


        System.out.println(" FACTURA" + factura.getId());
        System.out.println("Fecha: " + factura.getFecha());
        System.out.println("Client:");
        System.out.println("NIF: " + factura.getCliente().getId());
        System.out.println("Nombre: " + factura.getCliente().getNombre());
        System.out.println("Direccion Postal: " + factura.getCliente().getDirpostal());
        System.out.println("Poblacion: " + factura.getCliente().getPoblacion());
        System.out.println("Provincia: " + factura.getCliente().getProvincia());
        System.out.println("Email: " + factura.getCliente().getEmail());
        System.out.println("Telefono: " + factura.getCliente().getTelefono());
        System.out.println("VENTA");
        System.out.println("");
        System.out.println("Codigo: " + factura.getServicio().getId());
        System.out.println("Nombre: " + factura.getServicio().getNombre());
        System.out.println("Precio: " + factura.getServicio().getPrecio());
        System.out.println("IVA: " + factura.getServicio().getIva());
        System.out.println("Codigo: " + factura.getProducto().getId());
        System.out.println("Nombre: " + factura.getProducto().getNombre());
        System.out.println("Precio: " + factura.getProducto().getPrecio());
        System.out.println("IVA: " + factura.getProducto().getIva());
        System.out.println("TOTAL:");
        System.out.println("Total: " + (factura.getProducto().getPrecio())+factura.getServicio().getPrecio());
    }
}