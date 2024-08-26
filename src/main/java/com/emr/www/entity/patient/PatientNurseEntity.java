//package com.emr.www.entity.patient;
//
//import java.time.LocalDate;
//
//import com.emr.www.entity.nurse.NurseEntity;
//
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import jakarta.persistence.JoinColumn;
//import jakarta.persistence.ManyToOne;
//import jakarta.persistence.Table;
//import lombok.AllArgsConstructor;
//import lombok.Builder;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
////간호사 환자 관계 테이블
//@Data
//@NoArgsConstructor
//@AllArgsConstructor
//@Builder
//@Entity
//@Table(name = "PatientNurse")
//public class PatientNurseEntity {
//
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private int no;
//
//	@ManyToOne
//	@JoinColumn(name = "patientId", referencedColumnName = "no", nullable = false)
//	private PatientRegistrationEntity patient;
//
//	@ManyToOne
//	@JoinColumn(name = "nurseId", referencedColumnName = "no", nullable = false)
//	private NurseEntity nurse;
//
//	private LocalDate relationshipStartDate;
//	private LocalDate relationshipEndDate;
//}