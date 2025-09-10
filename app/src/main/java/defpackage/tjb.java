package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tjb {
    private final Map a;
    private final List b;

    public tjb(Map map, List list) {
        this.a = map;
        this.b = list;
    }

    static /* synthetic */ Object b(Constructor constructor) {
        try {
            return constructor.newInstance(null);
        } catch (IllegalAccessException e) {
            throw tmf.b(e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(a.bw(tmf.c(constructor), "Failed to invoke constructor '", "' with no args"), e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(a.bw(tmf.c(constructor), "Failed to invoke constructor '", "' with no args"), e3.getCause());
        }
    }

    static String c(Class cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            return "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: ".concat(String.valueOf(cls.getName()));
        }
        if (!Modifier.isAbstract(modifiers)) {
            return null;
        }
        return "Abstract classes can't be instantiated! Adjust the R8 configuration or register an InstanceCreator or a TypeAdapter for this type. Class name: " + cls.getName() + "\nSee " + sla.x("r8-abstract-class");
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x016e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.tjr a(defpackage.tmk r17, boolean r18) throws java.lang.NoSuchMethodException, java.lang.SecurityException {
        /*
            Method dump skipped, instructions count: 429
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tjb.a(tmk, boolean):tjr");
    }

    public final String toString() {
        return this.a.toString();
    }
}
