package com.mooncloak.kodetools.bulmak.elements

import com.mooncloak.kodetools.bulmak.modifier.BulmaModifier
import com.mooncloak.kodetools.bulmak.modifier.plus
import kotlinx.html.*

/**
 * Represents Bulma's Delete element.
 *
 * @see [Bulma Documentation](https://bulma.io/documentation/elements/delete/)
 */
public inline fun FlowOrInteractiveOrPhrasingContent.delete(
    classes: String? = null,
    modifiers: BulmaModifier? = null,
    crossinline block: BUTTON.() -> Unit = {}
) {
    button(
        formEncType = null,
        formMethod = null,
        name = null,
        type = null,
        classes = (BulmaModifier("delete") + modifiers + classes).value,
        block = block
    )
}
