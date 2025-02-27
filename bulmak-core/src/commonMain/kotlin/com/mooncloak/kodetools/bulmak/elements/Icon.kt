package com.mooncloak.kodetools.bulmak.elements

import com.mooncloak.kodetools.bulmak.modifier.BulmaModifier
import com.mooncloak.kodetools.bulmak.modifier.plus
import kotlinx.html.*

/**
 * Represents Bulma's Icon element.
 *
 * @see [Bulma Documentation](https://bulma.io/documentation/elements/icon/)
 */
public inline fun FlowContent.icon(
    classes: BulmaModifier? = null,
    modifiers: BulmaModifier? = null,
    crossinline block: SPAN.() -> Unit = {}
) {
    span(
        classes = (BulmaModifier("icon") + modifiers + classes).value,
        block = block
    )
}
