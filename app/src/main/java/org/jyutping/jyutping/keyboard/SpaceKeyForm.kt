package org.jyutping.jyutping.keyboard

import androidx.annotation.StringRes
import org.jyutping.jyutping.R

enum class SpaceKeyForm {

        English,
        Fallback,

        Lowercased,
        LowercasedSimplified,
        Uppercased,
        UppercasedSimplified,
        CapsLocked,
        CapsLockedSimplified,

        Confirm,
        ConfirmSimplified,
        Select,
        SelectSimplified;

        /**
         * Texto de la barra espaciadora, como recurso de cadena.
         *
         * Las variantes `*Simplified` indican el conjunto de caracteres que se está
         * escribiendo, no el idioma de la interfaz: en los idiomas chinos conservan la
         * distinción 繁/简 original, y en español o inglés ambas dan el mismo texto.
         */
        @StringRes
        fun textRes(): Int = when (this) {
                English -> R.string.space_key_space
                Fallback -> R.string.space_key_fallback
                Lowercased -> R.string.space_key_jyutping
                LowercasedSimplified -> R.string.space_key_jyutping_simplified
                Uppercased -> R.string.space_key_full_width_space
                UppercasedSimplified -> R.string.space_key_full_width_space_simplified
                CapsLocked -> R.string.space_key_caps_lock
                CapsLockedSimplified -> R.string.space_key_caps_lock_simplified
                Confirm -> R.string.space_key_confirm
                ConfirmSimplified -> R.string.space_key_confirm_simplified
                Select -> R.string.space_key_select
                SelectSimplified -> R.string.space_key_select_simplified
        }
}
