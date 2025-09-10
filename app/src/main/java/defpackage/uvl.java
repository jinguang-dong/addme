package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uvl {
    public static final /* synthetic */ int a = 0;
    private static final int b = c(Throwable.class, -1);
    private static final uve c;

    static {
        uve uveVar;
        try {
            uveVar = uvm.a ? uwj.a : uuy.a;
        } catch (Throwable unused) {
            uveVar = uwj.a;
        }
        c = uveVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Throwable a(Throwable th) {
        Object objAM;
        if (!(th instanceof umw)) {
            return (Throwable) c.a(th.getClass()).a(th);
        }
        try {
            objAM = ((umw) th).a();
        } catch (Throwable th2) {
            objAM = rnt.aM(th2);
        }
        if (true == (objAM instanceof uew)) {
            objAM = null;
        }
        return (Throwable) objAM;
    }

    public static final uiq b(Class cls) throws SecurityException {
        Object next;
        uiq uiqVar;
        uev uevVar;
        uvk uvkVar = uvk.a;
        int i = 0;
        if (b == c(cls, 0)) {
            Constructor<?>[] constructors = cls.getConstructors();
            int length = constructors.length;
            ArrayList arrayList = new ArrayList(length);
            int i2 = 0;
            while (true) {
                next = null;
                if (i2 >= length) {
                    break;
                }
                Constructor<?> constructor = constructors[i2];
                Class<?>[] parameterTypes = constructor.getParameterTypes();
                int length2 = parameterTypes.length;
                int i3 = 18;
                if (length2 != 0) {
                    int i4 = 1;
                    if (length2 != 1) {
                        uevVar = length2 != 2 ? new uev(null, -1) : (a.ao(parameterTypes[0], String.class) && a.ao(parameterTypes[1], Throwable.class)) ? new uev(new ndd(new ndd(constructor, 19), i3), 3) : new uev(null, -1);
                    } else {
                        Class<?> cls2 = parameterTypes[0];
                        uevVar = a.ao(cls2, String.class) ? new uev(new ndd(new ndd(constructor, 20), i3), 2) : a.ao(cls2, Throwable.class) ? new uev(new ndd(new uvj(constructor, i4), i3), 1) : new uev(null, -1);
                    }
                } else {
                    uevVar = new uev(new ndd(new uvj(constructor, i), i3), 0);
                }
                arrayList.add(uevVar);
                i2++;
            }
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    int iIntValue = ((Number) ((uev) next).b).intValue();
                    while (true) {
                        Object next2 = it.next();
                        int iIntValue2 = ((Number) ((uev) next2).b).intValue();
                        int i5 = iIntValue < iIntValue2 ? iIntValue2 : iIntValue;
                        if (iIntValue < iIntValue2) {
                            next = next2;
                        }
                        if (!it.hasNext()) {
                            break;
                        }
                        iIntValue = i5;
                    }
                }
            }
            uev uevVar2 = (uev) next;
            if (uevVar2 != null && (uiqVar = (uiq) uevVar2.a) != null) {
                return uiqVar;
            }
        }
        return uvkVar;
    }

    private static final int c(Class cls, int i) {
        Object objAM;
        ske.ax(cls);
        int i2 = 0;
        do {
            try {
                int i3 = 0;
                for (Field field : cls.getDeclaredFields()) {
                    if (!Modifier.isStatic(field.getModifiers())) {
                        i3++;
                    }
                }
                i2 += i3;
                cls = cls.getSuperclass();
            } catch (Throwable th) {
                objAM = rnt.aM(th);
            }
        } while (cls != null);
        objAM = Integer.valueOf(i2);
        Object objValueOf = Integer.valueOf(i);
        if (true == (objAM instanceof uew)) {
            objAM = objValueOf;
        }
        return ((Number) objAM).intValue();
    }
}
