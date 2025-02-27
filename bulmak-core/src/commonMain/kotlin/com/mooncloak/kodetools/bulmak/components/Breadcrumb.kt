package com.mooncloak.kodetools.bulmak.components

import com.mooncloak.kodetools.bulmak.modifier.BulmaModifier
import com.mooncloak.kodetools.bulmak.modifier.isActive
import com.mooncloak.kodetools.bulmak.modifier.plus
import kotlinx.html.*

/**
 * Represents Bulma's Breadcrumb component. Simply use [li] items for each navigation element, and add the [isActive]
 * modifier for the currently selected item to disable navigation to that item.
 *
 * @see [Bulma Documentation](https://bulma.io/documentation/components/breadcrumb/)
 */
public inline fun FlowContent.breadcrumb(
    classes: BulmaModifier? = null,
    modifiers: BulmaModifier? = null,
    crossinline block: UL.() -> Unit = {}
) {
    nav(
        classes = (BulmaModifier("breadcrumb") + modifiers + classes).value
    ) {
        attributes["aria-label"] = "breadcrumbs"

        ul(block = block)
    }
}
