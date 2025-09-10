package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ass {
    public float a = 6.0f;
    public float b = 12.0f;
    public float c = 8.0f;
    public float d = 8.0f;
    public final abr e = new abr(new cht(6.0f), adu.c, null, 12);
    private akb f;
    private akb g;

    private final float c(akb akbVar) {
        return akbVar instanceof akd ? this.b : akbVar instanceof ajz ? this.c : akbVar instanceof ajx ? this.d : this.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r8v0, types: [akb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v1, types: [akb] */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.akb r8, defpackage.uhb r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.asq
            if (r0 == 0) goto L13
            r0 = r9
            asq r0 = (defpackage.asq) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            asq r0 = new asq
            r0.<init>(r7, r9)
        L18:
            r5 = r0
            java.lang.Object r9 = r5.b
            uhi r0 = defpackage.uhi.a
            int r1 = r5.d
            r2 = 1
            if (r1 == 0) goto L37
            if (r1 != r2) goto L2f
            java.lang.Object r8 = r5.a
            defpackage.rnt.aN(r9)     // Catch: java.lang.Throwable -> L2b
            goto Lb0
        L2b:
            r0 = move-exception
            r9 = r0
            goto Lb5
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L37:
            defpackage.rnt.aN(r9)
            float r9 = r7.c(r8)
            r7.g = r8
            abr r1 = r7.e     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r3 = r1.c()     // Catch: java.lang.Throwable -> L2b
            cht r3 = (defpackage.cht) r3     // Catch: java.lang.Throwable -> L2b
            float r3 = r3.a     // Catch: java.lang.Throwable -> L2b
            boolean r3 = defpackage.cht.b(r3, r9)     // Catch: java.lang.Throwable -> L2b
            if (r3 != 0) goto Lb0
            akb r3 = r7.f     // Catch: java.lang.Throwable -> L2b
            r5.a = r8     // Catch: java.lang.Throwable -> L2b
            r5.d = r2     // Catch: java.lang.Throwable -> L2b
            adt r2 = defpackage.asl.a     // Catch: java.lang.Throwable -> L2b
            r2 = 0
            if (r8 == 0) goto L73
            boolean r3 = r8 instanceof defpackage.akd     // Catch: java.lang.Throwable -> L2b
            if (r3 == 0) goto L62
            adt r2 = defpackage.asl.a     // Catch: java.lang.Throwable -> L2b
            goto L8d
        L62:
            boolean r3 = r8 instanceof defpackage.aju     // Catch: java.lang.Throwable -> L2b
            if (r3 == 0) goto L69
        L66:
            adt r2 = defpackage.asl.a     // Catch: java.lang.Throwable -> L2b
            goto L8d
        L69:
            boolean r3 = r8 instanceof defpackage.ajz     // Catch: java.lang.Throwable -> L2b
            if (r3 == 0) goto L6e
            goto L66
        L6e:
            boolean r3 = r8 instanceof defpackage.ajx     // Catch: java.lang.Throwable -> L2b
            if (r3 == 0) goto L8d
            goto L66
        L73:
            if (r3 == 0) goto L8d
            boolean r4 = r3 instanceof defpackage.akd     // Catch: java.lang.Throwable -> L2b
            if (r4 == 0) goto L7c
        L79:
            adt r2 = defpackage.asl.b     // Catch: java.lang.Throwable -> L2b
            goto L8d
        L7c:
            boolean r4 = r3 instanceof defpackage.aju     // Catch: java.lang.Throwable -> L2b
            if (r4 == 0) goto L81
            goto L79
        L81:
            boolean r4 = r3 instanceof defpackage.ajz     // Catch: java.lang.Throwable -> L2b
            if (r4 == 0) goto L88
            adt r2 = defpackage.asl.c     // Catch: java.lang.Throwable -> L2b
            goto L8d
        L88:
            boolean r3 = r3 instanceof defpackage.ajx     // Catch: java.lang.Throwable -> L2b
            if (r3 == 0) goto L8d
            goto L79
        L8d:
            r3 = r2
            if (r3 == 0) goto La1
            cht r2 = new cht     // Catch: java.lang.Throwable -> L2b
            r2.<init>(r9)     // Catch: java.lang.Throwable -> L2b
            r4 = 0
            r6 = 12
            java.lang.Object r9 = defpackage.abr.k(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L2b
            if (r9 == r0) goto Lad
        L9e:
            ufg r9 = defpackage.ufg.a     // Catch: java.lang.Throwable -> L2b
            goto Lad
        La1:
            cht r2 = new cht     // Catch: java.lang.Throwable -> L2b
            r2.<init>(r9)     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r9 = r1.e(r2, r5)     // Catch: java.lang.Throwable -> L2b
            if (r9 == r0) goto Lad
            goto L9e
        Lad:
            if (r9 != r0) goto Lb0
            return r0
        Lb0:
            r7.f = r8
            ufg r7 = defpackage.ufg.a
            return r7
        Lb5:
            r7.f = r8
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ass.a(akb, uhb):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(defpackage.uhb r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.asr
            if (r0 == 0) goto L13
            r0 = r6
            asr r0 = (defpackage.asr) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            asr r0 = new asr
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            uhi r1 = defpackage.uhi.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            defpackage.rnt.aN(r6)     // Catch: java.lang.Throwable -> L27
            goto L57
        L27:
            r6 = move-exception
            goto L5d
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.rnt.aN(r6)
            akb r6 = r5.g
            float r6 = r5.c(r6)
            abr r2 = r5.e
            java.lang.Object r4 = r2.c()
            cht r4 = (defpackage.cht) r4
            float r4 = r4.a
            boolean r4 = defpackage.cht.b(r4, r6)
            if (r4 != 0) goto L62
            cht r4 = new cht     // Catch: java.lang.Throwable -> L27
            r4.<init>(r6)     // Catch: java.lang.Throwable -> L27
            r0.c = r3     // Catch: java.lang.Throwable -> L27
            java.lang.Object r6 = r2.e(r4, r0)     // Catch: java.lang.Throwable -> L27
            if (r6 == r1) goto L5c
        L57:
            akb r6 = r5.g
            r5.f = r6
            goto L62
        L5c:
            return r1
        L5d:
            akb r0 = r5.g
            r5.f = r0
            throw r6
        L62:
            ufg r5 = defpackage.ufg.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ass.b(uhb):java.lang.Object");
    }
}
