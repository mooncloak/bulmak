package com.mooncloak.kodetools.bulmak.elements

import com.mooncloak.kodetools.bulmak.modifier.BulmaModifier
import com.mooncloak.kodetools.bulmak.modifier.plus
import kotlinx.html.*

/**
 * Represents Bulma's Title container element.
 *
 * @see [Bulma Documentation](https://bulma.io/documentation/elements/title/)
 */
public inline fun FlowContent.title(
    classes: String? = null,
    modifiers: BulmaModifier? = null,
    crossinline block: H1.() -> Unit = {}
) {
    h1(
        classes = (BulmaModifier("title") + modifiers + classes).value,
        block = block
    )
}

/**
 * Represents Bulma's Subtitle container element.
 *
 * @see [Bulma Documentation](https://bulma.io/documentation/elements/title/)
 */
public inline fun FlowContent.subtitle(
    classes: String? = null,
    modifiers: BulmaModifier? = null,
    crossinline block: H2.() -> Unit = {}
) {
    h2(
        classes = (BulmaModifier("subtitle") + modifiers + classes).value,
        block = block
    )
}
