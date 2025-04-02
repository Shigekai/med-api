package med.voll.med_voll_api.domain.doctor.dto;

import med.voll.med_voll_api.domain.common.dto.AddressDTO;
import med.voll.med_voll_api.domain.doctor.enums.Specialty;

public record DoctorRequestDTO(String name, String email, String phone, String crm, Specialty specialty, AddressDTO address) {
}
