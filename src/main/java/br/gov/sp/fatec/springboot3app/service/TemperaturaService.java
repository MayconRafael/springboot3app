package br.gov.sp.fatec.springboot3app.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.gov.sp.fatec.springboot3app.entity.Temperatura;
import br.gov.sp.fatec.springboot3app.repository.TemperaturaRepository;

@Service
public class TemperaturaService {
    
    @Autowired
    private TemperaturaRepository temperaturaRepo;

    public Temperatura novaTemperatura(Temperatura temperatura) {
        return temperaturaRepo.save(temperatura);
    }

    public List<Temperatura> todasTemperaturas() {
        return temperaturaRepo.findAll();
    }

    public List<Temperatura> findByDataHoraGreaterThanAndMedidaGreaterThan(LocalDateTime dataHora, Float medida) {
        return temperaturaRepo.findByDataHoraGreaterThanAndMedidaGreaterThan(dataHora, medida);
    }
}
