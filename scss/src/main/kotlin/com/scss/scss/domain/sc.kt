package com.scss.scss.domain

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
//选课表
@Entity
data class sc(
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        val id: Long? = null,

        var sNumber: String? = null,
        var cNumber: String? = null,
        var cGrade: String? = null
)