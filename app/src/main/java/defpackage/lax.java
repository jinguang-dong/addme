package defpackage;

import com.google.android.apps.camera.jni.facebeautification.GFS.CZAHo;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lax {
    public final int a;
    public final sbp b;

    public lax() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lax) {
            lax laxVar = (lax) obj;
            if (this.a == laxVar.a && ujp.aH(this.b, laxVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a;
        return this.b.hashCode() ^ ((i ^ 1000003) * 1000003);
    }

    public lax(int i, sbp sbpVar) {
        this.a = i;
        sbpVar.getClass();
        this.b = sbpVar;
    }

    public final String toString() {
        return CZAHo.iotdVZaVzspgUB + this.a + ", " + this.b.toString() + "}";
    }
}
