package my.ljh.excelhandle

import kotlin.Throws
import java.beans.BeanInfo
import java.beans.Introspector
import java.lang.Exception

object Utils {
    @Throws(Exception::class)
    fun <M> merge(target: M, destination: M) {
        //获取目标bean
        val beanInfo = Introspector.getBeanInfo(target!!::class.java)
        // 遍历所有属性
        for (descriptor in beanInfo.propertyDescriptors) {
            // 如果是可写属性
            if (descriptor.writeMethod != null) {
                val defaultValue = descriptor.readMethod.invoke(destination)
                //可以使用StringUtil.isNotEmpty(defaultValue)来判断
                if (defaultValue != null && "" != defaultValue) {
                    //用非空的defaultValue值覆盖到target去
                    descriptor.writeMethod.invoke(target, defaultValue)
                }
            }
        }
    }
}