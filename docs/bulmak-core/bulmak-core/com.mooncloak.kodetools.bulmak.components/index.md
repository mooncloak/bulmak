//[bulmak-core](../../index.md)/[com.mooncloak.kodetools.bulmak.components](index.md)

# Package-level declarations

## Types

| Name | Summary |
|---|---|
| [CardBuilder](-card-builder/index.md) | [common]<br>class [CardBuilder](-card-builder/index.md) |
| [CardFooterBuilder](-card-footer-builder/index.md) | [common]<br>class [CardFooterBuilder](-card-footer-builder/index.md) |
| [CardHeaderBuilder](-card-header-builder/index.md) | [common]<br>class [CardHeaderBuilder](-card-header-builder/index.md) |
| [DropdownBuilder](-dropdown-builder/index.md) | [common]<br>class [DropdownBuilder](-dropdown-builder/index.md) |
| [DropdownContentBuilder](-dropdown-content-builder/index.md) | [common]<br>class [DropdownContentBuilder](-dropdown-content-builder/index.md) |
| [MenuBuilder](-menu-builder/index.md) | [common]<br>class [MenuBuilder](-menu-builder/index.md) |
| [MessageBuilder](-message-builder/index.md) | [common]<br>class [MessageBuilder](-message-builder/index.md) |
| [ModalBuilder](-modal-builder/index.md) | [common]<br>class [ModalBuilder](-modal-builder/index.md) |
| [ModalCardBuilder](-modal-card-builder/index.md) | [common]<br>class [ModalCardBuilder](-modal-card-builder/index.md) |
| [NavbarBuilder](-navbar-builder/index.md) | [common]<br>class [NavbarBuilder](-navbar-builder/index.md) |
| [NavbarItemBuilder](-navbar-item-builder/index.md) | [common]<br>class [NavbarItemBuilder](-navbar-item-builder/index.md) |
| [NavbarItemContainerBuilder](-navbar-item-container-builder/index.md) | [common]<br>class [NavbarItemContainerBuilder](-navbar-item-container-builder/index.md) |
| [NavbarMenuBuilder](-navbar-menu-builder/index.md) | [common]<br>class [NavbarMenuBuilder](-navbar-menu-builder/index.md) |
| [PaginationBuilder](-pagination-builder/index.md) | [common]<br>class [PaginationBuilder](-pagination-builder/index.md) |
| [PaginationListBuilder](-pagination-list-builder/index.md) | [common]<br>class [PaginationListBuilder](-pagination-list-builder/index.md) |
| [PanelBuilder](-panel-builder/index.md) | [common]<br>class [PanelBuilder](-panel-builder/index.md) |
| [TabContainerBuilder](-tab-container-builder/index.md) | [common]<br>class [TabContainerBuilder](-tab-container-builder/index.md) |

## Functions

