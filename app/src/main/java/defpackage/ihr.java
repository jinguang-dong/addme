package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ihr implements rww {
    private final rwc a;
    private final nkw b;
    private final int c;
    private final int d;
    private final int e;
    private final ibb f;
    private final kno g;

    public ihr(hyd hydVar, rwc rwcVar, nkw nkwVar, ibb ibbVar, kno knoVar) {
        this.a = rwcVar;
        this.b = nkwVar;
        int i = hydVar.a;
        this.e = i;
        this.f = ibbVar;
        this.c = i - hydVar.d;
        this.d = i - hydVar.e;
        this.g = knoVar;
        int i2 = hydVar.c;
    }

    private final int c(int i) {
        return Math.min(i, this.g.a());
    }

    @Override // defpackage.rww
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Integer fr() {
        ibb ibbVar = this.f;
        ibbVar.n();
        if (ixg.a(this.b) || ibbVar.m()) {
            return Integer.valueOf(c(this.c));
        }
        rwc rwcVar = this.a;
        return rwcVar.h() ? ((kan) rwcVar.c()).a() == 1 ? Integer.valueOf(c(this.e)) : ((kan) rwcVar.c()).a() == 2 ? Integer.valueOf(c(this.d)) : Integer.valueOf(c(this.c)) : Integer.valueOf(this.e);
    }
}
