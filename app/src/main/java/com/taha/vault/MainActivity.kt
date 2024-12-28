package com.taha.vault

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.taha.vault.di.appModule
import com.taha.vault.screens.AppNavHost
import com.taha.vault.ui.theme.VaultTheme
import org.koin.android.ext.koin.androidContext
import org.koin.androidx.compose.KoinAndroidContext
import org.koin.core.context.GlobalContext.startKoin

class MainActivity : ComponentActivity() {

    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        startKoin {
            androidContext(this@MainActivity)
            modules(appModule)
        }
        setContent {

            VaultTheme {
            KoinAndroidContext {
                AppNavHost()
            }

            }
        }
    }
}



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    VaultTheme {

    }
}