package com.example.demo.Repositorio;

import org.springframework.stereotype.Repository;
import com.example.demo.Modelo.Machine;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.Interface.MachineInterface;

@Repository

public class MachineRepository {

    @Autowired
    private MachineInterface extencionesCrud;

    public List<Machine> getAll() {
        return (List<Machine>) extencionesCrud.findAll();
    }

    public Optional<Machine> getMachine(int id) {
        return extencionesCrud.findById(id);
    }

    public Machine save(Machine machine) {
        return extencionesCrud.save(machine);
    }
    
    public void delete(Machine machine){
        extencionesCrud.delete(machine);
    }
}
