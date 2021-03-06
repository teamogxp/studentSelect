package com.scss.scss.domain

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.repository.query.Param

interface studentRepo:JpaRepository<student,Long>{
    fun findBysNumber(@Param("snumber")sNumber:String):student
}