package defpackage;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class tjs extends tju {
    final /* synthetic */ Method a;

    public tjs(Method method) {
        this.a = method;
    }

    @Override // defpackage.tju
    public final boolean a(AccessibleObject accessibleObject, Object obj) {
        try {
            return ((Boolean) this.a.invoke(accessibleObject, obj)).booleanValue();
        } catch (Exception e) {
            throw new RuntimeException("Failed invoking canAccess", e);
        }
    }
}
