package com.mooncloak.kodetools.bulmak.components

import com.mooncloak.kodetools.bulmak.modifier.BulmaModifier
import com.mooncloak.kodetools.bulmak.modifier.plus
import kotlinx.html.*

/**
 * Represents Bulma's Dropdown component.
 *
 * @see [Bulma Documentation](https://bulma.io/documentation/components/dropdown/)
 */
public fun FlowContent.dropdown(
    classes: String? = null,
    modifiers: BulmaModifier? = null,
    block: DropdownBuilder.() -> Unit = {}
) {
    div(
        classes = (BulmaModifier("dropdown") + modifiers + classes).value
    ) {
        val builder = DropdownBuilder(container = this)
        builder.block()
    }
}

public class DropdownBuilder internal constructor(
    private val container: DIV
) {

    public fun trigger(
        classes: String? = null,
        modifiers: BulmaModifier? = null,
        block: DIV.() -> Unit = {}
    ) {
        container.div(
            classes = (BulmaModifier("dropdown-trigger") + modifiers + classes).value,
            block = block
        )
    }

    public fun menu(
        classes: String? = null,
        modifiers: BulmaModifier? = null,
        block: DropdownContentBuilder.() -> Unit = {}
    ) {
        container.div(
            classes = (BulmaModifier("dropdown-menu") + modifiers + classes).value
        ) {
            div(
                classes = "dropdown-content"
            ) {
                val builder = DropdownContentBuilder(container = this)
                builder.block()
            }
        }
    }
}

public class DropdownContentBuilder internal constructor(
    private val container: DIV
) {

    public fun item(
        classes: String? = null,
        modifiers: BulmaModifier? = null,
        block: DIV.() -> Unit = {}
    ) {
        container.div(
            classes = (BulmaModifier("dropdown-item") + modifiers + classes).value,
            block = block
        )
    }

    public fun linkItem(
        href: String? = null,
        target: String? = null,
        referrerPolicy: AReferrerPolicy? = null,
        classes: String? = null,
        modifiers: BulmaModifier? = null,
        block: A.() -> Unit = {}
    ) {
        container.a(
            href = href,
            target = target,
            referrerPolicy = referrerPolicy,
            classes = (BulmaModifier("dropdown-item") + modifiers + classes).value,
            block = block
        )
    }

    public fun divider(
        classes: String? = null,
        modifiers: BulmaModifier? = null,
        block: HR.() -> Unit = {}
    ) {
        container.hr(
            classes = (BulmaModifier("dropdown-divider") + modifiers + classes).value,
            block = block
        )
    }
}
