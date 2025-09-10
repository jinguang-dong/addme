package defpackage;

import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gld extends kro {
    public final glb a;
    private final owq b = new ovx(ksa.AMETHYST_OFF);
    private final boolean c;
    private final glu d;
    private final pnq e;
    private final owf f;
    private final owf g;
    private final owq h;
    private final glf i;
    private final glf j;
    private final luw k;
    private final luw l;
    private final owf m;
    private final hbj n;

    public gld(hbj hbjVar, glu gluVar, glb glbVar, pnq pnqVar, owf owfVar, owf owfVar2, owq owqVar, glf glfVar, glf glfVar2, luw luwVar, luw luwVar2, owf owfVar3) {
        this.c = hbjVar.p(gym.am);
        this.n = hbjVar;
        this.d = gluVar;
        this.a = glbVar;
        this.e = pnqVar;
        this.f = owfVar;
        this.g = owfVar2;
        this.h = owqVar;
        this.i = glfVar;
        this.j = glfVar2;
        this.k = luwVar;
        this.l = luwVar2;
        this.m = owfVar3;
    }

    @Override // defpackage.krz
    public final int a() {
        return R.string.hdr_video_content_desc;
    }

    @Override // defpackage.kro
    protected final int b(ksa ksaVar) {
        int iOrdinal = ksaVar.ordinal();
        if (iOrdinal == 36) {
            return R.string.hdr_video_on_desc;
        }
        if (iOrdinal != 37) {
            return 0;
        }
        return R.string.hdr_video_off_desc;
    }

    @Override // defpackage.kro
    public final int d(ksa ksaVar) {
        int iOrdinal = ksaVar.ordinal();
        if (iOrdinal == 36) {
            return R.drawable.quantum_gm_ic_hdr_on_white_24;
        }
        if (iOrdinal != 37) {
            return 0;
        }
        return R.drawable.quantum_gm_ic_hdr_off_white_24;
    }

    @Override // defpackage.krz
    public final int e() {
        return R.string.hdr_video_label;
    }

    @Override // defpackage.kro, defpackage.krz
    public final int eI() {
        return R.string.options_menu_disabled;
    }

    @Override // defpackage.kro
    protected final int f(ksa ksaVar) {
        int iOrdinal = ksaVar.ordinal();
        if (iOrdinal == 36) {
            return R.string.hdr_video_on;
        }
        if (iOrdinal != 37) {
            return 0;
        }
        return R.string.hdr_video_off;
    }

    public final glf g() {
        return (((Boolean) this.h.dL()).booleanValue() && ((ovx) this.m).d == pka.BACK) ? this.j : this.i;
    }

    @Override // defpackage.krz
    public final krs h() {
        return krs.AMETHYST;
    }

    @Override // defpackage.kro, defpackage.krz
    public final ksd i() {
        this.n.p(gzo.bJ);
        return new gmf(this, 1);
    }

    @Override // defpackage.krz
    public final owq j() {
        return this.b;
    }

    @Override // defpackage.kro, defpackage.krz
    public final rbb k() {
        this.n.p(gzo.bJ);
        return null;
    }

    @Override // defpackage.krz
    public final sbp l() {
        return sbp.m(ksa.AMETHYST_OFF, ksa.AMETHYST_ON);
    }

    public final void m() {
        ksa ksaVar = (ksa) g().dL();
        owq owqVar = this.b;
        if (((ksa) ((ovx) owqVar).d).equals(ksaVar)) {
            return;
        }
        owqVar.a(ksaVar);
    }

    @Override // defpackage.krz
    public final void n(krj krjVar) {
        glu gluVar = this.d;
        owq owqVar = gluVar.a;
        gej gejVar = new gej(krjVar, 7);
        sxo sxoVar = sxo.a;
        paq paqVarDK = owqVar.dK(gejVar, sxoVar);
        our ourVar = krjVar.L;
        ourVar.d(paqVarDK);
        ourVar.d(gluVar.b.dK(new gej(krjVar, 8), sxoVar));
        ourVar.d(owb.a(gluVar.d).dK(new glc(this, krjVar, 0), sxoVar));
        ourVar.d(owb.a(owl.a(this.f, this.g)).dK(new gej(krjVar, 9), sxoVar));
        ourVar.d(this.h.dK(new glc(this, krjVar, 2), sxoVar));
        ourVar.d(this.b.dK(new gej(this, 10), sxoVar));
        ourVar.d(owl.a(this.i, this.j).dK(new gej(this, 11), sxoVar));
        ourVar.d(this.l.dK(new gej(krjVar, 12), sxoVar));
        ourVar.d(this.m.dK(new glc(this, krjVar, 3), sxoVar));
        m();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.kro, defpackage.krz
    public final boolean o(krj krjVar) {
        boolean z;
        if (((Boolean) this.f.dL()).booleanValue() || ((Boolean) this.g.dL()).booleanValue()) {
            return false;
        }
        glu gluVar = this.d;
        switch (((ksa) ((ovx) gluVar.a).d).ordinal()) {
            case 27:
            case 30:
                if (((lty) this.k.dL()).equals(lty.RES_1080P) && !((Boolean) this.h.dL()).booleanValue()) {
                    gzi gziVar = gym.a;
                }
                z = false;
                break;
            case 28:
            case 29:
                z = true;
                break;
            default:
                z = false;
                break;
        }
        boolean zBooleanValue = ((Boolean) ((ovx) gluVar.d).d).booleanValue();
        boolean z2 = ((Boolean) this.h.dL()).booleanValue() && ((ovx) this.m).d == pka.BACK;
        if (!z2 || !((lty) this.l.dL()).equals(lty.RES_4320P)) {
            return z || !zBooleanValue || z2;
        }
        gzi gziVar2 = hax.a;
        return false;
    }

    @Override // defpackage.krz
    public final boolean p(krj krjVar) {
        return ((this.e.j() && krjVar.s()) || !this.c || (krjVar.d() != nkw.VIDEO && krjVar.d() != nkw.VIDEO_NIGHT_SIGHT) || ((Boolean) ((ovx) this.d.b).d).booleanValue() || ((Boolean) this.f.dL()).booleanValue() || ((Boolean) this.g.dL()).booleanValue()) ? false : true;
    }
}
