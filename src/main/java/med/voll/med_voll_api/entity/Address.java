package med.voll.med_voll_api.entity;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import med.voll.med_voll_api.domain.common.dto.AddressDTO;

@Embeddable
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Address {
    private String street;
    private String number;
    private String complement;
    private String neighborhood;
    private String city;
    private String state;
    private String zipCode;

    public Address(AddressDTO address) {
        this.street = address.street();
        this.number = address.number();
        this.complement = address.complement();
        this.neighborhood = address.neighborhood();
        this.city = address.city();
        this.state = address.state();
        this.zipCode = address.zipCode();
    }
}
