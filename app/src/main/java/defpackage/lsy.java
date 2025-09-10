package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lsy {
    public final long a;
    public final Uri b;
    public final ltf c;
    public final boolean d;

    public lsy() {
        throw null;
    }

    public static nzf a() {
        nzf nzfVar = new nzf();
        nzfVar.f(false);
        return nzfVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lsy) {
            lsy lsyVar = (lsy) obj;
            if (this.a == lsyVar.a && this.b.equals(lsyVar.b) && this.c.equals(lsyVar.c) && this.d == lsyVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        return (true != this.d ? 1237 : 1231) ^ ((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003);
    }

    public final String toString() {
        ltf ltfVar = this.c;
        return "{" + this.a + ", " + String.valueOf(this.b) + ", " + String.valueOf(ltfVar) + ", " + this.d + "}";
    }

    public lsy(long j, Uri uri, ltf ltfVar, boolean z) {
        this.a = j;
        this.b = uri;
        this.c = ltfVar;
        this.d = z;
    }
}
