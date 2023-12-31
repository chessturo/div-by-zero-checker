package org.checkerframework.checker.dividebyzero.qual;

import org.checkerframework.common.subtyping.qual.Bottom;
import org.checkerframework.framework.qual.SubtypeOf;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@SubtypeOf({ Positive.class, Negative.class, Zero.class })
@Target({ ElementType.TYPE_USE, ElementType.TYPE_PARAMETER })
public @interface Bot { }
