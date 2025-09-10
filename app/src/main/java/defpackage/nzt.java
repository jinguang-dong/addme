package defpackage;

import com.google.android.apps.camera.autotimer.analysis.jni.wVCD.HHdu;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nzt {
    public final nzl a;
    public final syv b;
    public final syn c;

    public nzt() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof nzt) {
            nzt nztVar = (nzt) obj;
            if (this.a.equals(nztVar.a) && this.b.equals(nztVar.b) && this.c.equals(nztVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
        return this.c.hashCode() ^ (iHashCode * 1000003);
    }

    public nzt(nzl nzlVar, syv syvVar, syn synVar) {
        this.a = nzlVar;
        this.b = syvVar;
        this.c = synVar;
    }

    public final String toString() {
        syn synVar = this.c;
        syv syvVar = this.b;
        return HHdu.xWUiaEYnit + this.a.toString() + ", " + syvVar.toString() + ", " + synVar.toString() + "}";
    }
}
