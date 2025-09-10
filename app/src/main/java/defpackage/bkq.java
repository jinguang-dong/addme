package defpackage;

import android.graphics.BlendModeColorFilter;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bkq extends bkw {
    public final int a;
    private final long c;

    public bkq(long j, int i) {
        super(new BlendModeColorFilter(bko.h(j), bko.p(i)));
        this.c = j;
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bkq)) {
            return false;
        }
        long j = this.c;
        bkq bkqVar = (bkq) obj;
        long j2 = bkqVar.c;
        long j3 = bkv.a;
        return a.q(j, j2) && a.p(this.a, bkqVar.a);
    }

    public final int hashCode() {
        long j = bkv.a;
        return (a.r(this.c) * 31) + this.a;
    }

    public final String toString() {
        return "BlendModeColorFilter(color=" + ((Object) bkv.g(this.c)) + ", blendMode=" + ((Object) bkp.a(this.a)) + ')';
    }
}
