package com.example.demo.controllers;
import com.example.demo.models.Cliente;
import com.example.demo.models.Producto;
import com.example.demo.models.Venta;
import com.example.demo.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api")
public class Controller {

    @Autowired
    public Service service;

    @GetMapping
    public String index() {
        return service.index();
    }

    @GetMapping("/clientes")
    public List<Cliente> getClientes() {
        return service.getClientes();
    }

    @GetMapping("/productos")
    public List<Producto> getProductos() {
        return service.getProductos();
    }

    @GetMapping("/ventas")
    public List<Venta> getVentas() {
        return service.getVentas();
    }

    @PostMapping("/alta/cliente")
    public String postCliente(@RequestBody Cliente cliente) {
        return service.postCliente(cliente);
    }

    @PostMapping("/alta/producto")
    public String postProducto(@RequestBody Producto producto) {
        return service.postProducto(producto);
    }

    @PostMapping("/alta/venta")
    public String postVenta(@RequestBody Venta venta) {
        return service.postVenta(venta);
    }

    @PutMapping("/modificarCliente/{id}")
    public String updateCliente(@PathVariable Long id, @RequestBody Cliente cliente) {
        return service.updateCliente(id, cliente);
    }

    @PutMapping("/modificarProducto/{id}")
    public String updateProducto(@PathVariable Long id, @RequestBody Producto producto) {
        return service.updateProducto(id, producto);
    }

    @PutMapping("/modificarVenta/{id}")
    public String updateVenta(@PathVariable Long id, @RequestBody Venta venta) {
        return service.updateVenta(id, venta);
    }

    @DeleteMapping("/bajaCliente/{id}")
    public String deleteCliente(@PathVariable Long id) {
        return service.deleteCliente(id);
    }

    @DeleteMapping("/bajaProducto/{id}")
    public String deleteProducto(@PathVariable Long id) {
        return service.deleteProducto(id);
    }

    @DeleteMapping("/bajaVenta/{id}")
    public String deleteVenta(@PathVariable Long id) {
        return service.deleteVenta(id);
    }
}