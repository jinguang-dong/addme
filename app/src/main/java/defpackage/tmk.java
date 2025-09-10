package defpackage;

import com.google.android.apps.camera.ui.hotshot.yElM.PNlJufQ;
import j$.util.Objects;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tmk {
    public final Class a;
    public final Type b;
    private final int c;

    protected tmk() {
        Type genericSuperclass = getClass().getGenericSuperclass();
        if (genericSuperclass instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) genericSuperclass;
            if (parameterizedType.getRawType() == tmk.class) {
                Type typeC = tjh.c(parameterizedType.getActualTypeArguments()[0]);
                if (!Objects.equals(System.getProperty("gson.allowCapturingTypeVariables"), PNlJufQ.Ahrw)) {
                    a(typeC);
                }
                this.b = typeC;
                this.a = tjh.a(typeC);
                this.c = typeC.hashCode();
                return;
            }
        } else if (genericSuperclass == tmk.class) {
            throw new IllegalStateException("TypeToken must be created with a type argument: new TypeToken<...>() {}; When using code shrinkers (ProGuard, R8, ...) make sure that generic signatures are preserved.\nSee ".concat(sla.x("type-token-raw")));
        }
        throw new IllegalStateException("Must only create direct subclasses of TypeToken");
    }

    private static void a(Type type) {
        if (type instanceof TypeVariable) {
            TypeVariable typeVariable = (TypeVariable) type;
            throw new IllegalArgumentException("TypeToken type argument must not contain a type variable; captured type variable " + typeVariable.getName() + " declared by " + String.valueOf(typeVariable.getGenericDeclaration()) + "\nSee " + sla.x("typetoken-type-variable"));
        }
        if (type instanceof GenericArrayType) {
            a(((GenericArrayType) type).getGenericComponentType());
            return;
        }
        int i = 0;
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            Type ownerType = parameterizedType.getOwnerType();
            if (ownerType != null) {
                a(ownerType);
            }
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            int length = actualTypeArguments.length;
            while (i < length) {
                a(actualTypeArguments[i]);
                i++;
            }
            return;
        }
        if (!(type instanceof WildcardType)) {
            if (type == null) {
                throw new IllegalArgumentException("TypeToken captured `null` as type argument; probably a compiler / runtime bug");
            }
            return;
        }
        WildcardType wildcardType = (WildcardType) type;
        for (Type type2 : wildcardType.getLowerBounds()) {
            a(type2);
        }
        Type[] upperBounds = wildcardType.getUpperBounds();
        int length2 = upperBounds.length;
        while (i < length2) {
            a(upperBounds[i]);
            i++;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof tmk) && tjh.g(this.b, ((tmk) obj).b);
    }

    public final int hashCode() {
        return this.c;
    }

    public final String toString() {
        return tjh.b(this.b);
    }

    public tmk(Type type) {
        type.getClass();
        Type typeC = tjh.c(type);
        this.b = typeC;
        this.a = tjh.a(typeC);
        this.c = typeC.hashCode();
    }
}
