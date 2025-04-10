package med.voll.med_voll_api.domain.common.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public record AddressDTO(
        @NotBlank(message = "Logradouro é obrigatório")
        String street,

        String number,

        String complement,

        @NotBlank(message = "Bairro é obrigatório")
        String neighborhood,

        @NotBlank(message = "Cidade é obrigatória")
        String city,

        @NotBlank(message = "UF é obrigatória")
        @Size(min = 2, max = 2, message = "UF deve ter 2 caracteres")
        String state,

        @NotBlank(message = "CEP é obrigatório")
        @Pattern(regexp = "\\d{8}", message = "CEP deve ter 8 dígitos")
        String zipCode
) {
}
