package com.curso.android.app.proyectofinal.uno
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainActivityUITest {

    @Rule
    @JvmField
    val activityRule = ActivityTestRule()

    class ActivityTestRule

    class MainActivity

    @Test
    fun testCompareTexts() {
        // Ingresa texto en el primer EditText
        perform()

        // Ingresa texto en el segundo EditText
        perform()

        // Haz click en el botón "Comparar"
        perform()

        // Verifica que el TextView tenga el resultado esperado
        check()
    }

    class R {
        companion object

    }

}

private fun check() {
    TODO("Not yet implemented")
}

private fun perform() {
    TODO("Not yet implemented")
}
