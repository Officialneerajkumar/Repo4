package com.example.Student.Management.System.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.aspectj.weaver.loadtime.Agent;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tbl_laptop")
public class Laptop {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "laptop_id")
    private int laptopId;
    @Column(name = "name")
    private String laptopName;
    @Column(name = "brand")
    private String laptopBrand;
    @Column(name = "price")
    private Integer laptopPrice;
    @OneToOne
    @JoinColumn(name = "fk_student_id")
    private Student student;

}
