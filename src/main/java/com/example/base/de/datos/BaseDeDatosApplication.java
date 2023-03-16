package com.example.base.de.datos;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.base.de.datos.model.Cliente;
import com.example.base.de.datos.model.Factura;
import com.example.base.de.datos.model.Producto;
import com.example.base.de.datos.service.ClienteService;
import com.example.base.de.datos.service.FacturaService;
import com.example.base.de.datos.service.ProductoService;

@SpringBootApplication
public class BaseDeDatosApplication {

	public static void main(String[] args) {

		SpringApplication.run(BaseDeDatosApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(ClienteService clienteservice, ProductoService productoservice,
			FacturaService facturaservice) {

		return (args) -> {

			// ingresar por teclado 2 productos y 2 clientes y guardarlos en la base de
			// datos
			// seleccionar un producto y un cliente y guardarlo en una factura

			Scanner sc = new Scanner(System.in);

			for (int i = 0; i < 2; i++) {
				System.out.println(" Ingrese el id del cliente ");
				int id = sc.nextInt();
				System.out.println("Ingrese el nombre del cliente");
				String nombre = sc.next();

				Cliente c1 = new Cliente();
				c1.setId(id);
				c1.setNombre(nombre);

				clienteservice.save(c1);

				System.out.println("Ingrese el id del producto");
				id = sc.nextInt();
				System.out.println("ingrese el nombre del producto");
				nombre = sc.next();
				System.out.println("ingrese el precio del producto");
				float precio = sc.nextFloat();
				System.out.println();
				System.out.println(" ingrese la cantidad ");
				int cantidad = sc.nextInt();

				Producto p1 = new Producto();
				p1.setId(id);
				p1.setNombre(nombre);
				p1.setCantidad(cantidad);
				p1.setPrecio(precio);
				productoservice.save(p1);

			}
			System.out.println(" Factura ");
			Iterable<Cliente> clientes = clienteservice.findAll();// poner una variable y for
			List<Cliente> cl = new ArrayList<Cliente>();
			for (Cliente cliente1 : clientes) {
				System.out.println(cliente1);
			}
			System.out.println("Seleccione el id del cliente");
			int id = sc.nextInt();
			Optional<Cliente> cliente = clienteservice.findById(id);
			while (!cliente.isPresent()) {
				System.out.println("cliente no encontrado");
				System.out.println("Seleccione el id del cliente");
				id = sc.nextInt();
				cliente = clienteservice.findById(id);
			}

			System.out.println("Lista de productos ");
			Iterable<Producto> listaproducto = productoservice.findAll();
			for (Producto p : listaproducto) {

				System.out.println(p);
			}

			System.out.println(" seleccione el id del producto ");
			id = sc.nextInt();

			Optional<Producto> producto = productoservice.findById(id);
			while (!producto.isPresent()) {
				System.out.println("producto no encontrado");
				System.out.println(" seleccione el id del producto ");
				id = sc.nextInt();
				producto = productoservice.findById(id);

			}

			Factura factura = new Factura();

			factura.setFecha(new Date());
			factura.setCliente(cliente.get());
			factura.setProducto(producto.get());
			factura.setTotal(producto.get().getPrecio());
			factura = facturaservice.save(factura);
			System.out.println(factura);
			// listar todos los productos y los clientes antes de seleccionar el id

		};

	}

}