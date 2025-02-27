package com.mooncloak.kodetools.bulmak.components

import com.mooncloak.kodetools.bulmak.modifier.BulmaModifier
import com.mooncloak.kodetools.bulmak.modifier.plus
import kotlinx.html.*

/**
 * Represents Bulma's Message component.
 *
 * @see [Bulma Documentation](https://bulma.io/documentation/components/message/)
 */
public fun FlowContent.message(
    classes: String? = null,
    modifiers: BulmaModifier? = null,
    block: MessageBuilder.() -> Unit = {}
) {
    article(
        classes = (BulmaModifier("message") + modifiers + classes).value
    ) {
        val builder = MessageBuilder(container = this)
        builder.block()
    }
}

public class MessageBuilder internal constructor(
    private val container: ARTICLE
) {

    public fun header(
        classes: String? = null,
        modifiers: BulmaModifier? = null,
        block: DIV.() -> Unit = {}
    ) {
        container.div(
            classes = (BulmaModifier("message-header") + modifiers + classes).value,
            block = block
        )
    }

    public fun body(
        classes: String? = null,
        modifiers: BulmaModifier? = null,
        block: DIV.() -> Unit = {}
    ) {
        container.div(
            classes = (BulmaModifier("message-body") + modifiers + classes).value,
            block = block
        )
    }
}
