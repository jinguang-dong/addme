package defpackage;

import androidx.wear.ambient.AmbientDelegate;
import androidx.wear.ambient.AmbientMode;
import androidx.wear.ambient.SharedLibraryVersion;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dme implements ajd {
    public static final bgb l = bdq.q(new aud(3), new axa(12));
    public final azr a;
    public float b;
    public final azr c;
    public final azr d;
    public final azr e;
    public int f;
    public boolean g;
    public final bti h;
    public final dkj i;
    public final dmn j;
    public final dkn k;
    public bvm m;
    public final AmbientMode.AmbientController n;
    public final AmbientDelegate o;
    private final ajd p;
    private final bbd q;
    private final bbd r;

    public dme() {
        this(0, 0, new dkn(null));
    }

    public static /* synthetic */ void l(dme dmeVar, int i) {
        dmeVar.h(i);
        dmeVar.i(0);
        dmeVar.f = Integer.MIN_VALUE;
        bvm bvmVar = dmeVar.m;
        if (bvmVar != null) {
            bvmVar.B();
        }
        dmeVar.j(SharedLibraryVersion.a(dmeVar.f()));
    }

    @Override // defpackage.ajd
    public final float a(float f) {
        return this.p.a(f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005e, code lost:
    
        if (r5.b(r6, r7, r0) == r1) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r5v1, types: [ajd] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, uiu] */
    /* JADX WARN: Type inference failed for: r7v1, types: [uiu] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object] */
    @Override // defpackage.ajd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(defpackage.afs r6, defpackage.uiu r7, defpackage.uhb r8) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.dmc
            if (r0 == 0) goto L13
            r0 = r8
            dmc r0 = (defpackage.dmc) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            dmc r0 = new dmc
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.b
            uhi r1 = defpackage.uhi.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.rnt.aN(r8)
            goto L61
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            java.lang.Object r7 = r0.a
            afs r6 = r0.e
            defpackage.rnt.aN(r8)
            goto L51
        L3a:
            defpackage.rnt.aN(r8)
            dkj r8 = r5.i
            r0.e = r6
            r0.a = r7
            r0.d = r4
            umr r8 = r8.a
            java.lang.Object r8 = r8.z(r0)
            if (r8 == r1) goto L4f
            ufg r8 = defpackage.ufg.a
        L4f:
            if (r8 == r1) goto L64
        L51:
            ajd r5 = r5.p
            r8 = 0
            r0.e = r8
            r0.a = r8
            r0.d = r3
            java.lang.Object r5 = r5.b(r6, r7, r0)
            if (r5 != r1) goto L61
            goto L64
        L61:
            ufg r5 = defpackage.ufg.a
            return r5
        L64:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dme.b(afs, uiu, uhb):java.lang.Object");
    }

    @Override // defpackage.ajd
    public final boolean c() {
        return ((Boolean) this.d.a()).booleanValue();
    }

    @Override // defpackage.ajd
    public final boolean d() {
        return ((Boolean) this.c.a()).booleanValue();
    }

    @Override // defpackage.ajd
    public final boolean e() {
        return this.p.e();
    }

    public final int f() {
        return this.q.e();
    }

    public final int g() {
        return this.r.e();
    }

    public final void h(int i) {
        this.q.h(i);
    }

    public final void i(int i) {
        this.r.h(i);
    }

    public final void j(ukv ukvVar) {
        this.e.b(ukvVar);
    }

    public final dlq k() {
        return (dlq) this.a.a();
    }

    public dme(int i, int i2) {
        this(i, i2, new dkn(null));
    }

    public dme(int i, int i2, dkn dknVar) {
        this.k = dknVar;
        this.a = new azz(dmg.a, bap.b);
        bap bapVar = bap.c;
        this.c = new azz(false, bapVar);
        this.d = new azz(false, bapVar);
        this.q = new azw(i);
        this.r = new azw(i2);
        this.e = new azz(SharedLibraryVersion.a(i), bapVar);
        this.f = Integer.MIN_VALUE;
        this.g = true;
        this.h = new dmb(this);
        this.o = new AmbientDelegate(new dlz(this, 0));
        this.n = new AmbientMode.AmbientController(this);
        this.i = new dkj();
        this.j = new dmn();
        this.p = new ags(new dlz(this, 2));
    }
}
