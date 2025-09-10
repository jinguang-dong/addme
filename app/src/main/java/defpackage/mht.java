package defpackage;

import com.google.android.apps.camera.toast.vvJ.CGlJpiVWrCQOq;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mht implements mho {
    public int a = 1;
    public final mhp b;
    public final Runnable c;
    public final Runnable d;
    public final Executor e;
    public final String f;

    public mht() {
    }

    @Override // defpackage.mho
    public final void d(mhp mhpVar) {
        if (mhpVar == mhp.i) {
            return;
        }
        int i = true != mhpVar.a(this.b) ? 3 : 2;
        int i2 = this.a;
        if (i2 == 0) {
            throw null;
        }
        if (i2 != i) {
            if (i == 2) {
                this.e.execute(new man(this, 16));
            } else {
                this.e.execute(new man(this, 17));
            }
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mht) {
            mht mhtVar = (mht) obj;
            if (this.b.equals(mhtVar.b) && this.c.equals(mhtVar.c) && this.d.equals(mhtVar.d) && this.e.equals(mhtVar.e) && this.f.equals(mhtVar.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
        return this.f.hashCode() ^ (iHashCode * 1000003);
    }

    public mht(mhp mhpVar, Runnable runnable, Runnable runnable2, Executor executor, String str) {
        this.b = mhpVar;
        this.c = runnable;
        this.d = runnable2;
        this.e = executor;
        this.f = str;
    }

    public final String toString() {
        Executor executor = this.e;
        Runnable runnable = this.d;
        Runnable runnable2 = this.c;
        return "{" + String.valueOf(this.b) + ", " + String.valueOf(runnable2) + ", " + String.valueOf(runnable) + ", " + String.valueOf(executor) + ", " + this.f + CGlJpiVWrCQOq.ztdUXxxADFk;
    }
}
