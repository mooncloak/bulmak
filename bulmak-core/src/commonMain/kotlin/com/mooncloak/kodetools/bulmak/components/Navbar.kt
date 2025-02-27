package com.mooncloak.kodetools.bulmak.components

import com.mooncloak.kodetools.bulmak.modifier.BulmaModifier
import com.mooncloak.kodetools.bulmak.modifier.plus
import kotlinx.html.*

/**
 * Represents Bulma's Navbar component.
 *
 * @see [Bulma Documentation](https://bulma.io/documentation/components/navbar/)
 */
public fun FlowContent.navbar(
    classes: String? = null,
    modifiers: BulmaModifier? = null,
    block: NavbarBuilder.() -> Unit = {}
) {
    nav(
        classes = (BulmaModifier("navbar") + modifiers + classes).value
    ) {
        val builder = NavbarBuilder(container = this)
        builder.block()
    }
}

public class NavbarBuilder internal constructor(
    private val container: NAV
) {

    public fun brand(
        classes: String? = null,
        modifiers: BulmaModifier? = null,
        block: NavbarItemContainerBuilder.() -> Unit = {}
    ) {
        container.div(
            classes = (BulmaModifier("navbar-brand") + modifiers + classes).value
        ) {
            val builder = NavbarItemContainerBuilder(container = this)
            builder.block()
        }
    }

    public fun menu(
        classes: String? = null,
        modifiers: BulmaModifier? = null,
        block: NavbarMenuBuilder.() -> Unit = {}
    ) {
        container.div(
            classes = (BulmaModifier("navbar-menu") + modifiers + classes).value
        ) {
            val builder = NavbarMenuBuilder(container = this)
            builder.block()
        }
    }
}

public class NavbarMenuBuilder internal constructor(
    private val container: DIV
) {

    public fun start(
        classes: String? = null,
        modifiers: BulmaModifier? = null,
        block: NavbarItemContainerBuilder.() -> Unit = {}
    ) {
        container.div(
            classes = (BulmaModifier("navbar-start") + modifiers + classes).value
        ) {
            val builder = NavbarItemContainerBuilder(container = this)
            builder.block()
        }
    }

    public fun end(
        classes: String? = null,
        modifiers: BulmaModifier? = null,
        block: NavbarItemContainerBuilder.() -> Unit = {}
    ) {
        container.div(
            classes = (BulmaModifier("navbar-end") + modifiers + classes).value
        ) {
            val builder = NavbarItemContainerBuilder(container = this)
            builder.block()
        }
    }
}

public class NavbarItemContainerBuilder internal constructor(
    private val container: DIV
) {

    public fun item(
        classes: String? = null,
        modifiers: BulmaModifier? = null,
        block: NavbarItemBuilder.() -> Unit = {}
    ) {
        container.div(
            classes = (BulmaModifier("navbar-item") + modifiers + classes).value,
        ) {
            val builder = NavbarItemBuilder(container = this)
            builder.block()
        }
    }

    public fun plainItem(
        classes: String? = null,
        modifiers: BulmaModifier? = null,
        block: DIV.() -> Unit = {}
    ) {
        container.div(
            classes = (BulmaModifier("navbar-item") + modifiers + classes).value,
            block = block
        )
    }

    public fun linkItem(
        href: String? = null,
        target: String? = null,
        referrerPolicy: AReferrerPolicy? = null,
        classes: String? = null,
        modifiers: BulmaModifier? = null,
        block: NavbarItemBuilder.() -> Unit = {}
    ) {
        container.a(
            href = href,
            target = target,
            referrerPolicy = referrerPolicy,
            classes = (BulmaModifier("navbar-item") + modifiers + classes).value,
        ) {
            val builder = NavbarItemBuilder(container = this)
            builder.block()
        }
    }

    public fun plainLinkItem(
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
            classes = (BulmaModifier("navbar-item") + modifiers + classes).value,
            block = block
        )
    }

    public fun divider(
        classes: String? = null,
        modifiers: BulmaModifier? = null,
        block: HR.() -> Unit = {}
    ) {
        container.hr(
            classes = (BulmaModifier("navbar-divider") + modifiers + classes).value,
            block = block
        )
    }
}

public class NavbarItemBuilder internal constructor(
    private val container: FlowContent
) {

    public fun link(
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
            classes = (BulmaModifier("navbar-link") + modifiers + classes).value,
            block = block
        )
    }

    public fun dropdown(
        classes: String? = null,
        modifiers: BulmaModifier? = null,
        block: NavbarItemContainerBuilder.() -> Unit = {}
    ) {
        container.div(
            classes = (BulmaModifier("navbar-dropdown") + modifiers + classes).value
        ) {
            val builder = NavbarItemContainerBuilder(container = this)
            builder.block()
        }
    }
}

public fun FlowContent.navbarBurger(
    href: String? = null,
    target: String? = null,
    referrerPolicy: AReferrerPolicy? = null,
    classes: String? = null,
    modifiers: BulmaModifier? = null,
    block: A.() -> Unit = {}
) {
    a(
        href = href,
        target = target,
        referrerPolicy = referrerPolicy,
        classes = (BulmaModifier("navbar-burger") + modifiers + classes).value,
        block = block
    )
}
