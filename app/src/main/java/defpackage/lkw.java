package defpackage;

import com.google.android.clockwork.common.wearable.wearmaterial.list.CaNf.PJGqOKsIpSdZ;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lkw {
    public final lkv a;
    public final obu b;

    public lkw() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lkw) {
            lkw lkwVar = (lkw) obj;
            if (this.a.equals(lkwVar.a) && this.b.equals(lkwVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        return this.b.hashCode() ^ (iHashCode * 1000003);
    }

    public lkw(lkv lkvVar, obu obuVar) {
        this.a = lkvVar;
        this.b = obuVar;
    }

    public final String toString() {
        obu obuVar = this.b;
        return "{" + this.a.toString() + ", " + obuVar.toString() + PJGqOKsIpSdZ.QmKuWpNjsZZYiyn;
    }
}
