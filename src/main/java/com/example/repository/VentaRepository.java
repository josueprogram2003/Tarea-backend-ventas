package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.Venta;

@Repository
public interface VentaRepository extends JpaRepository<Venta, Integer>{

}
