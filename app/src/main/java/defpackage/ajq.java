package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ajq {
    public static final uiv a = new ajj(null);

    /* JADX WARN: Removed duplicated region for block: B:17:0x004a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0048 -> B:18:0x004b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object c(defpackage.bqk r9, boolean r10, int r11, defpackage.uhb r12) {
        /*
            boolean r0 = r12 instanceof defpackage.ajk
            if (r0 == 0) goto L13
            r0 = r12
            ajk r0 = (defpackage.ajk) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ajk r0 = new ajk
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.b
            uhi r1 = defpackage.uhi.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            boolean r9 = r0.a
            int r10 = r0.e
            bqk r11 = r0.d
            defpackage.rnt.aN(r12)
            r8 = r10
            r10 = r9
            r9 = r11
            r11 = r8
            goto L4b
        L31:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L39:
            defpackage.rnt.aN(r12)
        L3c:
            r0.d = r9
            r0.e = r11
            r0.a = r10
            r0.c = r3
            java.lang.Object r12 = r9.s(r11, r0)
            if (r12 != r1) goto L4b
            return r1
        L4b:
            bpp r12 = (defpackage.bpp) r12
            java.util.List r12 = r12.a
            int r2 = r12.size()
            r4 = 0
            r5 = r4
        L55:
            if (r5 >= r2) goto L7b
            java.lang.Object r6 = r12.get(r5)
            bpv r6 = (defpackage.bpv) r6
            if (r10 == 0) goto L71
            boolean r7 = r6.c()
            if (r7 != 0) goto L6f
            boolean r7 = r6.h
            if (r7 != 0) goto L6f
            boolean r6 = r6.d
            if (r6 == 0) goto L6f
            r6 = r3
            goto L75
        L6f:
            r6 = r4
            goto L75
        L71:
            boolean r6 = defpackage.akg.y(r6)
        L75:
            if (r6 != 0) goto L78
            goto L3c
        L78:
            int r5 = r5 + 1
            goto L55
        L7b:
            java.lang.Object r9 = r12.get(r4)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajq.c(bqk, boolean, int, uhb):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a4, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b0, code lost:
    
        if (r0 != r2) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00b0 -> B:13:0x0031). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object d(defpackage.bqk r17, int r18, defpackage.uhb r19) {
        /*
            Method dump skipped, instructions count: 219
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajq.d(bqk, int, uhb):java.lang.Object");
    }

    public static final Object e(bqc bqcVar, uiv uivVar, uiq uiqVar, uhb uhbVar) throws Throwable {
        Object objI = ung.i(new ddc(bqcVar, uivVar, uiqVar, (uhb) null, 1), uhbVar);
        return objI == uhi.a ? objI : ufg.a;
    }
}
