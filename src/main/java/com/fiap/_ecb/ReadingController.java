package com.fiap._ecb;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/readings")
public class ReadingController {

    @Autowired
    private ReadingRepository repository;

    @PostMapping
    public Reading createReading(@RequestBody Reading reading) {
        return repository.save(reading);
    }

    @GetMapping
    public List<Reading> getAllReadings() {
        return repository.findAll();
    }

    @GetMapping("/{sensorId}")
    public List<Reading> getReadingsBySensorId(@PathVariable String sensorId) {
        return repository.findBySensorId(sensorId);
    }
}
