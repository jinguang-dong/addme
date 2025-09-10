package defpackage;

import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class tje implements GenericArrayType, Serializable {
    private static final long serialVersionUID = 0;
    private final Type a;

    public tje(Type type) {
        type.getClass();
        this.a = tjh.c(type);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof GenericArrayType) && tjh.g(this, (GenericArrayType) obj);
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return String.valueOf(tjh.b(this.a)).concat("[]");
    }
}
