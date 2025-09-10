package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class tme extends tmc {
    private final Method a = Class.class.getMethod("isRecord", null);
    private final Method b = Class.class.getMethod("getRecordComponents", null);
    private final Method c;
    private final Method d;

    public tme() throws ClassNotFoundException {
        Class<?> cls = Class.forName("java.lang.reflect.RecordComponent");
        this.c = cls.getMethod("getName", null);
        this.d = cls.getMethod("getType", null);
    }

    @Override // defpackage.tmc
    public final Constructor a(Class cls) {
        try {
            Object[] objArr = (Object[]) this.b.invoke(cls, null);
            Class<?>[] clsArr = new Class[objArr.length];
            for (int i = 0; i < objArr.length; i++) {
                clsArr[i] = (Class) this.d.invoke(objArr[i], null);
            }
            return cls.getDeclaredConstructor(clsArr);
        } catch (ReflectiveOperationException e) {
            throw tmf.a(e);
        }
    }

    @Override // defpackage.tmc
    public final Method b(Class cls, Field field) {
        try {
            return cls.getMethod(field.getName(), null);
        } catch (ReflectiveOperationException e) {
            throw tmf.a(e);
        }
    }

    @Override // defpackage.tmc
    public final boolean c(Class cls) {
        try {
            return ((Boolean) this.a.invoke(cls, null)).booleanValue();
        } catch (ReflectiveOperationException e) {
            throw tmf.a(e);
        }
    }

    @Override // defpackage.tmc
    public final String[] d(Class cls) {
        try {
            Object[] objArr = (Object[]) this.b.invoke(cls, null);
            String[] strArr = new String[objArr.length];
            for (int i = 0; i < objArr.length; i++) {
                strArr[i] = (String) this.c.invoke(objArr[i], null);
            }
            return strArr;
        } catch (ReflectiveOperationException e) {
            throw tmf.a(e);
        }
    }
}
