package defpackage;

import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kte extends kro {
    public final uem a;
    public final owf b;
    public boolean c;
    public final hbj d;
    private final owq e;
    private final owf f;
    private final boolean g;
    private ksa h;

    public kte(uem uemVar, owq owqVar, owf owfVar, hbj hbjVar, owf owfVar2) {
        ksa ksaVar = ksa.TIMER_ZERO_SECONDS;
        this.h = ksaVar;
        this.a = uemVar;
        this.f = owfVar;
        this.b = owfVar2;
        boolean z = false;
        if ((hbjVar.p(gzo.bD) || hbjVar.p(hac.L)) && ((Boolean) owfVar2.dL()).booleanValue()) {
            z = true;
        }
        this.c = z;
        this.g = hbjVar.p(gzo.bw);
        this.d = hbjVar;
        ltw ltwVar = ltw.OFF;
        this.e = new krp(owqVar, ltwVar, sbc.e(ltwVar, ksaVar, ltw.THREE, ksa.TIMER_THREE_SECONDS, ltw.FIVE, ksa.TIMER_FIVE_SECONDS, ltw.TEN, ksa.TIMER_TEN_SECONDS, ltw.AUTO, ksa.TIMER_AUTO));
    }

    private final void m(kqy kqyVar) {
        ksa ksaVar = ksa.TIMER_THREE_SECONDS;
        int iD = d(ksaVar);
        int iB = b(ksaVar);
        krs krsVar = krs.TIMER;
        kqyVar.g(false, iD, iB, "Feature Timer MenuItem", krsVar);
        ksa ksaVar2 = ksa.TIMER_FIVE_SECONDS;
        kqyVar.g(false, d(ksaVar2), b(ksaVar2), "Feature Timer MenuItem", krsVar);
        ksa ksaVar3 = ksa.TIMER_TEN_SECONDS;
        kqyVar.g(false, d(ksaVar3), b(ksaVar3), "Feature Timer MenuItem", krsVar);
    }

    @Override // defpackage.krz
    public final int a() {
        return R.string.timer_options_desc;
    }

    @Override // defpackage.kro
    protected final int b(ksa ksaVar) {
        int iOrdinal = ksaVar.ordinal();
        if (iOrdinal == 1) {
            return R.string.timer_off_desc;
        }
        if (iOrdinal == 2) {
            return R.string.timer_3_seconds_option_desc;
        }
        if (iOrdinal == 3) {
            return R.string.timer_5_seconds_option_desc;
        }
        if (iOrdinal == 4) {
            return R.string.timer_10_seconds_option_desc;
        }
        if (iOrdinal != 5) {
            return 0;
        }
        return R.string.timer_auto_desc;
    }

    @Override // defpackage.kro
    public final int d(ksa ksaVar) {
        int iOrdinal = ksaVar.ordinal();
        if (iOrdinal == 1) {
            return R.drawable.gs_timer_off_fill1_vd_theme_24;
        }
        if (iOrdinal == 2) {
            return R.drawable.gs_timer_3_alt_1_fill1_vd_theme_24;
        }
        if (iOrdinal == 3) {
            return R.drawable.gs_timer_5_fill1_vd_theme_24;
        }
        if (iOrdinal == 4) {
            return R.drawable.gs_timer_10_alt_1_fill1_vd_theme_24;
        }
        if (iOrdinal != 5) {
            return 0;
        }
        return R.drawable.gs_time_auto_fill1_vd_theme_24;
    }

    @Override // defpackage.krz
    public final int e() {
        return R.string.timer_desc;
    }

    @Override // defpackage.kro, defpackage.krz
    public final void ed(kqy kqyVar, boolean z) {
        if (this.g) {
            if (!z) {
                m(kqyVar);
                this.h = ksa.TIMER_ZERO_SECONDS;
                return;
            }
            ksa ksaVar = this.h;
            owq owqVar = this.e;
            if (ksaVar.equals(owqVar.dL())) {
                return;
            }
            m(kqyVar);
            ksa ksaVar2 = (ksa) owqVar.dL();
            if (ksaVar2.equals(ksa.TIMER_THREE_SECONDS) || ksaVar2.equals(ksa.TIMER_FIVE_SECONDS) || ksaVar2.equals(ksa.TIMER_TEN_SECONDS)) {
                kqyVar.g(true, d(ksaVar2), b(ksaVar2), "Feature Timer MenuItem", krs.TIMER);
                this.h = ksaVar2;
            }
        }
    }

    @Override // defpackage.kro
    protected final int f(ksa ksaVar) {
        int iOrdinal = ksaVar.ordinal();
        if (iOrdinal == 1) {
            return R.string.timer_off;
        }
        if (iOrdinal == 2) {
            return R.string.timer_3_seconds;
        }
        if (iOrdinal == 3) {
            return R.string.timer_5_seconds;
        }
        if (iOrdinal == 4) {
            return R.string.timer_10_seconds;
        }
        if (iOrdinal != 5) {
            return 0;
        }
        return R.string.timer_auto;
    }

    @Override // defpackage.krz
    public final krs h() {
        return krs.TIMER;
    }

    @Override // defpackage.krz
    public final owq j() {
        return this.e;
    }

    @Override // defpackage.krz
    public final sbp l() {
        int i = sbp.d;
        sbk sbkVar = new sbk();
        sbkVar.h(ksa.TIMER_ZERO_SECONDS);
        if (((Boolean) this.f.dL()).booleanValue()) {
            sbkVar.h(ksa.TIMER_AUTO);
        }
        sbkVar.h(ksa.TIMER_THREE_SECONDS);
        if (this.c) {
            sbkVar.h(ksa.TIMER_FIVE_SECONDS);
        }
        sbkVar.h(ksa.TIMER_TEN_SECONDS);
        return sbkVar.g();
    }

    @Override // defpackage.krz
    public final void n(krj krjVar) {
        ktd ktdVar = new ktd(this, krjVar, 0);
        ouu ouuVar = out.a;
        paq paqVarDK = this.f.dK(ktdVar, ouuVar);
        our ourVar = krjVar.L;
        ourVar.d(paqVarDK);
        ourVar.d(this.b.dK(new ktd(this, krjVar, 2), ouuVar));
    }

    @Override // defpackage.krz
    public final boolean p(krj krjVar) {
        return krjVar.d().b();
    }

    @Override // defpackage.kro, defpackage.krz
    public final boolean w(kqy kqyVar, ksa ksaVar) {
        if (ksaVar.equals(ksa.TIMER_FIVE_SECONDS)) {
            return this.c;
        }
        return true;
    }
}
