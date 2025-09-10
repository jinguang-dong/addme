package defpackage;

import com.google.ar.core.R;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ksj extends kro {
    public static final krs a = krs.FEATURE_SOUND_EFFECTS;
    public Optional b = Optional.empty();
    public final pmg c;
    private final out d;
    private final owq e;
    private final owf f;
    private final owf g;

    public ksj(hbj hbjVar, luj lujVar, out outVar, owq owqVar, owf owfVar, pmg pmgVar) {
        gzg gzgVar = gzt.a;
        this.d = outVar;
        this.f = owqVar;
        this.g = owfVar;
        this.c = pmgVar;
        lus lusVar = luf.be;
        this.e = new krp(lujVar.a(lusVar), (Integer) lusVar.d(hbjVar), Integer.valueOf(qpt.bF(2)), ksa.FEATURE_SOUND_EFFECTS_OFF, Integer.valueOf(qpt.bF(3)), ksa.FEATURE_SOUND_EFFECTS_ON);
    }

    @Override // defpackage.krz
    public final int a() {
        return R.string.feature_sound_effects_desc;
    }

    @Override // defpackage.kro
    protected final int b(ksa ksaVar) {
        int iOrdinal = ksaVar.ordinal();
        if (iOrdinal == 84) {
            return R.string.feature_sound_effects_on_desc;
        }
        if (iOrdinal != 85) {
            return 0;
        }
        return R.string.feature_sound_effects_off_desc;
    }

    @Override // defpackage.kro
    public final int d(ksa ksaVar) {
        int iOrdinal = ksaVar.ordinal();
        if (iOrdinal == 84) {
            return R.drawable.gm_filled_volume_up_vd_theme_24;
        }
        if (iOrdinal != 85) {
            return 0;
        }
        return R.drawable.gm_filled_volume_off_vd_theme_24;
    }

    @Override // defpackage.krz
    public final int e() {
        return R.string.feature_sound_effects;
    }

    @Override // defpackage.kro, defpackage.krz
    public final void ec(krj krjVar) {
        if (this.b.isEmpty()) {
            Optional optionalOf = Optional.of(krjVar);
            this.b = optionalOf;
            if (optionalOf.isEmpty()) {
                return;
            }
            ((krj) this.b.get()).L.d(owl.a(this.f, this.g).dK(new gwm(this, 4), this.d));
        }
    }

    @Override // defpackage.kro, defpackage.krz
    public final void ed(kqy kqyVar, boolean z) {
        ksa ksaVar = ksa.FEATURE_SOUND_EFFECTS_OFF;
        int iD = d(ksaVar);
        int iB = b(ksaVar);
        krs krsVar = a;
        kqyVar.g(false, iD, iB, "Feature Sound Effects MenuItem", krsVar);
        ksa ksaVar2 = ksa.FEATURE_SOUND_EFFECTS_ON;
        kqyVar.g(false, d(ksaVar2), b(ksaVar2), "Feature Sound Effects MenuItem", krsVar);
    }

    @Override // defpackage.kro
    protected final int f(ksa ksaVar) {
        int iOrdinal = ksaVar.ordinal();
        if (iOrdinal == 84) {
            return R.string.feature_sound_effects_on;
        }
        if (iOrdinal != 85) {
            return 0;
        }
        return R.string.feature_sound_effects_off;
    }

    @Override // defpackage.krz
    public final krs h() {
        return a;
    }

    @Override // defpackage.kro, defpackage.krz
    public final ksd i() {
        return new gmf(this, 4);
    }

    @Override // defpackage.krz
    public final owq j() {
        return this.e;
    }

    @Override // defpackage.krz
    public final sbp l() {
        return sbp.m(ksa.FEATURE_SOUND_EFFECTS_OFF, ksa.FEATURE_SOUND_EFFECTS_ON);
    }

    @Override // defpackage.kro, defpackage.krz
    public final boolean o(krj krjVar) {
        return ((Boolean) this.g.dL()).booleanValue();
    }

    @Override // defpackage.krz
    public final boolean p(krj krjVar) {
        return false;
    }

    @Override // defpackage.krz
    public final void n(krj krjVar) {
    }
}
