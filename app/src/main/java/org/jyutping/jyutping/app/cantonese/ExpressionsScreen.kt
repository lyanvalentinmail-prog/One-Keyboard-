package org.jyutping.jyutping.app.cantonese

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.ErrorOutline
import androidx.compose.material.icons.outlined.Info
import androidx.compose.material.icons.rounded.Cancel
import androidx.compose.material.icons.rounded.CheckCircle
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.MaterialTheme.colorScheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import org.jyutping.jyutping.presets.PresetColor

@Composable
fun ExpressionsScreen() {
        LazyColumn(
                contentPadding = PaddingValues(start = 14.dp, top = 8.dp, end = 14.dp, bottom = 12.dp),
                verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
                item {
                        Expression(
                                heading = "Pronombres de primera persona",
                                labels = listOf(
                                        LabelEntry(type = LabelType.CHECKED, text = "Singular: 我"),
                                        LabelEntry(type = LabelType.CHECKED, text = "Plural: 我哋"),
                                        LabelEntry(type = LabelType.MISTAKE, text = "咱、咱們")
                                )
                        )
                }
                item {
                        Expression(
                                heading = "Pronombres de segunda persona",
                                labels = listOf(
                                        LabelEntry(type = LabelType.CHECKED, text = "Singular: 你"),
                                        LabelEntry(type = LabelType.CHECKED, text = "Plural: 你哋"),
                                        LabelEntry(type = LabelType.WARNING, text = "Para el tratamiento de cortesía, el cantonés usa normalmente 「閣下」. 「您」 es propio del dialecto de Pekín y apenas aparece en otras variedades del chino."),
                                        LabelEntry(type = LabelType.WARNING, text = "No hace falta recurrir a 「妳」: es un añadido innecesario.")
                                )
                        )
                }
                item {
                        Expression(
                                heading = "Pronombres de tercera persona",
                                labels = listOf(
                                        LabelEntry(type = LabelType.CHECKED, text = "Singular: 佢"),
                                        LabelEntry(type = LabelType.CHECKED, text = "Plural: 佢哋"),
                                        LabelEntry(type = LabelType.INFO, text = "Se usa 佢 siempre, sin distinguir género ni entre personas y cosas."),
                                        LabelEntry(type = LabelType.INFO, text = "佢 también se escribe 渠 o 𠍲{⿰亻渠}")
                                )
                        )
                }
                item {
                        DifferentView(
                                heading = "Diferencia entre 【係】 y 【喺】",
                                lines = listOf(
                                        "係 hai6: verbo copulativo; equivale a 「是」 (ser).",
                                        "喺 hai2: indica lugar o tiempo; equivale a 「在」 (estar en).",
                                        "Ejemplo: 我係曹阿瞞。",
                                        "Ejemplo: 我喺赤壁遊山玩水。"
                                )
                        )
                }
                item {
                        DifferentView(
                                heading = "Diferencia entre 【諗】, 【冧】 y 【霖】",
                                lines = listOf(
                                        "諗 nam2: pensar, reflexionar, opinar.",
                                        "冧 lam3: derrumbarse, venirse abajo.",
                                        "霖 lam4: en su sentido original, lluvia continua; aparece sobre todo en nombres propios.",
                                        "Ejemplo: 我諗緊今晚食咩。",
                                        "Ejemplo: 佢畀人㨃冧咗。",
                                        "Ejemplo: 甘霖時雨。"
                                )
                        )
                }
                item {
                        DifferentView(
                                heading = "Diferencia entre 【咁】 y 【噉】",
                                lines = listOf(
                                        "咁 gam3: se pronuncia igual que 「禁」.",
                                        "噉 gam2: se pronuncia igual que 「感」.",
                                        "Ejemplo: 我生得咁靚仔。",
                                        "Ejemplo: 噉又未必。"
                                )
                        )
                }
                item {
                        DifferentView(
                                heading = "Diferencia entre 【會】 y 【識】",
                                lines = listOf(
                                        "會: delante de un verbo, indica que algo se va a hacer.",
                                        "識: saber, conocer, entender, dominar.",
                                        "Ejemplo: 我會煮飯。（Voy a cocinar.）",
                                        "Ejemplo: 我識煮飯。（Sé cocinar.）"
                                )
                        )
                }
                item {
                        Expression(
                                heading = "啩、啊嘛",
                                labels = listOf(
                                        LabelEntry(type = LabelType.CHECKED, text = "下個禮拜會出啩。"),
                                        LabelEntry(type = LabelType.CHECKED, text = "唔係啊嘛，真係冇？"),
                                        LabelEntry(type = LabelType.MISTAKE, text = "下個禮拜會出吧。"),
                                        LabelEntry(type = LabelType.MISTAKE, text = "唔係吧，真係冇？")
                                )
                        )
                }
                item {
                        Expression(
                                heading = "喇、嘞",
                                labels = listOf(
                                        LabelEntry(type = LabelType.CHECKED, text = "我識用粵拼打字喇！"),
                                        LabelEntry(type = LabelType.CHECKED, text = "係嘞，你試過粵拼輸入法未啊？"),
                                        LabelEntry(type = LabelType.MISTAKE, text = "我識用粵拼打字了！"),
                                        LabelEntry(type = LabelType.MISTAKE, text = "係了，你試過粵拼輸入法未啊？")
                                )
                        )
                }
                item {
                        Expression(
                                heading = "使",
                                labels = listOf(
                                        LabelEntry(type = LabelType.CHECKED, text = "唔使驚"),
                                        LabelEntry(type = LabelType.MISTAKE, text = "唔駛驚"),
                                        LabelEntry(type = LabelType.MISTAKE, text = "唔洗驚")
                                )
                        )
                }
                item {
                        Expression(
                                heading = "而家",
                                labels = listOf(
                                        LabelEntry(type = LabelType.CHECKED, text = "我而家食緊飯。"),
                                        LabelEntry(type = LabelType.MISTAKE, text = "我宜家食緊飯。")
                                )
                        )
                }
                item {
                        Expression(
                                heading = "甲（adjetivo）過 乙 — el comparativo",
                                labels = listOf(
                                        LabelEntry(type = LabelType.CHECKED, text = "苦過黃連。"),
                                        LabelEntry(type = LabelType.CHECKED, text = "狼過華秀隻狗。"),
                                        LabelEntry(type = LabelType.MISTAKE, text = "比黃連苦。"),
                                        LabelEntry(type = LabelType.MISTAKE, text = "比華秀隻狗更狼。")
                                )
                        )
                }
                item {
                        Expression(
                                heading = "兩樣都得",
                                labels = listOf(
                                        LabelEntry(type = LabelType.INFO, text = "A: 「你飲茶定係飲咖啡？」"),
                                        LabelEntry(type = LabelType.CHECKED, text = "B: 「兩樣都得。」"),
                                        LabelEntry(type = LabelType.MISTAKE, text = "B: 「都得。」")
                                )
                        )
                }
                item {
                        SelectionContainer {
                                Text(
                                        text = etymologyNote,
                                        modifier = Modifier.padding(6.dp),
                                        color = colorScheme.onBackground,
                                        style = MaterialTheme.typography.bodySmall
                                )
                        }
                }
        }
}

