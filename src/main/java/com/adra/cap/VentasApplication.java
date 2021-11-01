package com.adra.cap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.repository.CategoriaRepository;
import com.example.repository.ClienteRepository;
import com.example.repository.DepartmentRepository;
import com.example.repository.DetalleVentaRepositoy;
import com.example.repository.EmpleadoRepository;
import com.example.repository.ProductoRepository;
import com.example.repository.RolRepository;
import com.example.repository.UsuarioRepository;
import com.example.repository.VentaRepository;

@SpringBootApplication
public class VentasApplication implements CommandLineRunner{
	
	
	@Autowired
	private ClienteRepository clienteRepository;
	@Autowired
	private EmpleadoRepository empleadoRepository;
	
	@Autowired
	private VentaRepository ventaRepository;
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Autowired
	private RolRepository rolRepository;
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	@Autowired
	private ProductoRepository productoRepository;
	
	@Autowired
	private DetalleVentaRepositoy detalleRepository;
	
	@Autowired
	private DepartmentRepository departmentRepository;
	
	@Autowired
	private UsuarioRepository u;
	
	public static void main(String[] args) {
		
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	}
	
	

	
	

}
