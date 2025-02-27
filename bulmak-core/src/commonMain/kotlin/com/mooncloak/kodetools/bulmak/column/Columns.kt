package com.mooncloak.kodetools.bulmak.column

import com.mooncloak.kodetools.bulmak.modifier.BulmaModifier
import kotlinx.html.*

/**
 * Represents Bulma's Columns component.
 *
 * @see [Bulma Documentation](https://bulma.io/documentation/columns/basics/)
 */
public fun FlowContent.columns(
    classes: String? = null,
    modifiers: BulmaModifier? = null,
    block: ColumnBuilder.() -> Unit = {}
) {
    div(
        classes = BulmaModifier("columns", modifiers, classes).value
    ) {
        val builder = ColumnBuilder(container = this)
        builder.block()
    }
}

public class ColumnBuilder internal constructor(
    private val container: DIV
) {

    public fun column(
        classes: String? = null,
        modifiers: BulmaModifier? = null,
        block: DIV.() -> Unit = {}
    ) {
        container.div(
            classes = BulmaModifier("column", modifiers, classes).value,
            block = block
        )
    }
}
