package com.mooncloak.kodetools.bulmak.elements

import com.mooncloak.kodetools.bulmak.modifier.BulmaModifier
import com.mooncloak.kodetools.bulmak.modifier.plus
import kotlinx.html.*

/**
 * Represents Bulma's Tag element.
 *
 * @see [Bulma Documentation](https://bulma.io/documentation/elements/tag/)
 */
public inline fun FlowContent.tag(
    classes: BulmaModifier? = null,
    modifiers: BulmaModifier? = null,
    crossinline block: SPAN.() -> Unit = {}
) {
    span(
        classes = (BulmaModifier("tag") + modifiers + classes).value,
        block = block
    )
}

/**
 * Represents Bulma's Tags container element.
 *
 * @see [Bulma Documentation](https://bulma.io/documentation/elements/tag/#list-of-tags)
 */
public inline fun FlowContent.tags(
    classes: BulmaModifier? = null,
    modifiers: BulmaModifier? = null,
    crossinline block: DIV.() -> Unit = {}
) {
    div(
        classes = (BulmaModifier("tags") + modifiers + classes).value,
        block = block
    )
}
