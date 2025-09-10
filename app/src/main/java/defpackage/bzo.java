package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bzo extends uht implements uiu {
    Object a;
    Object b;
    int c;
    final /* synthetic */ uqm d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bzo(uqm uqmVar, uhb uhbVar) {
        super(2, uhbVar);
        this.d = uqmVar;
    }

    @Override // defpackage.uiu
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bzo) c((und) obj, (uhb) obj2)).b(ufg.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0028 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031 A[Catch: all -> 0x004b, TRY_LEAVE, TryCatch #0 {all -> 0x004b, blocks: (B:5:0x000a, B:12:0x0029, B:14:0x0031, B:9:0x0018, B:8:0x0013), top: B:23:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0044  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:12:0x0029). Please report as a decompilation issue!!! */
    @Override // defpackage.uhn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r5) {
        /*
            r4 = this;
            uhi r0 = defpackage.uhi.a
            int r1 = r4.c
            if (r1 == 0) goto Le
            java.lang.Object r1 = r4.b
            java.lang.Object r2 = r4.a
            defpackage.rnt.aN(r5)     // Catch: java.lang.Throwable -> L4b
            goto L29
        Le:
            defpackage.rnt.aN(r5)
            uqm r2 = r4.d
            uqa r5 = r2.A()     // Catch: java.lang.Throwable -> L4b
            r1 = r5
        L18:
            r4.a = r2     // Catch: java.lang.Throwable -> L4b
            r4.b = r1     // Catch: java.lang.Throwable -> L4b
            r5 = 1
            r4.c = r5     // Catch: java.lang.Throwable -> L4b
            r5 = r1
            uqa r5 = (defpackage.uqa) r5     // Catch: java.lang.Throwable -> L4b
            java.lang.Object r5 = r5.a(r4)     // Catch: java.lang.Throwable -> L4b
            if (r5 != r0) goto L29
            return r0
        L29:
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch: java.lang.Throwable -> L4b
            boolean r5 = r5.booleanValue()     // Catch: java.lang.Throwable -> L4b
            if (r5 == 0) goto L44
            r5 = r1
            uqa r5 = (defpackage.uqa) r5     // Catch: java.lang.Throwable -> L4b
            java.lang.Object r5 = r5.b()     // Catch: java.lang.Throwable -> L4b
            ufg r5 = (defpackage.ufg) r5     // Catch: java.lang.Throwable -> L4b
            java.util.concurrent.atomic.AtomicBoolean r5 = defpackage.bzp.b     // Catch: java.lang.Throwable -> L4b
            r3 = 0
            r5.set(r3)     // Catch: java.lang.Throwable -> L4b
            defpackage.bay.F()     // Catch: java.lang.Throwable -> L4b
            goto L18
        L44:
            r4 = 0
            defpackage.ujo.g(r2, r4)
            ufg r4 = defpackage.ufg.a
            return r4
        L4b:
            r4 = move-exception
            throw r4     // Catch: java.lang.Throwable -> L4d
        L4d:
            r5 = move-exception
            defpackage.ujo.g(r2, r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bzo.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.uhn
    public final uhb c(Object obj, uhb uhbVar) {
        return new bzo(this.d, uhbVar);
    }
}
