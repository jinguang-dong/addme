package defpackage;

import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class arb extends bij implements bve, buu, bwx {
    private aqt A;
    private uiq B;
    public ccm a;
    public cdo b;
    public int c;
    public boolean d;
    public int e;
    public int f;
    public bkx g;
    public uiq h;
    public ara i;
    public qqq j;
    private uiq k;
    private List l;
    private uiq x;
    private aqw y;
    private Map z;

    public /* synthetic */ arb(ccm ccmVar, cdo cdoVar, qqq qqqVar, uiq uiqVar, int i, boolean z, int i2, int i3, List list, uiq uiqVar2, aqw aqwVar, bkx bkxVar, uiq uiqVar3) {
        this.a = ccmVar;
        this.b = cdoVar;
        this.j = qqqVar;
        this.k = uiqVar;
        this.c = i;
        this.d = z;
        this.e = i2;
        this.f = i3;
        this.l = list;
        this.x = uiqVar2;
        this.y = aqwVar;
        this.g = bkxVar;
        this.h = uiqVar3;
    }

    private final aqt v(chq chqVar) {
        aqt aqtVar;
        ara araVar = this.i;
        if (araVar != null && araVar.c && (aqtVar = araVar.d) != null) {
            aqtVar.g(chqVar);
            return aqtVar;
        }
        aqt aqtVarH = h();
        aqtVarH.g(chqVar);
        return aqtVarH;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x008a A[Catch: all -> 0x0117, TryCatch #0 {all -> 0x0117, blocks: (B:3:0x0005, B:26:0x0072, B:28:0x007d, B:30:0x008a, B:32:0x0091, B:33:0x0094, B:35:0x0098, B:37:0x009e, B:39:0x00ac, B:40:0x00b1, B:41:0x00ba, B:43:0x00be, B:44:0x00c4, B:45:0x00e4, B:47:0x00e8, B:48:0x00ed, B:6:0x0018, B:8:0x0022, B:10:0x0028, B:22:0x0055, B:25:0x0066, B:13:0x0031, B:15:0x003b, B:17:0x0045, B:19:0x0050), top: B:54:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e8 A[Catch: all -> 0x0117, TryCatch #0 {all -> 0x0117, blocks: (B:3:0x0005, B:26:0x0072, B:28:0x007d, B:30:0x008a, B:32:0x0091, B:33:0x0094, B:35:0x0098, B:37:0x009e, B:39:0x00ac, B:40:0x00b1, B:41:0x00ba, B:43:0x00be, B:44:0x00c4, B:45:0x00e4, B:47:0x00e8, B:48:0x00ed, B:6:0x0018, B:8:0x0022, B:10:0x0028, B:22:0x0055, B:25:0x0066, B:13:0x0031, B:15:0x003b, B:17:0x0045, B:19:0x0050), top: B:54:0x0005 }] */
    @Override // defpackage.bve
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.bss a(defpackage.bst r9, defpackage.bsq r10, long r11) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.arb.a(bst, bsq, long):bss");
    }

    @Override // defpackage.bve
    public final int c(brv brvVar, bru bruVar, int i) {
        return v(brvVar).a(i, brvVar.m());
    }

    @Override // defpackage.buu
    public final void cS(bvo bvoVar) {
        List list;
        if (!this.w) {
            return;
        }
        aqw aqwVar = this.y;
        if (aqwVar != null) {
            if (((arf) aqwVar.b.b().a(aqwVar.a)) != null) {
                throw null;
            }
        }
        bku bkuVarB = bvoVar.o().b();
        cdl cdlVarD = v(bvoVar).d();
        ccw ccwVar = cdlVarD.b;
        boolean z = cdlVarD.h() && !a.p(this.c, 3);
        if (z) {
            long j = cdlVarD.c;
            bkg bkgVarT = bdq.t(0L, (Float.floatToRawIntBits((int) (j & 4294967295L)) & 4294967295L) | (Float.floatToRawIntBits((int) (j >> 32)) << 32));
            bkuVarB.f();
            bkuVarB.k(bkgVarT);
        }
        try {
            chd chdVarR = this.b.r();
            if (chdVarR == null) {
                chdVarR = chd.a;
            }
            chd chdVar = chdVarR;
            blo bloVarJ = this.b.j();
            if (bloVarJ == null) {
                bloVarJ = blo.a;
            }
            blo bloVar = bloVarJ;
            byi byiVarZ = this.b.z();
            if (byiVarZ == null) {
                byiVarZ = bmx.a;
            }
            byi byiVar = byiVarZ;
            this.b.y();
            bkx bkxVar = this.g;
            long jA = bkxVar != null ? bkxVar.a() : bkv.f;
            if (jA == 16) {
                jA = this.b.f() != 16 ? this.b.f() : bkv.a;
            }
            ccwVar.c(bkuVarB, jA, bloVar, chdVar, byiVar);
            if (z) {
                bkuVarB.d();
            }
            ara araVar = this.i;
            if (((araVar == null || !araVar.c) && amo.d(this.a)) || !((list = this.l) == null || list.isEmpty())) {
                bvoVar.p();
            }
        } finally {
        }
    }

    @Override // defpackage.bve
    public final int d(brv brvVar, bru bruVar, int i) {
        return bay.X(v(brvVar).c(brvVar.m()).a());
    }

    @Override // defpackage.bij
    public final boolean db() {
        return false;
    }

    @Override // defpackage.bve
    public final int e(brv brvVar, bru bruVar, int i) {
        return v(brvVar).a(i, brvVar.m());
    }

    @Override // defpackage.bve
    public final int f(brv brvVar, bru bruVar, int i) {
        return bay.X(((Number) v(brvVar).c(brvVar.m()).c.a()).floatValue());
    }

    public final aqt h() {
        if (this.A == null) {
            this.A = new aqt(this.a, this.b, this.j, this.c, this.d, this.e, this.l);
        }
        aqt aqtVar = this.A;
        aqtVar.getClass();
        return aqtVar;
    }

    public final void k() {
        this.i = null;
    }

    public final void l(boolean z, boolean z2, boolean z3, boolean z4) {
        if (z2 || z3 || z4) {
            h().h(this.a, this.b, this.j, this.c, this.d, this.e, this.l);
        }
        if (this.w) {
            if (z2 || (z && this.B != null)) {
                bad.D(this);
            }
            if (z2 || z3 || z4) {
                bko.u(this);
                bko.x(this);
            }
            if (z) {
                bko.x(this);
            }
        }
    }

    public final void m() {
        bad.D(this);
        bko.u(this);
        bko.x(this);
    }

    @Override // defpackage.bwx
    public final /* synthetic */ boolean o() {
        return false;
    }

    @Override // defpackage.bwx
    public final /* synthetic */ boolean p() {
        return false;
    }

    public final boolean q(uiq uiqVar, uiq uiqVar2, aqw aqwVar, uiq uiqVar3) {
        boolean z;
        if (this.k != uiqVar) {
            this.k = uiqVar;
            z = true;
        } else {
            z = false;
        }
        if (this.x != uiqVar2) {
            this.x = uiqVar2;
            z = true;
        }
        if (!a.ao(this.y, aqwVar)) {
            this.y = aqwVar;
            z = true;
        }
        if (this.h == uiqVar3) {
            return z;
        }
        this.h = uiqVar3;
        return true;
    }

    public final boolean r(bkx bkxVar, cdo cdoVar) {
        boolean zAo = a.ao(bkxVar, this.g);
        this.g = bkxVar;
        return (zAo && cdoVar.u(this.b)) ? false : true;
    }

    @Override // defpackage.bwx
    public final void s(cbn cbnVar) {
        uiq shVar = this.B;
        if (shVar == null) {
            shVar = new sh(this, 18);
            this.B = shVar;
        }
        cbw.j(cbnVar, this.a);
        ara araVar = this.i;
        if (araVar != null) {
            cbw.k(cbnVar, araVar.b);
            cbw.i(cbnVar, araVar.c);
        }
        cbnVar.e(cbm.k, new cbc(null, new sh(this, 19)));
        cbnVar.e(cbm.l, new cbc(null, new sh(this, 20)));
        cbnVar.e(cbm.m, new cbc(null, new aei(this, 15)));
        cbnVar.e(cbm.a, new cbc(null, shVar));
    }

    public final boolean t(ccm ccmVar) {
        boolean zAo = a.ao(this.a.b, ccmVar.b);
        boolean zAo2 = a.ao(this.a.a, ccmVar.a);
        boolean z = true;
        if (zAo && zAo2) {
            z = false;
        }
        if (z) {
            this.a = ccmVar;
        }
        if (!zAo) {
            k();
        }
        return z;
    }

    public final boolean u(cdo cdoVar, List list, int i, int i2, boolean z, qqq qqqVar, int i3) {
        boolean z2 = !this.b.v(cdoVar);
        this.b = cdoVar;
        if (!a.ao(this.l, list)) {
            this.l = list;
            z2 = true;
        }
        if (this.f != i) {
            this.f = i;
            z2 = true;
        }
        if (this.e != i2) {
            this.e = i2;
            z2 = true;
        }
        if (this.d != z) {
            this.d = z;
            z2 = true;
        }
        if (!a.ao(this.j, qqqVar)) {
            this.j = qqqVar;
            z2 = true;
        }
        if (!a.p(this.c, i3)) {
            this.c = i3;
            z2 = true;
        }
        if (a.ao(null, null)) {
            return z2;
        }
        return true;
    }

    @Override // defpackage.buu
    public final /* synthetic */ void cR() {
    }
}
