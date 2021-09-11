package my.ljh.excelhandle.entity

data class Entity constructor(
    var pk: String?,
    var c2: String?,
    var c3: String?,
    var c4: String?,
    var c5: String?,
    var c6: String?,
    var c7: String?,
    var c8: String?,
    var c9: String?,
    var c10: String?,
    var c11: String?,
    var c12: String?,
    var c13: String?,
    var c14: String?,
    var c15: String?,
    var c16: String?,
    var c17: String?,
    var c18: String?,
    var c19: String?,

    ) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Entity

        if (pk != other.pk) return false

        return true
    }

    override fun hashCode(): Int {
        return pk.hashCode()
    }
}