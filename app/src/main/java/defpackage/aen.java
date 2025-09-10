package defpackage;

import android.view.KeyEvent;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class aen extends bup implements bww, bov, bwx, bxd, bun, bwm {
    public static final byi i = new byi();
    private final afg A;
    private buo B;
    private long C;
    private boolean D;
    private final Object E;
    private ocq F;
    public boolean a;
    public uif b;
    public afr c;
    public akd d;
    public ajz e;
    public bql f;
    public final yx g;
    public ocq h;
    private afr j;
    private boolean k;
    private String l;
    private cbk z;

    public aen(ocq ocqVar, afr afrVar, boolean z, boolean z2, String str, cbk cbkVar, uif uifVar) {
        this.h = ocqVar;
        this.j = afrVar;
        this.k = z;
        this.l = str;
        this.z = cbkVar;
        this.a = z2;
        this.b = uifVar;
        this.A = new afg(this.h, new aek(this, 0));
        int i2 = yy.a;
        this.g = new yx((byte[]) null);
        this.C = 0L;
        this.F = this.h;
        this.D = A();
        this.E = i;
    }

    private final boolean A() {
        return this.F == null;
    }

    public abstract Object a(bqc bqcVar, uhb uhbVar);

    @Override // defpackage.bij
    public final void cW() {
        k();
        if (!this.D) {
            e();
        }
        if (this.a) {
            M(this.A);
        }
    }

    @Override // defpackage.bww
    public final void cX() {
        ajz ajzVar;
        ocq ocqVar = this.h;
        if (ocqVar != null && (ajzVar = this.e) != null) {
            ocqVar.aF(new aka(ajzVar));
        }
        this.e = null;
        bql bqlVar = this.f;
        if (bqlVar != null) {
            bqlVar.cX();
        }
    }

    @Override // defpackage.bij
    public final /* synthetic */ void cY() {
        amo.i(this);
    }

    @Override // defpackage.bij
    public final void cZ() {
        d();
        if (this.F == null) {
            this.h = null;
        }
        buo buoVar = this.B;
        if (buoVar != null) {
            L(buoVar);
        }
        this.B = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void d() {
        /*
            r17 = this;
            r0 = r17
            ocq r1 = r0.h
            if (r1 == 0) goto L6a
            akd r2 = r0.d
            if (r2 == 0) goto L12
            akc r3 = new akc
            r3.<init>(r2)
            r1.aF(r3)
        L12:
            ajz r2 = r0.e
            if (r2 == 0) goto L1e
            aka r3 = new aka
            r3.<init>(r2)
            r1.aF(r3)
        L1e:
            yx r2 = r0.g
            java.lang.Object[] r3 = r2.c
            long[] r2 = r2.a
            int r4 = r2.length
            int r4 = r4 + (-2)
            if (r4 < 0) goto L6a
            r5 = 0
            r6 = r5
        L2b:
            r7 = r2[r6]
            long r9 = ~r7
            r11 = 7
            long r9 = r9 << r11
            long r9 = r9 & r7
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r11
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 == 0) goto L65
            int r9 = r6 - r4
            r10 = r5
        L3e:
            int r11 = ~r9
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            if (r10 >= r11) goto L63
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r7
            r15 = 128(0x80, double:6.3E-322)
            int r11 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r11 >= 0) goto L5f
            int r11 = r6 << 3
            int r11 = r11 + r10
            r11 = r3[r11]
            akd r11 = (defpackage.akd) r11
            akc r13 = new akc
            r13.<init>(r11)
            r1.aF(r13)
        L5f:
            long r7 = r7 >> r12
            int r10 = r10 + 1
            goto L3e
        L63:
            if (r11 != r12) goto L6a
        L65:
            if (r6 == r4) goto L6a
            int r6 = r6 + 1
            goto L2b
        L6a:
            r1 = 0
            r0.d = r1
            r0.e = r1
            yx r0 = r0.g
            r0.d()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aen.d():void");
    }

    @Override // defpackage.bij
    public final boolean db() {
        return false;
    }

    @Override // defpackage.bxd
    public final Object dc() {
        return this.E;
    }

    public final void e() {
        if (this.B != null) {
            return;
        }
        afr afrVar = this.k ? this.c : this.j;
        if (afrVar != null) {
            if (this.h == null) {
                this.h = new ocq((char[]) null, (byte[]) null, (byte[]) null, (byte[]) null);
            }
            this.A.l(this.h);
            ocq ocqVar = this.h;
            ocqVar.getClass();
            buo buoVarB = afrVar.b(ocqVar);
            M(buoVarB);
            this.B = buoVarB;
        }
    }

    @Override // defpackage.bwm
    public final void k() {
        if (this.k) {
            amo.k(this, new aei(this, 0));
        }
    }

    @Override // defpackage.bww
    public final /* synthetic */ void l() {
        amo.j(this);
    }

    public final void m() {
        buo buoVar = this.B;
        if (buoVar == null && this.D) {
            return;
        }
        if (buoVar != null) {
            L(buoVar);
        }
        this.B = null;
        e();
    }

    @Override // defpackage.bwx
    public final /* synthetic */ boolean o() {
        return false;
    }

    @Override // defpackage.bwx
    public final boolean p() {
        return true;
    }

    @Override // defpackage.bov
    public final boolean q(KeyEvent keyEvent) {
        boolean z;
        e();
        long jG = akg.G(keyEvent);
        if (this.a && a.p(akg.F(keyEvent), 2) && byi.aQ(keyEvent)) {
            yx yxVar = this.g;
            if (yxVar.b(jG)) {
                z = false;
            } else {
                akd akdVar = new akd(this.C);
                yxVar.e(jG, akdVar);
                if (this.h != null) {
                    ukc.C(C(), null, 0, new aej(this, akdVar, (uhb) null, 4, (byte[]) null), 3);
                }
                z = true;
            }
            w(keyEvent);
            return z;
        }
        if (!this.a || !a.p(akg.F(keyEvent), 1) || !byi.aQ(keyEvent)) {
            return false;
        }
        akd akdVar2 = (akd) this.g.c(jG);
        if (akdVar2 != null) {
            if (this.h != null) {
                ukc.C(C(), null, 0, new aej(this, akdVar2, (uhb) null, 5, (char[]) null), 3);
            }
            t(keyEvent);
        }
        return akdVar2 != null;
    }

    protected final Object r(ail ailVar, long j, uhb uhbVar) {
        Object objI;
        ocq ocqVar = this.h;
        return (ocqVar == null || (objI = ung.i(new aem(ailVar, j, ocqVar, this, null), uhbVar)) != uhi.a) ? ufg.a : objI;
    }

    @Override // defpackage.bwx
    public final void s(cbn cbnVar) {
        cbk cbkVar = this.z;
        if (cbkVar != null) {
            cbw.g(cbnVar, cbkVar.a);
        }
        String str = this.l;
        ne neVar = new ne(this, 18);
        uld[] uldVarArr = cbw.a;
        cbnVar.e(cbm.b, new cbc(str, neVar));
        if (this.a) {
            this.A.s(cbnVar);
        } else {
            cbnVar.e(cbu.i, ufg.a);
        }
    }

    protected abstract void t(KeyEvent keyEvent);

    @Override // defpackage.bww
    public final void u(bpp bppVar, int i2, long j) {
        long j2 = (((j << 32) >> 33) & 4294967295L) | ((j >> 33) << 32);
        this.C = (Float.floatToRawIntBits(chy.b(j2)) & 4294967295L) | (Float.floatToRawIntBits(chy.a(j2)) << 32);
        e();
        if (this.a && i2 == 2) {
            int i3 = bppVar.d;
            if (a.p(i3, 4)) {
                ukc.C(C(), null, 0, new vl(this, (uhb) null, 2), 3);
            } else if (a.p(i3, 5)) {
                ukc.C(C(), null, 0, new vl(this, (uhb) null, 3, (byte[]) null), 3);
            }
            i2 = 2;
        }
        if (this.f == null) {
            ahi ahiVar = new ahi(this, 1);
            bpp bppVar2 = bqh.a;
            bql bqlVar = new bql(null, null, ahiVar);
            M(bqlVar);
            this.f = bqlVar;
        }
        bql bqlVar2 = this.f;
        if (bqlVar2 != null) {
            bqlVar2.u(bppVar, i2, j);
        }
    }

    protected abstract void w(KeyEvent keyEvent);

    /* JADX WARN: Removed duplicated region for block: B:34:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void z(defpackage.ocq r3, defpackage.afr r4, boolean r5, boolean r6, java.lang.String r7, defpackage.cbk r8, defpackage.uif r9) {
        /*
            r2 = this;
            ocq r0 = r2.F
            boolean r0 = defpackage.a.ao(r0, r3)
            r1 = 1
            if (r0 != 0) goto L12
            r2.d()
            r2.F = r3
            r2.h = r3
            r3 = r1
            goto L13
        L12:
            r3 = 0
        L13:
            afr r0 = r2.j
            boolean r0 = defpackage.a.ao(r0, r4)
            if (r0 != 0) goto L1e
            r2.j = r4
            r3 = r1
        L1e:
            boolean r4 = r2.k
            if (r4 == r5) goto L2a
            r2.k = r5
            if (r5 == 0) goto L2b
            r2.k()
            goto L2b
        L2a:
            r1 = r3
        L2b:
            boolean r3 = r2.a
            if (r3 == r6) goto L44
            if (r6 == 0) goto L37
            afg r3 = r2.A
            r2.M(r3)
            goto L3f
        L37:
            afg r3 = r2.A
            r2.L(r3)
            r2.d()
        L3f:
            defpackage.bad.D(r2)
            r2.a = r6
        L44:
            java.lang.String r3 = r2.l
            boolean r3 = defpackage.a.ao(r3, r7)
            if (r3 != 0) goto L51
            r2.l = r7
            defpackage.bad.D(r2)
        L51:
            cbk r3 = r2.z
            boolean r3 = defpackage.a.ao(r3, r8)
            if (r3 != 0) goto L5e
            r2.z = r8
            defpackage.bad.D(r2)
        L5e:
            r2.b = r9
            boolean r3 = r2.D
            boolean r4 = r2.A()
            if (r3 == r4) goto L75
            boolean r3 = r2.A()
            r2.D = r3
            if (r3 != 0) goto L75
            buo r3 = r2.B
            if (r3 != 0) goto L75
            goto L77
        L75:
            if (r1 == 0) goto L7a
        L77:
            r2.m()
        L7a:
            afg r3 = r2.A
            ocq r2 = r2.h
            r3.l(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aen.z(ocq, afr, boolean, boolean, java.lang.String, cbk, uif):void");
    }

    protected void f() {
    }

    @Override // defpackage.bww
    public final /* synthetic */ void v() {
    }

    @Override // defpackage.bov
    public final void x() {
    }

    @Override // defpackage.bww
    public final /* synthetic */ void y() {
    }
}
