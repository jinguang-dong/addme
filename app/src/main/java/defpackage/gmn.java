package defpackage;

import com.google.ar.core.R;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gmn extends kro {
    public final owq a;
    public final gmm b;
    private final boolean c;
    private final tzj d;
    private final gnt e;
    private final owf f;
    private boolean g;
    private final luj h;
    private final hbj i;
    private final got j;

    public gmn(gnt gntVar, owq owqVar, boolean z, gmm gmmVar, tzj tzjVar, luj lujVar, got gotVar, owf owfVar, hbj hbjVar) {
        this.e = gntVar;
        this.f = owfVar;
        this.b = gmmVar;
        fgb fgbVar = new fgb(15);
        ksa ksaVar = ksa.SAPPHIRE_ON;
        ksaVar.getClass();
        this.a = new own(owqVar, fgbVar, new fdz(ksaVar, 5));
        this.c = z;
        this.d = tzjVar;
        this.h = lujVar;
        this.j = gotVar;
        this.i = hbjVar;
    }

    @Override // defpackage.krz
    public final int a() {
        return R.string.sapphire_content_desc;
    }

    @Override // defpackage.kro
    protected final int b(ksa ksaVar) {
        int iOrdinal = ksaVar.ordinal();
        if (iOrdinal == 77) {
            return R.string.sapphire_on_desc;
        }
        if (iOrdinal != 78) {
            return 0;
        }
        return R.string.sapphire_off_desc;
    }

    @Override // defpackage.kro
    public final int d(ksa ksaVar) {
        int iOrdinal = ksaVar.ordinal();
        if (iOrdinal == 77) {
            return R.drawable.ic_sapphire_on;
        }
        if (iOrdinal != 78) {
            return 0;
        }
        return R.drawable.ic_sapphire_off;
    }

    @Override // defpackage.krz
    public final int e() {
        return R.string.sapphire_label;
    }

    @Override // defpackage.kro, defpackage.krz
    public final void ec(krj krjVar) {
        krjVar.L.d(this.f.dK(new fun(this, krjVar, 7), sxo.a));
    }

    @Override // defpackage.kro, defpackage.krz
    public final void ed(kqy kqyVar, boolean z) {
        boolean z2 = false;
        if (z && Objects.equals(this.a.dL(), ksa.SAPPHIRE_ON)) {
            z2 = true;
        }
        kqyVar.g(z2, R.drawable.ic_sapphire_on, R.string.sapphire_on_desc, "Sapphire", krs.SAPPHIRE);
    }

    @Override // defpackage.kro
    protected final int f(ksa ksaVar) {
        int iOrdinal = ksaVar.ordinal();
        if (iOrdinal == 77) {
            return R.string.sapphire_on;
        }
        if (iOrdinal != 78) {
            return 0;
        }
        return R.string.sapphire_off;
    }

    @Override // defpackage.krz
    public final krs h() {
        return krs.SAPPHIRE;
    }

    @Override // defpackage.kro, defpackage.krz
    public final ksd i() {
        this.i.p(gzo.bJ);
        return new gmf(this, 2);
    }

    @Override // defpackage.krz
    public final owq j() {
        return this.a;
    }

    @Override // defpackage.kro, defpackage.krz
    public final rbb k() {
        this.i.p(gzo.bJ);
        return null;
    }

    @Override // defpackage.krz
    public final sbp l() {
        return sbp.m(ksa.SAPPHIRE_OFF, ksa.SAPPHIRE_ON);
    }

    public final void m(krj krjVar) {
        if (this.g) {
            return;
        }
        our ourVar = krjVar.L;
        owq owqVar = this.a;
        gmd gmdVar = new gmd(krjVar, 8);
        sxo sxoVar = sxo.a;
        ourVar.d(owqVar.dK(gmdVar, sxoVar));
        ourVar.d(this.h.a(luf.aN).dK(new gmd(this, 9), sxoVar));
        this.g = true;
    }

    @Override // defpackage.krz
    public final void n(krj krjVar) {
        m(krjVar);
    }

    @Override // defpackage.krz
    public final boolean p(krj krjVar) {
        return this.c && krjVar.d().equals(nkw.VIDEO) && this.e.i();
    }

    @Override // defpackage.kro, defpackage.ksb
    public final boolean v(krs krsVar, ksa ksaVar, boolean z) {
        return this.j.h(nkw.VIDEO) || ((mgh) this.d.a()).c(z, R.string.video_boost_turn_off_storage_saver_dialog_body);
    }
}
