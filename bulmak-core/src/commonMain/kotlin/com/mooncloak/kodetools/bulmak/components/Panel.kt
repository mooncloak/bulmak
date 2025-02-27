package com.mooncloak.kodetools.bulmak.components

import com.mooncloak.kodetools.bulmak.modifier.BulmaModifier
import com.mooncloak.kodetools.bulmak.modifier.plus
import kotlinx.html.*

/**
 * Represents Bulma's Panel component.
 *
 * @see [Bulma Documentation](https://bulma.io/documentation/components/panel/)
 */
public fun FlowContent.panel(
    classes: String? = null,
    modifiers: BulmaModifier? = null,
    build: PanelBuilder.() -> Unit = {}
) {
    nav(
        classes = (BulmaModifier("panel") + modifiers + classes).value
    ) {
        val builder = PanelBuilder(container = this)
        builder.build()
    }
}

public class PanelBuilder internal constructor(
    private val container: NAV
) {

    public fun heading(
        classes: String? = null,
        modifiers: BulmaModifier? = null,
        block: P.() -> Unit = {}
    ) {
        container.p(
            classes = (BulmaModifier("panel-heading") + modifiers + classes).value,
            block = block
        )
    }

    public fun tabs(
        classes: String? = null,
        modifiers: BulmaModifier? = null,
        block: P.() -> Unit = {}
    ) {
        container.p(
            classes = (BulmaModifier("panel-tabs") + modifiers + classes).value,
            block = block
        )
    }

    public fun block(
        classes: String? = null,
        modifiers: BulmaModifier? = null,
        block: DIV.() -> Unit = {}
    ) {
        container.div(
            classes = (BulmaModifier("panel-block") + modifiers + classes).value,
            block = block
        )
    }
}
