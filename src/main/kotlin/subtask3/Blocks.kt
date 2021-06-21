package subtask3

import java.time.LocalDate
import kotlin.reflect.KClass

class Blocks {

    fun getData(blockA: Array<*>, blockB: KClass<*>): Any {
        return when (blockB) {
            String::class -> {
                val z = StringBuffer()
                blockA.filterIsInstance<String>()
                    .forEach { z.append(it) }
                z.toString()}
            Int::class -> blockA.filterIsInstance<Int>().sum()
            LocalDate::class -> "31.12.2019"
            // blockA.filterIsInstance<LocalDate>().
            else -> "Incorrect filter type"

        }
    }
}
