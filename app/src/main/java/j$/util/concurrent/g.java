package j$.util.concurrent;

/* loaded from: classes3.dex */
public final class g extends k {
    public final k[] e;

    public g(k[] kVarArr) {
        super(-1, null, null);
        this.e = kVarArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x001f, code lost:
    
        return r0;
     */
    @Override // j$.util.concurrent.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final j$.util.concurrent.k a(int r4, java.lang.Object r5) {
        /*
            r3 = this;
            j$.util.concurrent.k[] r0 = r3.e
        L2:
            int r1 = r0.length
            if (r1 == 0) goto L34
            int r1 = r1 + (-1)
            r1 = r1 & r4
            j$.util.concurrent.k r0 = j$.util.concurrent.ConcurrentHashMap.k(r0, r1)
            if (r0 != 0) goto Lf
            goto L34
        Lf:
            int r1 = r0.a
            if (r1 != r4) goto L20
            java.lang.Object r2 = r0.b
            if (r2 == r5) goto L1f
            if (r2 == 0) goto L20
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L20
        L1f:
            return r0
        L20:
            if (r1 >= 0) goto L30
            boolean r1 = r0 instanceof j$.util.concurrent.g
            if (r1 == 0) goto L2b
            j$.util.concurrent.g r0 = (j$.util.concurrent.g) r0
            j$.util.concurrent.k[] r0 = r0.e
            goto L2
        L2b:
            j$.util.concurrent.k r4 = r0.a(r4, r5)
            return r4
        L30:
            j$.util.concurrent.k r0 = r0.d
            if (r0 != 0) goto Lf
        L34:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.g.a(int, java.lang.Object):j$.util.concurrent.k");
    }
}
