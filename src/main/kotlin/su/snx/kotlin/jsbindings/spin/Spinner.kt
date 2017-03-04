package su.snx.kotlin.jsbindings.spin

import org.w3c.dom.Element

external class Spinner() {
    constructor(options: SpinnerOptions)
    fun spin(element: Element): Spinner
    fun stop(): Spinner
}