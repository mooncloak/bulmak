package com.mooncloak.kodetools.bulmak

import kotlinx.html.HEAD
import kotlinx.html.link

/**
 * Includes the Bulma CSS library via the CDN link.
 */
public inline fun HEAD.bulmaLink(
    version: String = "1.0.2"
) {
    link(
        href = "https://cdn.jsdelivr.net/npm/bulma@$version/css/bulma.min.css",
        rel = "stylesheet",
        type = "text/css"
    )
}
