package com.example.demo.entity

import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.GeneratedValue
import javax.persistence.Table
import javax.persistence.GenerationTYpe
import javax.validation.constraints.NotNull
import javax.persistence.Column

@Entity
@Table(name = "categories")
class Category{
    @Id
    @GeneratedValue(strategy = GenerationTYpe.IDENTITY)
    Integer Id

    @NotNull
    @Column(nullable = false)
    String
}