package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class tkr extends tkp {
    private final tjr a;

    public tkr(tjr tjrVar, tks tksVar) {
        super(tksVar);
        this.a = tjrVar;
    }

    @Override // defpackage.tkp
    public final Object c() {
        return this.a.a();
    }

    @Override // defpackage.tkp
    public final void e(Object obj, tml tmlVar, tkq tkqVar) throws IllegalAccessException, IllegalArgumentException {
        Object objA = tkqVar.d.a(tmlVar);
        if (objA == null && tkqVar.e) {
            return;
        }
        if (tkqVar.c) {
            tku.b(obj, tkqVar.a);
        } else if (tkqVar.f) {
            throw new tim("Cannot set value of 'static final' ".concat(tmf.e(tkqVar.a, false)));
        }
        tkqVar.a.set(obj, objA);
    }

    @Override // defpackage.tkp
    public final Object d(Object obj) {
        return obj;
    }
}
