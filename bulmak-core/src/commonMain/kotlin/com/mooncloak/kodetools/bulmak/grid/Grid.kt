package com.mooncloak.kodetools.bulmak.grid

import com.mooncloak.kodetools.bulmak.modifier.BulmaModifier
import kotlinx.html.*

/**
 * Represents Bulma's Grid component.
 *
 * @see [Bulma Documentation](https://bulma.io/documentation/grid/smart-grid/)
 */
public fun FlowContent.grid(
    classes: String? = null,
    modifiers: BulmaModifier? = null,
    block: GridBuilder.() -> Unit = {}
) {
    div(
        classes = BulmaModifier("grid", modifiers, classes).value
    ) {
        val builder = GridBuilder(container = this)
        builder.block()
    }
}

/**
 * Represents Bulma's FixedGrid component.
 *
 * @see [Bulma Documentation](https://bulma.io/documentation/grid/fixed-grid/)
 */
public fun FlowContent.fixedGrid(
    classes: String? = null,
    modifiers: BulmaModifier? = null,
    block: FixedGridBuilder.() -> Unit = {}
) {
    div(
        classes = BulmaModifier("fixed-grid", modifiers, classes).value
    ) {
        val builder = FixedGridBuilder(container = this)
        builder.block()
    }
}

public class GridBuilder internal constructor(
    private val container: DIV
) {

    public fun cell(
        classes: String? = null,
        modifiers: BulmaModifier? = null,
        block: DIV.() -> Unit = {}
    ) {
        container.div(
            classes = BulmaModifier("cell", modifiers, classes).value,
            block = block
        )
    }
}

public class FixedGridBuilder internal constructor(
    private val container: DIV
) {

    public fun grid(
        classes: String? = null,
        modifiers: BulmaModifier? = null,
        block: GridBuilder.() -> Unit = {}
    ) {
        container.div(
            classes = BulmaModifier("grid", modifiers, classes).value
        ) {
            val builder = GridBuilder(container = this)
            builder.block()
        }
    }
}
