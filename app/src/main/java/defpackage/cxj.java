package defpackage;

import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cxj {
    public static final List a = rnt.ae(new Class[]{Application.class, cxb.class});
    public static final List b = ske.bj(cxb.class);

    public static final cxm a(Class cls, Constructor constructor, Object... objArr) {
        try {
            return (cxm) constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e) {
            Objects.toString(cls);
            throw new RuntimeException("Failed to access ".concat(cls.toString()), e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(a.bz(cls, "A ", " cannot be instantiated."), e2);
        } catch (InvocationTargetException e3) {
            Objects.toString(cls);
            throw new RuntimeException("An exception happened in constructor of ".concat(cls.toString()), e3.getCause());
        }
    }

    public static final Constructor b(Class cls, List list) {
        list.getClass();
        Iterator itAu = ske.au(cls.getConstructors());
        while (itAu.hasNext()) {
            Constructor constructor = (Constructor) itAu.next();
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            parameterTypes.getClass();
            List listAp = rnt.ap(parameterTypes);
            if (a.ao(list, listAp)) {
                constructor.getClass();
                return constructor;
            }
            if (list.size() == listAp.size() && listAp.containsAll(list)) {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + list);
            }
        }
        return null;
    }
}
