# kotlin-jsbindings-spin
Kotlin bindings for https://github.com/fgnass/spin.js/
## Usage
1) Add as dependency
2) Add http://spin.js.org/spin.min.js to scripts
```html
    <!-- here -->
    <script type="text/javascript" src="http://spin.js.org/spin.min.js"></script>
    <script type="text/javascript" src="lib/kotlin.js"></script>

```
2) Put script tag after Kotlin's script tag
```html
    <script type="text/javascript" src="lib/kotlin.js"></script>
    <!-- here -->
    <script type="text/javascript" src="lib/spin.js"></script>
```
3) Write code:
```javascript
    Spinner(SpinnerOptions(speed = 5)).spin(target);
```
