package com.mooncloak.kodetools.bulmak.form

import com.mooncloak.kodetools.bulmak.modifier.BulmaModifier
import com.mooncloak.kodetools.bulmak.modifier.plus
import kotlinx.html.*

/**
 * Represents Bulma's Select component.
 *
 * @see [Bulma Documentation](https://bulma.io/documentation/form/select/)
 */
public fun FlowContent.select(
    classes: String? = null,
    modifiers: BulmaModifier? = null,
    block: SELECT.() -> Unit = {}
) {
    div(
        classes = (BulmaModifier("select") + modifiers + classes).value
    ) {
        select(block = block)
    }
}
