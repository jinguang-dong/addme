package defpackage;

import android.text.TextUtils;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rsr {
    public final sbp a;
    public final sbp b;
    public final UUID c;
    public final long d;

    public rsr() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rsr) {
            rsr rsrVar = (rsr) obj;
            if (ujp.aH(this.a, rsrVar.a) && ujp.aH(this.b, rsrVar.b) && this.c.equals(rsrVar.c) && this.d == rsrVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
        long j = this.d;
        return ((int) (j ^ (j >>> 32))) ^ (iHashCode * 1000003);
    }

    public final String toString() {
        return TextUtils.join(" -> ", this.a);
    }

    public rsr(sbp sbpVar, sbp sbpVar2, UUID uuid) {
        this.a = sbpVar;
        this.b = sbpVar2;
        this.c = uuid;
        this.d = -1L;
    }
}
