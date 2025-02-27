package com.mooncloak.kodetools.bulmak.form

import com.mooncloak.kodetools.bulmak.modifier.BulmaModifier
import com.mooncloak.kodetools.bulmak.modifier.plus
import kotlinx.html.*

/**
 * Represents Bulma's Field form component.
 *
 * @see [Bulma Documentation](https://bulma.io/documentation/form/general/)
 */
public fun FlowContent.customField(
    classes: String? = null,
    modifiers: BulmaModifier? = null,
    block: DIV.() -> Unit = {}
) {
    div(
        classes = (BulmaModifier("field") + modifiers + classes).value,
        block = block
    )
}

/**
 * Represents Bulma's Field form component.
 *
 * @see [Bulma Documentation](https://bulma.io/documentation/form/general/)
 */
public fun FlowContent.field(
    classes: String? = null,
    modifiers: BulmaModifier? = null,
    block: FieldBuilder.() -> Unit = {}
) {
    div(
        classes = (BulmaModifier("field") + modifiers + classes).value
    ) {
        val builder = FieldBuilder(container = this)
        builder.block()
    }
}

public class FieldBuilder internal constructor(
    private val container: DIV
) {

    public fun label(
        classes: String? = null,
        modifiers: BulmaModifier? = null,
        block: LABEL.() -> Unit = {}
    ) {
        container.label(
            classes = BulmaModifier("label", modifiers, classes).value,
            block = block
        )
    }

    public fun control(
        classes: String? = null,
        modifiers: BulmaModifier? = null,
        block: DIV.() -> Unit = {}
    ) {
        container.div(
            classes = BulmaModifier("control", modifiers, classes).value,
            block = block
        )
    }

    public fun help(
        classes: String? = null,
        modifiers: BulmaModifier? = null,
        block: P.() -> Unit = {}
    ) {
        container.p(
            classes = BulmaModifier("help", modifiers, classes).value,
            block = block
        )
    }

    public fun fieldLabel(
        classes: String? = null,
        modifiers: BulmaModifier? = null,
        block: DIV.() -> Unit = {}
    ) {
        container.div(
            classes = BulmaModifier("field-label", modifiers, classes).value,
            block = block
        )
    }

    public fun fieldBody(
        classes: String? = null,
        modifiers: BulmaModifier? = null,
        block: DIV.() -> Unit = {}
    ) {
        container.div(
            classes = BulmaModifier("field-body", modifiers, classes).value,
            block = block
        )
    }
}
