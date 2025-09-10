package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class crr extends uht implements uiq {
    Object a;
    int b;
    final /* synthetic */ cru c;
    final /* synthetic */ Object d;
    final /* synthetic */ Object e;
    private final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public crr(cru cruVar, uhf uhfVar, uiu uiuVar, uhb uhbVar, int i) {
        super(1, uhbVar);
        this.f = i;
        this.c = cruVar;
        this.d = uhfVar;
        this.e = uiuVar;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, uhf] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, uiu] */
    @Override // defpackage.uiq
    public final /* synthetic */ Object a(Object obj) {
        if (this.f != 0) {
            uhb uhbVar = (uhb) obj;
            return new crr((uka) this.e, this.c, (ujy) this.d, uhbVar, 1).b(ufg.a);
        }
        return new crr(this.c, (uhf) this.d, (uiu) this.e, (uhb) obj, 0).b(ufg.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ea  */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, uhf] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, uiu] */
    @Override // defpackage.uhn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 242
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.crr.b(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public crr(uka ukaVar, cru cruVar, ujy ujyVar, uhb uhbVar, int i) {
        super(1, uhbVar);
        this.f = i;
        this.e = ukaVar;
        this.c = cruVar;
        this.d = ujyVar;
    }
}
