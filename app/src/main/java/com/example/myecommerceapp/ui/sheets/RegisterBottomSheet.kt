package com.example.myecommerceapp.ui.sheets

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myecommerceapp.ui.theme.MyEcommerceAppTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RegisterBottomSheet(onDismiss: () -> Unit) {
    val sheetState = rememberModalBottomSheetState(skipPartiallyExpanded = true)

    ModalBottomSheet(
        onDismissRequest = onDismiss,
        sheetState = sheetState
    ) {
        Text(
            "Sign-up form",
            style = MaterialTheme.typography.titleLarge,
            modifier = Modifier.padding(16.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun RegisterBottomSheetDemoPreview() {
    var showSheet by remember { mutableStateOf(false) }

    MyEcommerceAppTheme {
        RegisterBottomSheet(onDismiss = {showSheet = false})
    }
}
