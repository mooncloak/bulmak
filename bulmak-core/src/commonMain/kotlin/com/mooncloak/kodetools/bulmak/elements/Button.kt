package com.mooncloak.kodetools.bulmak.elements

import com.mooncloak.kodetools.bulmak.classes.BulmaModifier
import com.mooncloak.kodetools.bulmak.classes.plus
import kotlinx.html.*

public inline fun FlowContent.buttons(
    classes: BulmaModifier? = null,
    crossinline block: DIV.() -> Unit = {}
) {
    div(
        classes = (BulmaModifier("buttons") + classes).value,
        block = block
    )
}

/**
 * Represents Bulma's Button element.
 *
 * @see [Bulma Documentation](https://bulma.io/documentation/elements/button/)
 */
public inline fun FlowOrInteractiveOrPhrasingContent.coreButton(
    formEncType: ButtonFormEncType? = null,
    formMethod: ButtonFormMethod? = null,
    name: String? = null,
    type: ButtonType? = null,
    classes: BulmaModifier? = null,
    modifiers: BulmaModifier? = null,
    crossinline block: BUTTON.() -> Unit = {}
) {
    button(
        formEncType = formEncType,
        formMethod = formMethod,
        name = name,
        type = type,
        classes = (BulmaModifier("button") + modifiers + classes).value,
        block = block
    )
}

/**
 * Represents Bulma's Button element.
 *
 * @see [Bulma Documentation](https://bulma.io/documentation/elements/button/)
 */
public inline fun FlowOrInteractiveOrPhrasingContent.linkButton(
    href: String? = null,
    target: String? = null,
    referrerPolicy: AReferrerPolicy? = null,
    classes: BulmaModifier? = null,
    modifiers: BulmaModifier? = null,
    crossinline block: A.() -> Unit = {}
) {
    a(
        href = href,
        target = target,
        referrerPolicy = referrerPolicy,
        classes = (BulmaModifier("button") + modifiers + classes).value,
        block = block
    )
}

/**
 * Represents Bulma's Button element.
 *
 * @see [Bulma Documentation](https://bulma.io/documentation/elements/button/)
 */
public inline fun FlowOrInteractiveOrPhrasingContent.inputButton(
    formEncType: InputFormEncType? = null,
    formMethod: InputFormMethod? = null,
    name: String? = null,
    classes: String? = null,
    modifiers: BulmaModifier? = null,
    crossinline block: INPUT.() -> Unit = {}
) {
    buttonInput(
        formEncType = formEncType,
        formMethod = formMethod,
        name = name,
        classes = (BulmaModifier("button") + modifiers + classes).value,
        block = block
    )
}
