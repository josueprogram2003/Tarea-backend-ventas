package com.example.entity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "usuario_rol")
public class UsuarioRol {
	
	@ManyToOne
	@JoinColumn(name = "idusuario", nullable = false)
	public Usuario usuario;
	
	@ManyToOne
	@JoinColumn(name = "idrol", nullable = false)
	public Rol rol;
	
}