| Name | Summary |
|---|---|
| [breadcrumb](breadcrumb.md) | [common]<br>inline fun FlowContent.[breadcrumb](breadcrumb.md)(classes: [BulmaModifier](../com.mooncloak.kodetools.bulmak.modifier/-bulma-modifier/index.md)? = null, modifiers: [BulmaModifier](../com.mooncloak.kodetools.bulmak.modifier/-bulma-modifier/index.md)? = null, crossinline block: UL.() -&gt; [Unit](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-unit/index.html) = {})<br>Represents Bulma's Breadcrumb component. Simply use li items for each navigation element, and add the [isActive](../com.mooncloak.kodetools.bulmak.modifier/is-active.md) modifier for the currently selected item to disable navigation to that item. |
| [card](card.md) | [common]<br>fun FlowContent.[card](card.md)(classes: [String](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-string/index.html)? = null, modifiers: [BulmaModifier](../com.mooncloak.kodetools.bulmak.modifier/-bulma-modifier/index.md)? = null, block: [CardBuilder](-card-builder/index.md).() -&gt; [Unit](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-unit/index.html) = {})<br>Represents Bulma's Card component. |
| [dropdown](dropdown.md) | [common]<br>fun FlowContent.[dropdown](dropdown.md)(classes: [String](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-string/index.html)? = null, modifiers: [BulmaModifier](../com.mooncloak.kodetools.bulmak.modifier/-bulma-modifier/index.md)? = null, block: [DropdownBuilder](-dropdown-builder/index.md).() -&gt; [Unit](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-unit/index.html) = {})<br>Represents Bulma's Dropdown component. |
| [menu](menu.md) | [common]<br>fun FlowContent.[menu](menu.md)(classes: [String](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-string/index.html)? = null, modifiers: [BulmaModifier](../com.mooncloak.kodetools.bulmak.modifier/-bulma-modifier/index.md)? = null, block: [MenuBuilder](-menu-builder/index.md).() -&gt; [Unit](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-unit/index.html) = {})<br>Represents Bulma's Menu component. |
| [message](message.md) | [common]<br>fun FlowContent.[message](message.md)(classes: [String](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-string/index.html)? = null, modifiers: [BulmaModifier](../com.mooncloak.kodetools.bulmak.modifier/-bulma-modifier/index.md)? = null, block: [MessageBuilder](-message-builder/index.md).() -&gt; [Unit](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-unit/index.html) = {})<br>Represents Bulma's Message component. |
| [modal](modal.md) | [common]<br>fun FlowContent.[modal](modal.md)(classes: [String](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-string/index.html)? = null, modifiers: [BulmaModifier](../com.mooncloak.kodetools.bulmak.modifier/-bulma-modifier/index.md)? = null, block: [ModalBuilder](-modal-builder/index.md).() -&gt; [Unit](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-unit/index.html) = {})<br>Represents Bulma's Modal component. |
| [modalCardTitle](modal-card-title.md) | [common]<br>fun HEADER.[modalCardTitle](modal-card-title.md)(classes: [String](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-string/index.html)? = null, modifiers: [BulmaModifier](../com.mooncloak.kodetools.bulmak.modifier/-bulma-modifier/index.md)? = null, block: P.() -&gt; [Unit](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-unit/index.html) = {}) |
| [navbar](navbar.md) | [common]<br>fun FlowContent.[navbar](navbar.md)(classes: [String](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-string/index.html)? = null, modifiers: [BulmaModifier](../com.mooncloak.kodetools.bulmak.modifier/-bulma-modifier/index.md)? = null, block: [NavbarBuilder](-navbar-builder/index.md).() -&gt; [Unit](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-unit/index.html) = {})<br>Represents Bulma's Navbar component. |
| [navbarBurger](navbar-burger.md) | [common]<br>fun FlowContent.[navbarBurger](navbar-burger.md)(href: [String](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-string/index.html)? = null, target: [String](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-string/index.html)? = null, referrerPolicy: AReferrerPolicy? = null, classes: [String](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-string/index.html)? = null, modifiers: [BulmaModifier](../com.mooncloak.kodetools.bulmak.modifier/-bulma-modifier/index.md)? = null, block: A.() -&gt; [Unit](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-unit/index.html) = {}) |
| [pagination](pagination.md) | [common]<br>fun FlowContent.[pagination](pagination.md)(classes: [String](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-string/index.html)? = null, modifiers: [BulmaModifier](../com.mooncloak.kodetools.bulmak.modifier/-bulma-modifier/index.md)? = null, block: [PaginationBuilder](-pagination-builder/index.md).() -&gt; [Unit](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-unit/index.html) = {})<br>Represents Bulma's Pagination component. |
| [panel](panel.md) | [common]<br>fun FlowContent.[panel](panel.md)(classes: [String](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-string/index.html)? = null, modifiers: [BulmaModifier](../com.mooncloak.kodetools.bulmak.modifier/-bulma-modifier/index.md)? = null, build: [PanelBuilder](-panel-builder/index.md).() -&gt; [Unit](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-unit/index.html) = {})<br>Represents Bulma's Panel component. |
| [tabs](tabs.md) | [common]<br>fun FlowContent.[tabs](tabs.md)(classes: [String](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-string/index.html)? = null, modifiers: [BulmaModifier](../com.mooncloak.kodetools.bulmak.modifier/-bulma-modifier/index.md)? = null, build: [TabContainerBuilder](-tab-container-builder/index.md).() -&gt; [Unit](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-unit/index.html) = {})<br>Represents Bulma's Tabs component. |
