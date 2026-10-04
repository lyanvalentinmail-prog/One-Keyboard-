package org.jyutping.jyutping.models

/** Cantonese Keyboard Layout */
enum class KeyboardLayout(val identifier: Int) {
        /** Teclado completo de 26 teclas. 26 鍵全鍵盤 */
        Qwerty(1),

        /** Triple pulsación de 26 teclas. 26 鍵三拼 */
        TripleStroke(2),

        /** Cuadrícula de 9 teclas (T9). 九宮格（9 鍵） */
        NineKey(3);

        /** 26 鍵全鍵盤 */
        val isQwerty: Boolean
                get() = (this == Qwerty)

        /** 26 鍵三拼 */
        val isTripleStroke: Boolean
                get() = (this == TripleStroke)

        /** 九宮格（9 鍵） */
        val isNineKey: Boolean
                get() = (this == NineKey)

        companion object {
                fun layoutOf(value: Int): KeyboardLayout = entries.find { it.identifier == value } ?: Qwerty
        }
}
