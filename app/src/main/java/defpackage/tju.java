package defpackage;

import java.lang.reflect.AccessibleObject;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class tju {
    public static final tju b;

    static {
        tju tjsVar = null;
        if (tji.a()) {
            try {
                tjsVar = new tjs(AccessibleObject.class.getDeclaredMethod("canAccess", Object.class));
            } catch (NoSuchMethodException unused) {
            }
        }
        if (tjsVar == null) {
            tjsVar = new tjt();
        }
        b = tjsVar;
    }

    public abstract boolean a(AccessibleObject accessibleObject, Object obj);
}
