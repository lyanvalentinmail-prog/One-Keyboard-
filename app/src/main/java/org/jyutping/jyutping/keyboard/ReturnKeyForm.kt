package org.jyutping.jyutping.keyboard

import android.view.inputmethod.EditorInfo
import androidx.annotation.StringRes
import org.jyutping.jyutping.R

enum class ReturnKeyForm {

        BufferingSimplified,
        BufferingTraditional,
        StandbyABC,
        StandbySimplified,
        StandbyTraditional,
        UnavailableABC,
        UnavailableSimplified,
        UnavailableTraditional;

        /**
         * Texto de la tecla Intro, como recurso de cadena, o `null` si la tecla no
         * lleva texto para la acción indicada.
         *
         * Las variantes ABC / Simplified / Traditional indican el conjunto de caracteres
         * que se está escribiendo, no el idioma de la interfaz: en los idiomas chinos
         * conservan la distinción original, y en español o inglés dan el mismo texto.
         */
        @StringRes
        fun keyTextRes(imeAction: Int? = null): Int? = when (this) {
                BufferingSimplified -> R.string.return_key_confirm_simplified
                BufferingTraditional -> R.string.return_key_confirm
                StandbyABC, UnavailableABC -> when (imeAction) {
                        EditorInfo.IME_ACTION_DONE -> R.string.return_key_abc_done
                        EditorInfo.IME_ACTION_GO -> R.string.return_key_abc_go
                        EditorInfo.IME_ACTION_NEXT -> R.string.return_key_abc_next
                        EditorInfo.IME_ACTION_NONE -> null
                        EditorInfo.IME_ACTION_SEND -> R.string.return_key_abc_send
                        EditorInfo.IME_ACTION_PREVIOUS -> R.string.return_key_abc_previous
                        EditorInfo.IME_ACTION_SEARCH -> R.string.return_key_abc_search
                        EditorInfo.IME_ACTION_UNSPECIFIED -> null
                        else -> null
                }
                StandbySimplified, UnavailableSimplified -> when (imeAction) {
                        EditorInfo.IME_ACTION_DONE -> R.string.return_key_done
                        EditorInfo.IME_ACTION_GO -> R.string.return_key_go
                        EditorInfo.IME_ACTION_NEXT -> R.string.return_key_next_simplified
                        EditorInfo.IME_ACTION_NONE -> null
                        EditorInfo.IME_ACTION_SEND -> R.string.return_key_send_simplified
                        EditorInfo.IME_ACTION_PREVIOUS -> R.string.return_key_previous_simplified
                        EditorInfo.IME_ACTION_SEARCH -> R.string.return_key_search_simplified
                        EditorInfo.IME_ACTION_UNSPECIFIED -> null
                        else -> null
                }
                StandbyTraditional, UnavailableTraditional -> when (imeAction) {
                        EditorInfo.IME_ACTION_DONE -> R.string.return_key_done
                        EditorInfo.IME_ACTION_GO -> R.string.return_key_go
                        EditorInfo.IME_ACTION_NEXT -> R.string.return_key_next
                        EditorInfo.IME_ACTION_NONE -> null
                        EditorInfo.IME_ACTION_SEND -> R.string.return_key_send
                        EditorInfo.IME_ACTION_PREVIOUS -> R.string.return_key_previous
                        EditorInfo.IME_ACTION_SEARCH -> R.string.return_key_search
                        EditorInfo.IME_ACTION_UNSPECIFIED -> null
                        else -> null
                }
        }
}
