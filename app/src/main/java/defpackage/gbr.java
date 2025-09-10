package defpackage;

import com.google.android.apps.camera.toast.vvJ.CGlJpiVWrCQOq;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gbr extends gbt {
    public final gcc a;
    public final int b;
    private final rwc d;
    private final oxh e;

    public gbr(gcc gccVar, rwc rwcVar, int i, oxh oxhVar) {
        this.a = gccVar;
        this.d = rwcVar;
        this.b = i;
        this.e = oxhVar;
    }

    @Override // defpackage.gbt
    public final int a() {
        return this.b;
    }

    @Override // defpackage.gbt
    public final gcc b() {
        return this.a;
    }

    @Override // defpackage.gbt
    public final oxh c() {
        return this.e;
    }

    @Override // defpackage.gbt
    public final rwc d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof gbt) {
            gbt gbtVar = (gbt) obj;
            if (this.a.equals(gbtVar.b()) && this.d.equals(gbtVar.d()) && this.b == gbtVar.a() && this.e.equals(gbtVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.d.hashCode();
        oxh oxhVar = this.e;
        return ((this.b ^ (iHashCode * 1000003)) * 1000003) ^ oxhVar.hashCode();
    }

    public final String toString() {
        oxh oxhVar = this.e;
        rwc rwcVar = this.d;
        return CGlJpiVWrCQOq.mSysYTphqAZ + this.a.toString() + ", " + String.valueOf(rwcVar) + ", " + this.b + ", " + oxhVar.toString() + "}";
    }
}
