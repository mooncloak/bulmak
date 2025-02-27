package com.mooncloak.kodetools.bulmak.form

import com.mooncloak.kodetools.bulmak.modifier.BulmaModifier
import com.mooncloak.kodetools.bulmak.modifier.plus
import kotlinx.html.*

/**
 * Represents Bulma's Radios container component.
 *
 * @see [Bulma Documentation](https://bulma.io/documentation/form/radio/)
 */
public fun FlowContent.radios(
    classes: String? = null,
    modifiers: BulmaModifier? = null,
    block: DIV.() -> Unit = {}
) {
    div(
        classes = (BulmaModifier("radios") + modifiers + classes).value,
        block = block
    )
}
