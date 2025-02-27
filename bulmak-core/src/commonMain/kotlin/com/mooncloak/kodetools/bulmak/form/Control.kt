package com.mooncloak.kodetools.bulmak.form

import com.mooncloak.kodetools.bulmak.modifier.BulmaModifier
import com.mooncloak.kodetools.bulmak.modifier.plus
import kotlinx.html.*

/**
 * Represents Bulma's Control form component.
 *
 * @see [Bulma Documentation](https://bulma.io/documentation/form/general/)
 */
public fun FlowContent.control(
    classes: String? = null,
    modifiers: BulmaModifier? = null,
    block: DIV.() -> Unit = {}
) {
    div(
        classes = (BulmaModifier("control") + modifiers + classes).value,
        block = block
    )
}
