package com.mooncloak.kodetools.bulmak.components

import com.mooncloak.kodetools.bulmak.modifier.BulmaModifier
import com.mooncloak.kodetools.bulmak.modifier.plus
import kotlinx.html.*

/**
 * Represents Bulma's Modal component.
 *
 * @see [Bulma Documentation](https://bulma.io/documentation/components/modal/)
 */
public fun FlowContent.modal(
    classes: String? = null,
    modifiers: BulmaModifier? = null,
    block: ModalBuilder.() -> Unit = {}
) {
    div(
        classes = (BulmaModifier("modal") + modifiers + classes).value
    ) {
        val builder = ModalBuilder(container = this)
        builder.block()
    }
}

public class ModalBuilder internal constructor(
    private val container: DIV
) {

    public fun background(
        classes: String? = null,
        modifiers: BulmaModifier? = null,
        block: DIV.() -> Unit = {}
    ) {
        container.div(
            classes = (BulmaModifier("modal-background") + modifiers + classes).value,
            block = block
        )
    }

    public fun content(
        classes: String? = null,
        modifiers: BulmaModifier? = null,
        block: DIV.() -> Unit = {}
    ) {
        container.div(
            classes = (BulmaModifier("modal-content") + modifiers + classes).value,
            block = block
        )
    }

    public fun close(
        formEncType: ButtonFormEncType? = null,
        formMethod: ButtonFormMethod? = null,
        name: String? = null,
        type: ButtonType? = null,
        classes: String? = null,
        modifiers: BulmaModifier? = null,
        block: BUTTON.() -> Unit = {}
    ) {
        container.button(
            formEncType = formEncType,
            formMethod = formMethod,
            name = name,
            type = type,
            classes = (BulmaModifier("modal-close") + modifiers + classes).value,
            block = block
        )
    }

    public fun card(
        classes: String? = null,
        modifiers: BulmaModifier? = null,
        block: ModalCardBuilder.() -> Unit = {}
    ) {
        container.div(
            classes = (BulmaModifier("modal-card") + modifiers + classes).value
        ) {
            val builder = ModalCardBuilder(container = this)
            builder.block()
        }
    }
}

public class ModalCardBuilder internal constructor(
    private val container: DIV
) {

    public fun head(
        classes: String? = null,
        modifiers: BulmaModifier? = null,
        block: HEADER.() -> Unit = {}
    ) {
        container.header(
            classes = (BulmaModifier("modal-card-head") + modifiers + classes).value,
            block = block
        )
    }

    public fun body(
        classes: String? = null,
        modifiers: BulmaModifier? = null,
        block: SECTION.() -> Unit = {}
    ) {
        container.section(
            classes = (BulmaModifier("modal-card-body") + modifiers + classes).value,
            block = block
        )
    }

    public fun foot(
        classes: String? = null,
        modifiers: BulmaModifier? = null,
        block: FOOTER.() -> Unit = {}
    ) {
        container.footer(
            classes = (BulmaModifier("modal-card-foot") + modifiers + classes).value,
            block = block
        )
    }
}

public fun HEADER.modalCardTitle(
    classes: String? = null,
    modifiers: BulmaModifier? = null,
    block: P.() -> Unit = {}
) {
    p(
        classes = (BulmaModifier("modal-card-title") + modifiers + classes).value,
        block = block
    )
}
