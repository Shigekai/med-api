package med.voll.med_voll_api.domain.doctor.dto;


import med.voll.med_voll_api.domain.doctor.enums.Specialty;
import med.voll.med_voll_api.entity.Doctor;

import java.util.UUID;

public record ListDoctorDTO(
        UUID id,
        String name,
        String email,
        String phone,
        String crm,
        Specialty specialty

) {
    public ListDoctorDTO(Doctor doctor) {
        this(
                doctor.getId(),
                doctor.getName(),
                doctor.getEmail(),
                doctor.getPhone(),
                doctor.getCrm(),
                doctor.getSpecialty()
        );
    }
}
