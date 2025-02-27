package com.mooncloak.kodetools.bulmak.layout

import com.mooncloak.kodetools.bulmak.modifier.BulmaModifier
import kotlinx.html.*

/**
 * Represents Bulma's Level layout.
 *
 * @see [Bulma Documentation](https://bulma.io/documentation/layout/level/)
 */
public fun FlowContent.level(
    classes: String? = null,
    modifiers: BulmaModifier? = null,
    block: LevelBuilder.() -> Unit = {}
) {
    nav(
        classes = BulmaModifier("level", modifiers, classes).value
    ) {
        val builder = LevelBuilder(container = this)
        builder.block()
    }
}

public class LevelBuilder internal constructor(
    private val container: FlowContent
) {

    public fun left(
        classes: String? = null,
        modifiers: BulmaModifier? = null,
        block: LevelItemListBuilder.() -> Unit = {}
    ) {
        container.div(
            classes = BulmaModifier("level-left", modifiers, classes).value
        ) {
            val builder = LevelItemListBuilder(container = this)
            builder.block()
        }
    }

    public fun right(
        classes: String? = null,
        modifiers: BulmaModifier? = null,
        block: LevelItemListBuilder.() -> Unit = {}
    ) {
        container.div(
            classes = BulmaModifier("level-right", modifiers, classes).value
        ) {
            val builder = LevelItemListBuilder(container = this)
            builder.block()
        }
    }
}

public class LevelItemListBuilder internal constructor(
    private val container: DIV
) {

    public fun item(
        classes: String? = null,
        modifiers: BulmaModifier? = null,
        block: DIV.() -> Unit = {}
    ) {
        container.div(
            classes = BulmaModifier("level-item", modifiers, classes).value,
            block = block
        )
    }
}
