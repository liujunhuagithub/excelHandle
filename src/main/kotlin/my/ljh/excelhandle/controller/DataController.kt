package my.ljh.excelhandle.controller

import cn.hutool.core.bean.BeanUtil
import cn.hutool.core.bean.copier.CopyOptions
import cn.hutool.poi.excel.ExcelReader
import cn.hutool.poi.excel.WorkbookUtil
import my.ljh.excelhandle.entity.Entity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import java.beans.BeanInfo
import java.io.InputStream


@RestController
class DataController {

    val temp = mutableSetOf<Entity>()

    @GetMapping("/entity")
    fun showTable() = temp
    fun handlerFile(file: InputStream): Boolean {
        val create = CopyOptions.create().apply { setIgnoreNullValue(true) }
        WorkbookUtil.createBook(file).sheetIterator().forEach {
            val reader = ExcelReader(it)
            reader.readAll(Entity::class.java).forEach { entity ->
                assert(!(entity.pk == ""))
                val t = temp.find { _entity -> _entity.pk == entity.pk }
                if (t == null) temp.add(entity) else BeanUtil.copyProperties(entity, t)
            }

        }
        return true
    }

}