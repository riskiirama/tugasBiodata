package com.example.riskiramadhan


import androidx.compose.foundation.layout.Arrangement
import androidx.compose.material3.MaterialTheme
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.riskiramadhan.ui.theme.RiskiRamadhanTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            RiskiRamadhanTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Biodata(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun Biodata(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Biodata",
            style = MaterialTheme.typography.headlineMedium
        )
        Text(
            text = "Nama: Riski Ramadhan",
            style = MaterialTheme.typography.bodyMedium
        )
        Text(
            text = "Kelas: TI21K1",
            style = MaterialTheme.typography.bodyMedium
        )
        Text(
            text = "Program Studi: Teknik Informatika",
            style = MaterialTheme.typography.bodyMedium
        )
    }
}

@Preview(showBackground = true)
@Composable
fun BiodataPreview() {
    RiskiRamadhanTheme {
        Biodata()
    }
}
