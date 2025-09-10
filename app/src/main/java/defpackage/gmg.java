package defpackage;

import com.bumptech.glide.qd.MyBPCgKwEjJI;
import com.google.ar.core.R;
import j$.util.Objects;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gmg extends kro {
    public static final sgv a = sgv.g("gmg");
    public final owq b;
    public final gmx c;
    private final gnt d;
    private final owf e;
    private final owf f;
    private final luw g;
    private final glu h;
    private final luj i;
    private final hbj j;
    private final gtm k;

    public gmg(owq owqVar, gnt gntVar, hbj hbjVar, owf owfVar, gmx gmxVar, owf owfVar2, luw luwVar, glu gluVar, luj lujVar, gtm gtmVar) {
        this.d = gntVar;
        this.j = hbjVar;
        this.e = owfVar;
        this.c = gmxVar;
        gho ghoVar = gho.DEFAULT;
        this.b = new krp(owqVar, ghoVar, ghoVar, ksa.VIDEO_STABILIZATION_STANDARD, gho.LOCKED, ksa.VIDEO_STABILIZATION_LOCKED, gho.ACTIVE, ksa.VIDEO_STABILIZATION_ACTIVE);
        this.f = owfVar2;
        this.g = luwVar;
        this.h = gluVar;
        this.i = lujVar;
        this.k = gtmVar;
    }

    @Override // defpackage.krz
    public final int a() {
        return R.string.stabilization_options_desc;
    }

    @Override // defpackage.kro
    protected final int b(ksa ksaVar) {
        return gsn.n(ksaVar);
    }

    @Override // defpackage.kro
    public final int d(ksa ksaVar) {
        switch (ksaVar.ordinal()) {
            case 50:
                return R.drawable.quantum_gm_ic_stabilization_white_24;
            case 51:
                return R.drawable.quantum_gm_ic_stabilization_lock_white_24;
            case 52:
                return R.drawable.quantum_gm_ic_stabilization_action_white_24;
            default:
                throw new IllegalArgumentException("Invalid option: ".concat(String.valueOf(String.valueOf(ksaVar))));
        }
    }

    @Override // defpackage.kro, defpackage.krz
    public final kry dZ() {
        if (((nkw) this.e.dL()).equals(nkw.VIDEO)) {
            gzi gziVar = gym.a;
        }
        return kry.DEFAULT;
    }

    @Override // defpackage.krz
    public final int e() {
        return R.string.stabilization_label;
    }

    @Override // defpackage.kro
    protected final int f(ksa ksaVar) {
        return gsn.n(ksaVar);
    }

    @Override // defpackage.krz
    public final krs h() {
        return krs.VIDEO_STABILIZATION;
    }

    @Override // defpackage.kro, defpackage.krz
    public final ksd i() {
        return new gmf(this, 0);
    }

    @Override // defpackage.krz
    public final owq j() {
        return this.b;
    }

    @Override // defpackage.krz
    public final sbp l() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(ksa.VIDEO_STABILIZATION_LOCKED);
        arrayList.add(ksa.VIDEO_STABILIZATION_STANDARD);
        arrayList.add(ksa.VIDEO_STABILIZATION_ACTIVE);
        return sbp.j(arrayList);
    }

    @Override // defpackage.krz
    public final void n(krj krjVar) {
        owq owqVar = this.h.a;
        glc glcVar = new glc(this, krjVar, 10);
        sxo sxoVar = sxo.a;
        paq paqVarDK = owqVar.dK(glcVar, sxoVar);
        our ourVar = krjVar.L;
        ourVar.d(paqVarDK);
        ourVar.d(this.g.dK(new glc(this, krjVar, 11), sxoVar));
        ourVar.d(this.i.a(luf.O).dK(new glc(this, krjVar, 12), sxoVar));
    }

    @Override // defpackage.kro, defpackage.krz
    public final boolean o(krj krjVar) {
        hbj hbjVar = this.j;
        return (hbjVar.p(gym.S) || hbjVar.p(gym.R)) && this.k.p();
    }

    @Override // defpackage.krz
    public final boolean p(krj krjVar) {
        hbj hbjVar = this.j;
        return (hbjVar.p(gym.S) || hbjVar.p(gym.R)) && krjVar.d().equals(nkw.VIDEO) && this.d.a().equals(pka.BACK);
    }

    @Override // defpackage.kro, defpackage.krz
    public final boolean w(kqy kqyVar, ksa ksaVar) {
        int iOrdinal = ksaVar.ordinal();
        return iOrdinal != 51 ? iOrdinal != 52 ? ksaVar.equals(ksa.VIDEO_STABILIZATION_STANDARD) : this.j.p(gym.S) && ((ksa) ((ovx) this.h.a).d).equals(ksa.FPS_30) && ((lty) this.g.dL()).equals(lty.RES_1080P) && !((Boolean) this.f.dL()).booleanValue() : this.j.p(gym.R) && !((Boolean) this.f.dL()).booleanValue();
    }

    @Override // defpackage.kro, defpackage.krz
    public final void ed(kqy kqyVar, boolean z) {
        boolean z2 = z && Objects.equals(this.b.dL(), ksa.VIDEO_STABILIZATION_ACTIVE);
        boolean z3 = z && Objects.equals(this.b.dL(), ksa.VIDEO_STABILIZATION_LOCKED);
        if (!z2) {
            ksa ksaVar = ksa.VIDEO_STABILIZATION_ACTIVE;
            kqyVar.g(false, d(ksaVar), gsn.n(ksaVar), "VideoStabilization", krs.VIDEO_STABILIZATION);
        }
        if (!z3) {
            ksa ksaVar2 = ksa.VIDEO_STABILIZATION_LOCKED;
            kqyVar.g(false, d(ksaVar2), gsn.n(ksaVar2), "VideoStabilization", krs.VIDEO_STABILIZATION);
        }
        if (z2) {
            ksa ksaVar3 = ksa.VIDEO_STABILIZATION_ACTIVE;
            kqyVar.g(true, d(ksaVar3), gsn.n(ksaVar3), "VideoStabilization", krs.VIDEO_STABILIZATION);
        } else if (z3) {
            ksa ksaVar4 = ksa.VIDEO_STABILIZATION_LOCKED;
            kqyVar.g(true, d(ksaVar4), gsn.n(ksaVar4), MyBPCgKwEjJI.PZgJZn, krs.VIDEO_STABILIZATION);
        }
    }
}
