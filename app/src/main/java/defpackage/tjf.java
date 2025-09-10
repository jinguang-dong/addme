package defpackage;

import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class tjf implements ParameterizedType, Serializable {
    private static final long serialVersionUID = 0;
    private final Type a;
    private final Type b;
    private final Type[] c;

    public tjf(Type type, Class cls, Type... typeArr) {
        cls.getClass();
        if (type == null && !Modifier.isStatic(cls.getModifiers()) && cls.getDeclaringClass() != null) {
            throw new IllegalArgumentException("Must specify owner type for ".concat(cls.toString()));
        }
        this.a = type == null ? null : tjh.c(type);
        this.b = tjh.c(cls);
        Type[] typeArr2 = (Type[]) typeArr.clone();
        this.c = typeArr2;
        int length = typeArr2.length;
        for (int i = 0; i < length; i++) {
            Type type2 = this.c[i];
            type2.getClass();
            tjh.f(type2);
            Type[] typeArr3 = this.c;
            typeArr3[i] = tjh.c(typeArr3[i]);
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ParameterizedType) && tjh.g(this, (ParameterizedType) obj);
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return (Type[]) this.c.clone();
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.a;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.b;
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode() ^ Arrays.hashCode(this.c);
        Type type = this.a;
        return (type != null ? type.hashCode() : 0) ^ iHashCode;
    }

    public final String toString() {
        Type[] typeArr = this.c;
        int length = typeArr.length;
        if (length == 0) {
            return tjh.b(this.b);
        }
        StringBuilder sb = new StringBuilder((length + 1) * 30);
        sb.append(tjh.b(this.b));
        sb.append("<");
        sb.append(tjh.b(typeArr[0]));
        for (int i = 1; i < length; i++) {
            sb.append(", ");
            sb.append(tjh.b(typeArr[i]));
        }
        sb.append(">");
        return sb.toString();
    }
}
