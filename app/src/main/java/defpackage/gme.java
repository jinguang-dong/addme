package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gme extends kro {
    public final tzj a;
    public final owq b;
    private final luw d;
    private final luw e;
    private final owq f;
    private final owq g;
    private final owq h;
    private final owq i;
    private final tzj j;
    private final jug k;
    private final mni l;
    private final Context m;
    private final owf n;
    private final owf o;
    private final hbj r;
    private final got s;
    public boolean c = false;
    private boolean p = false;
    private final owq q = new ovx(ksa.RES_1080P);

    public gme(hbj hbjVar, luw luwVar, luw luwVar2, owq owqVar, owq owqVar2, owq owqVar3, owq owqVar4, tzj tzjVar, jug jugVar, mni mniVar, Context context, tzj tzjVar2, owq owqVar5, owf owfVar, owf owfVar2, got gotVar) {
        this.r = hbjVar;
        this.d = luwVar;
        this.e = luwVar2;
        this.f = owqVar;
        this.g = owqVar2;
        this.h = owqVar3;
        this.i = owqVar4;
        this.j = tzjVar;
        this.k = jugVar;
        this.l = mniVar;
        this.m = context;
        this.a = tzjVar2;
        this.b = owqVar5;
        this.n = owfVar;
        this.o = owfVar2;
        this.s = gotVar;
    }

    public static lty q(ksa ksaVar) {
        nkw nkwVar = nkw.UNINITIALIZED;
        switch (ksaVar.ordinal()) {
            case 31:
                return lty.RES_1080P;
            case 32:
                return lty.RES_2160P;
            case 33:
                return lty.RES_4320P;
            default:
                throw new IllegalArgumentException("Invalid menu option: ".concat(String.valueOf(String.valueOf(ksaVar))));
        }
    }

    @Override // defpackage.krz
    public final int a() {
        return R.string.video_res_desc;
    }

    @Override // defpackage.kro
    protected final int b(ksa ksaVar) {
        nkw nkwVar = nkw.UNINITIALIZED;
        switch (ksaVar.ordinal()) {
            case 31:
                return R.string.video_res_fhd_desc;
            case 32:
                return R.string.video_res_4k_desc;
            case 33:
                return R.string.video_res_8k_desc;
            default:
                throw new IllegalArgumentException("Not a valid option: ".concat(String.valueOf(String.valueOf(ksaVar))));
        }
    }

    @Override // defpackage.kro
    public final int d(ksa ksaVar) {
        nkw nkwVar = nkw.UNINITIALIZED;
        switch (ksaVar.ordinal()) {
            case 31:
                return R.drawable.gs_full_hd_fill1_vd_theme_24;
            case 32:
                return R.drawable.gs_4k_fill1_vd_theme_24;
            case 33:
                return R.drawable.gs_8k_fill1_vd_theme_24;
            default:
                throw new IllegalArgumentException("Not a valid option: ".concat(String.valueOf(String.valueOf(ksaVar))));
        }
    }

    @Override // defpackage.krz
    public final int e() {
        return R.string.video_res;
    }

    @Override // defpackage.kro, defpackage.krz
    public final void ec(krj krjVar) {
        krjVar.L.d(this.n.dK(new fun(this, krjVar, 6), sxo.a));
    }

    @Override // defpackage.kro, defpackage.krz
    public final void ed(kqy kqyVar, boolean z) {
        boolean z2;
        boolean zEquals;
        boolean zEquals2;
        kqy kqyVar2;
        nkw nkwVarD = kqyVar.d();
        nkw nkwVar = nkw.UNINITIALIZED;
        int iOrdinal = nkwVarD.ordinal();
        boolean z3 = true;
        boolean z4 = false;
        boolean z5 = iOrdinal == 2 || iOrdinal == 5 || iOrdinal == 8 || iOrdinal == 11 || iOrdinal == 19 || iOrdinal == 13 || iOrdinal == 14;
        if (((Boolean) this.b.dL()).booleanValue() && ((nkw) this.n.dL()).a()) {
            ovx ovxVar = (ovx) this.q;
            boolean zEquals3 = ((ksa) ovxVar.d).equals(ksa.RES_4320P) & z5;
            zEquals = ((ksa) ovxVar.d).equals(ksa.RES_2160P) & z5;
            zEquals2 = ((ksa) ovxVar.d).equals(ksa.RES_1080P) & z5;
            z2 = false;
            z4 = zEquals3;
        } else {
            owq owqVar = this.i;
            boolean zE = ((oxj) owqVar.dL()).e() & z5;
            boolean zD = ((oxj) owqVar.dL()).d() & z5;
            oxj oxjVar = (oxj) owqVar.dL();
            if (oxjVar != oxj.RES_720P && oxjVar != oxj.RES_720P_3X4) {
                z3 = false;
            }
            z2 = z5 & z3;
            zEquals = zE;
            zEquals2 = zD;
        }
        if (z4) {
            kqyVar2 = kqyVar;
        } else {
            kqyVar2 = kqyVar;
            kqyVar2.g(false, R.drawable.gs_8k_fill1_vd_theme_24, R.string.video_res_8k_desc, "VideoResolution", krs.p);
        }
        if (!zEquals) {
            kqyVar2.g(false, R.drawable.gs_4k_fill1_vd_theme_24, R.string.video_res_4k_desc, "VideoResolution", krs.p);
        }
        if (!zEquals2) {
            kqyVar2.g(false, R.drawable.gs_full_hd_fill1_vd_theme_24, R.string.video_res_fhd_desc, "VideoResolution", krs.p);
        }
        if (!z2) {
            kqyVar2.g(false, R.drawable.gs_hd_fill1_vd_theme_24, R.string.video_res_hd_desc, "VideoResolution", krs.p);
        }
        if (z4) {
            kqyVar2.g(true, R.drawable.gs_8k_fill1_vd_theme_24, R.string.video_res_8k_desc, "VideoResolution", krs.p);
            return;
        }
        if (zEquals) {
            kqyVar2.g(true, R.drawable.gs_4k_fill1_vd_theme_24, R.string.video_res_4k_desc, "VideoResolution", krs.p);
        } else if (zEquals2) {
            kqyVar2.g(true, R.drawable.gs_full_hd_fill1_vd_theme_24, R.string.video_res_fhd_desc, "VideoResolution", krs.p);
        } else if (z2) {
            kqyVar2.g(true, R.drawable.gs_hd_fill1_vd_theme_24, R.string.video_res_hd_desc, "VideoResolution", krs.p);
        }
    }

    @Override // defpackage.kro
    protected final int f(ksa ksaVar) {
        nkw nkwVar = nkw.UNINITIALIZED;
        switch (ksaVar.ordinal()) {
            case 31:
                return R.string.video_res_fhd;
            case 32:
                return R.string.video_res_4k;
            case 33:
                return R.string.video_res_8k;
            default:
                return 0;
        }
    }

    @Override // defpackage.krz
    public final krs h() {
        return krs.p;
    }

    @Override // defpackage.krz
    public final owq j() {
        return this.q;
    }

    @Override // defpackage.krz
    public final sbp l() {
        return (hax.b(this.r) && ((nkw) this.n.dL()).a() && ((ovx) this.o).d == pka.BACK) ? sbp.n(ksa.RES_1080P, ksa.RES_2160P, ksa.RES_4320P) : sbp.m(ksa.RES_1080P, ksa.RES_2160P);
    }

    public final ksa m() {
        lty ltyVar = (lty) u().dL();
        nkw nkwVar = nkw.UNINITIALIZED;
        int iOrdinal = ltyVar.ordinal();
        if (iOrdinal == 0) {
            return ksa.RES_1080P;
        }
        if (iOrdinal == 1) {
            return ksa.RES_2160P;
        }
        if (iOrdinal == 2) {
            return ksa.RES_4320P;
        }
        throw new RuntimeException(null, null);
    }

    @Override // defpackage.krz
    public final void n(krj krjVar) {
        z(krjVar);
    }

    @Override // defpackage.krz
    public final boolean p(krj krjVar) {
        if (!this.r.p(haf.b)) {
            return false;
        }
        nkw nkwVarD = krjVar.d();
        return (nkwVarD.equals(nkw.TIME_LAPSE) && ((Boolean) this.g.dL()).booleanValue()) || ((nkwVarD.equals(nkw.VIDEO) || nkwVarD.equals(nkw.VIDEO_NIGHT_SIGHT) || nkwVarD.equals(nkw.ROOSTER)) && ((Boolean) this.h.dL()).booleanValue());
    }

    public final owq u() {
        return (((Boolean) this.b.dL()).booleanValue() && ((ovx) this.o).d == pka.BACK && ((nkw) this.n.dL()).a()) ? this.e : this.d;
    }

    @Override // defpackage.kro, defpackage.ksb
    public final boolean v(krs krsVar, ksa ksaVar, boolean z) {
        if (!this.r.p(gza.b) || !ksaVar.equals(ksa.RES_2160P) || !this.k.b()) {
            return ksaVar.equals(ksa.RES_4320P) ? this.s.h(nkw.VIDEO) || ((mgh) this.j.a()).c(z, R.string.resolution_8k_turn_off_storage_saver_dialog_body) : ((mgh) this.j.a()).v(krsVar, ksaVar, z);
        }
        Context context = this.m;
        FrameLayout frameLayout = new FrameLayout(context);
        View.inflate(context, R.layout.video_resolution_bottomsheet, frameLayout);
        this.l.m(18, R.string.video_resolution_bottomsheet_title, frameLayout);
        return true;
    }

    @Override // defpackage.kro, defpackage.krz
    public final boolean w(kqy kqyVar, ksa ksaVar) {
        if (kqyVar.d().equals(nkw.TIME_LAPSE) && ((Boolean) this.g.dL()).booleanValue() && ((Boolean) this.f.dL()).booleanValue()) {
            return q(ksaVar).equals(lty.b((oxj) this.i.dL()).c());
        }
        return true;
    }

    public final void y() {
        owq owqVar = this.q;
        ksa ksaVarM = m();
        if (((ksa) ((ovx) owqVar).d).equals(ksaVarM)) {
            return;
        }
        owqVar.a(ksaVarM);
    }

    public final void z(krj krjVar) {
        if (this.p) {
            return;
        }
        our ourVar = krjVar.L;
        owf owfVarA = owl.a(this.d, this.e);
        gmd gmdVar = new gmd(this, 1);
        sxo sxoVar = sxo.a;
        ourVar.d(owfVarA.dK(gmdVar, sxoVar));
        ourVar.d(this.q.dK(new gmd(this, 0), sxoVar));
        ourVar.d(this.g.dK(new gmd(krjVar, 2), sxoVar));
        ourVar.d(this.h.dK(new gmd(krjVar, 3), sxoVar));
        ourVar.d(this.i.dK(new gmd(krjVar, 4), sxoVar));
        ourVar.d(this.b.dK(new glc(this, krjVar, 9), sxoVar));
        ourVar.d(this.f.dK(new gmd(krjVar, 5), sxoVar));
        ourVar.d(this.n.dK(new gmd(this, 6), sxoVar));
        ourVar.d(this.o.dK(new gmd(this, 7), sxoVar));
        this.p = true;
    }
}
