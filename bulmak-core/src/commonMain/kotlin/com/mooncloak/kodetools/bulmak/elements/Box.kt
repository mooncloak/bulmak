package com.mooncloak.kodetools.bulmak.elements

import com.mooncloak.kodetools.bulmak.modifier.BulmaModifier
import com.mooncloak.kodetools.bulmak.modifier.plus
import kotlinx.html.DIV
import kotlinx.html.FlowContent
import kotlinx.html.div

/**
 * Represents Bulma's Box element. The box element is a simple container with a white background, some padding, and a
 * box shadow.
 *
 * @see [Bulma Documentation](https://bulma.io/documentation/elements/box/)
 */
public inline fun FlowContent.box(
    classes: BulmaModifier? = null,
    modifiers: BulmaModifier? = null,
    crossinline block: DIV.() -> Unit = {}
) {
    div(
        classes = (BulmaModifier("box") + modifiers + classes).value,
        block = block
    )
}
