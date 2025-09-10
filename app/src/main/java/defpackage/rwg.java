package defpackage;

import java.util.Collections;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rwg extends rwc {
    private static final long serialVersionUID = 0;
    public final Object a;

    public rwg(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.rwc
    public final rwc b(rvu rvuVar) {
        Object objApply = rvuVar.apply(this.a);
        objApply.getClass();
        return new rwg(objApply);
    }

    @Override // defpackage.rwc
    public final Object c() {
        return this.a;
    }

    @Override // defpackage.rwc
    public final Object d(rww rwwVar) {
        return this.a;
    }

    @Override // defpackage.rwc
    public final Object e(Object obj) {
        obj.getClass();
        return this.a;
    }

    @Override // defpackage.rwc
    public final boolean equals(Object obj) {
        if (obj instanceof rwg) {
            return this.a.equals(((rwg) obj).a);
        }
        return false;
    }

    @Override // defpackage.rwc
    public final Object f() {
        return this.a;
    }

    @Override // defpackage.rwc
    public final Set g() {
        return Collections.singleton(this.a);
    }

    @Override // defpackage.rwc
    public final boolean h() {
        return true;
    }

    @Override // defpackage.rwc
    public final int hashCode() {
        return this.a.hashCode() + 1502476572;
    }

    @Override // defpackage.rwc
    public final String toString() {
        return "Optional.of(" + this.a.toString() + ")";
    }

    @Override // defpackage.rwc
    public final rwc a(rwc rwcVar) {
        return this;
    }
}
