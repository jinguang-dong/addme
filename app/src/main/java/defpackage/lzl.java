package defpackage;

import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lzl {
    public final long a;
    public final boolean b;
    public final String c;
    public final Drawable d;
    public final Runnable e;
    public final Runnable f;
    public final String g;
    public final Runnable h;
    public final Runnable i;
    public final Runnable j;
    public final Runnable k;
    public final boolean l;
    public final boolean m;
    public final int n;

    public lzl() {
        throw null;
    }

    public static lzk a() {
        lzk lzkVar = new lzk();
        lzkVar.f(0L);
        lzkVar.c(false);
        lzkVar.j = 1;
        lzkVar.e(false);
        lzkVar.d(true);
        return lzkVar;
    }

    public final boolean equals(Object obj) {
        String str;
        Drawable drawable;
        Runnable runnable;
        Runnable runnable2;
        String str2;
        Runnable runnable3;
        Runnable runnable4;
        Runnable runnable5;
        Runnable runnable6;
        if (obj == this) {
            return true;
        }
        if (obj instanceof lzl) {
            lzl lzlVar = (lzl) obj;
            if (this.a == lzlVar.a && this.b == lzlVar.b && ((str = this.c) != null ? str.equals(lzlVar.c) : lzlVar.c == null) && ((drawable = this.d) != null ? drawable.equals(lzlVar.d) : lzlVar.d == null) && ((runnable = this.e) != null ? runnable.equals(lzlVar.e) : lzlVar.e == null) && ((runnable2 = this.f) != null ? runnable2.equals(lzlVar.f) : lzlVar.f == null) && ((str2 = this.g) != null ? str2.equals(lzlVar.g) : lzlVar.g == null) && ((runnable3 = this.h) != null ? runnable3.equals(lzlVar.h) : lzlVar.h == null) && ((runnable4 = this.i) != null ? runnable4.equals(lzlVar.i) : lzlVar.i == null) && ((runnable5 = this.j) != null ? runnable5.equals(lzlVar.j) : lzlVar.j == null) && ((runnable6 = this.k) != null ? runnable6.equals(lzlVar.k) : lzlVar.k == null) && this.l == lzlVar.l) {
                int i = this.n;
                int i2 = lzlVar.n;
                if (i == 0) {
                    throw null;
                }
                if (i == i2 && this.m == lzlVar.m) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.c;
        int iHashCode = str == null ? 0 : str.hashCode();
        long j = this.a;
        int i = iHashCode ^ ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003);
        Drawable drawable = this.d;
        int iHashCode2 = ((i * 1000003) ^ (drawable == null ? 0 : drawable.hashCode())) * 1000003;
        Runnable runnable = this.e;
        int iHashCode3 = iHashCode2 ^ (runnable == null ? 0 : runnable.hashCode());
        Runnable runnable2 = this.f;
        int iHashCode4 = ((iHashCode3 * (-721379959)) ^ (runnable2 == null ? 0 : runnable2.hashCode())) * 1000003;
        String str2 = this.g;
        int iHashCode5 = (iHashCode4 ^ (str2 == null ? 0 : str2.hashCode())) * (-721379959);
        Runnable runnable3 = this.h;
        int iHashCode6 = (iHashCode5 ^ (runnable3 == null ? 0 : runnable3.hashCode())) * 1000003;
        Runnable runnable4 = this.i;
        int iHashCode7 = (iHashCode6 ^ (runnable4 == null ? 0 : runnable4.hashCode())) * 1000003;
        Runnable runnable5 = this.j;
        int iHashCode8 = (iHashCode7 ^ (runnable5 == null ? 0 : runnable5.hashCode())) * 1000003;
        Runnable runnable6 = this.k;
        int iHashCode9 = (((iHashCode8 ^ (runnable6 != null ? runnable6.hashCode() : 0)) * 1000003) ^ (true != this.l ? 1237 : 1231)) * 1000003;
        int i2 = this.n;
        a.aF(i2);
        return ((iHashCode9 ^ i2) * 1000003) ^ (true == this.m ? 1231 : 1237);
    }

    public final String toString() {
        Runnable runnable = this.k;
        Runnable runnable2 = this.j;
        Runnable runnable3 = this.i;
        Runnable runnable4 = this.h;
        Runnable runnable5 = this.f;
        Runnable runnable6 = this.e;
        return "{" + this.a + ", " + this.b + ", " + this.c + ", " + String.valueOf(this.d) + ", " + String.valueOf(runnable6) + ", null, " + String.valueOf(runnable5) + ", " + this.g + ", null, " + String.valueOf(runnable4) + ", " + String.valueOf(runnable3) + ", " + String.valueOf(runnable2) + ", " + String.valueOf(runnable) + ", " + this.l + ", " + qpt.by(this.n) + ", " + this.m + "}";
    }

    public lzl(long j, boolean z, String str, Drawable drawable, Runnable runnable, Runnable runnable2, String str2, Runnable runnable3, Runnable runnable4, Runnable runnable5, Runnable runnable6, boolean z2, int i, boolean z3) {
        this.a = j;
        this.b = z;
        this.c = str;
        this.d = drawable;
        this.e = runnable;
        this.f = runnable2;
        this.g = str2;
        this.h = runnable3;
        this.i = runnable4;
        this.j = runnable5;
        this.k = runnable6;
        this.l = z2;
        this.n = i;
        this.m = z3;
    }
}
