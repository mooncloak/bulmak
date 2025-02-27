package com.mooncloak.kodetools.bulmak.form

import com.mooncloak.kodetools.bulmak.modifier.BulmaModifier
import com.mooncloak.kodetools.bulmak.modifier.plus
import kotlinx.html.*

/**
 * Represents Bulma's Checkboxes container component.
 *
 * @see [Bulma Documentation](https://bulma.io/documentation/form/checkbox/)
 */
public fun FlowContent.checkboxes(
    classes: String? = null,
    modifiers: BulmaModifier? = null,
    block: DIV.() -> Unit = {}
) {
    div(
        classes = (BulmaModifier("checkboxes") + modifiers + classes).value,
        block = block
    )
}
