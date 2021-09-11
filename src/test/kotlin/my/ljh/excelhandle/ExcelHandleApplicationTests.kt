package my.ljh.excelhandle

import cn.hutool.poi.excel.ExcelUtil
import my.ljh.excelhandle.controller.DataController
import my.ljh.excelhandle.entity.Entity
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import java.io.File


@SpringBootTest
class ExcelHandleApplicationTests {
    @Autowired
    lateinit var d: DataController

    @Test
    fun contextLoads() {
        d.handlerFile(File("d:/aaa.xlsx").inputStream())
        d.handlerFile(File("d:/bbb.xlsx").inputStream())
        d.handlerFile(File("d:/ccc.xlsx").inputStream())

    }

}
