package defpackage;

import android.content.pm.ResolveInfo;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mbh {
    public final ResolveInfo a;
    public final boolean b;
    public final boolean c;
    private final boolean d;

    public mbh() {
        throw null;
    }

    public static mbg a() {
        mbg mbgVar = new mbg();
        mbgVar.b(false);
        return mbgVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mbh) {
            mbh mbhVar = (mbh) obj;
            if (this.a.equals(mbhVar.a) && this.b == mbhVar.b && this.d == mbhVar.d && this.c == mbhVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003) ^ (true == this.c ? 1231 : 1237);
    }

    public final String toString() {
        return "{" + String.valueOf(this.a) + ", " + this.b + ", " + this.d + ", " + this.c + "}";
    }

    public mbh(ResolveInfo resolveInfo, boolean z, boolean z2, boolean z3) {
        this.a = resolveInfo;
        this.b = z;
        this.d = z2;
        this.c = z3;
    }
}
