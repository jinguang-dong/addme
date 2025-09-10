package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class itr extends uht implements uiu {
    Object a;
    Object b;
    int c;
    final /* synthetic */ iuf d;
    final /* synthetic */ itu e;
    final /* synthetic */ iuh f;
    private /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public itr(iuf iufVar, itu ituVar, iuh iuhVar, uhb uhbVar) {
        super(2, uhbVar);
        this.d = iufVar;
        this.e = ituVar;
        this.f = iuhVar;
    }

    @Override // defpackage.uiu
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((itr) c((und) obj, (uhb) obj2)).b(ufg.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0084  */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0077 -> B:18:0x0078). Please report as a decompilation issue!!! */
    @Override // defpackage.uhn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r11) {
        /*
            r10 = this;
            uhi r0 = defpackage.uhi.a
            int r1 = r10.c
            if (r1 == 0) goto L12
            java.lang.Object r1 = r10.b
            java.lang.Object r2 = r10.a
            java.lang.Object r3 = r10.g
            java.util.Collection r3 = (java.util.Collection) r3
            defpackage.rnt.aN(r11)     // Catch: java.util.concurrent.CancellationException -> L7d
            goto L78
        L12:
            defpackage.rnt.aN(r11)
            java.lang.Object r11 = r10.g
            und r11 = (defpackage.und) r11
            iuf r1 = r10.d
            itu r3 = r10.e
            iuh r4 = r10.f
            java.util.List r1 = r1.a
            java.util.ArrayList r8 = new java.util.ArrayList
            r9 = 10
            int r2 = defpackage.ske.bq(r1, r9)
            r8.<init>(r2)
            java.util.Iterator r1 = r1.iterator()
        L30:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L4d
            java.lang.Object r2 = r1.next()
            r5 = r2
            iue r5 = (defpackage.iue) r5
            itq r2 = new itq
            r6 = 0
            r7 = 0
            r2.<init>(r3, r4, r5, r6, r7)
            r5 = 3
            unj r2 = defpackage.ukc.A(r11, r6, r2, r5)
            r8.add(r2)
            goto L30
        L4d:
            java.util.ArrayList r11 = new java.util.ArrayList
            int r1 = defpackage.ske.bq(r8, r9)
            r11.<init>(r1)
            java.util.Iterator r1 = r8.iterator()
            r2 = r1
            r1 = r11
        L5c:
            boolean r11 = r2.hasNext()
            if (r11 == 0) goto L84
            java.lang.Object r11 = r2.next()
            unj r11 = (defpackage.unj) r11
            r10.g = r1     // Catch: java.util.concurrent.CancellationException -> L7c
            r10.a = r2     // Catch: java.util.concurrent.CancellationException -> L7c
            r10.b = r1     // Catch: java.util.concurrent.CancellationException -> L7c
            r3 = 1
            r10.c = r3     // Catch: java.util.concurrent.CancellationException -> L7c
            java.lang.Object r11 = r11.k(r10)     // Catch: java.util.concurrent.CancellationException -> L7c
            if (r11 == r0) goto L7b
            r3 = r1
        L78:
            java.util.List r11 = (java.util.List) r11     // Catch: java.util.concurrent.CancellationException -> L7d
            goto L7f
        L7b:
            return r0
        L7c:
            r3 = r1
        L7d:
            ufw r11 = defpackage.ufw.a
        L7f:
            r1.add(r11)
            r1 = r3
            goto L5c
        L84:
            java.util.List r1 = (java.util.List) r1
            r1.getClass()
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r11 = r1.iterator()
        L92:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto La2
            java.lang.Object r0 = r11.next()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            defpackage.ske.bT(r10, r0)
            goto L92
        La2:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.itr.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.uhn
    public final uhb c(Object obj, uhb uhbVar) {
        itr itrVar = new itr(this.d, this.e, this.f, uhbVar);
        itrVar.g = obj;
        return itrVar;
    }
}
