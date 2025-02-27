package com.mooncloak.kodetools.bulmak.components

import com.mooncloak.kodetools.bulmak.elements.image
import com.mooncloak.kodetools.bulmak.modifier.BulmaModifier
import com.mooncloak.kodetools.bulmak.modifier.plus
import kotlinx.html.*

/**
 * Represents Bulma's Card component.
 *
 * @see [Bulma Documentation](https://bulma.io/documentation/components/card/)
 */
public fun FlowContent.card(
    classes: String? = null,
    modifiers: BulmaModifier? = null,
    block: CardBuilder.() -> Unit = {}
) {
    div(
        classes = (BulmaModifier("card") + modifiers + classes).value
    ) {
        val builder = CardBuilder(container = this)
        builder.block()
    }
}

public class CardBuilder internal constructor(
    private val container: DIV
) {

    public fun header(
        classes: String? = null,
        modifiers: BulmaModifier? = null,
        block: CardHeaderBuilder.() -> Unit = {}
    ) {
        container.header(
            classes = BulmaModifier("card-header", modifiers, classes).value
        ) {
            val builder = CardHeaderBuilder(container = this)
            builder.block()
        }
    }

    public fun image(
        classes: String? = null,
        modifiers: BulmaModifier? = null,
        block: FIGURE.() -> Unit = {}
    ) {
        container.div(
            classes = BulmaModifier("card-image").value
        ) {
            this.image(
                modifiers = BulmaModifier(modifiers, classes),
                block = block
            )
        }
    }

    public fun content(
        classes: String? = null,
        modifiers: BulmaModifier? = null,
        block: DIV.() -> Unit = {}
    ) {
        container.div(
            classes = BulmaModifier("card-content", modifiers, classes).value,
            block = block
        )
    }

    public fun footer(
        classes: String? = null,
        modifiers: BulmaModifier? = null,
        block: CardFooterBuilder.() -> Unit = {}
    ) {
        container.footer(
            classes = BulmaModifier("card-footer", modifiers, classes).value
        ) {
            val builder = CardFooterBuilder(container = this)
            builder.block()
        }
    }
}

public class CardHeaderBuilder internal constructor(
    private val container: HEADER
) {

    public fun title(
        classes: String? = null,
        modifiers: BulmaModifier? = null,
        block: P.() -> Unit = {}
    ) {
        container.p(
            classes = BulmaModifier("card-header-title", modifiers, classes).value,
            block = block
        )
    }

    public fun icon(
        classes: String? = null,
        modifiers: BulmaModifier? = null,
        block: DIV.() -> Unit = {}
    ) {
        container.div(
            classes = BulmaModifier("card-header-icon", modifiers, classes).value,
            block = block
        )
    }
}

public class CardFooterBuilder internal constructor(
    private val container: FOOTER
) {

    public fun item(
        classes: String? = null,
        modifiers: BulmaModifier? = null,
        block: DIV.() -> Unit = {}
    ) {
        container.div(
            classes = BulmaModifier("card-footer-item", modifiers, classes).value,
            block = block
        )
    }
}
