package com.explorenest.habitacion.repository;

import com.explorenest.habitacion.domain.Habitacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HabitacionRepository extends JpaRepository<Habitacion, Integer> {
    Habitacion findOneById(int id);
}
