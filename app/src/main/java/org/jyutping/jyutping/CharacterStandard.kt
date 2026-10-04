package org.jyutping.jyutping

/** Conjunto de caracteres chinos: estándar de codificación y de forma. 漢字字符集標準／字形標準 */
enum class CharacterStandard(val identifier: Int) {

        /** Tradicional (predeterminado). 傳統漢字(預設) */
        Preset(1),

        /** Tradicional, variante personalizada. 傳統漢字・自定轉換字符集 */
        Custom(2),

        /** Tradicional, heredado, forma antigua. 傳統漢字・舊字形・傳承字形 */
        Inherited(3),

        /** Tradicional, filología y gramatología. 傳統漢字・字源、字理、文字學 */
        Etymology(4),

        /** Tradicional, según las tablas de OpenCC. 傳統漢字・OpenCC 字表 */
        OpenCC(5),

        /** Tradicional, estándar de Hong Kong. 傳統漢字・香港《常用字字形表》 */
        HongKong(6),

        /** Tradicional, estándar de Taiwán. 傳統漢字・臺灣《國字標準字體表》 */
        Taiwan(7),

        /** Tradicional, estándar de China continental. 傳統漢字・大陸《通用規範漢字表》 */
        PrcGeneral(8),

        /** Tradicional, China continental (impresión de libros antiguos). 傳統漢字・大陸《古籍印刷通用字規範字形表》 */
        AncientBooksPublishing(9),

        /** Simplificado, estándar de China continental. 簡化字・大陸《通用規範漢字表》 */
        Mutilated(51);

        /** isSimplified */
        val isMutilated: Boolean
                get() = (this == Mutilated)

        /** isNotSimplified */
        val isTraditional: Boolean
                get() = (this != Mutilated)

        companion object {
                fun standardOf(value: Int): CharacterStandard = entries.find { it.identifier == value } ?: Preset
        }
}
