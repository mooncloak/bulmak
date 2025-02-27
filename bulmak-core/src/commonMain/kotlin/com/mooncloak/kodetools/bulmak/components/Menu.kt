package com.mooncloak.kodetools.bulmak.components

import com.mooncloak.kodetools.bulmak.modifier.BulmaModifier
import com.mooncloak.kodetools.bulmak.modifier.plus
import kotlinx.html.*

/**
 * Represents Bulma's Menu component.
 *
 * @see [Bulma Documentation](https://bulma.io/documentation/components/menu/)
 */
public fun FlowContent.menu(
    classes: String? = null,
    modifiers: BulmaModifier? = null,
    block: MenuBuilder.() -> Unit = {}
) {
    aside(
        classes = (BulmaModifier("menu") + modifiers + classes).value
    ) {
        val builder = MenuBuilder(container = this)
        builder.block()
    }
}

public class MenuBuilder internal constructor(
    private val container: ASIDE
) {

    public fun label(
        classes: String? = null,
        modifiers: BulmaModifier? = null,
        block: P.() -> Unit = {}
    ) {
        container.p(
            classes = (BulmaModifier("menu-label") + modifiers + classes).value,
            block = block
        )
    }

    public fun list(
        classes: String? = null,
        modifiers: BulmaModifier? = null,
        block: UL.() -> Unit = {}
    ) {
        container.ul(
            classes = (BulmaModifier("menu-label") + modifiers + classes).value,
            block = block
        )
    }
}
