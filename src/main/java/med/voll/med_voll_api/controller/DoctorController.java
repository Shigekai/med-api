package med.voll.med_voll_api.controller;

import med.voll.med_voll_api.domain.doctor.dto.DoctorRequestDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/doctor")
public class DoctorController {
    @PostMapping()
    public String helloWorld(@RequestBody DoctorRequestDTO data) {
        System.out.println(data.name());
        return "Hello World";
    }
}
