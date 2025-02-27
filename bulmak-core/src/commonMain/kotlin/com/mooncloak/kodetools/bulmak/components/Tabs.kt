package com.mooncloak.kodetools.bulmak.components

import com.mooncloak.kodetools.bulmak.modifier.BulmaModifier
import com.mooncloak.kodetools.bulmak.modifier.isActive
import com.mooncloak.kodetools.bulmak.modifier.plus
import kotlinx.html.*

/**
 * Represents Bulma's Tabs component.
 *
 * @see [Bulma Documentation](https://bulma.io/documentation/components/tabs/)
 */
public fun FlowContent.tabs(
    classes: String? = null,
    modifiers: BulmaModifier? = null,
    build: TabContainerBuilder.() -> Unit = {}
) {
    div(
        classes = (BulmaModifier("tabs") + modifiers + classes).value
    ) {
        ul {
            val builder = TabContainerBuilder(container = this)
            builder.build()
        }
    }
}

public class TabContainerBuilder internal constructor(
    private val container: UL
) {

    public fun item(
        active: Boolean = false,
        href: String? = null,
        target: String? = null,
        referrerPolicy: AReferrerPolicy? = null,
        classes: String? = null,
        modifiers: BulmaModifier? = null,
        block: A.() -> Unit = {}
    ) {
        container.li(
            classes = if (active) {
                isActive.value
            } else {
                null
            }
        ) {
            a(
                href = href,
                target = target,
                referrerPolicy = referrerPolicy,
                classes = BulmaModifier(modifiers, classes).value,
                block = block
            )
        }
    }
}
