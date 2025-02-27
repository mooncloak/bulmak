package com.mooncloak.kodetools.bulmak.elements

import com.mooncloak.kodetools.bulmak.modifier.BulmaModifier
import com.mooncloak.kodetools.bulmak.modifier.plus
import kotlinx.html.*

/**
 * Represents Bulma's ProgressBar element.
 *
 * @see [Bulma Documentation](https://bulma.io/documentation/elements/progress/)
 */
public inline fun FlowContent.progressBar(
    classes: String? = null,
    modifiers: BulmaModifier? = null,
    crossinline block: PROGRESS.() -> Unit = {}
) {
    progress(
        classes = (BulmaModifier("progress") + modifiers + classes).value,
        block = block
    )
}
