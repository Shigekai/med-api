package med.voll.med_voll_api.domain.doctor.dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import med.voll.med_voll_api.domain.common.dto.AddressDTO;
import med.voll.med_voll_api.domain.doctor.enums.Specialty;

public record DoctorRequestDTO(
        @NotBlank(message = "Nome é obrigatório")
        String name,

        @NotBlank(message = "Email é obrigatório")
        @Email(message = "Formato de email inválido")
        String email,

        @NotBlank(message = "Telefone é obrigatório")
        @Pattern(regexp = "\\d{10,11}", message = "Número de dígitos inválido")
        String phone,

        @NotBlank(message = "CRM é obrigatório")
        @Pattern(regexp = "\\d{4,6}", message = "Número de dígitos inválido")
        String crm,

        @NotNull(message = "Especialidade é obrigatório")
        Specialty specialty,

        @NotNull(message = "Dados do endereço são obrigatórios")
        @Valid
        AddressDTO address
) {
}
