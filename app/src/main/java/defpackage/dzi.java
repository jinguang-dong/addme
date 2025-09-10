package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class dzi implements Runnable {
    private final dzj a;

    public dzi(dzj dzjVar) {
        this.a = dzjVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x006b A[Catch: all -> 0x007b, TryCatch #2 {, blocks: (B:4:0x000b, B:6:0x000f, B:8:0x0026, B:9:0x002a, B:10:0x0031, B:11:0x0032, B:12:0x003a, B:16:0x0044, B:18:0x004c, B:19:0x0051, B:23:0x005d, B:25:0x0064, B:33:0x0076, B:29:0x006a, B:30:0x006b, B:32:0x0073, B:37:0x007a, B:20:0x0052, B:21:0x005a, B:13:0x003b, B:14:0x0041), top: B:45:0x000b, inners: #0, #1 }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            r4 = this;
            defpackage.dwj.b()
            defpackage.dzj.e()
            dzj r4 = r4.a
            java.util.List r0 = r4.g
            monitor-enter(r0)
            android.content.Intent r1 = r4.h     // Catch: java.lang.Throwable -> L7b
            if (r1 == 0) goto L32
            defpackage.dwj.b()     // Catch: java.lang.Throwable -> L7b
            android.content.Intent r1 = r4.h     // Catch: java.lang.Throwable -> L7b
            java.util.Objects.toString(r1)     // Catch: java.lang.Throwable -> L7b
            r1 = 0
            java.lang.Object r1 = r0.remove(r1)     // Catch: java.lang.Throwable -> L7b
            android.content.Intent r1 = (android.content.Intent) r1     // Catch: java.lang.Throwable -> L7b
            android.content.Intent r2 = r4.h     // Catch: java.lang.Throwable -> L7b
            boolean r1 = r1.equals(r2)     // Catch: java.lang.Throwable -> L7b
            if (r1 == 0) goto L2a
            r1 = 0
            r4.h = r1     // Catch: java.lang.Throwable -> L7b
            goto L32
        L2a:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L7b
            java.lang.String r1 = "Dequeue-d command is not the first."
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L7b
            throw r4     // Catch: java.lang.Throwable -> L7b
        L32:
            gga r1 = r4.k     // Catch: java.lang.Throwable -> L7b
            java.lang.Object r1 = r1.b     // Catch: java.lang.Throwable -> L7b
            dza r2 = r4.f     // Catch: java.lang.Throwable -> L7b
            java.lang.Object r3 = r2.d     // Catch: java.lang.Throwable -> L7b
            monitor-enter(r3)     // Catch: java.lang.Throwable -> L7b
            java.util.Map r2 = r2.c     // Catch: java.lang.Throwable -> L78
            boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> L78
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L78
            if (r2 == 0) goto L6b
            java.util.List r2 = r4.g     // Catch: java.lang.Throwable -> L7b
            boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> L7b
            if (r2 == 0) goto L6b
            r2 = r1
            edb r2 = (defpackage.edb) r2     // Catch: java.lang.Throwable -> L7b
            java.lang.Object r2 = r2.b     // Catch: java.lang.Throwable -> L7b
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L7b
            edb r1 = (defpackage.edb) r1     // Catch: java.lang.Throwable -> L68
            java.util.ArrayDeque r1 = r1.a     // Catch: java.lang.Throwable -> L68
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L68
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L68
            if (r1 == 0) goto L6b
            defpackage.dwj.b()     // Catch: java.lang.Throwable -> L7b
            dzh r4 = r4.i     // Catch: java.lang.Throwable -> L7b
            if (r4 == 0) goto L76
            r4.a()     // Catch: java.lang.Throwable -> L7b
            goto L76
        L68:
            r4 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L68
            throw r4     // Catch: java.lang.Throwable -> L7b
        L6b:
            java.util.List r1 = r4.g     // Catch: java.lang.Throwable -> L7b
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L7b
            if (r1 != 0) goto L76
            r4.c()     // Catch: java.lang.Throwable -> L7b
        L76:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7b
            return
        L78:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L78
            throw r4     // Catch: java.lang.Throwable -> L7b
        L7b:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7b
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dzi.run():void");
    }
}
