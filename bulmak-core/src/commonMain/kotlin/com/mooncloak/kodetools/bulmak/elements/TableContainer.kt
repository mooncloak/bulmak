package com.mooncloak.kodetools.bulmak.elements

import com.mooncloak.kodetools.bulmak.modifier.BulmaModifier
import com.mooncloak.kodetools.bulmak.modifier.plus
import kotlinx.html.DIV
import kotlinx.html.FlowContent
import kotlinx.html.div

/**
 * Represents Bulma's Table Container element. A table container is used to wrap a Table element to make it
 * horizontally scrollable.
 *
 * @see [Bulma Documentation](https://bulma.io/documentation/elements/table/#table-container)
 */
public inline fun FlowContent.tableContainer(
    classes: String? = null,
    modifiers: BulmaModifier? = null,
    crossinline block: DIV.() -> Unit = {}
) {
    div(
        classes = (BulmaModifier("table-container") + modifiers + classes).value,
        block = block
    )
}
