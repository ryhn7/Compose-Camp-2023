package com.example.tiptime

import com.example.tiptime.ui.screen.calculateTip
import junit.framework.TestCase.assertEquals
import org.junit.Test
import java.text.NumberFormat

class TipCalculatorTest {

    @Test
    fun calculateTip_20PercentNoRoundUp() {
        val amount = 10.00
        val tipPercent = 20.00
        val roundUp = false
        val expectedTip = NumberFormat.getCurrencyInstance().format(2)
        val actualTip = calculateTip(amount, tipPercent, roundUp)
        assertEquals(expectedTip, actualTip)
    }
}