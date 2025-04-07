package med.voll.med_voll_api.controller;

import jakarta.transaction.Transactional;
import med.voll.med_voll_api.domain.doctor.dto.DoctorRequestDTO;
import med.voll.med_voll_api.entity.Doctor;
import med.voll.med_voll_api.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/doctor")
public class DoctorController {

    @Autowired
    private DoctorRepository repository;

    @PostMapping("")
    @Transactional
    public void createDoctor(@RequestBody DoctorRequestDTO data) {
        repository.save(new Doctor(data));
    }
}
