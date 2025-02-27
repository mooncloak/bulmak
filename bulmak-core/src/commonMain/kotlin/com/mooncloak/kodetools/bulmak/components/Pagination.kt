package com.mooncloak.kodetools.bulmak.components

import com.mooncloak.kodetools.bulmak.modifier.BulmaModifier
import com.mooncloak.kodetools.bulmak.modifier.plus
import kotlinx.html.*

/**
 * Represents Bulma's Pagination component.
 *
 * @see [Bulma Documentation](https://bulma.io/documentation/components/pagination/)
 */
public fun FlowContent.pagination(
    classes: String? = null,
    modifiers: BulmaModifier? = null,
    block: PaginationBuilder.() -> Unit = {}
) {
    nav(
        classes = (BulmaModifier("pagination") + modifiers + classes).value
    ) {
        val builder = PaginationBuilder(container = this)
        builder.block()
    }
}

public class PaginationBuilder internal constructor(
    private val container: NAV
) {

    public fun previous(
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
            classes = (BulmaModifier("pagination-previous") + modifiers + classes).value,
            block = block
        )
    }

    public fun next(
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
            classes = (BulmaModifier("pagination-next") + modifiers + classes).value,
            block = block
        )
    }

    public fun list(
        classes: String? = null,
        modifiers: BulmaModifier? = null,
        block: PaginationListBuilder.() -> Unit = {}
    ) {
        container.ul(
            classes = (BulmaModifier("pagination-list") + modifiers + classes).value
        ) {
            val builder = PaginationListBuilder(container = this)
            builder.block()
        }
    }
}

public class PaginationListBuilder internal constructor(
    private val container: UL
) {

    public fun link(
        href: String? = null,
        target: String? = null,
        referrerPolicy: AReferrerPolicy? = null,
        classes: String? = null,
        modifiers: BulmaModifier? = null,
        block: A.() -> Unit = {}
    ) {
        container.li {
            a(
                href = href,
                target = target,
                referrerPolicy = referrerPolicy,
                classes = (BulmaModifier("pagination-link") + modifiers + classes).value,
                block = block
            )
        }
    }

    public fun ellipsis(
        classes: String? = null,
        modifiers: BulmaModifier? = null,
        block: SPAN.() -> Unit = {}
    ) {
        container.li {
            span(
                classes = (BulmaModifier("pagination-ellipsis") + modifiers + classes).value,
                block = block
            )
        }
    }
}
