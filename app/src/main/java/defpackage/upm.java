package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class upm extends uvz implements Runnable {
    public final long b;

    public upm(long j, uhb uhbVar) {
        super(uhbVar.q(), uhbVar);
        this.b = j;
    }

    @Override // defpackage.umd, defpackage.uov
    public final String fS() {
        return super.fS() + "(timeMillis=" + this.b + ")";
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() throws java.lang.Throwable {
        /*
            r5 = this;
            uhf r0 = r5.a
            unk r0 = defpackage.ung.f(r0)
            boolean r1 = r0 instanceof defpackage.unm
            if (r1 == 0) goto Ld
            unm r0 = (defpackage.unm) r0
            goto Le
        Ld:
            r0 = 0
        Le:
            long r1 = r5.b
            if (r0 == 0) goto L1f
            long r3 = defpackage.uls.a
            ulu r3 = defpackage.ulu.c
            defpackage.ujp.k(r1, r3)
            java.lang.String r0 = r0.a()
            if (r0 != 0) goto L27
        L1f:
            java.lang.String r0 = "Timed out waiting for "
            java.lang.String r3 = " ms"
            java.lang.String r0 = defpackage.mn.b(r1, r0, r3)
        L27:
            upl r1 = new upl
            r1.<init>(r0, r5)
            r5.L(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.upm.run():void");
    }
}
