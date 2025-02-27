package com.mooncloak.kodetools.bulmak.layout

import com.mooncloak.kodetools.bulmak.modifier.BulmaModifier
import kotlinx.html.*

/**
 * Represents Bulma's Media layout.
 *
 * @see [Bulma Documentation](https://bulma.io/documentation/layout/media/)
 */
public fun FlowContent.media(
    classes: String? = null,
    modifiers: BulmaModifier? = null,
    block: MediaBuilder.() -> Unit = {}
) {
    article(
        classes = BulmaModifier("media", modifiers, classes).value
    ) {
        val builder = MediaBuilder(container = this)
        builder.block()
    }
}

public class MediaBuilder internal constructor(
    private val container: ARTICLE
) {

    public fun left(
        classes: String? = null,
        modifiers: BulmaModifier? = null,
        block: FIGURE.() -> Unit = {}
    ) {
        container.figure(
            classes = BulmaModifier("media-left", modifiers, classes).value,
            block = block
        )
    }

    public fun right(
        classes: String? = null,
        modifiers: BulmaModifier? = null,
        block: FIGURE.() -> Unit = {}
    ) {
        container.figure(
            classes = BulmaModifier("media-right", modifiers, classes).value,
            block = block
        )
    }

    public fun content(
        classes: String? = null,
        modifiers: BulmaModifier? = null,
        block: DIV.() -> Unit = {}
    ) {
        container.div(
            classes = BulmaModifier("media-content", modifiers, classes).value,
            block = block
        )
    }
}
