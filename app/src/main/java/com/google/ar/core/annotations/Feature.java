package com.google.ar.core.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: PG */
@Target({ElementType.FIELD, ElementType.TYPE, ElementType.TYPE_USE, ElementType.METHOD, ElementType.CONSTRUCTOR})
@Retention(RetentionPolicy.SOURCE)
/* loaded from: classes2.dex */
public @interface Feature {
    public static final String RETAIN_AS_PACKAGE_PRIVATE = "retainAsPackagePrivate";
    public static final String RETAIN_AS_PRIVATE = "retainAsPrivate";
    public static final String RETAIN_DECLARATION = "retainDeclaration";

    boolean retainAsPackagePrivate() default false;

    boolean retainAsPrivate() default false;

    boolean retainDeclaration() default false;

    String[] value();
}
