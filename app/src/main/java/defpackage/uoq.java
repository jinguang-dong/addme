package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class uoq extends uoo {
    private final uov a;
    private final uor f;
    private final umq g;
    private final Object h;

    public uoq(uov uovVar, uor uorVar, umq umqVar, Object obj) {
        this.a = uovVar;
        this.f = uorVar;
        this.g = umqVar;
        this.h = obj;
    }

    @Override // defpackage.uoo
    public final void a(Throwable th) {
        boolean z = unf.a;
        uov uovVar = this.a;
        uor uorVar = this.f;
        umq umqVar = this.g;
        umq umqVarR = uov.R(umqVar);
        Object obj = this.h;
        if (umqVarR == null || !uovVar.P(uorVar, umqVarR, obj)) {
            uorVar.a.j(2);
            umq umqVarR2 = uov.R(umqVar);
            if (umqVarR2 == null || !uovVar.P(uorVar, umqVarR2, obj)) {
                uovVar.a(uovVar.fX(uorVar, obj));
            }
        }
    }

    @Override // defpackage.uoo
    public final boolean b() {
        return false;
    }
}
