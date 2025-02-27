package com.mooncloak.kodetools.bulmak.theme

import kotlinx.html.HEAD
import kotlinx.html.style
import kotlinx.html.unsafe

// TODO: Provide way to override the theme colors.
private fun HEAD.bulmaTheme() {
    style(type = "text/css") {
        unsafe {
            +"""
            |:root {
            |  --bulma-primary-h: 240deg;
            |  --bulma-primary-l: 68%;
            |  --bulma-link-h: 240deg;
            |  --bulma-link-l: 68%;
            |  --bulma-info-h: 221deg;
            |  --bulma-info-s: 83%;
            |  --bulma-info-l: 53%;
            |  --bulma-success-h: 175deg;
            |  --bulma-success-s: 84%;
            |  --bulma-success-l: 32%;
            |  --bulma-warning-h: 45deg;
            |  --bulma-warning-s: 97%;
            |  --bulma-warning-l: 60%;
            |  --bulma-danger-h: 0deg;
            |  --bulma-danger-s: 81%;
            |  --bulma-danger-l: 58%;
            |  --bulma-arrow-color: #5D5DFF;
            |  --bulma-loading-color: #5D5DFF;
            |  --bulma-body-background-color: #12161F;
            |  --bulma-skeleton-background: #1C2230;
            |}
            | 
            |.card {
            |  --bulma-card-background-color: #1C2230;
            |}
            |
            |.dropdown {
            |  --bulma-dropdown-content-background-color: #1C2230;
            |}
            | 
            |.modal {
            |  --bulma-modal-background-background-color: #1C2230;
            |}
            """.trimMargin()
        }
    }
}
