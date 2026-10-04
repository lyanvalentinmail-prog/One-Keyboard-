package org.jyutping.jyutping.keyboard

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.Dp
import org.jyutping.jyutping.R
import org.jyutping.jyutping.models.KeyElement
import org.jyutping.jyutping.models.KeyModel
import org.jyutping.jyutping.models.KeySide
import org.jyutping.jyutping.models.VirtualInputKey

@Composable
fun CantoneseNumberRow(height: Dp) {
        Row(
                modifier = Modifier
                        .height(height)
                        .fillMaxWidth()
        ) {
                EdgeEnhancedInputKey(
                        side = KeySide.Left,
                        virtual = VirtualInputKey.number1,
                        keyModel = KeyModel(
                                primary = KeyElement("1"),
                                members = listOf(
                                        KeyElement("1"),
                                        KeyElement(text = "１", header = stringResource(R.string.key_header_full_width)),
                                        KeyElement("壹"),
                                        KeyElement(text = "¹", header = stringResource(R.string.key_header_superscript)),
                                        KeyElement(text = "₁", header = stringResource(R.string.key_header_subscript)),
                                        KeyElement("①")
                                )
                        ),
                        modifier = Modifier.weight(1f)
                )
                EnhancedInputKey(
                        side = KeySide.Left,
                        virtual = VirtualInputKey.number2,
                        keyModel = KeyModel(
                                primary = KeyElement("2"),
                                members = listOf(
                                        KeyElement("2"),
                                        KeyElement(text = "２", header = stringResource(R.string.key_header_full_width)),
                                        KeyElement("貳"),
                                        KeyElement(text = "²", header = stringResource(R.string.key_header_superscript)),
                                        KeyElement(text = "₂", header = stringResource(R.string.key_header_subscript)),
                                        KeyElement("②")
                                )
                        ),
                        modifier = Modifier.weight(1f)
                )
                EnhancedInputKey(
                        side = KeySide.Left,
                        virtual = VirtualInputKey.number3,
                        keyModel = KeyModel(
                                primary = KeyElement("3"),
                                members = listOf(
                                        KeyElement("3"),
                                        KeyElement(text = "３", header = stringResource(R.string.key_header_full_width)),
                                        KeyElement("叁"),
                                        KeyElement(text = "³", header = stringResource(R.string.key_header_superscript)),
                                        KeyElement(text = "₃", header = stringResource(R.string.key_header_subscript)),
                                        KeyElement("③")
                                )
                        ),
                        modifier = Modifier.weight(1f)
                )
                EnhancedInputKey(
                        side = KeySide.Left,
                        virtual = VirtualInputKey.number4,
                        keyModel = KeyModel(
                                primary = KeyElement("4"),
                                members = listOf(
                                        KeyElement("4"),
                                        KeyElement(text = "４", header = stringResource(R.string.key_header_full_width)),
                                        KeyElement("肆"),
                                        KeyElement(text = "⁴", header = stringResource(R.string.key_header_superscript)),
                                        KeyElement(text = "₄", header = stringResource(R.string.key_header_subscript)),
                                        KeyElement("④")
                                )
                        ),
                        modifier = Modifier.weight(1f)
                )
                EnhancedInputKey(
                        side = KeySide.Left,
                        virtual = VirtualInputKey.number5,
                        keyModel = KeyModel(
                                primary = KeyElement("5"),
                                members = listOf(
                                        KeyElement("5"),
                                        KeyElement(text = "５", header = stringResource(R.string.key_header_full_width)),
                                        KeyElement("伍"),
                                        KeyElement(text = "⁵", header = stringResource(R.string.key_header_superscript)),
                                        KeyElement(text = "₅", header = stringResource(R.string.key_header_subscript)),
                                        KeyElement("⑤")
                                )
                        ),
                        modifier = Modifier.weight(1f)
                )
                EnhancedInputKey(
                        side = KeySide.Right,
                        virtual = VirtualInputKey.number6,
                        keyModel = KeyModel(
                                primary = KeyElement("6"),
                                members = listOf(
                                        KeyElement("6"),
                                        KeyElement(text = "６", header = stringResource(R.string.key_header_full_width)),
                                        KeyElement("陸"),
                                        KeyElement(text = "⁶", header = stringResource(R.string.key_header_superscript)),
                                        KeyElement(text = "₆", header = stringResource(R.string.key_header_subscript)),
                                        KeyElement("⑥")
                                )
                        ),
                        modifier = Modifier.weight(1f)
                )
                EnhancedInputKey(
                        side = KeySide.Right,
                        virtual = VirtualInputKey.number7,
                        keyModel = KeyModel(
                                primary = KeyElement("7"),
                                members = listOf(
                                        KeyElement("7"),
                                        KeyElement(text = "７", header = stringResource(R.string.key_header_full_width)),
                                        KeyElement("柒"),
                                        KeyElement(text = "⁷", header = stringResource(R.string.key_header_superscript)),
                                        KeyElement(text = "₇", header = stringResource(R.string.key_header_subscript)),
                                        KeyElement("⑦")
                                )
                        ),
                        modifier = Modifier.weight(1f)
                )
                EnhancedInputKey(
                        side = KeySide.Right,
                        virtual = VirtualInputKey.number8,
                        keyModel = KeyModel(
                                primary = KeyElement("8"),
                                members = listOf(
                                        KeyElement("8"),
                                        KeyElement(text = "８", header = stringResource(R.string.key_header_full_width)),
                                        KeyElement("捌"),
                                        KeyElement(text = "⁸", header = stringResource(R.string.key_header_superscript)),
                                        KeyElement(text = "₈", header = stringResource(R.string.key_header_subscript)),
                                        KeyElement("⑧")
                                )
                        ),
                        modifier = Modifier.weight(1f)
                )
                EnhancedInputKey(
                        side = KeySide.Right,
                        virtual = VirtualInputKey.number9,
                        keyModel = KeyModel(
                                primary = KeyElement("9"),
                                members = listOf(
                                        KeyElement("9"),
                                        KeyElement(text = "９", header = stringResource(R.string.key_header_full_width)),
                                        KeyElement("玖"),
                                        KeyElement(text = "⁹", header = stringResource(R.string.key_header_superscript)),
                                        KeyElement(text = "₉", header = stringResource(R.string.key_header_subscript)),
                                        KeyElement("⑨")
                                )
                        ),
                        modifier = Modifier.weight(1f)
                )
                EdgeEnhancedInputKey(
                        side = KeySide.Right,
                        virtual = VirtualInputKey.number0,
                        keyModel = KeyModel(
                                primary = KeyElement("0"),
                                members = listOf(
                                        KeyElement("0"),
                                        KeyElement(text = "０", header = stringResource(R.string.key_header_full_width)),
                                        KeyElement("零"),
                                        KeyElement(text = "⁰", header = stringResource(R.string.key_header_superscript)),
                                        KeyElement(text = "₀", header = stringResource(R.string.key_header_subscript)),
                                        KeyElement("⓪"),
                                        KeyElement("拾"),
                                        KeyElement(text = "°", header = stringResource(R.string.key_header_degree))
                                )
                        ),
                        modifier = Modifier.weight(1f)
                )
        }
}
