package defpackage;

import android.content.res.Resources;
import com.google.ar.core.R;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public class glu extends kro {
    private static final sgv m = sgv.g("glu");
    public final owf c;
    public final owf e;
    public final owf f;
    public sbp g;
    public sbp h;
    public boolean i;
    public volatile boolean j;
    public krj k;
    public final hbj l;
    private final luw n;
    private final owf o;
    private final tzj p;
    private final luw q;
    private final pmv r;
    public final owq a = new ovx(ksa.FPS_AUTO);
    public final owq b = new ovx(false);
    public final owq d = new ovx(false);

    public glu(pmv pmvVar, luw luwVar, owf owfVar, tzj tzjVar, owf owfVar2, luw luwVar2, owf owfVar3, owf owfVar4, hbj hbjVar) {
        int i = sbp.d;
        sbp sbpVar = sex.a;
        this.g = sbpVar;
        this.h = sbpVar;
        this.i = false;
        this.j = false;
        this.k = null;
        this.r = pmvVar;
        this.n = luwVar;
        this.o = owfVar;
        this.p = tzjVar;
        this.c = owfVar2;
        this.q = luwVar2;
        this.e = owfVar3;
        this.f = owfVar4;
        this.l = hbjVar;
    }

    public static ksa m(ltt lttVar) {
        int iOrdinal = lttVar.ordinal();
        if (iOrdinal == 0) {
            return ksa.FPS_AUTO;
        }
        if (iOrdinal == 1) {
            return ksa.C;
        }
        if (iOrdinal == 2) {
            return ksa.FPS_30;
        }
        if (iOrdinal == 3) {
            return ksa.FPS_60;
        }
        throw new RuntimeException(null, null);
    }

    public static final boolean x(ksa ksaVar) {
        if (ksaVar == ksa.FPS_30) {
            return true;
        }
        if (ksaVar != ksa.C) {
            return false;
        }
        gzi gziVar = hax.a;
        return false;
    }

    @Override // defpackage.krz
    public final int a() {
        return R.string.fps_options_desc;
    }

    @Override // defpackage.kro
    public final int d(ksa ksaVar) {
        switch (ksaVar.ordinal()) {
            case 27:
                return R.drawable.quantum_gm_ic_autofps_select_white_24;
            case 28:
                return R.drawable.ic_options_24fps_24px;
            case 29:
                return R.drawable.quantum_gm_ic_30fps_select_white_24;
            case 30:
                return R.drawable.quantum_gm_ic_60fps_select_white_24;
            default:
                throw new IllegalArgumentException("Invalid option: ".concat(String.valueOf(String.valueOf(ksaVar))));
        }
    }

    @Override // defpackage.krz
    public final int e() {
        return R.string.fps_option_desc;
    }

    public final ksa g() {
        return m((ltt) q().dL());
    }

    @Override // defpackage.krz
    public final krs h() {
        return krs.FPS;
    }

    @Override // defpackage.krz
    public final owq j() {
        return this.a;
    }

    @Override // defpackage.krz
    public final sbp l() {
        gzi gziVar = gym.a;
        return this.g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.krz
    public final void n(krj krjVar) {
        this.k = krjVar;
        pmv pmvVar = this.r;
        owf owfVarA = owl.a(pmvVar.a, pmvVar.c, pmvVar.b, pmvVar.d);
        gej gejVar = new gej(this, 17);
        sxo sxoVar = sxo.a;
        paq paqVarDK = owfVarA.dK(gejVar, sxoVar);
        our ourVar = krjVar.L;
        ourVar.d(paqVarDK);
        ourVar.d(this.a.dK(new gej(this, 18), sxoVar));
        ourVar.d(this.c.dK(new glc(this, krjVar, 4), sxoVar));
        ourVar.d(this.n.dK(new glc(this, new AtomicBoolean(true), 5), sxoVar));
        ourVar.d(this.q.dK(new glc(this, krjVar, 6), sxoVar));
        ourVar.d(this.o.dK(new glc(this, krjVar, 7), sxoVar));
        ourVar.d(this.e.dK(new gej(this, 19), sxoVar));
    }

    @Override // defpackage.krz
    public final boolean p(krj krjVar) {
        boolean z = false;
        if ((krjVar.d() == nkw.VIDEO || krjVar.d() == nkw.VIDEO_NIGHT_SIGHT) && this.g.size() > 1) {
            z = true;
        }
        owq owqVar = this.d;
        ovx ovxVar = (ovx) owqVar;
        if (((Boolean) ovxVar.d).booleanValue() != z) {
            owqVar.a(Boolean.valueOf(z));
        }
        return ((Boolean) ovxVar.d).booleanValue();
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, owq] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, owq] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, owq] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, owq] */
    public final owq q() {
        if (((Boolean) this.c.dL()).booleanValue() && ((pka) ((ovx) this.e).d).equals(pka.BACK) && ((nkw) this.f.dL()).a()) {
            return this.r.d;
        }
        if (((Boolean) ((ovx) this.b).d).booleanValue()) {
            return this.r.c;
        }
        boolean z = this.i;
        pmv pmvVar = this.r;
        return z ? pmvVar.a : pmvVar.b;
    }

    @Override // defpackage.kro, defpackage.krz
    public final String r(ksa ksaVar, Resources resources) {
        switch (ksaVar.ordinal()) {
            case 27:
                return resources.getString(R.string.fps_auto_desc);
            case 28:
                return resources.getString(R.string.fps_desc, Integer.valueOf(resources.getInteger(R.integer.fps_24)));
            case 29:
                return resources.getString(R.string.fps_desc, Integer.valueOf(resources.getInteger(R.integer.fps_30)));
            case 30:
                return resources.getString(R.string.fps_desc, Integer.valueOf(resources.getInteger(R.integer.fps_60)));
            default:
                throw new IllegalArgumentException("Invalid option: ".concat(String.valueOf(String.valueOf(ksaVar))));
        }
    }

    @Override // defpackage.kro, defpackage.krz
    public final String s(ksa ksaVar, Resources resources) {
        switch (ksaVar.ordinal()) {
            case 27:
                return resources.getString(R.string.fps_auto);
            case 28:
                return String.format("%d", Integer.valueOf(resources.getInteger(R.integer.fps_24)));
            case 29:
                return String.format("%d", Integer.valueOf(resources.getInteger(R.integer.fps_30)));
            case 30:
                return String.format("%d", Integer.valueOf(resources.getInteger(R.integer.fps_60)));
            default:
                throw new IllegalArgumentException("Invalid option: ".concat(String.valueOf(String.valueOf(ksaVar))));
        }
    }

    public final void t() {
        owq owqVar = this.a;
        ksa ksaVarG = g();
        if (((ksa) ((ovx) owqVar).d).equals(ksaVarG)) {
            return;
        }
        owqVar.a(ksaVarG);
    }

    public final boolean u() {
        return ((Boolean) this.c.dL()).booleanValue() && ((nkw) this.f.dL()).a() && this.q.dL() == lty.RES_4320P && ((ovx) this.e).d == pka.BACK;
    }

    @Override // defpackage.kro, defpackage.ksb
    public final boolean v(krs krsVar, ksa ksaVar, boolean z) {
        boolean z2 = this.j;
        boolean z3 = true;
        if (!z2 && !((mgh) this.p.a()).v(krsVar, ksaVar, z)) {
            z3 = false;
        }
        if (z3) {
            ((sgt) m.c().M(955)).G("shouldBlockSelection: block. option=%s invalidState=%b isSelected=%b", ksaVar, Boolean.valueOf(z2), Boolean.valueOf(z));
        }
        return z3;
    }

    @Override // defpackage.kro, defpackage.krz
    public final boolean w(kqy kqyVar, ksa ksaVar) {
        return u() ? x(ksaVar) : this.h.contains(ksaVar);
    }
}
