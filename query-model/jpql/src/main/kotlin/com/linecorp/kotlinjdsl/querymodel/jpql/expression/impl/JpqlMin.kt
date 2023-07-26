package com.linecorp.kotlinjdsl.querymodel.jpql.expression.impl

import com.linecorp.kotlinjdsl.Internal
import com.linecorp.kotlinjdsl.querymodel.jpql.expression.Expression

@Internal
data class JpqlMin<T : Comparable<T>> internal constructor(
    val distinct: Boolean,
    val expr: Expression<T>,
) : Expression<T>
