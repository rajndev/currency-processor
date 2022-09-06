package com.shivnasoft.currency_processors

import com.shivnasoft.currency_processors.Constants.Companion.CURRENCY_AMOUNT_FORMAT_NUMBER_OF_DECIMALS
import java.text.DecimalFormat

object CurrencyUtils {
    fun formatNumberToCurrencyDecimal(amountToConvert: String): String {
        val symbols = DecimalFormat().decimalFormatSymbols
        val decimalSeparator = symbols.decimalSeparator
        val zero = symbols.zeroDigit

        val intPart =
            if (amountToConvert.length > CURRENCY_AMOUNT_FORMAT_NUMBER_OF_DECIMALS) {
                amountToConvert.subSequence(
                    0,
                    amountToConvert.length - CURRENCY_AMOUNT_FORMAT_NUMBER_OF_DECIMALS
                )
            } else {
                zero.toString()
            }
        var fractionPart =
            if (amountToConvert.length >= CURRENCY_AMOUNT_FORMAT_NUMBER_OF_DECIMALS) {
                amountToConvert.subSequence(
                    amountToConvert.length - CURRENCY_AMOUNT_FORMAT_NUMBER_OF_DECIMALS,
                    amountToConvert.length
                )
            } else {
                amountToConvert
            }

        if (fractionPart.length < CURRENCY_AMOUNT_FORMAT_NUMBER_OF_DECIMALS) {
            fractionPart =
                fractionPart.padStart(CURRENCY_AMOUNT_FORMAT_NUMBER_OF_DECIMALS, zero)
        }

        return intPart.toString() + decimalSeparator + fractionPart
    }
}