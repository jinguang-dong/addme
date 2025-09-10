package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class idu implements idt {
    private final nkw a;
    private final uem b;
    private final boolean c;
    private final boolean d;
    private final boolean e;
    private final kgw f;

    /* JADX WARN: Removed duplicated region for block: B:33:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public idu(defpackage.hbj r4, defpackage.kgw r5, defpackage.nkw r6, boolean r7, defpackage.lkk r8, defpackage.uem r9) {
        /*
            r3 = this;
            r3.<init>()
            r3.a = r6
            r3.f = r5
            r3.b = r9
            r9 = 1
            r0 = 0
            if (r7 != 0) goto L33
            lkk r1 = defpackage.lkk.AUTO
            boolean r1 = r8.equals(r1)
            if (r1 == 0) goto L33
            nkw r1 = defpackage.nkw.PHOTO
            if (r6 != r1) goto L33
            pka r1 = r5.l()
            pka r2 = defpackage.pka.BACK
            if (r1 != r2) goto L33
            gzg r1 = defpackage.gzc.j
            boolean r1 = r4.p(r1)
            if (r1 == 0) goto L33
            gzg r1 = defpackage.gzo.aU
            boolean r1 = r4.p(r1)
            if (r1 == 0) goto L33
            r1 = r9
            goto L34
        L33:
            r1 = r0
        L34:
            r3.c = r1
            if (r7 != 0) goto La4
            lkk r1 = defpackage.lkk.AUTO
            boolean r8 = r8.equals(r1)
            if (r8 == 0) goto La4
            gzg r8 = defpackage.gzc.F
            java.lang.String r8 = r4.f(r8)
            if (r8 != 0) goto L4b
            sfd r8 = defpackage.sfd.a
            goto L84
        L4b:
            java.lang.String r1 = ","
            rwr r1 = defpackage.rwr.c(r1)
            java.lang.Iterable r8 = r1.d(r8)
            j$.util.Spliterator r8 = j$.lang.Iterable$EL.spliterator(r8)
            j$.util.stream.Stream r8 = j$.util.stream.StreamSupport.stream(r8, r0)
            hci r1 = new hci
            r2 = 7
            r1.<init>(r2)
            j$.util.stream.Stream r8 = r8.map(r1)
            hsj r1 = new hsj
            r2 = 2
            r1.<init>(r2)
            j$.util.stream.Stream r8 = r8.filter(r1)
            hci r1 = new hci
            r2 = 8
            r1.<init>(r2)
            j$.util.stream.Stream r8 = r8.map(r1)
            j$.util.stream.Collector r1 = defpackage.ryv.b
            java.lang.Object r8 = r8.collect(r1)
            scn r8 = (defpackage.scn) r8
        L84:
            boolean r8 = r8.contains(r6)
            if (r8 == 0) goto La4
            pka r8 = r5.l()
            pka r1 = defpackage.pka.BACK
            if (r8 != r1) goto La4
            gzg r8 = defpackage.gzc.C
            boolean r8 = r4.p(r8)
            if (r8 == 0) goto La4
            gzg r8 = defpackage.gzo.aU
            boolean r8 = r4.p(r8)
            if (r8 == 0) goto La4
            r8 = r9
            goto La5
        La4:
            r8 = r0
        La5:
            r3.d = r8
            if (r7 != 0) goto Lbe
            nkw r8 = defpackage.nkw.PHOTO
            if (r6 != r8) goto Lbe
            pka r5 = r5.l()
            pka r6 = defpackage.pka.BACK
            if (r5 != r6) goto Lbe
            gzg r5 = defpackage.gzc.k
            boolean r5 = r4.p(r5)
            if (r5 == 0) goto Lbe
            goto Lbf
        Lbe:
            r9 = r0
        Lbf:
            r3.e = r9
            if (r7 == 0) goto Lc5
            java.lang.String r3 = defpackage.gzc.a
        Lc5:
            gzi r3 = defpackage.gzc.h
            j$.util.Optional r3 = r4.a(r3)
            java.lang.Object r3 = r3.get()
            java.lang.Integer r3 = (java.lang.Integer) r3
            r3.intValue()
            gzi r3 = defpackage.gzc.i
            j$.util.Optional r3 = r4.a(r3)
            java.lang.Object r3 = r3.get()
            java.lang.Integer r3 = (java.lang.Integer) r3
            r3.intValue()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.idu.<init>(hbj, kgw, nkw, boolean, lkk, uem):void");
    }

    @Override // defpackage.idt
    public final /* synthetic */ boolean a() {
        return ins.u(this);
    }

    @Override // defpackage.idt
    public final boolean b() {
        return this.c;
    }

    @Override // defpackage.idt
    public final boolean c() {
        return this.e;
    }

    @Override // defpackage.idt
    public final boolean d() {
        return this.a == nkw.PORTRAIT && this.f.l() == pka.BACK && ((Boolean) this.b.a()).booleanValue();
    }

    @Override // defpackage.idt
    public final boolean e() {
        return this.d;
    }

    @Override // defpackage.idt
    public final void f() {
    }
}
