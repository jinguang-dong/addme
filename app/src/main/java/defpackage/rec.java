package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rec {
    public final Uri a;
    public final tqr b;
    public final rwc c;
    public final sbp d;
    public final boolean e;
    public final qsy f;

    public rec() {
        throw null;
    }

    public static reb a() {
        reb rebVar = new reb((byte[]) null);
        rebVar.e = rei.a;
        rebVar.c();
        rebVar.f(true);
        return rebVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rec) {
            rec recVar = (rec) obj;
            if (this.a.equals(recVar.a) && this.b.equals(recVar.b) && this.c.equals(recVar.c) && ujp.aH(this.d, recVar.d) && this.f.equals(recVar.f) && this.e == recVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((true != this.e ? 1237 : 1231) ^ ((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003)) * 1000003) ^ 1237;
    }

    public final String toString() {
        qsy qsyVar = this.f;
        sbp sbpVar = this.d;
        rwc rwcVar = this.c;
        tqr tqrVar = this.b;
        return "{" + String.valueOf(this.a) + ", " + String.valueOf(tqrVar) + ", " + String.valueOf(rwcVar) + ", " + String.valueOf(sbpVar) + ", " + String.valueOf(qsyVar) + ", " + this.e + ", false}";
    }

    public rec(Uri uri, tqr tqrVar, rwc rwcVar, sbp sbpVar, qsy qsyVar, boolean z) {
        this.a = uri;
        this.b = tqrVar;
        this.c = rwcVar;
        this.d = sbpVar;
        this.f = qsyVar;
        this.e = z;
    }
}
