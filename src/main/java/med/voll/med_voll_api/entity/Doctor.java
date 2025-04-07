package med.voll.med_voll_api.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import med.voll.med_voll_api.domain.doctor.dto.DoctorRequestDTO;
import med.voll.med_voll_api.domain.doctor.enums.Specialty;

import java.util.UUID;

@Table(name = "doctors")
@Entity(name = "Doctor")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String name;
    private String email;
    private String phone;
    private String crm;

    @Enumerated(EnumType.STRING)
    private Specialty specialty;

    @Embedded
    private Address address;

    public Doctor(DoctorRequestDTO doctor) {
        this.name = doctor.name();
        this.email = doctor.email();
        this.phone = doctor.phone();
        this.crm = doctor.crm();
        this.specialty = doctor.specialty();
        this.address = new Address(doctor.address());
    }

}
