package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
abstract class qze extends qyq implements qyu {
    private volatile int d;
    private qqe e;

    public qze(String str, String str2, qzn qznVar) {
        super(str, str2, qznVar);
        this.d = -1;
    }

    @Override // defpackage.qyu
    public final int a() {
        return this.d;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0065 A[Catch: all -> 0x00ce, TryCatch #1 {, blocks: (B:7:0x0012, B:9:0x0019, B:11:0x002c, B:13:0x0036, B:15:0x0048, B:18:0x005d, B:21:0x0065, B:22:0x006b, B:24:0x0079, B:25:0x008b, B:28:0x009c, B:32:0x00af, B:37:0x00ba, B:39:0x00c0, B:40:0x00c6, B:31:0x00a2, B:42:0x00c8), top: B:50:0x0012, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0079 A[Catch: all -> 0x00ce, TryCatch #1 {, blocks: (B:7:0x0012, B:9:0x0019, B:11:0x002c, B:13:0x0036, B:15:0x0048, B:18:0x005d, B:21:0x0065, B:22:0x006b, B:24:0x0079, B:25:0x008b, B:28:0x009c, B:32:0x00af, B:37:0x00ba, B:39:0x00c0, B:40:0x00c6, B:31:0x00a2, B:42:0x00c8), top: B:50:0x0012, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ba A[Catch: all -> 0x00ce, TryCatch #1 {, blocks: (B:7:0x0012, B:9:0x0019, B:11:0x002c, B:13:0x0036, B:15:0x0048, B:18:0x005d, B:21:0x0065, B:22:0x006b, B:24:0x0079, B:25:0x008b, B:28:0x009c, B:32:0x00af, B:37:0x00ba, B:39:0x00c0, B:40:0x00c6, B:31:0x00a2, B:42:0x00c8), top: B:50:0x0012, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c0 A[Catch: all -> 0x00ce, TryCatch #1 {, blocks: (B:7:0x0012, B:9:0x0019, B:11:0x002c, B:13:0x0036, B:15:0x0048, B:18:0x005d, B:21:0x0065, B:22:0x006b, B:24:0x0079, B:25:0x008b, B:28:0x009c, B:32:0x00af, B:37:0x00ba, B:39:0x00c0, B:40:0x00c6, B:31:0x00a2, B:42:0x00c8), top: B:50:0x0012, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // defpackage.qyq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final java.lang.Object f(defpackage.qxf r10) {
        /*
            r9 = this;
            int r0 = r9.a()
            r1 = -1
            if (r0 == r1) goto L11
            qqe r2 = r9.i()
            int r2 = r2.a()
            if (r0 >= r2) goto Lc9
        L11:
            monitor-enter(r9)
            int r0 = r9.a()     // Catch: java.lang.Throwable -> Lce
            r2 = 0
            if (r0 != r1) goto L2b
            defpackage.qxf.d()     // Catch: java.lang.Throwable -> Lce
            r10.getClass()     // Catch: java.lang.Throwable -> Lce
            qzn r1 = r9.c     // Catch: java.lang.Throwable -> Lce
            qzm r1 = r1.a(r10)     // Catch: java.lang.Throwable -> Lce
            qqe r3 = r1.i     // Catch: java.lang.Throwable -> Lce
            r9.j(r3)     // Catch: java.lang.Throwable -> Lce
            goto L2c
        L2b:
            r1 = r2
        L2c:
            qqe r3 = r9.i()     // Catch: java.lang.Throwable -> Lce
            int r3 = r3.a()     // Catch: java.lang.Throwable -> Lce
            if (r0 >= r3) goto Lc8
            defpackage.qxf.d()     // Catch: java.lang.Throwable -> Lce
            r10.getClass()     // Catch: java.lang.Throwable -> Lce
            android.content.Context r0 = r10.c     // Catch: java.lang.Throwable -> Lce
            rwc r4 = defpackage.qxa.a(r0)     // Catch: java.lang.Throwable -> Lce
            boolean r5 = r4.h()     // Catch: java.lang.Throwable -> Lce
            if (r5 == 0) goto L62
            java.lang.Object r5 = r4.c()     // Catch: java.lang.Throwable -> Lce
            java.lang.String r6 = r9.a     // Catch: java.lang.Throwable -> Lce
            android.net.Uri r6 = defpackage.qxc.a(r6)     // Catch: java.lang.Throwable -> Lce
            java.lang.String r7 = r9.b     // Catch: java.lang.Throwable -> Lce
            qaq r5 = (defpackage.qaq) r5     // Catch: java.lang.Throwable -> Lce
            java.lang.String r5 = r5.l(r6, r2, r7)     // Catch: java.lang.Throwable -> Lce
            if (r5 != 0) goto L5d
            goto L62
        L5d:
            java.lang.Object r5 = r9.ft(r5)     // Catch: java.lang.Throwable -> Lce
            goto L63
        L62:
            r5 = r2
        L63:
            if (r1 != 0) goto L6b
            qzn r1 = r9.c     // Catch: java.lang.Throwable -> Lce
            qzm r1 = r1.a(r10)     // Catch: java.lang.Throwable -> Lce
        L6b:
            java.lang.String r6 = r1.c     // Catch: java.lang.Throwable -> Lce
            java.lang.String r0 = r0.getPackageName()     // Catch: java.lang.Throwable -> Lce
            java.lang.String r7 = "com.android.vending"
            boolean r0 = r0.equals(r7)     // Catch: java.lang.Throwable -> Lce
            if (r0 != 0) goto L8b
            syx r0 = r10.b()     // Catch: java.lang.Throwable -> Lce
            ovw r7 = new ovw     // Catch: java.lang.Throwable -> Lce
            r8 = 17
            r7.<init>(r10, r6, r8)     // Catch: java.lang.Throwable -> Lce
            syu r10 = r0.submit(r7)     // Catch: java.lang.Throwable -> Lce
            defpackage.qpt.ah(r10)     // Catch: java.lang.Throwable -> Lce
        L8b:
            uwt r10 = r1.d()     // Catch: java.lang.Throwable -> Lce
            java.lang.Object r10 = r10.d     // Catch: java.lang.Throwable -> Lce
            java.lang.String r0 = r9.b     // Catch: java.lang.Throwable -> Lce
            sbv r10 = (defpackage.sbv) r10     // Catch: java.lang.Throwable -> Lce
            java.lang.Object r10 = r10.get(r0)     // Catch: java.lang.Throwable -> Lce
            if (r10 != 0) goto L9c
            goto Laf
        L9c:
            java.lang.Object r2 = r9.b(r10)     // Catch: java.lang.Throwable -> La1 java.lang.Throwable -> Lce
            goto Laf
        La1:
            r10 = move-exception
            java.lang.String r0 = r9.b     // Catch: java.lang.Throwable -> Lce
            java.lang.String r1 = "Invalid Phenotype flag value for flag "
            java.lang.String r0 = r1.concat(r0)     // Catch: java.lang.Throwable -> Lce
            java.lang.String r1 = "FilePhenotypeFlags"
            android.util.Log.e(r1, r0, r10)     // Catch: java.lang.Throwable -> Lce
        Laf:
            boolean r10 = r4.h()     // Catch: java.lang.Throwable -> Lce
            r0 = 1
            if (r0 != r10) goto Lb7
            goto Lb8
        Lb7:
            r5 = r2
        Lb8:
            if (r5 != 0) goto Lbe
            java.lang.Object r5 = r9.e()     // Catch: java.lang.Throwable -> Lce
        Lbe:
            if (r5 == 0) goto Lc6
            r9.g(r5)     // Catch: java.lang.Throwable -> Lce
            r9.h(r3)     // Catch: java.lang.Throwable -> Lce
        Lc6:
            monitor-exit(r9)     // Catch: java.lang.Throwable -> Lce
            return r5
        Lc8:
            monitor-exit(r9)     // Catch: java.lang.Throwable -> Lce
        Lc9:
            java.lang.Object r9 = r9.d()
            return r9
        Lce:
            r10 = move-exception
            monitor-exit(r9)     // Catch: java.lang.Throwable -> Lce
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qze.f(qxf):java.lang.Object");
    }

    @Override // defpackage.qyu
    public final void h(int i) {
        this.d = i;
    }

    @Override // defpackage.qyu
    public final qqe i() {
        return this.e;
    }

    @Override // defpackage.qyu
    public final void j(qqe qqeVar) {
        this.e = qqeVar;
    }
}
