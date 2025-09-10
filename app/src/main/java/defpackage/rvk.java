package defpackage;

import java.util.Collections;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rvk extends rwc {
    public static final rvk a = new rvk();
    private static final long serialVersionUID = 0;

    private rvk() {
    }

    private Object readResolve() {
        return a;
    }

    @Override // defpackage.rwc
    public final rwc b(rvu rvuVar) {
        return a;
    }

    @Override // defpackage.rwc
    public final Object c() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // defpackage.rwc
    public final Object d(rww rwwVar) {
        Object objFr = rwwVar.fr();
        objFr.getClass();
        return objFr;
    }

    @Override // defpackage.rwc
    public final Object e(Object obj) {
        obj.getClass();
        return obj;
    }

    @Override // defpackage.rwc
    public final boolean equals(Object obj) {
        return this == obj;
    }

    @Override // defpackage.rwc
    public final Object f() {
        return null;
    }

    @Override // defpackage.rwc
    public final Set g() {
        return Collections.EMPTY_SET;
    }

    @Override // defpackage.rwc
    public final boolean h() {
        return false;
    }

    @Override // defpackage.rwc
    public final int hashCode() {
        return 2040732332;
    }

    @Override // defpackage.rwc
    public final String toString() {
        return "Optional.absent()";
    }

    @Override // defpackage.rwc
    public final rwc a(rwc rwcVar) {
        return rwcVar;
    }
}
