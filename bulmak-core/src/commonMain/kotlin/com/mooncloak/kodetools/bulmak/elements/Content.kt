package com.mooncloak.kodetools.bulmak.elements

import com.mooncloak.kodetools.bulmak.modifier.BulmaModifier
import com.mooncloak.kodetools.bulmak.modifier.plus
import kotlinx.html.DIV
import kotlinx.html.FlowContent
import kotlinx.html.div

/**
 * Represents Bulma's Content element.
 *
 * @see [Bulma Documentation](https://bulma.io/documentation/elements/content/)
 */
public inline fun FlowContent.content(
    classes: BulmaModifier? = null,
    modifiers: BulmaModifier? = null,
    crossinline block: DIV.() -> Unit = {}
) {
    div(
        classes = (BulmaModifier("content") + modifiers + classes).value,
        block = block
    )
}
