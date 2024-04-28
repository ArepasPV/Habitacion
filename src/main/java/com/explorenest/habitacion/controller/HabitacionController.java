package com.explorenest.habitacion.controller;

import com.explorenest.habitacion.domain.Habitacion;
import com.explorenest.habitacion.service.HabitacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("api/habitacion")
public class HabitacionController {
    @Autowired
    private HabitacionService service;

    public List<Habitacion> getHabitaciones() {
        return service.getHabitaciones();
    }

    public Habitacion getHabitacionById(@RequestParam("id") int id) {
        return service.getHabitacion(id);
    }
}
