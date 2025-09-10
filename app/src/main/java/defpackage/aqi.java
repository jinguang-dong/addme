package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aqi {
    private static Boolean a;
    private static final ayp b = new bbp(new adq(5));

    public static final boolean a(int i) {
        if (i >= 8 && i < 1000) {
            if (a == null) {
                a = Boolean.valueOf(Runtime.getRuntime().availableProcessors() >= 4);
            }
            Boolean bool = a;
            bool.getClass();
            if (bool.booleanValue()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003c A[Catch: RejectedExecutionException -> 0x008c, TryCatch #0 {RejectedExecutionException -> 0x008c, blocks: (B:8:0x0036, B:14:0x0043, B:16:0x0053, B:21:0x005e, B:23:0x0073, B:26:0x0087, B:25:0x0077, B:18:0x0059, B:10:0x003c), top: B:32:0x0036 }] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(java.lang.String r9, defpackage.cdo r10, defpackage.qqq r11, defpackage.ayc r12, int r13) {
        /*
            ayp r0 = defpackage.aqi.b
            java.lang.Object r0 = r12.e(r0)
            java.util.concurrent.Executor r0 = (java.util.concurrent.Executor) r0
            if (r0 == 0) goto L92
            int r1 = r9.length()
            boolean r1 = a(r1)
            if (r1 == 0) goto L92
            r1 = 1254323569(0x4ac37571, float:6404792.5)
            r12.u(r1)
            ayp r1 = defpackage.bze.h
            java.lang.Object r1 = r12.e(r1)
            r4 = r1
            cib r4 = (defpackage.cib) r4
            ayp r1 = defpackage.bze.c
            java.lang.Object r1 = r12.e(r1)
            r6 = r1
            chq r6 = (defpackage.chq) r6
            r1 = r13 & 112(0x70, float:1.57E-43)
            r1 = r1 ^ 48
            r2 = 0
            r3 = 32
            r5 = 1
            if (r1 <= r3) goto L3c
            boolean r1 = r12.B(r10)     // Catch: java.util.concurrent.RejectedExecutionException -> L8c
            if (r1 != 0) goto L40
        L3c:
            r1 = r13 & 48
            if (r1 != r3) goto L42
        L40:
            r1 = r5
            goto L43
        L42:
            r1 = r2
        L43:
            int r3 = r4.ordinal()     // Catch: java.util.concurrent.RejectedExecutionException -> L8c
            boolean r3 = r12.z(r3)     // Catch: java.util.concurrent.RejectedExecutionException -> L8c
            r1 = r1 | r3
            r3 = r13 & 14
            r3 = r3 ^ 6
            r7 = 4
            if (r3 <= r7) goto L59
            boolean r3 = r12.B(r9)     // Catch: java.util.concurrent.RejectedExecutionException -> L8c
            if (r3 != 0) goto L5d
        L59:
            r13 = r13 & 6
            if (r13 != r7) goto L5e
        L5d:
            r2 = r5
        L5e:
            r13 = r1 | r2
            boolean r1 = r12.B(r6)     // Catch: java.util.concurrent.RejectedExecutionException -> L8c
            r13 = r13 | r1
            boolean r1 = r12.D(r11)     // Catch: java.util.concurrent.RejectedExecutionException -> L8c
            r13 = r13 | r1
            r1 = r12
            ayg r1 = (defpackage.ayg) r1     // Catch: java.util.concurrent.RejectedExecutionException -> L8c
            java.lang.Object r1 = r1.R()     // Catch: java.util.concurrent.RejectedExecutionException -> L8c
            if (r13 != 0) goto L77
            java.lang.Object r13 = defpackage.ayb.a     // Catch: java.util.concurrent.RejectedExecutionException -> L8c
            if (r1 != r13) goto L87
        L77:
            eml r2 = new eml     // Catch: java.util.concurrent.RejectedExecutionException -> L8c
            r8 = 1
            r5 = r9
            r3 = r10
            r7 = r11
            r2.<init>(r3, r4, r5, r6, r7, r8)     // Catch: java.util.concurrent.RejectedExecutionException -> L8c
            r9 = r12
            ayg r9 = (defpackage.ayg) r9     // Catch: java.util.concurrent.RejectedExecutionException -> L8c
            r9.ac(r2)     // Catch: java.util.concurrent.RejectedExecutionException -> L8c
            r1 = r2
        L87:
            java.lang.Runnable r1 = (java.lang.Runnable) r1     // Catch: java.util.concurrent.RejectedExecutionException -> L8c
            r0.execute(r1)     // Catch: java.util.concurrent.RejectedExecutionException -> L8c
        L8c:
            ayg r12 = (defpackage.ayg) r12
            r12.Y()
            return
        L92:
            r9 = 1255082759(0x4acf0b07, float:6784387.5)
            r12.u(r9)
            ayg r12 = (defpackage.ayg) r12
            r12.Y()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aqi.b(java.lang.String, cdo, qqq, ayc, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003c A[Catch: RejectedExecutionException -> 0x0092, TryCatch #0 {RejectedExecutionException -> 0x0092, blocks: (B:8:0x0036, B:14:0x0043, B:16:0x0058, B:21:0x0063, B:23:0x0078, B:26:0x008d, B:25:0x007c, B:18:0x005e, B:10:0x003c), top: B:32:0x0036 }] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(defpackage.ccm r10, defpackage.cdo r11, defpackage.qqq r12, java.util.List r13, defpackage.ayc r14, int r15) {
        /*
            ayp r0 = defpackage.aqi.b
            java.lang.Object r0 = r14.e(r0)
            java.util.concurrent.Executor r0 = (java.util.concurrent.Executor) r0
            if (r0 == 0) goto L98
            int r1 = r10.a()
            boolean r1 = a(r1)
            if (r1 == 0) goto L98
            r1 = -518712704(0xffffffffe1151280, float:-1.7186862E20)
            r14.u(r1)
            ayp r1 = defpackage.bze.h
            java.lang.Object r1 = r14.e(r1)
            r4 = r1
            cib r4 = (defpackage.cib) r4
            ayp r1 = defpackage.bze.c
            java.lang.Object r1 = r14.e(r1)
            r7 = r1
            chq r7 = (defpackage.chq) r7
            r1 = r15 & 112(0x70, float:1.57E-43)
            r1 = r1 ^ 48
            r2 = 0
            r3 = 32
            r5 = 1
            if (r1 <= r3) goto L3c
            boolean r1 = r14.B(r11)     // Catch: java.util.concurrent.RejectedExecutionException -> L92
            if (r1 != 0) goto L40
        L3c:
            r1 = r15 & 48
            if (r1 != r3) goto L42
        L40:
            r1 = r5
            goto L43
        L42:
            r1 = r2
        L43:
            int r3 = r4.ordinal()     // Catch: java.util.concurrent.RejectedExecutionException -> L92
            boolean r3 = r14.z(r3)     // Catch: java.util.concurrent.RejectedExecutionException -> L92
            r1 = r1 | r3
            boolean r3 = r14.D(r13)     // Catch: java.util.concurrent.RejectedExecutionException -> L92
            r1 = r1 | r3
            r3 = r15 & 14
            r3 = r3 ^ 6
            r6 = 4
            if (r3 <= r6) goto L5e
            boolean r3 = r14.B(r10)     // Catch: java.util.concurrent.RejectedExecutionException -> L92
            if (r3 != 0) goto L62
        L5e:
            r15 = r15 & 6
            if (r15 != r6) goto L63
        L62:
            r2 = r5
        L63:
            r15 = r1 | r2
            boolean r1 = r14.B(r7)     // Catch: java.util.concurrent.RejectedExecutionException -> L92
            r15 = r15 | r1
            boolean r1 = r14.D(r12)     // Catch: java.util.concurrent.RejectedExecutionException -> L92
            r15 = r15 | r1
            r1 = r14
            ayg r1 = (defpackage.ayg) r1     // Catch: java.util.concurrent.RejectedExecutionException -> L92
            java.lang.Object r1 = r1.R()     // Catch: java.util.concurrent.RejectedExecutionException -> L92
            if (r15 != 0) goto L7c
            java.lang.Object r15 = defpackage.ayb.a     // Catch: java.util.concurrent.RejectedExecutionException -> L92
            if (r1 != r15) goto L8d
        L7c:
            ffz r2 = new ffz     // Catch: java.util.concurrent.RejectedExecutionException -> L92
            r9 = 1
            r6 = r10
            r3 = r11
            r8 = r12
            r5 = r13
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.util.concurrent.RejectedExecutionException -> L92
            r10 = r14
            ayg r10 = (defpackage.ayg) r10     // Catch: java.util.concurrent.RejectedExecutionException -> L92
            r10.ac(r2)     // Catch: java.util.concurrent.RejectedExecutionException -> L92
            r1 = r2
        L8d:
            java.lang.Runnable r1 = (java.lang.Runnable) r1     // Catch: java.util.concurrent.RejectedExecutionException -> L92
            r0.execute(r1)     // Catch: java.util.concurrent.RejectedExecutionException -> L92
        L92:
            ayg r14 = (defpackage.ayg) r14
            r14.Y()
            return
        L98:
            r10 = -517921801(0xffffffffe12123f7, float:-1.8578233E20)
            r14.u(r10)
            ayg r14 = (defpackage.ayg) r14
            r14.Y()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aqi.c(ccm, cdo, qqq, java.util.List, ayc, int):void");
    }
}
