package com.explorenest.habitacion.service;

import com.explorenest.habitacion.domain.Habitacion;
import com.explorenest.habitacion.repository.HabitacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class HabitacionService {
    @Autowired
    private HabitacionRepository repository;
    @GetMapping("list")
    public List<Habitacion> getHabitaciones(){
        return repository.findAll();
    }
    @GetMapping("get")
    public Habitacion getHabitacion(int id){
        return repository.findOneById(id);
    }
}
