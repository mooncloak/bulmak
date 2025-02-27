package com.mooncloak.kodetools.bulmak.elements

import com.mooncloak.kodetools.bulmak.modifier.BulmaModifier
import com.mooncloak.kodetools.bulmak.modifier.plus
import kotlinx.html.*

/**
 * A container for Button elements.
 *
 * @see [Bulma Documentation](https://bulma.io/documentation/elements/button/)
 */
public inline fun FlowContent.buttons(
    classes: String? = null,
    modifiers: BulmaModifier? = null,
    crossinline block: DIV.() -> Unit = {}
) {
    div(
        classes = (BulmaModifier("buttons") + modifiers + classes).value,
        block = block
    )
}

/**
 * Represents Bulma's Button element.
 *
 * @see [Bulma Documentation](https://bulma.io/documentation/elements/button/)
 */
public inline fun FlowOrInteractiveOrPhrasingContent.regularButton(
    formEncType: ButtonFormEncType? = null,
    formMethod: ButtonFormMethod? = null,
    name: String? = null,
    type: ButtonType? = null,
    classes: String? = null,
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
    classes: String? = null,
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
