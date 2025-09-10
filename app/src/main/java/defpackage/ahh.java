package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ahh extends uht implements uiu {
    int a;
    final /* synthetic */ ahn b;
    final /* synthetic */ bqc c;
    final /* synthetic */ uiv d;
    final /* synthetic */ uiq e;
    final /* synthetic */ uif f;
    final /* synthetic */ uif g;
    final /* synthetic */ uiu h;
    private /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahh(ahn ahnVar, bqc bqcVar, uiv uivVar, uiq uiqVar, uif uifVar, uif uifVar2, uiu uiuVar, uhb uhbVar) {
        super(2, uhbVar);
        this.b = ahnVar;
        this.c = bqcVar;
        this.d = uivVar;
        this.e = uiqVar;
        this.f = uifVar;
        this.g = uifVar2;
        this.h = uiuVar;
    }

    @Override // defpackage.uiu
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ahh) c((und) obj, (uhb) obj2)).b(ufg.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0052  */
    @Override // defpackage.uhn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r11) {
        /*
            r10 = this;
            uhi r0 = defpackage.uhi.a
            int r1 = r10.a
            if (r1 == 0) goto L13
            java.lang.Object r0 = r10.i
            r1 = r0
            und r1 = (defpackage.und) r1
            defpackage.rnt.aN(r11)     // Catch: java.util.concurrent.CancellationException -> Lf
            goto L4f
        Lf:
            r0 = move-exception
            r11 = r0
            r9 = r10
            goto L3e
        L13:
            defpackage.rnt.aN(r11)
            java.lang.Object r11 = r10.i
            r1 = r11
            und r1 = (defpackage.und) r1
            ahn r11 = r10.b     // Catch: java.util.concurrent.CancellationException -> L3a
            aii r7 = r11.a     // Catch: java.util.concurrent.CancellationException -> L3a
            bqc r2 = r10.c     // Catch: java.util.concurrent.CancellationException -> L3a
            uiv r3 = r10.d     // Catch: java.util.concurrent.CancellationException -> L3a
            uiq r4 = r10.e     // Catch: java.util.concurrent.CancellationException -> L3a
            uif r5 = r10.f     // Catch: java.util.concurrent.CancellationException -> L3a
            uif r6 = r10.g     // Catch: java.util.concurrent.CancellationException -> L3a
            uiu r8 = r10.h     // Catch: java.util.concurrent.CancellationException -> L3a
            r10.i = r1     // Catch: java.util.concurrent.CancellationException -> L3a
            r11 = 1
            r10.a = r11     // Catch: java.util.concurrent.CancellationException -> L3a
            r9 = r10
            java.lang.Object r10 = defpackage.a.ba(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch: java.util.concurrent.CancellationException -> L38
            if (r10 != r0) goto L4f
            return r0
        L38:
            r0 = move-exception
            goto L3c
        L3a:
            r0 = move-exception
            r9 = r10
        L3c:
            r10 = r0
            r11 = r10
        L3e:
            ahn r10 = r9.b
            uqm r10 = r10.d
            if (r10 == 0) goto L49
            agt r0 = defpackage.agt.a
            r10.j(r0)
        L49:
            boolean r10 = defpackage.ung.l(r1)
            if (r10 == 0) goto L52
        L4f:
            ufg r10 = defpackage.ufg.a
            return r10
        L52:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahh.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.uhn
    public final uhb c(Object obj, uhb uhbVar) {
        ahh ahhVar = new ahh(this.b, this.c, this.d, this.e, this.f, this.g, this.h, uhbVar);
        ahhVar.i = obj;
        return ahhVar;
    }
}
