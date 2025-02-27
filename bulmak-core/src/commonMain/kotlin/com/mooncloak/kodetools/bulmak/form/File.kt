package com.mooncloak.kodetools.bulmak.form

import com.mooncloak.kodetools.bulmak.modifier.BulmaModifier
import com.mooncloak.kodetools.bulmak.modifier.hasName
import kotlinx.html.*

/**
 * Represents Bulma's File form component.
 *
 * @see [Bulma Documentation](https://bulma.io/documentation/form/file/)
 */
public fun FlowContent.file(
    name: Boolean = false,
    classes: String? = null,
    modifiers: BulmaModifier? = null,
    block: FileBuilder.() -> Unit = {}
) {
    div(
        classes = BulmaModifier("file", if (name) hasName else null, modifiers, classes).value
    ) {
        val builder = FileBuilder(container = this)
        builder.block()
    }
}

public class FileBuilder internal constructor(
    private val container: DIV
) {

    public fun label(
        classes: String? = null,
        modifiers: BulmaModifier? = null,
        block: FileLabelBuilder.() -> Unit = {}
    ) {
        container.label(
            classes = BulmaModifier("file-label", modifiers, classes).value
        ) {
            val builder = FileLabelBuilder(container = this)
            builder.block()
        }
    }
}

public class FileLabelBuilder internal constructor(
    private val container: LABEL
) {

    public fun input(
        type: InputType? = InputType.file,
        formEncType: InputFormEncType? = null,
        formMethod: InputFormMethod? = null,
        name: String? = null,
        classes: String? = null,
        modifiers: BulmaModifier? = null,
        block: INPUT.() -> Unit = {}
    ) {
        container.input(
            type = type,
            formEncType = formEncType,
            formMethod = formMethod,
            name = name,
            classes = BulmaModifier("file-input", modifiers, classes).value,
            block = block
        )
    }

    public fun callToAction(
        classes: String? = null,
        modifiers: BulmaModifier? = null,
        block: FileCallToActionBuilder.() -> Unit = {}
    ) {
        container.span(
            classes = BulmaModifier("file-cta", modifiers, classes).value
        ) {
            val builder = FileCallToActionBuilder(container = this)
            builder.block()
        }
    }

    public fun name(
        classes: String? = null,
        modifiers: BulmaModifier? = null,
        block: SPAN.() -> Unit = {}
    ) {
        container.span(
            classes = BulmaModifier("file-name", modifiers, classes).value,
            block = block
        )
    }
}

public class FileCallToActionBuilder internal constructor(
    private val container: SPAN
) {

    public fun icon(
        classes: String? = null,
        modifiers: BulmaModifier? = null,
        block: SPAN.() -> Unit = {}
    ) {
        container.span(
            classes = BulmaModifier("file-icon", modifiers, classes).value,
            block = block
        )
    }

    public fun label(
        classes: String? = null,
        modifiers: BulmaModifier? = null,
        block: SPAN.() -> Unit = {}
    ) {
        container.span(
            classes = BulmaModifier("file-label", modifiers, classes).value,
            block = block
        )
    }
}
