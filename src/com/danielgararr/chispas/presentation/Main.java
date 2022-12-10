package com.danielgararr.chispas.presentation;

import com.danielgararr.chispas.data.Bill.BillDataStore;
import com.danielgararr.chispas.data.Bill.MemBillDataStore;
import com.danielgararr.chispas.data.Customer.CustomerDataStore;
import com.danielgararr.chispas.data.Customer.MemCustomerDataStore;
import com.danielgararr.chispas.data.Item.ItemDataStore;
import com.danielgararr.chispas.data.Item.MemItemDataStore;
import com.danielgararr.chispas.domain.models.*;
import com.danielgararr.chispas.domain.usecase.Bill.AddBillUseCase;
import com.danielgararr.chispas.domain.usecase.Bill.GetBillUseCase;
import com.danielgararr.chispas.domain.usecase.Customer.AddCustomerUseCase;
import com.danielgararr.chispas.domain.usecase.Customer.DeleteCustomerUseCase;
import com.danielgararr.chispas.domain.usecase.Customer.GetCustomerUseCase;
import com.danielgararr.chispas.domain.usecase.Customer.UpdateCustomerUseCase;
import com.danielgararr.chispas.domain.usecase.Item.AddItemUseCase;
import com.danielgararr.chispas.domain.usecase.Item.DeleteItemUseCase;
import com.danielgararr.chispas.domain.usecase.Item.GetItemUseCase;
import com.danielgararr.chispas.domain.usecase.Item.UpdateItemUseCase;

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


        System.out.println("FACTURA" + factura.getId());
        System.out.println("Fecha: " + factura.getFecha());
        System.out.println("Cliente:");
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


        //Cliente
        CustomerDataStore customerDataStore = new MemCustomerDataStore();
        
        System.out.println("----- Agregando Cliente -----");

        AddCustomerUseCase addCustomerUseCase = new AddCustomerUseCase(customerDataStore);
        addCustomerUseCase.execute(autonomo);
        addCustomerUseCase.execute(sociedad);

        GetCustomerUseCase getCustomerUseCase = new GetCustomerUseCase(customerDataStore);
        List<Cliente> customers = getCustomerUseCase.execute();
        for (int i = 0; i < customers.size(); i++) {
            printCliente(customers.get(i));
        }

        System.out.println("----- Eliminando Cliente ------");

        DeleteCustomerUseCase deleteCustomerUseCase = new DeleteCustomerUseCase(customerDataStore);
        deleteCustomerUseCase.execute(autonomo);
        List<Cliente> customers2 = getCustomerUseCase.execute();
        for (int i = 0; i < customers2.size(); i++) {
            printCliente(customers2.get(i));
        }

        System.out.println("----- Modificando Cliente ------");
        sociedad.setEmail("0000000000");
        UpdateCustomerUseCase updateCustomerUseCase = new UpdateCustomerUseCase(customerDataStore);
        updateCustomerUseCase.execute(sociedad);
        List<Cliente> customers3 = getCustomerUseCase.execute();
        for (int i = 0; i < customers3.size(); i++) {
            printCliente(customers3.get(i));
        }

        //ProductoServicio
        ItemDataStore itemDataStore = new MemItemDataStore();

        System.out.println("----- Agregando Producto -----");

        AddItemUseCase addItemUseCase = new AddItemUseCase(itemDataStore);
        addItemUseCase.execute(producto);
        addItemUseCase.execute(servicio);

        GetItemUseCase getItemUseCase = new GetItemUseCase(itemDataStore);
        List<ProductoServicio> items = getItemUseCase.execute();
        for (int i = 0; i < items.size(); i++) {
            printProductoServicio(items.get(i));
        }

        System.out.println("----- Eliminando Producto ------");

        DeleteItemUseCase deleteItemUseCase = new DeleteItemUseCase(itemDataStore);
        deleteItemUseCase.execute(producto);
        List<ProductoServicio> producto2 = getItemUseCase.execute();
        for (int i = 0; i < producto2.size(); i++) {
            printProductoServicio(producto2.get(i));
        }

        System.out.println("----- Modificando Producto ------");
        producto.setModelo("tesla");
        UpdateItemUseCase updateItemUseCase = new UpdateItemUseCase(itemDataStore);
        updateItemUseCase.execute(producto);
        List<ProductoServicio> producto3 = getItemUseCase.execute();
        for (int i = 0; i < producto3.size(); i++) {
            printProductoServicio(producto3.get(i));
        }

        //Factura
        BillDataStore billDataStore = new MemBillDataStore();

        System.out.println("----- Agregando Factura -----");

        AddBillUseCase addBillUseCase = new AddBillUseCase(billDataStore);
        addBillUseCase.execute(factura);
        addBillUseCase.execute(factura1);

        GetBillUseCase getBillUseCase = new GetBillUseCase(billDataStore);
        List<Factura> factura2 = getBillUseCase.execute();
        for (int i = 0; i < items.size(); i++) {
            printFactura(items.get(i));
        }

    }

    //Imprimir CLiente
    public static void printAutonomos(Autonomo autonomo) {
        System.out.println("Cod: " + autonomo.getId() + " Nombre: " + autonomo.getNombre());
    }

    public static void printSociedades(Sociedad sociedad) {
        System.out.println("Cod: " + sociedad.getId() + " Nombre: " + sociedad.getNombre());
    }

    public static void printCliente(Cliente cliente) {
        System.out.println("Cod: " + cliente.getId() + " Nombre: " + cliente.getNombre() + " Email: " + cliente.getEmail());
    }

    //Imprimir Item
    public static void printProductos(Producto producto) {
        System.out.println("Cod: " + producto.getId() + " Nombre: " + producto.getNombre());
    }

    public static void printServicios(Servicio servicio) {
        System.out.println("Cod: " + servicio.getId() + " Nombre: " + servicio.getNombre());
    }

    public static void printProductoServicio(ProductoServicio productoServicio) {
        System.out.println("Cod: " + productoServicio.getId() + " Nombre: " + productoServicio.getNombre() + " Precio: " + productoServicio.getPrecio());
    }

    //Imprimir Factura
    public static void printFactura(Factura factura) {
        System.out.println("Cod: " + factura.getId() + " Nombre: " + factura.getCliente());
    }
}