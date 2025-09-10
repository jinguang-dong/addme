package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aer implements afz {
    private final Context a;
    private final chq b;
    private final long c;
    private final alv d;

    public aer(Context context, chq chqVar, long j, alv alvVar) {
        this.a = context;
        this.b = chqVar;
        this.c = j;
        this.d = alvVar;
    }

    @Override // defpackage.afz
    public final afy a() {
        return new aeq(this.a, this.b, this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!a.ao(getClass(), obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        aer aerVar = (aer) obj;
        if (!a.ao(this.a, aerVar.a) || !a.ao(this.b, aerVar.b)) {
            return false;
        }
        long j = this.c;
        long j2 = aerVar.c;
        long j3 = bkv.a;
        return a.q(j, j2) && a.ao(this.d, aerVar.d);
    }

    @Override // defpackage.afz
    public final int hashCode() {
        int iHashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        long j = bkv.a;
        return (((iHashCode * 31) + a.r(this.c)) * 31) + this.d.hashCode();
    }
}
