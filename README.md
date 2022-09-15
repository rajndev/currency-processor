# Currency Processor Library
A Currency processing library for Android apps.

## Importing the library into your project

### settings.gradle file

```gradle
repositories {
  // When using build.gradle
  maven { url 'https://jitpack.io' } 
        
  // When using build.gradle.kts
  maven { setUrl("https://jitpack.io") }
}
```

### build.gradle file

```gradle
dependencies {
  implementation 'com.github.rajndev:currency-processor:<latest-version>'
}
```

## Included Components

### Currency Utilities: Utility functions to handle currency operations

```kotlin
object CurrencyUtils {
  fun formatNumberToCurrencyDecimal(amountToConvert: String): String
}
```

## Contributions

Any and all contributions are welcome and appreciated. Please open a pull request when you are ready. Thank you.

## License

```
MIT License

Copyright (c) 2022 Raj Narayanan

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
```
