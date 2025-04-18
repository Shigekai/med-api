package med.voll.med_voll_api.controller;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import med.voll.med_voll_api.domain.doctor.dto.DoctorRequestDTO;
import med.voll.med_voll_api.domain.doctor.dto.ListDoctorDTO;
import med.voll.med_voll_api.entity.Doctor;
import med.voll.med_voll_api.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/doctor")
public class DoctorController {

    @Autowired
    private DoctorRepository repository;

    @PostMapping("")
    @Transactional
    public ResponseEntity<Doctor> createDoctor(@RequestBody @Valid DoctorRequestDTO data) {
        Doctor doctor = repository.save(new Doctor(data));
        return ResponseEntity.ok().body(doctor);
    }

    @GetMapping("")
    public Page<ListDoctorDTO> listDoctors(@PageableDefault(size = 10, sort = "name") Pageable pagination) {
        return repository.findAll(pagination).map(ListDoctorDTO::new);
    }
}
