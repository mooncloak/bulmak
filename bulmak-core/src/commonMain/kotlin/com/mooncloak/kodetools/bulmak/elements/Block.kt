package com.mooncloak.kodetools.bulmak.elements

import com.mooncloak.kodetools.bulmak.modifier.BulmaModifier
import com.mooncloak.kodetools.bulmak.modifier.plus
import kotlinx.html.DIV
import kotlinx.html.FlowContent
import kotlinx.html.div

/**
 * Represents Bulma's spacer Block element.
 *
 * @see [Bulma Documentation](https://bulma.io/documentation/elements/block/)
 */
public inline fun FlowContent.block(
    classes: String? = null,
    modifiers: BulmaModifier? = null,
    crossinline block: DIV.() -> Unit = {}
) {
    div(
        classes = (BulmaModifier("block") + modifiers + classes).value,
        block = block
    )
}
