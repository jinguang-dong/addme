package defpackage;

import com.google.android.apps.camera.ui.gridlines.gBW.mNLbzhCxd;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class blr extends bks {
    public final long a;

    public blr(long j) {
        this.a = j;
    }

    @Override // defpackage.bks
    public final void a(long j, fnd fndVar, float f) {
        long jK;
        fndVar.i(1.0f);
        if (f == 1.0f) {
            jK = this.a;
        } else {
            long j2 = this.a;
            jK = bko.k(bkv.d(j2), bkv.c(j2), bkv.b(j2), bkv.a(j2) * f, bkv.f(j2));
        }
        fndVar.k(jK);
        if (fndVar.c != null) {
            fndVar.n(null);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof blr)) {
            return false;
        }
        long j = this.a;
        long j2 = ((blr) obj).a;
        long j3 = bkv.a;
        return a.q(j, j2);
    }

    public final int hashCode() {
        long j = bkv.a;
        return a.r(this.a);
    }

    public final String toString() {
        return mNLbzhCxd.KlDWLdVVcVBvoDI + ((Object) bkv.g(this.a)) + ')';
    }
}
