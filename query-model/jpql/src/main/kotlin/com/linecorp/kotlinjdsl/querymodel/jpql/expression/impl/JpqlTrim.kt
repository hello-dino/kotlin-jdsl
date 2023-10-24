package com.linecorp.kotlinjdsl.querymodel.jpql.expression.impl

import com.linecorp.kotlinjdsl.Internal
import com.linecorp.kotlinjdsl.querymodel.jpql.expression.Expression

enum class TrimSpecification {
    LEADING,
    TRAILING,
    BOTH,
}

@Internal
data class JpqlTrim internal constructor(
    val value: Expression<String>,
    val trimSpecification: TrimSpecification?,
    val trimCharacter: Expression<Char>?,
) : Expression<String>
