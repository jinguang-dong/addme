package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gdu implements mho {
    public mht a;
    public mhp b = mhp.i;
    public final mhp c;
    public final Runnable d;
    public final Runnable e;
    public final Executor f;
    public final String g;
    public final boolean h;
    public final gdt i;

    public gdu() {
    }

    public final mhp a() {
        return this.b == mhp.i ? this.c : this.b;
    }

    @Override // defpackage.mho
    public final void d(mhp mhpVar) {
        this.a.d(mhpVar);
    }

    public final boolean equals(Object obj) {
        gdt gdtVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof gdu) {
            gdu gduVar = (gdu) obj;
            if (this.c.equals(gduVar.c) && this.d.equals(gduVar.d) && this.e.equals(gduVar.e) && this.f.equals(gduVar.f) && this.g.equals(gduVar.g) && this.h == gduVar.h && ((gdtVar = this.i) != null ? gdtVar.equals(gduVar.i) : gduVar.i == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((((((this.c.hashCode() ^ 1000003) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode();
        gdt gdtVar = this.i;
        return (((true != this.h ? 1237 : 1231) ^ (iHashCode * 1000003)) * 1000003) ^ (gdtVar == null ? 0 : gdtVar.hashCode());
    }

    public final String toString() {
        gdt gdtVar = this.i;
        Executor executor = this.f;
        Runnable runnable = this.e;
        Runnable runnable2 = this.d;
        return "{" + String.valueOf(this.c) + ", " + String.valueOf(runnable2) + ", " + String.valueOf(runnable) + ", " + String.valueOf(executor) + ", " + this.g + ", " + this.h + ", " + String.valueOf(gdtVar) + "}";
    }

    public gdu(mhp mhpVar, Runnable runnable, Runnable runnable2, Executor executor, String str, boolean z, gdt gdtVar) {
        this.c = mhpVar;
        this.d = runnable;
        this.e = runnable2;
        this.f = executor;
        this.g = str;
        this.h = z;
        this.i = gdtVar;
    }
}
