package com.mooncloak.kodetools.bulmak.elements

import com.mooncloak.kodetools.bulmak.modifier.BulmaModifier
import com.mooncloak.kodetools.bulmak.modifier.plus
import kotlinx.html.*

/**
 * Represents Bulma's Image element.
 *
 * @see [Bulma Documentation](https://bulma.io/documentation/elements/image/)
 */
public inline fun FlowContent.image(
    classes: String? = null,
    modifiers: BulmaModifier? = null,
    crossinline block: FIGURE.() -> Unit = {}
) {
    figure(
        classes = (BulmaModifier("image") + modifiers + classes).value,
        block = block
    )
}
