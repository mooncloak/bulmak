package com.mooncloak.kodetools.bulmak.elements

import com.mooncloak.kodetools.bulmak.modifier.BulmaModifier
import com.mooncloak.kodetools.bulmak.modifier.plus
import kotlinx.html.DIV
import kotlinx.html.FlowContent
import kotlinx.html.div

/**
 * Represents Bulma's Notification element.
 *
 * @see [Bulma Documentation](https://bulma.io/documentation/elements/notification/)
 */
public inline fun FlowContent.notification(
    classes: BulmaModifier? = null,
    modifiers: BulmaModifier? = null,
    crossinline block: DIV.() -> Unit = {}
) {
    div(
        classes = (BulmaModifier("notification") + modifiers + classes).value,
        block = block
    )
}
