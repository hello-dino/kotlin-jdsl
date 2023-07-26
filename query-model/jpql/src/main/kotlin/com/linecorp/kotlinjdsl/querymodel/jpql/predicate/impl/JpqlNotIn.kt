package com.linecorp.kotlinjdsl.querymodel.jpql.predicate.impl

import com.linecorp.kotlinjdsl.Internal
import com.linecorp.kotlinjdsl.querymodel.jpql.expression.Expression
import com.linecorp.kotlinjdsl.querymodel.jpql.predicate.Predicate

@Internal
data class JpqlNotIn<T : Any> internal constructor(
    val value: Expression<T>,
    val compareValues: Iterable<Expression<T>?>,
) : Predicate
