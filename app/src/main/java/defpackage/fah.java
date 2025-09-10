package defpackage;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fah implements eqi {
    private final String b;
    private final long c;
    private final int d;

    public fah(String str, long j, int i) {
        this.b = str;
        this.c = j;
        this.d = i;
    }

    @Override // defpackage.eqi
    public final void a(MessageDigest messageDigest) {
        messageDigest.update(ByteBuffer.allocate(12).putLong(this.c).putInt(this.d).array());
        messageDigest.update(this.b.getBytes(a));
    }

    @Override // defpackage.eqi
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        fah fahVar = (fah) obj;
        return this.c == fahVar.c && this.d == fahVar.d && this.b.equals(fahVar.b);
    }

    @Override // defpackage.eqi
    public final int hashCode() {
        int iHashCode = this.b.hashCode() * 31;
        long j = this.c;
        return ((iHashCode + ((int) (j ^ (j >>> 32)))) * 31) + this.d;
    }
}
