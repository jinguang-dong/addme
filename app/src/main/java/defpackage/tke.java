package defpackage;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tke implements tiw {
    private final /* synthetic */ int a;

    public tke(int i) {
        this.a = i;
    }

    @Override // defpackage.tiw
    public final tiv a(tih tihVar, tmk tmkVar) {
        Type genericComponentType;
        int i = this.a;
        if (i == 0) {
            Class superclass = tmkVar.a;
            if (!Enum.class.isAssignableFrom(superclass) || superclass == Enum.class) {
                return null;
            }
            if (!superclass.isEnum()) {
                superclass = superclass.getSuperclass();
            }
            return new tkf(superclass);
        }
        if (i == 1) {
            Type type = tmkVar.b;
            if (type instanceof GenericArrayType) {
                genericComponentType = ((GenericArrayType) type).getGenericComponentType();
            } else {
                if (!(type instanceof Class)) {
                    return null;
                }
                Class cls = (Class) type;
                if (!cls.isArray()) {
                    return null;
                }
                genericComponentType = cls.getComponentType();
            }
            return new tka(tihVar.a(new tmk(genericComponentType)), tjh.a(genericComponentType));
        }
        if (i == 2) {
            throw new AssertionError("Factory should not be used");
        }
        if (i == 3) {
            if (tmkVar.a == Date.class) {
                return new tmg();
            }
            return null;
        }
        if (i != 4) {
            if (tmkVar.a == Timestamp.class) {
                return new tmi(tihVar.b(java.util.Date.class));
            }
            return null;
        }
        if (tmkVar.a == Time.class) {
            return new tmh();
        }
        return null;
    }
}
