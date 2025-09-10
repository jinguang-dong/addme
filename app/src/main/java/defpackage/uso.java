package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class uso extends uht implements uiv {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ Object c;
    private /* synthetic */ Object d;
    private final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uso(uhb uhbVar, uix uixVar, int i) {
        super(3, uhbVar);
        this.e = i;
        this.c = uixVar;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, uix] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, uiu] */
    @Override // defpackage.uiv
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        if (this.e == 0) {
            uso usoVar = new uso((uhb) obj3, (uix) this.c, 0);
            usoVar.d = (url) obj;
            usoVar.b = (Object[]) obj2;
            return usoVar.b(ufg.a);
        }
        uso usoVar2 = new uso((uiu) this.c, (uhb) obj3, 1);
        usoVar2.d = (url) obj;
        usoVar2.b = obj2;
        return usoVar2.b(ufg.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0035, code lost:
    
        if (r3.a(r11, r10) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x008b, code lost:
    
        if (r3.a(r11, r10) == r0) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [url] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [url] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, uiu] */
    @Override // defpackage.uhn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r11) {
        /*
            r10 = this;
            int r0 = r10.e
            r1 = 0
            r2 = 2
            r3 = 1
            if (r0 == 0) goto L3c
            uhi r0 = defpackage.uhi.a
            int r4 = r10.a
            if (r4 == 0) goto L19
            if (r4 == r3) goto L13
            defpackage.rnt.aN(r11)
            goto L38
        L13:
            java.lang.Object r3 = r10.d
            defpackage.rnt.aN(r11)
            goto L2d
        L19:
            defpackage.rnt.aN(r11)
            java.lang.Object r11 = r10.d
            java.lang.Object r4 = r10.b
            java.lang.Object r5 = r10.c
            r10.a = r3
            java.lang.Object r3 = r5.a(r4, r10)
            if (r3 == r0) goto L3b
            r9 = r3
            r3 = r11
            r11 = r9
        L2d:
            r10.d = r1
            r10.a = r2
            java.lang.Object r10 = r3.a(r11, r10)
            if (r10 != r0) goto L38
            goto L3b
        L38:
            ufg r10 = defpackage.ufg.a
            return r10
        L3b:
            return r0
        L3c:
            uhi r0 = defpackage.uhi.a
            int r4 = r10.a
            if (r4 == 0) goto L4e
            if (r4 == r3) goto L48
            defpackage.rnt.aN(r11)
            goto L8e
        L48:
            java.lang.Object r3 = r10.d
            defpackage.rnt.aN(r11)
            goto L83
        L4e:
            defpackage.rnt.aN(r11)
            java.lang.Object r11 = r10.d
            java.lang.Object r4 = r10.b
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            r5 = 0
            r5 = r4[r5]
            r6 = r4[r3]
            r7 = r4[r2]
            r8 = 3
            r4 = r4[r8]
            r10.a = r3
            gyd r5 = (defpackage.gyd) r5
            java.lang.Float r6 = (java.lang.Float) r6
            java.lang.Float r7 = (java.lang.Float) r7
            gyd r4 = (defpackage.gyd) r4
            gwo r3 = new gwo
            r3.<init>(r10)
            r3.a = r5
            r3.b = r6
            r3.c = r7
            r3.d = r4
            ufg r4 = defpackage.ufg.a
            java.lang.Object r3 = r3.b(r4)
            if (r3 == r0) goto L91
            r9 = r3
            r3 = r11
            r11 = r9
        L83:
            r10.d = r1
            r10.a = r2
            java.lang.Object r10 = r3.a(r11, r10)
            if (r10 != r0) goto L8e
            goto L91
        L8e:
            ufg r10 = defpackage.ufg.a
            return r10
        L91:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uso.b(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uso(uiu uiuVar, uhb uhbVar, int i) {
        super(3, uhbVar);
        this.e = i;
        this.c = uiuVar;
    }
}
