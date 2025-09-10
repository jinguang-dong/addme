package defpackage;

import com.google.android.apps.camera.ui.zoomlock.Gx.nWEkBGOQPWQp;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pwu {
    public final long a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final int e;
    public final int f;

    public pwu() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof pwu) {
            pwu pwuVar = (pwu) obj;
            if (this.a == pwuVar.a) {
                int i = this.e;
                int i2 = pwuVar.e;
                if (i == 0) {
                    throw null;
                }
                if (i == i2 && this.b == pwuVar.b && this.c == pwuVar.c && this.d == pwuVar.d) {
                    int i3 = this.f;
                    int i4 = pwuVar.f;
                    if (i3 == 0) {
                        throw null;
                    }
                    if (i3 == i4) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.e;
        a.aF(i);
        int i2 = this.f;
        a.aF(i2);
        int i3 = true != this.b ? 1237 : 1231;
        long j = this.a;
        return ((((((((i ^ ((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003)) * 1000003) ^ i3) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ (true == this.d ? 1231 : 1237)) * 1000003) ^ i2;
    }

    public pwu(long j, int i, boolean z, boolean z2, boolean z3) {
        this.a = j;
        this.e = i;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.f = 2;
    }

    public final String toString() {
        int i = this.f;
        String str = i != 1 ? i != 2 ? "null" : "TASK_SCHEDULER_WORK_MANAGER" : "TASK_SCHEDULER_UNKNOWN";
        int i2 = this.e;
        boolean z = this.d;
        boolean z2 = this.c;
        boolean z3 = this.b;
        return "{" + this.a + ", " + prh.f(i2) + ", " + z3 + ", " + z2 + ", " + z + ", " + str + nWEkBGOQPWQp.zsJxkWAmXiXu;
    }
}
