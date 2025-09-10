package defpackage;

import com.google.android.apps.camera.rectiface.Iqz.mPfBwqXsnpXI;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cdt {
    public final int a;
    public final int b;
    public final boolean c;

    public cdt(int i, int i2, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cdt)) {
            return false;
        }
        cdt cdtVar = (cdt) obj;
        return this.a == cdtVar.a && this.b == cdtVar.b && this.c == cdtVar.c;
    }

    public final int hashCode() {
        return (((this.a * 31) + this.b) * 31) + a.o(this.c);
    }

    public final String toString() {
        return "BidiRun(start=" + this.a + mPfBwqXsnpXI.TNxYg + this.b + ", isRtl=" + this.c + ')';
    }
}
