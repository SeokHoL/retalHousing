package kr.ac.kopo.back.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name="Certification")
@Table(name = "Certification")
public class CertificationEntity {

    @Id
    private String userId;
    private String email;
    private String certificationNumber;
}
