package my.ljh.excelhandle

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.CrossOrigin

@SpringBootApplication
@CrossOrigin
class ExcelHandleApplication

fun main(args: Array<String>) {
    runApplication<ExcelHandleApplication>(*args)
}
