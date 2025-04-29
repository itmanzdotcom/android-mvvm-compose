package com.thuanpx.mvvm_compose.designsystem.component

import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

/**
 * Created by ThuanPx on 08/07/2023.
 */

@Composable
fun AppIconButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    content: @Composable () -> Unit,
) {
    IconButton(
        onClick = onClick,
        content = content,
        modifier = modifier,
        enabled = enabled,
    )
}