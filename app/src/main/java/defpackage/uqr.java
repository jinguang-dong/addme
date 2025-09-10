package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class uqr extends uvb {
    private final uqi c;
    private final ocq d;

    public uqr(long j, uqr uqrVar, uqi uqiVar, int i) {
        super(j, uqrVar, i);
        this.c = uqiVar;
        int i2 = uqk.b;
        this.d = new ocq(i2 + i2);
    }

    @Override // defpackage.uvb
    public final int a() {
        return uqk.b;
    }

    public final Object b(int i, Object obj) {
        return this.d.x(i + i + 1).a(obj);
    }

    public final Object c(int i) {
        return this.d.x(i + i).a;
    }

    public final Object d(int i) {
        return this.d.x(i + i + 1).a;
    }

    public final Object e(int i) {
        Object objC = c(i);
        g(i);
        return objC;
    }

    public final uqi f() {
        uqi uqiVar = this.c;
        uqiVar.getClass();
        return uqiVar;
    }

    public final void g(int i) {
        i(i, null);
    }

    public final void h(int i, boolean z) {
        if (z) {
            f().t((this.b * uqk.b) + i);
        }
        s();
    }

    public final void i(int i, Object obj) {
        this.d.x(i + i).b(obj);
    }

    public final void j(int i, Object obj) {
        this.d.x(i + i + 1).c(obj);
    }

    public final boolean k(int i, Object obj, Object obj2) {
        return this.d.x(i + i + 1).d(obj, obj2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x004c, code lost:
    
        g(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x004f, code lost:
    
        if (r1 == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0051, code lost:
    
        r4 = f().a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0057, code lost:
    
        if (r4 == null) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0059, code lost:
    
        defpackage.ujk.m(r4, r0, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x005c, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:?, code lost:
    
        return;
     */
    @Override // defpackage.uvb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l(int r5, defpackage.uhf r6) {
        /*
            r4 = this;
            int r0 = defpackage.uqk.b
            if (r5 < r0) goto L6
            r1 = 1
            goto L7
        L6:
            r1 = 0
        L7:
            if (r1 == 0) goto La
            int r5 = r5 - r0
        La:
            java.lang.Object r0 = r4.c(r5)
        Le:
            java.lang.Object r2 = r4.d(r5)
            boolean r3 = r2 instanceof defpackage.upr
            if (r3 != 0) goto L5d
            boolean r3 = r2 instanceof defpackage.urb
            if (r3 == 0) goto L1b
            goto L5d
        L1b:
            uwc r3 = defpackage.uqk.j
            if (r2 == r3) goto L4c
            uwc r3 = defpackage.uqk.k
            if (r2 != r3) goto L24
            goto L4c
        L24:
            uwc r3 = defpackage.uqk.g
            if (r2 == r3) goto Le
            uwc r3 = defpackage.uqk.f
            if (r2 == r3) goto Le
            uwc r4 = defpackage.uqk.i
            if (r2 == r4) goto L7f
            uwc r4 = defpackage.uqk.d
            if (r2 == r4) goto L7f
            uwc r4 = defpackage.uqk.l
            if (r2 != r4) goto L39
            goto L7f
        L39:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.util.Objects.toString(r2)
            java.lang.String r5 = java.lang.String.valueOf(r2)
            java.lang.String r6 = "unexpected state: "
            java.lang.String r5 = r6.concat(r5)
            r4.<init>(r5)
            throw r4
        L4c:
            r4.g(r5)
            if (r1 == 0) goto L7f
            uqi r4 = r4.f()
            uiq r4 = r4.a
            if (r4 == 0) goto L7f
            defpackage.ujk.m(r4, r0, r6)
            return
        L5d:
            if (r1 == 0) goto L62
            uwc r3 = defpackage.uqk.j
            goto L64
        L62:
            uwc r3 = defpackage.uqk.k
        L64:
            boolean r2 = r4.k(r5, r2, r3)
            if (r2 == 0) goto Le
            r4.g(r5)
            r2 = r1 ^ 1
            r4.h(r5, r2)
            if (r1 == 0) goto L7f
            uqi r4 = r4.f()
            uiq r4 = r4.a
            if (r4 == 0) goto L7f
            defpackage.ujk.m(r4, r0, r6)
        L7f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uqr.l(int, uhf):void");
    }
}