private const val etymologyNote: String =
"""
La mayoría de los supuestos «caracteres correctos» u «originales» del cantonés que circulan hoy son interpretaciones forzadas y rebuscadas, y son erróneas.
Es preferible usar la grafía corriente y de uso común, porque facilita la comunicación. No hagas caso de esas invenciones.
"""

@Composable
private fun DifferentView(heading: String, lines: List<String>) {
        SelectionContainer {
                Column(
                        modifier = Modifier
                                .background(color = colorScheme.background, shape = RoundedCornerShape(16.dp))
                                .fillMaxWidth()
                                .padding(8.dp),
                        verticalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                        Text(
                                text = heading,
                                color = colorScheme.onBackground,
                                style = MaterialTheme.typography.titleMedium
                        )
                        lines.forEach { Text(text = it, color = colorScheme.onBackground) }
                }
        }
}

private enum class LabelType {
        CHECKED,
        INFO,
        MISTAKE,
        WARNING
}
private class LabelEntry(val type: LabelType, val text: String)

@Composable
private fun Expression(heading: String, labels: List<LabelEntry>) {
        Column(
                modifier = Modifier
                        .background(color = colorScheme.background, shape = RoundedCornerShape(16.dp))
                        .fillMaxWidth()
                        .padding(8.dp),
                verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
                SelectionContainer {
                        Text(
                                text = heading,
                                color = colorScheme.onBackground,
                                style = MaterialTheme.typography.titleMedium
                        )
                }
                labels.forEach {
                        IconLabel(entry = it)
                }
        }
}

@Composable
private fun IconLabel(entry: LabelEntry) {
        val image: ImageVector = when (entry.type) {
                LabelType.CHECKED -> Icons.Rounded.CheckCircle
                LabelType.INFO -> Icons.Outlined.Info
                LabelType.MISTAKE -> Icons.Rounded.Cancel
                LabelType.WARNING -> Icons.Outlined.ErrorOutline
        }
        val color: Color = when (entry.type) {
                LabelType.CHECKED -> PresetColor.green
                LabelType.INFO -> colorScheme.onBackground
                LabelType.MISTAKE -> PresetColor.red
                LabelType.WARNING -> PresetColor.orange
        }
        Row(
                horizontalArrangement = Arrangement.spacedBy(16.dp),
                verticalAlignment = Alignment.CenterVertically
        ) {
                Icon(
                        imageVector = image,
                        contentDescription = null,
                        modifier = Modifier.size(20.dp),
                        tint = color
                )
                SelectionContainer {
                        Text(text = entry.text, color = colorScheme.onBackground)
                }
        }
}
