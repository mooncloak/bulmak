package com.mooncloak.kodetools.bulmak.layout

import com.mooncloak.kodetools.bulmak.modifier.BulmaModifier
import kotlinx.html.*

/**
 * Represents Bulma's Footer layout.
 *
 * @see [Bulma Documentation](https://bulma.io/documentation/layout/footer/)
 */
public fun FlowContent.footer(
    classes: String? = null,
    modifiers: BulmaModifier? = null,
    block: FOOTER.() -> Unit = {}
) {
    footer(
        classes = BulmaModifier("footer", modifiers, classes).value,
        block = block
    )
}
