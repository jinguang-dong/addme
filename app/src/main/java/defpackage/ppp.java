package defpackage;

import com.google.android.gms.common.internal.oQFY.clFzVRcygwbq;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ppp {
    public final UUID a;
    private final long b;
    private final long c;
    private final long d;

    public ppp() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ppp) {
            ppp pppVar = (ppp) obj;
            if (this.b == pppVar.b && this.c == pppVar.c && this.d == pppVar.d && this.a.equals(pppVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.d;
        long j2 = this.b;
        int i = (int) (j2 ^ (j2 >>> 32));
        UUID uuid = this.a;
        long j3 = this.c;
        int i2 = (int) (j ^ (j >>> 32));
        return uuid.hashCode() ^ ((i2 ^ ((((i ^ 1000003) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003)) * 1000003);
    }

    public ppp(long j, long j2, long j3, UUID uuid) {
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.a = uuid;
    }

    public final String toString() {
        return "{" + this.b + ", " + this.c + ", " + this.d + ", " + String.valueOf(this.a) + clFzVRcygwbq.cJcDUPdKpU;
    }
}
