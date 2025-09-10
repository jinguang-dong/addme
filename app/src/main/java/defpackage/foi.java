package defpackage;

import com.google.ar.core.Anchor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class foi extends fok {
    private final foy b;

    public foi(Anchor anchor, foy foyVar) {
        super(anchor);
        this.b = foyVar;
    }

    public final void b() {
        boolean z;
        foy foyVar = this.b;
        Object obj = foyVar.b;
        synchronized (obj) {
            synchronized (obj) {
                z = foyVar.c;
            }
        }
        if (z) {
            return;
        }
        Anchor anchor = (Anchor) this.a;
        anchor.getClass();
        ezh.m(new foh(anchor, 0));
    }

    @Override // defpackage.fok
    public final fnp dN() {
        return (fnp) ezh.k(new fog(this, 2));
    }

    @Override // defpackage.fok
    public final fnt dO() {
        return (fnt) ezh.k(new fog(this, 3));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof foi) {
            return ((Boolean) ezh.k(new foj((Object) this, obj, 1))).booleanValue();
        }
        return false;
    }

    public final int hashCode() {
        Anchor anchor = (Anchor) this.a;
        anchor.getClass();
        return ((Integer) ezh.k(new fog(anchor, 0))).intValue();
    }
}
