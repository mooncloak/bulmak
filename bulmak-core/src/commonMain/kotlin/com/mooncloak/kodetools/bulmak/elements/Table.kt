package com.mooncloak.kodetools.bulmak.elements

import com.mooncloak.kodetools.bulmak.modifier.BulmaModifier
import com.mooncloak.kodetools.bulmak.modifier.plus
import kotlinx.html.*

/**
 * Represents Bulma's Table element. Note that tables in Bulma MUST follow a certain order:
 * ```
 * - <table class="table"> as the main container
 *     - thead the optional top part of the table
 *     - tfoot the optional bottom part of the table
 *     - tbody the main content of the table
 *         - tr each table row
 *             - th a table cell heading
 *             - td a table cell
 * ```
 *
 * @see [Bulma Documentation](https://bulma.io/documentation/elements/table)
 */
public inline fun FlowContent.table(
    classes: BulmaModifier? = null,
    modifiers: BulmaModifier? = null,
    crossinline block: TABLE.() -> Unit = {}
) {
    table(
        classes = (BulmaModifier("table") + modifiers + classes).value,
        block = block
    )
}
