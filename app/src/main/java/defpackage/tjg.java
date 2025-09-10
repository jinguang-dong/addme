package defpackage;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class tjg implements WildcardType, Serializable {
    private static final long serialVersionUID = 0;
    private final Type a;
    private final Type b;

    public tjg(Type[] typeArr, Type[] typeArr2) {
        int length = typeArr2.length;
        a.I(length <= 1);
        a.I(typeArr.length == 1);
        if (length != 1) {
            Type type = typeArr[0];
            type.getClass();
            tjh.f(type);
            this.b = null;
            this.a = tjh.c(typeArr[0]);
            return;
        }
        Type type2 = typeArr2[0];
        type2.getClass();
        tjh.f(type2);
        a.I(typeArr[0] == Object.class);
        this.b = tjh.c(typeArr2[0]);
        this.a = Object.class;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof WildcardType) && tjh.g(this, (WildcardType) obj);
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        Type type = this.b;
        return type != null ? new Type[]{type} : tjh.a;
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        return new Type[]{this.a};
    }

    public final int hashCode() {
        Type type = this.b;
        return (this.a.hashCode() + 31) ^ (type != null ? type.hashCode() + 31 : 1);
    }

    public final String toString() {
        Type type = this.b;
        if (type != null) {
            return "? super ".concat(String.valueOf(tjh.b(type)));
        }
        Type type2 = this.a;
        return type2 == Object.class ? "?" : "? extends ".concat(String.valueOf(tjh.b(type2)));
    }
}
