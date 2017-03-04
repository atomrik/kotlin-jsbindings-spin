package su.snx.kotlin.jsbindings.spin

class SpinnerOption (
        val lines: Int = 12, // The number of lines to draw
        val length: Int = 7, // The length of each line
        val width: Int = 5, // The line thickness
        val radius: Int = 10, // The radius of the inner circle
        val scale: Double = 1.0, // Scales overall size of the spinner
        val corners: Double = 1.0, // Corner roundness (0..1)
        val color: String = "#000", // #rgb or #rrggbb or array of colors
        val opacity: Double = 0.25, // Opacity of the lines
        val rotate: Int = 0, // The rotation offset
        val direction: Int = 1, // 1: clockwise, -1: counterclockwise
        val speed: Int = 1, // Rounds per second
        val trail: Int = 100, // Afterglow percentage
        val fps: Int = 20, // Frames per second when using setTimeout() as a fallback for CSS
        val zIndex: Double = 2e9, // The z-index (defaults to 2000000000)
        val className: String = "spinner", // The CSS class to assign to the spinner
        val top: String = "50%", // Top position relative to parent
        val left: String = "50%", // Left position relative to parent
        val shadow: Boolean = false, // Whether to render a shadow
        val hwaccel: Boolean = false, // Whether to use hardware acceleration
        val position: String = "absolute" // Element positioning
)
