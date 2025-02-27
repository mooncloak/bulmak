//[bulmak-core](../../index.md)/[com.mooncloak.kodetools.bulmak.elements](index.md)/[defaultTable](default-table.md)

# defaultTable

[common]\
inline fun FlowContent.[defaultTable](default-table.md)(classes: [String](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-string/index.html)? = null, modifiers: [BulmaModifier](../com.mooncloak.kodetools.bulmak.modifier/-bulma-modifier/index.md)? = null, crossinline block: TABLE.() -&gt; [Unit](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-unit/index.html) = {})

Represents Bulma's Table element. Note that tables in Bulma MUST follow a certain order:

```kotlin
- <table class="table"> as the main container
    - thead the optional top part of the table
    - tfoot the optional bottom part of the table
    - tbody the main content of the table
        - tr each table row
            - th a table cell heading
            - td a table cell
```

#### See also

| | |
|---|---|
|  | [Bulma Documentation](https://bulma.io/documentation/elements/table) |
