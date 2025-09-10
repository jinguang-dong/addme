package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.google.android.apps.camera.ui.layout.MainActivityLayout;
import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ksk extends kro implements mxl {
    private final owq a;
    private final ngw b;
    private final Drawable c;
    private final Drawable d;
    private final sbp e;
    private final owf f;
    private final owf g;
    private final jug h;
    private final hbj i;

    public ksk(luj lujVar, Resources resources, ngw ngwVar, hbj hbjVar, jug jugVar, owf owfVar) {
        this.b = ngwVar;
        ksa ksaVar = ksa.ASPECT_RATIO_SIXTEEN_BY_NINE;
        ksa ksaVar2 = ksa.ASPECT_RATIO_FOUR_BY_THREE;
        this.e = sbp.m(ksaVar, ksaVar2);
        lus lusVar = luf.e;
        this.a = new krp(lujVar.a(lusVar), (Integer) lusVar.d(hbjVar), 0, ksaVar, 1, ksaVar2);
        this.c = resources.getDrawable(R.drawable.ic_ratio_standard_rotate, null);
        this.d = resources.getDrawable(R.drawable.ic_ratio_full_rotate, null);
        this.i = hbjVar;
        this.h = jugVar;
        this.f = jugVar.c;
        this.g = owfVar;
    }

    @Override // defpackage.kro, defpackage.krz
    public final Drawable B(ksa ksaVar, Resources resources) {
        nkw nkwVar = nkw.UNINITIALIZED;
        int iOrdinal = ksaVar.ordinal();
        if (iOrdinal == 65) {
            return this.d;
        }
        if (iOrdinal == 66) {
            return this.c;
        }
        throw new IllegalArgumentException("Invalid option: ".concat(String.valueOf(String.valueOf(ksaVar))));
    }

    @Override // defpackage.krz
    public final int a() {
        return R.string.aspect_ratio_desc;
    }

    @Override // defpackage.kro
    protected final int b(ksa ksaVar) {
        nkw nkwVar = nkw.UNINITIALIZED;
        int iOrdinal = ksaVar.ordinal();
        if (iOrdinal == 65) {
            return R.string.sixteen_by_nine_desc;
        }
        if (iOrdinal == 66) {
            return R.string.four_by_three_desc;
        }
        throw new IllegalArgumentException("Invalid option: ".concat(String.valueOf(String.valueOf(ksaVar))));
    }

    @Override // defpackage.krz
    public final int e() {
        return R.string.aspect_ratio_desc;
    }

    @Override // defpackage.mxl
    public final void eH(mxm mxmVar) {
        if (mxmVar.d()) {
            this.c.setLevel(0);
            this.d.setLevel(0);
        } else {
            this.c.setLevel(2500);
            this.d.setLevel(2500);
        }
    }

    @Override // defpackage.kro
    protected final int f(ksa ksaVar) {
        nkw nkwVar = nkw.UNINITIALIZED;
        int iOrdinal = ksaVar.ordinal();
        if (iOrdinal == 65) {
            return R.string.sixteen_by_nine;
        }
        if (iOrdinal == 66) {
            return R.string.four_by_three;
        }
        throw new IllegalArgumentException("Invalid option: ".concat(String.valueOf(String.valueOf(ksaVar))));
    }

    @Override // defpackage.krz
    public final krs h() {
        return krs.IMAGE_ASPECT_RATIO;
    }

    @Override // defpackage.krz
    public final owq j() {
        return this.a;
    }

    @Override // defpackage.krz
    public final sbp l() {
        return this.e;
    }

    @Override // defpackage.krz
    public final void n(krj krjVar) {
        ((MainActivityLayout) this.b.c).i(this, mxk.DEVICE);
        juf jufVar = new juf(krjVar, 16);
        sxo sxoVar = sxo.a;
        paq paqVarDK = this.f.dK(jufVar, sxoVar);
        our ourVar = krjVar.L;
        ourVar.d(paqVarDK);
        ourVar.d(this.g.dK(new juf(krjVar, 17), sxoVar));
    }

    @Override // defpackage.krz
    public final boolean p(krj krjVar) {
        if (((Boolean) ((ovx) this.f).d).booleanValue()) {
            return false;
        }
        if (this.i.p(gza.b)) {
            jug jugVar = this.h;
            if (jugVar.c(jugVar.b.a())) {
                return false;
            }
        }
        nkw nkwVar = nkw.UNINITIALIZED;
        int iOrdinal = krjVar.d().ordinal();
        return iOrdinal == 1 || iOrdinal == 6 || iOrdinal == 10 || iOrdinal == 18 || iOrdinal == 15 || iOrdinal == 16;
    }

    @Override // defpackage.mxl
    public final /* synthetic */ void eR(mxj mxjVar, mxm mxmVar) {
    }
}
