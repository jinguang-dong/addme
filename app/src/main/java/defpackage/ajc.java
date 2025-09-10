package defpackage;

import android.view.KeyEvent;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajc extends ahn implements bov, bwx, bun {
    private uiu A;
    private uiu B;
    private aih C;
    private final apg D;
    private apg E;
    public final bpb h;
    public final aji i;
    public final ago j;
    private afy k;
    private final ain l;
    private final aiw z;

    public ajc(ajd ajdVar, afy afyVar, apg apgVar, aii aiiVar, boolean z, boolean z2, ocq ocqVar) {
        super(aiu.a, z, ocqVar, aiiVar);
        this.k = afyVar;
        this.E = apgVar;
        bpb bpbVar = new bpb();
        this.h = bpbVar;
        ain ainVar = new ain(z);
        M(ainVar);
        this.l = ainVar;
        apg apgVar2 = new apg(byi.bN(aiu.d));
        this.D = apgVar2;
        afy afyVar2 = this.k;
        apg apgVar3 = this.E;
        aji ajiVar = new aji(ajdVar, afyVar2, apgVar3 == null ? apgVar2 : apgVar3, aiiVar, z2, bpbVar, this, new ne(this, 19));
        this.i = ajiVar;
        aiw aiwVar = new aiw(ajiVar, z);
        this.z = aiwVar;
        ago agoVar = new ago(aiiVar, ajiVar, z2);
        M(agoVar);
        this.j = agoVar;
        M(new bpe(aiwVar, bpbVar));
        M(bdq.u(2, null, 2));
        M(new apt(agoVar));
        M(new afh(new np(this, 8)));
    }

    private final void N() {
        if (this.w) {
            chq chqVarE = bko.E(this);
            this.D.c = byi.bN(chqVarE);
        }
    }

    public final void A(ajd ajdVar, aii aiiVar, afy afyVar, boolean z, boolean z2, apg apgVar, ocq ocqVar) {
        boolean z3;
        boolean z4 = false;
        boolean z5 = true;
        if (((ahn) this).c != z) {
            this.z.a = z;
            this.l.a = z;
            z3 = true;
        } else {
            z3 = false;
        }
        apg apgVar2 = apgVar == null ? this.D : apgVar;
        aji ajiVar = this.i;
        bpb bpbVar = this.h;
        if (!a.ao(ajiVar.a, ajdVar)) {
            ajiVar.a = ajdVar;
            z4 = true;
        }
        ajiVar.b = afyVar;
        if (ajiVar.c != aiiVar) {
            ajiVar.c = aiiVar;
            z4 = true;
        }
        if (ajiVar.d != z2) {
            ajiVar.d = z2;
        } else {
            z5 = z4;
        }
        ajiVar.k = apgVar2;
        ajiVar.e = bpbVar;
        ago agoVar = this.j;
        agoVar.a = aiiVar;
        agoVar.c = z2;
        this.k = afyVar;
        this.E = apgVar;
        z(aiu.a, z, ocqVar, ajiVar.k() ? aii.a : aii.b, z5);
        if (z3) {
            this.A = null;
            this.B = null;
            bad.D(this);
        }
    }

    @Override // defpackage.ahn
    public final Object c(uiu uiuVar, uhb uhbVar) {
        aji ajiVar = this.i;
        Object objI = ajiVar.i(afs.b, new ahq(uiuVar, ajiVar, (uhb) null, 2), uhbVar);
        return objI == uhi.a ? objI : ufg.a;
    }

    @Override // defpackage.bij
    public final void cW() {
        N();
        aih aihVar = this.C;
        if (aihVar != null) {
            aihVar.b = bko.E(this);
        }
    }

    @Override // defpackage.ahn, defpackage.bij
    public final void cY() {
        cX();
        N();
        aih aihVar = this.C;
        if (aihVar != null) {
            aihVar.b = bko.E(this);
        }
    }

    @Override // defpackage.bij
    public final boolean db() {
        return false;
    }

    @Override // defpackage.bwx
    public final /* synthetic */ boolean o() {
        return false;
    }

    @Override // defpackage.bwx
    public final /* synthetic */ boolean p() {
        return false;
    }

    @Override // defpackage.bov
    public final boolean q(KeyEvent keyEvent) {
        long jFloatToRawIntBits;
        int iFloatToRawIntBits;
        if (!((ahn) this).c || ((!a.q(akg.G(keyEvent), bot.n) && !a.q(akg.G(keyEvent), bot.m)) || !a.p(akg.F(keyEvent), 2) || keyEvent.isCtrlPressed())) {
            return false;
        }
        if (this.i.k()) {
            float f = (int) (this.j.g & 4294967295L);
            if (!a.q(akg.G(keyEvent), bot.m)) {
                f = -f;
            }
            jFloatToRawIntBits = Float.floatToRawIntBits(0.0f);
            iFloatToRawIntBits = Float.floatToRawIntBits(f);
        } else {
            float f2 = (int) (this.j.g >> 32);
            if (!a.q(akg.G(keyEvent), bot.m)) {
                f2 = -f2;
            }
            jFloatToRawIntBits = Float.floatToRawIntBits(f2);
            iFloatToRawIntBits = Float.floatToRawIntBits(0.0f);
        }
        ukc.C(C(), null, 0, new aiz(this, (iFloatToRawIntBits & 4294967295L) | (jFloatToRawIntBits << 32), (uhb) null, 0), 3);
        return true;
    }

    @Override // defpackage.bwx
    public final void s(cbn cbnVar) {
        if (((ahn) this).c && (this.A == null || this.B == null)) {
            this.A = new aml(this, 1);
            this.B = new ajb(this, null);
        }
        uiu uiuVar = this.A;
        if (uiuVar != null) {
            uld[] uldVarArr = cbw.a;
            cbnVar.e(cbm.d, new cbc(null, uiuVar));
        }
        uiu uiuVar2 = this.B;
        if (uiuVar2 != null) {
            uld[] uldVarArr2 = cbw.a;
            cbnVar.e(cbm.e, uiuVar2);
        }
    }

    @Override // defpackage.ahn
    public final void t(long j) {
        ukc.C(this.h.f(), null, 0, new aiz(this, j, (uhb) null, 1, (byte[]) null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0131  */
    @Override // defpackage.ahn, defpackage.bww
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void u(defpackage.bpp r9, int r10, long r11) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajc.u(bpp, int, long):void");
    }

    @Override // defpackage.ahn
    public final boolean w() {
        aji ajiVar = this.i;
        if (ajiVar.a.e()) {
            return true;
        }
        afy afyVar = ajiVar.b;
        return afyVar != null && afyVar.h();
    }

    @Override // defpackage.bov
    public final void x() {
    }

    @Override // defpackage.ahn
    public final void r(long j) {
    }
}
