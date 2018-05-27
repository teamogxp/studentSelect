package com.scss.scss.service

import com.scss.scss.domain.sc

interface scService {
    //    增
    fun insertSc(Sc: sc): sc

    //    删除
    fun delSc(id: Long): Unit

    //    改
    fun updateSc(Sc: sc): sc

    //    查
    fun findSc(): List<sc>
}