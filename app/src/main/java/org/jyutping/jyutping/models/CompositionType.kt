package org.jyutping.jyutping.models

/** InputMethodType */
enum class CompositionType {
        /** Jyutping y búsqueda inversa por componentes del carácter. 粵拼以及兩分拆字反查粵拼 */
        Primary,

        /** Búsqueda inversa mediante pinyin mandarín. 普通話拼音反查粵拼 */
        Pinyin,

        /** Búsqueda inversa mediante Cangjie o Quick (Sucheng). 倉頡或速成反查粵拼 */
        Cangjie,

        /** Búsqueda inversa mediante trazos. 筆畫反查粵拼 */
        Stroke;
}
