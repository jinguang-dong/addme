package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kmr implements kmz {
    private final kmz a;
    private final rwc b;
    private final boolean c;
    private final boolean d;
    private final pbn e;
    private final pbc f;
    private final cxb g;
    private final cxb h;

    public kmr(kmz kmzVar, rwc rwcVar, tzj tzjVar, tzj tzjVar2, boolean z, boolean z2, pbb pbbVar, pbn pbnVar) {
        this.a = kmzVar;
        this.b = rwcVar;
        this.g = new cxb(tzjVar);
        this.h = new cxb(tzjVar2);
        this.c = z;
        this.d = z2;
        this.e = pbnVar;
        this.f = pbbVar.a("MicrovideoCapCmd");
    }

    @Override // defpackage.kmz
    public final owf a() {
        return this.a.a();
    }

    @Override // defpackage.kmz
    public final owf b() {
        return this.a.b();
    }

    public final String toString() {
        rwb rwbVarW = rnt.W(this);
        rwbVarW.a = true;
        rwbVarW.b("primaryCommand", this.a);
        rwbVarW.b("fallback", this.b.f());
        return rwbVarW.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0105  */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kmz] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object, lss] */
    @Override // defpackage.kmz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(defpackage.kmy r18, defpackage.gga r19) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kmr.c(kmy, gga):void");
    }
}
