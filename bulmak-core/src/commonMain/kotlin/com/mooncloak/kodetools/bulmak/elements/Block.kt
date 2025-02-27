package com.mooncloak.kodetools.bulmak.elements

import com.mooncloak.kodetools.bulmak.classes.BulmaModifier
import com.mooncloak.kodetools.bulmak.classes.plus
import kotlinx.html.DIV
import kotlinx.html.FlowContent
import kotlinx.html.div

/**
 * Represents Bulma's spacer Block element.
 *
 * @see [Bulma Documentation](https://bulma.io/documentation/elements/block/)
 */
public inline fun FlowContent.block(
    classes: BulmaModifier? = null,
    modifiers: BulmaModifier? = null,
    crossinline block: DIV.() -> Unit = {}
) {
    div(
        classes = (BulmaModifier("block") + modifiers + classes).value,
        block = block
    )
}
