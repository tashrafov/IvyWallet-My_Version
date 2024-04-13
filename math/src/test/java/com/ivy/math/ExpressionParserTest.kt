package com.ivy.math

import assertk.assertThat
import assertk.assertions.isEqualTo
import com.ivy.parser.Parser
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

class ExpressionParserTest {

    private lateinit var parser: Parser<TreeNode>

    @BeforeEach
    fun setUp() {
        parser = expressionParser()
    }

    @ParameterizedTest
    @CsvSource(
        "2+3*4, 14.0",
        "3*3+(12-5)*7, 58.0",
        "5.0000000, 5.0",
    )
    fun `Test evaluating expression`(expression: String, expected: Double) {
        val result = parser(expression).first()

        val actual = result.value.eval()

        assertThat(actual).isEqualTo(expected)
    }

    @Test
    fun `Test evaluating expression with divide by zero`() {
        val result = parser("2+3*4/0").first()

        val actual = result.value.eval()

        assertThat(actual).isEqualTo(Double.POSITIVE_INFINITY)
    }
}