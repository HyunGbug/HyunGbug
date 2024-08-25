package com.emr.www.entity.nurse;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "Nurse")
public class NurseEntity {

	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "no")
    private int no;  // int형 자동 증가 PK

    @Column(nullable = false)
    private String name;  // 간호사 이름

    @Column(nullable = false, unique = true, columnDefinition = "CHAR(14)")
    private String securityNum;  // 주민등록번호

    @Column(nullable = false, unique = false)
    private String email;  // 이메일

    @Column(nullable = false)
    private String phone;  // 전화번호

    @Column(nullable = false, unique = true,  columnDefinition = "CHAR(16)")
    private String licenseId;  // 면허 ID

    @Column(nullable = false)
    private String password;  // 비밀번호

    @Column(nullable = false)
    private String position;  // 직급

    @Column(nullable = false)
    private String departmentId;
    
    @Column
    private String profileImage;  // 프로필 이미지 경로

    @Column(nullable = false)
    private String activeStatus;
    

}
