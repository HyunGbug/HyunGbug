package com.emr.www.entity.doctor;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "doctor")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DoctorEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "no")
    private int no; // 의사 고유식별 입니다.

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "phone", nullable = false)
    private String phone;

    @Column(name = "securityNum", nullable = false, unique = true, columnDefinition = "CHAR(14)" )
    private String securityNum;

    @Column(name = "email", nullable = false, unique = false)
    private String email;

    @Column(name = "position", nullable = false)
    private String position;

    @Column(name = "licenseId", nullable = false, unique = true, columnDefinition = "CHAR(8)")
    private String licenseId; 

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "departmentId", nullable = false)
    private String departmentId;

    @Column(name = "profileImage")
    private String profileImage;

    @Column(name = "activeStatus", nullable = false)
    private String activeStatus;

}
