package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class uvh {
    public static final uwc a = new uwc("UNDEFINED");
    public static final uwc b = new uwc("REUSABLE_CLAIMED");

    /* JADX WARN: Removed duplicated region for block: B:27:0x007d A[Catch: all -> 0x0097, DONT_GENERATE, TryCatch #0 {all -> 0x0097, blocks: (B:13:0x003c, B:15:0x004a, B:17:0x0050, B:28:0x0080, B:18:0x005c, B:20:0x006c, B:25:0x0077, B:27:0x007d, B:34:0x008d, B:37:0x0096, B:36:0x0093, B:23:0x0072), top: B:47:0x003c, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(defpackage.uhb r6, java.lang.Object r7) {
        /*
            boolean r0 = r6 instanceof defpackage.uvg
            if (r0 == 0) goto La4
            uvg r6 = (defpackage.uvg) r6
            java.lang.Object r0 = defpackage.ung.o(r7)
            una r1 = r6.a
            uhf r2 = r6.q()
            boolean r2 = c(r1, r2)
            r3 = 1
            if (r2 == 0) goto L23
            r6.c = r0
            r6.e = r3
            uhf r7 = r6.q()
            b(r1, r7, r6)
            return
        L23:
            boolean r1 = defpackage.unf.a
            java.lang.ThreadLocal r1 = defpackage.upk.a
            unw r1 = defpackage.upk.a()
            boolean r2 = r1.p()
            if (r2 == 0) goto L39
            r6.c = r0
            r6.e = r3
            r1.n(r6)
            return
        L39:
            r1.o(r3)
            uhf r0 = r6.q()     // Catch: java.lang.Throwable -> L97
            azn r2 = defpackage.uol.c     // Catch: java.lang.Throwable -> L97
            uhd r0 = r0.get(r2)     // Catch: java.lang.Throwable -> L97
            uol r0 = (defpackage.uol) r0     // Catch: java.lang.Throwable -> L97
            if (r0 == 0) goto L5c
            boolean r2 = r0.t()     // Catch: java.lang.Throwable -> L97
            if (r2 != 0) goto L5c
            java.util.concurrent.CancellationException r7 = r0.n()     // Catch: java.lang.Throwable -> L97
            java.lang.Object r7 = defpackage.rnt.aM(r7)     // Catch: java.lang.Throwable -> L97
            r6.fW(r7)     // Catch: java.lang.Throwable -> L97
            goto L80
        L5c:
            uhb r0 = r6.b     // Catch: java.lang.Throwable -> L97
            java.lang.Object r2 = r6.d     // Catch: java.lang.Throwable -> L97
            uhf r4 = r0.q()     // Catch: java.lang.Throwable -> L97
            java.lang.Object r2 = defpackage.uwe.b(r4, r2)     // Catch: java.lang.Throwable -> L97
            uwc r5 = defpackage.uwe.a     // Catch: java.lang.Throwable -> L97
            if (r2 == r5) goto L71
            upp r5 = defpackage.umy.c(r0, r4, r2)     // Catch: java.lang.Throwable -> L97
            goto L72
        L71:
            r5 = 0
        L72:
            r0.fW(r7)     // Catch: java.lang.Throwable -> L8a
            if (r5 == 0) goto L7d
            boolean r7 = r5.V()     // Catch: java.lang.Throwable -> L97
            if (r7 == 0) goto L80
        L7d:
            defpackage.uwe.c(r4, r2)     // Catch: java.lang.Throwable -> L97
        L80:
            boolean r7 = r1.r()     // Catch: java.lang.Throwable -> L97
            if (r7 != 0) goto L80
            r1.m(r3)
            return
        L8a:
            r7 = move-exception
            if (r5 == 0) goto L93
            boolean r0 = r5.V()     // Catch: java.lang.Throwable -> L97
            if (r0 == 0) goto L96
        L93:
            defpackage.uwe.c(r4, r2)     // Catch: java.lang.Throwable -> L97
        L96:
            throw r7     // Catch: java.lang.Throwable -> L97
        L97:
            r7 = move-exception
            r6.F(r7)     // Catch: java.lang.Throwable -> L9f
            r1.m(r3)
            return
        L9f:
            r6 = move-exception
            r1.m(r3)
            throw r6
        La4:
            r6.fW(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uvh.a(uhb, java.lang.Object):void");
    }

    public static final void b(una unaVar, uhf uhfVar, Runnable runnable) {
        try {
            unaVar.a(uhfVar, runnable);
        } catch (Throwable th) {
            throw new unn(th, unaVar, uhfVar);
        }
    }

    public static final boolean c(una unaVar, uhf uhfVar) throws unn {
        try {
            return unaVar.dw(uhfVar);
        } catch (Throwable th) {
            throw new unn(th, unaVar, uhfVar);
        }
    }
}
