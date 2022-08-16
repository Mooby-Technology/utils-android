package io.mooby.utils.text

fun String.isValid(): Boolean {
    return try {
        !(this.isEmpty() || this == "" || this == " " || this == "null" || this == "[]")
    } catch (e: Exception) {
        false
    }
}
