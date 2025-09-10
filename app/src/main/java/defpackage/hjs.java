package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class hjs implements hkd {
    private final poj a;
    private final byte[] b;
    private final ltr c;

    public hjs(poj pojVar, byte[] bArr, ltr ltrVar) {
        this.a = pojVar;
        this.b = bArr;
        this.c = ltrVar;
    }

    @Override // defpackage.hkd
    public final poj a() {
        return this.a;
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [sgt, shi] */
    @Override // defpackage.hkd
    public final void b(mdm mdmVar) {
        byte[] bArr;
        if (mdmVar == null || (bArr = this.b) == null) {
            return;
        }
        try {
            tpc tpcVarM = spy.a.m();
            tpcVarM.s(bArr, bArr.length, tow.a());
            int i = this.c.f;
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            spy spyVar = (spy) tpcVarM.b;
            spyVar.b |= 4;
            spyVar.c = i;
            ((mdo) mdmVar).q = (spy) tpcVarM.l();
        } catch (tpz e) {
            ((sgt) ((sgt) hju.a.c().i(e)).M((char) 1330)).s("Invalid log buffer");
        }
    }

    @Override // defpackage.hkd
    public final boolean c() {
        return true;
    }
}
