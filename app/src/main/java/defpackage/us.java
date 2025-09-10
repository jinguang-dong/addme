package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class us {
    public final String a;
    public final wb b;
    public final und c;
    public boolean e;
    public uq f;
    public final urk g;
    public uol h;
    public vj i;
    private final usr k;
    private byi l;
    private final int j = ur.a.b();
    public final Object d = new Object();

    public us(String str, wb wbVar, und undVar) {
        this.a = str;
        this.b = wbVar;
        this.c = undVar;
        usr usrVarE = usy.e(1, 3, 0, 4);
        this.k = usrVarE;
        this.g = urn.a(usrVarE);
        th thVar = th.a;
        this.l = thVar;
        if (!usrVarE.d(thVar)) {
            throw new IllegalStateException("Check failed.");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0022 A[Catch: all -> 0x005b, TryCatch #2 {, blocks: (B:4:0x0003, B:9:0x000a, B:11:0x0013, B:12:0x0015, B:14:0x0018, B:18:0x001c, B:19:0x001d, B:20:0x001e, B:22:0x0022, B:23:0x0025, B:25:0x0029, B:26:0x002c, B:27:0x002e, B:29:0x0031, B:30:0x0032, B:32:0x0036, B:34:0x003a, B:35:0x0043, B:40:0x0059, B:41:0x005a, B:28:0x002f, B:13:0x0016), top: B:50:0x0003, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0029 A[Catch: all -> 0x005b, TryCatch #2 {, blocks: (B:4:0x0003, B:9:0x000a, B:11:0x0013, B:12:0x0015, B:14:0x0018, B:18:0x001c, B:19:0x001d, B:20:0x001e, B:22:0x0022, B:23:0x0025, B:25:0x0029, B:26:0x002c, B:27:0x002e, B:29:0x0031, B:30:0x0032, B:32:0x0036, B:34:0x003a, B:35:0x0043, B:40:0x0059, B:41:0x005a, B:28:0x002f, B:13:0x0016), top: B:50:0x0003, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x002f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(defpackage.pk r13) {
        /*
            r12 = this;
            java.lang.Object r1 = r12.d
            monitor-enter(r1)
            boolean r0 = r12.e     // Catch: java.lang.Throwable -> L5b
            if (r0 == 0) goto L9
            monitor-exit(r1)
            return
        L9:
            r0 = 1
            r12.e = r0     // Catch: java.lang.Throwable -> L5b
            r12.toString()     // Catch: java.lang.Throwable -> L5b
            uq r2 = r12.f     // Catch: java.lang.Throwable -> L5b
            if (r2 == 0) goto L1e
            java.lang.Object r3 = r2.a     // Catch: java.lang.Throwable -> L5b
            monitor-enter(r3)     // Catch: java.lang.Throwable -> L5b
            r2.b = r0     // Catch: java.lang.Throwable -> L1a
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L5b
            goto L1e
        L1a:
            r0 = move-exception
            r12 = r0
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L5b
            throw r12     // Catch: java.lang.Throwable -> L5b
        L1e:
            uol r0 = r12.h     // Catch: java.lang.Throwable -> L5b
            if (r0 == 0) goto L25
            defpackage.ujp.Z(r0)     // Catch: java.lang.Throwable -> L5b
        L25:
            vj r0 = r12.i     // Catch: java.lang.Throwable -> L5b
            if (r0 == 0) goto L2c
            r0.b()     // Catch: java.lang.Throwable -> L5b
        L2c:
            java.lang.Object r2 = r12.d     // Catch: java.lang.Throwable -> L5b
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L5b
            byi r0 = r12.l     // Catch: java.lang.Throwable -> L57
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L5b
            boolean r2 = r0 instanceof defpackage.tc     // Catch: java.lang.Throwable -> L5b
            if (r2 != 0) goto L55
            boolean r0 = r0 instanceof defpackage.td     // Catch: java.lang.Throwable -> L5b
            if (r0 != 0) goto L43
            td r0 = new td     // Catch: java.lang.Throwable -> L5b
            r2 = 0
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L5b
            r12.b(r0)     // Catch: java.lang.Throwable -> L5b
        L43:
            tc r2 = new tc     // Catch: java.lang.Throwable -> L5b
            java.lang.String r3 = r12.a     // Catch: java.lang.Throwable -> L5b
            r9 = 0
            r10 = 0
            r4 = 2
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r11 = r13
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L5b
            r12.b(r2)     // Catch: java.lang.Throwable -> L5b
        L55:
            monitor-exit(r1)
            return
        L57:
            r0 = move-exception
            r12 = r0
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L5b
            throw r12     // Catch: java.lang.Throwable -> L5b
        L5b:
            r0 = move-exception
            r12 = r0
            monitor-exit(r1)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.us.a(pk):void");
    }

    public final void b(byi byiVar) {
        this.l = byiVar;
        if (!this.k.d(byiVar)) {
            throw new IllegalStateException(a.bC(this, byiVar, "Failed to emit ", " in "));
        }
    }

    public final String toString() {
        return "VirtualCamera-" + this.j;
    }
}
