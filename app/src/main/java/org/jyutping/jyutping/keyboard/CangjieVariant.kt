package org.jyutping.jyutping.keyboard

/// Versión de Cangjie / Quick (Sucheng). 倉頡／速成版本
enum class CangjieVariant(val identifier: Int) {

        /// Cangjie, 5.ª generación. 倉頡五代
        Cangjie5(11),

        /// Cangjie, 3.ª generación. 倉頡三代
        Cangjie3(12),

        /// Quick (Sucheng), basado en Cangjie 5.ª generación. 速成（倉頡五代）
        Quick5(21),

        /// Quick (Sucheng), basado en Cangjie 3.ª generación. 速成（倉頡三代）
        Quick3(22);

        companion object {
                fun variantOf(value: Int): CangjieVariant = when (value) {
                        Cangjie5.identifier -> Cangjie5
                        Cangjie3.identifier -> Cangjie3
                        Quick5.identifier -> Quick5
                        Quick3.identifier -> Quick3
                        else -> Cangjie5
                }
        }
}
