package com.mooncloak.kodetools.bulmak.classes

import kotlin.jvm.JvmInline

@JvmInline
public value class BulmaModifier public constructor(
    public val value: String
)

public fun BulmaModifier(vararg values: Any?): BulmaModifier =
    combine(*values)

public fun BulmaModifier(values: Collection<Any?>): BulmaModifier =
    combine(*values.toTypedArray())

public operator fun BulmaModifier.plus(other: BulmaModifier?): BulmaModifier =
    combine(this, other)

public operator fun BulmaModifier.plus(other: String?): BulmaModifier =
    combine(this, other)

public operator fun BulmaModifier.plus(other: Collection<String>?): BulmaModifier =
    combine(this, other)

public operator fun BulmaModifier.plus(other: Array<String>?): BulmaModifier =
    combine(this, other)

private fun combine(vararg values: Any?): BulmaModifier =
    combine(values = values.toList())

private fun combine(values: Collection<Any?>): BulmaModifier {
    val value = buildString {
        values.forEach { clazz ->
            val formatted = when (clazz) {
                null -> null
                is BulmaModifier -> clazz.value
                is Collection<*> -> combine(values = clazz).value
                is Array<*> -> combine(values = clazz.toList()).value
                else -> clazz.toString()
            }

            if (!formatted.isNullOrBlank()) {
                append(" $formatted")
            }
        }
    }

    return BulmaModifier(value = value)
}
