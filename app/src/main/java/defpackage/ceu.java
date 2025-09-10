package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ceu implements bbo {
    public boolean a = true;
    public final pfl b;
    private final List c;
    private final cfv d;
    private final cey e;
    private final uiq f;
    private final azr g;

    public ceu(List list, Object obj, cfv cfvVar, cey ceyVar, uiq uiqVar, pfl pflVar) {
        this.c = list;
        this.d = cfvVar;
        this.e = ceyVar;
        this.f = uiqVar;
        this.b = pflVar;
        this.g = new azz(obj, bap.c);
    }

    @Override // defpackage.bbo
    public final Object a() {
        return this.g.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ba, code lost:
    
        if (defpackage.ujp.O(r0) != r1) goto L39;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0057 A[Catch: all -> 0x00be, TryCatch #0 {all -> 0x00be, blocks: (B:13:0x002e, B:23:0x0057, B:25:0x0067, B:30:0x0084, B:33:0x00ac, B:18:0x0043, B:21:0x004d), top: B:44:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0084 A[Catch: all -> 0x00be, TRY_LEAVE, TryCatch #0 {all -> 0x00be, blocks: (B:13:0x002e, B:23:0x0057, B:25:0x0067, B:30:0x0084, B:33:0x00ac, B:18:0x0043, B:21:0x004d), top: B:44:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ac A[Catch: all -> 0x00be, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x00be, blocks: (B:13:0x002e, B:23:0x0057, B:25:0x0067, B:30:0x0084, B:33:0x00ac, B:18:0x0043, B:21:0x004d), top: B:44:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0065 -> B:39:0x00c0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00ba -> B:39:0x00c0). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(defpackage.uhb r13) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ceu.b(uhb):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(defpackage.cfc r6, defpackage.uhb r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.cet
            if (r0 == 0) goto L13
            r0 = r7
            cet r0 = (defpackage.cet) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            cet r0 = new cet
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.b
            uhi r1 = defpackage.uhi.a
            int r2 = r0.d
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            java.lang.Object r6 = r0.a
            defpackage.rnt.aN(r7)     // Catch: java.lang.Exception -> L2a java.util.concurrent.CancellationException -> L73
            return r7
        L2a:
            r5 = move-exception
            goto L4a
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            defpackage.rnt.aN(r7)
            crq r7 = new crq     // Catch: java.lang.Exception -> L2a java.util.concurrent.CancellationException -> L73
            r7.<init>(r5, r6, r4, r3)     // Catch: java.lang.Exception -> L2a java.util.concurrent.CancellationException -> L73
            r0.a = r6     // Catch: java.lang.Exception -> L2a java.util.concurrent.CancellationException -> L73
            r0.d = r3     // Catch: java.lang.Exception -> L2a java.util.concurrent.CancellationException -> L73
            r2 = 15000(0x3a98, double:7.411E-320)
            java.lang.Object r5 = defpackage.ujo.i(r2, r7, r0)     // Catch: java.lang.Exception -> L2a java.util.concurrent.CancellationException -> L73
            if (r5 != r1) goto L49
            return r1
        L49:
            return r5
        L4a:
            uhf r7 = r0.q()
            azn r1 = kotlinx.coroutines.CoroutineExceptionHandler.c
            uhd r7 = r7.get(r1)
            kotlinx.coroutines.CoroutineExceptionHandler r7 = (kotlinx.coroutines.CoroutineExceptionHandler) r7
            if (r7 != 0) goto L59
            goto L7e
        L59:
            uhf r0 = r0.q()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.util.Objects.toString(r6)
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r2 = "Unable to load font "
            java.lang.String r6 = r2.concat(r6)
            r1.<init>(r6, r5)
            r7.handleException(r0, r1)
            return r4
        L73:
            r5 = move-exception
            uhf r6 = r0.q()
            boolean r6 = defpackage.ujp.V(r6)
            if (r6 == 0) goto L7f
        L7e:
            return r4
        L7f:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ceu.c(cfc, uhb):java.lang.Object");
    }
}
