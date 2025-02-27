package com.mooncloak.kodetools.bulmak.layout

import com.mooncloak.kodetools.bulmak.modifier.BulmaModifier
import kotlinx.html.*

/**
 * Represents Bulma's Hero layout.
 *
 * @see [Bulma Documentation](https://bulma.io/documentation/layout/hero/)
 */
public fun FlowContent.hero(
    classes: String? = null,
    modifiers: BulmaModifier? = null,
    block: HeroBuilder.() -> Unit = {}
) {
    section(
        classes = BulmaModifier("hero", modifiers, classes).value
    ) {
        val builder = HeroBuilder(container = this)
        builder.block()
    }
}

public class HeroBuilder internal constructor(
    private val container: SECTION
) {

    public fun head(
        classes: String? = null,
        modifiers: BulmaModifier? = null,
        block: DIV.() -> Unit = {}
    ) {
        container.div(
            classes = BulmaModifier("hero-head", modifiers, classes).value,
            block = block
        )
    }

    public fun body(
        classes: String? = null,
        modifiers: BulmaModifier? = null,
        block: DIV.() -> Unit = {}
    ) {
        container.div(
            classes = BulmaModifier("hero-body", modifiers, classes).value,
            block = block
        )
    }

    public fun foot(
        classes: String? = null,
        modifiers: BulmaModifier? = null,
        block: DIV.() -> Unit = {}
    ) {
        container.div(
            classes = BulmaModifier("hero-foot", modifiers, classes).value,
            block = block
        )
    }
}
