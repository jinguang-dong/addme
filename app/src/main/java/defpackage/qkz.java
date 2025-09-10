package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qkz {
    public final ByteBuffer a;
    public final int b;
    public final long c;

    public qkz() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof qkz) {
            qkz qkzVar = (qkz) obj;
            if (this.a.equals(qkzVar.a) && this.b == qkzVar.b && this.c == qkzVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        long j = this.c;
        return ((this.b ^ (iHashCode * 1000003)) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "{" + this.a.toString() + ", " + this.b + ", " + this.c + "}";
    }

    public qkz(ByteBuffer byteBuffer, int i, long j) {
        byteBuffer.getClass();
        this.a = byteBuffer;
        this.b = i;
        this.c = j;
    }
}
