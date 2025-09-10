package defpackage;

import java.lang.reflect.Method;

/* compiled from: PG */
@Deprecated
/* loaded from: classes2.dex */
final class cvr {
    final int a;
    final Method b;

    public cvr(int i, Method method) {
        this.a = i;
        this.b = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cvr)) {
            return false;
        }
        cvr cvrVar = (cvr) obj;
        return this.a == cvrVar.a && this.b.getName().equals(cvrVar.b.getName());
    }

    public final int hashCode() {
        return (this.a * 31) + this.b.getName().hashCode();
    }
}
