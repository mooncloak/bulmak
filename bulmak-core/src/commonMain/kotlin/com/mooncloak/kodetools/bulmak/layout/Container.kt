package com.mooncloak.kodetools.bulmak.layout

import com.mooncloak.kodetools.bulmak.modifier.BulmaModifier
import kotlinx.html.DIV
import kotlinx.html.FlowContent
import kotlinx.html.div

/**
 * Represents Bulma's Container layout.
 *
 * @see [Bulma Documentation](https://bulma.io/documentation/layout/container/)
 */
public fun FlowContent.container(
    classes: String? = null,
    modifiers: BulmaModifier? = null,
    block: DIV.() -> Unit = {}
) {
    div(
        classes = BulmaModifier("container", modifiers, classes).value,
        block = block
    )
}
