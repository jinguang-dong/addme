package defpackage;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class tjz {
    public static final tjz c;

    static {
        tjz tjyVar;
        try {
            try {
                try {
                    Class<?> cls = Class.forName("sun.misc.Unsafe");
                    Field declaredField = cls.getDeclaredField("theUnsafe");
                    declaredField.setAccessible(true);
                    tjyVar = new tjv(cls.getMethod("allocateInstance", Class.class), declaredField.get(null));
                } catch (Exception unused) {
                    Method declaredMethod = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
                    declaredMethod.setAccessible(true);
                    tjyVar = new tjx(declaredMethod);
                }
            } catch (Exception unused2) {
                tjyVar = new tjy();
            }
        } catch (Exception unused3) {
            Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
            declaredMethod2.setAccessible(true);
            int iIntValue = ((Integer) declaredMethod2.invoke(null, Object.class)).intValue();
            Method declaredMethod3 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
            declaredMethod3.setAccessible(true);
            tjyVar = new tjw(declaredMethod3, iIntValue);
        }
        c = tjyVar;
    }

    public static void b(Class cls) {
        String strC = tjb.c(cls);
        if (strC != null) {
            throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(strC));
        }
    }

    public abstract Object a(Class cls);
}
