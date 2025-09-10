package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.google.android.apps.camera.ui.layout.MainActivityLayout;
import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ksn extends kro implements mxl {
    private final owq a;
    private final owf b;
    private final ngw c;
    private final Drawable d;
    private final Drawable e;
    private final sbp f;
    private final owf g;
    private final owf h;
    private int i = 0;
    private final hbj j;
    private final /* synthetic */ int k;

    public ksn(luj lujVar, Resources resources, ngw ngwVar, hbj hbjVar, jug jugVar, owf owfVar, owf owfVar2, int i, byte[] bArr) {
        this.k = i;
        this.c = ngwVar;
        this.b = owfVar2;
        ksa ksaVar = ksa.ASPECT_RATIO_THREE_BY_FOUR;
        ksa ksaVar2 = ksa.ASPECT_RATIO_FOUR_BY_THREE;
        this.f = sbp.m(ksaVar, ksaVar2);
        lus lusVar = luf.g;
        this.a = new krp(lujVar.a(lusVar), (Integer) lusVar.d(hbjVar), 2, ksaVar, 1, ksaVar2);
        this.e = resources.getDrawable(R.drawable.ic_ratio_standard_rotate, null);
        this.d = resources.getDrawable(R.drawable.ic_ratio_3by4_rotate, null);
        this.j = hbjVar;
        this.g = jugVar.c;
        this.h = owfVar;
    }

    @Override // defpackage.kro, defpackage.krz
    public final Drawable B(ksa ksaVar, Resources resources) {
        if (this.k != 0) {
            this.i = ((Integer) this.h.dL()).intValue() % 180 != 90 ? 2500 : 0;
            nkw nkwVar = nkw.UNINITIALIZED;
            int iOrdinal = ksaVar.ordinal();
            if (iOrdinal == 66) {
                Drawable drawable = this.e;
                drawable.setLevel(this.i);
                return drawable;
            }
            if (iOrdinal != 67) {
                throw new IllegalArgumentException("Invalid option: ".concat(String.valueOf(String.valueOf(ksaVar))));
            }
            Drawable drawable2 = this.d;
            drawable2.setLevel(this.i);
            return drawable2;
        }
        this.i = ((Integer) this.h.dL()).intValue() % 180 != 90 ? 2500 : 0;
        nkw nkwVar2 = nkw.UNINITIALIZED;
        int iOrdinal2 = ksaVar.ordinal();
        if (iOrdinal2 == 34) {
            Drawable drawable3 = this.d;
            drawable3.setLevel(this.i);
            return drawable3;
        }
        if (iOrdinal2 != 35) {
            throw new IllegalArgumentException("Invalid option: ".concat(String.valueOf(String.valueOf(ksaVar))));
        }
        Drawable drawable4 = this.e;
        drawable4.setLevel(this.i);
        return drawable4;
    }

    @Override // defpackage.krz
    public final int a() {
        return R.string.aspect_ratio_desc;
    }

    @Override // defpackage.kro
    protected final int b(ksa ksaVar) {
        if (this.k != 0) {
            nkw nkwVar = nkw.UNINITIALIZED;
            int iOrdinal = ksaVar.ordinal();
            if (iOrdinal == 66) {
                return R.string.four_by_three_desc;
            }
            if (iOrdinal == 67) {
                return R.string.three_by_four_desc;
            }
            throw new IllegalArgumentException("Invalid option: ".concat(String.valueOf(String.valueOf(ksaVar))));
        }
        nkw nkwVar2 = nkw.UNINITIALIZED;
        int iOrdinal2 = ksaVar.ordinal();
        if (iOrdinal2 == 34) {
            return R.string.sixteen_by_nine_desc;
        }
        if (iOrdinal2 == 35) {
            return R.string.three_by_four_desc;
        }
        throw new IllegalArgumentException("Invalid option: ".concat(String.valueOf(String.valueOf(ksaVar))));
    }

    @Override // defpackage.krz
    public final int e() {
        return R.string.aspect_ratio_desc;
    }

    @Override // defpackage.mxl
    public final void eR(mxj mxjVar, mxm mxmVar) {
        if (this.k != 0) {
            if (mxjVar.equals(mxj.JARVIS_LAYOUT)) {
                mxmVar = mxm.LANDSCAPE;
            }
            if (mxmVar.d()) {
                this.e.setLevel(0);
                this.d.setLevel(0);
                return;
            } else {
                this.e.setLevel(2500);
                this.d.setLevel(2500);
                return;
            }
        }
        if (mxjVar.equals(mxj.JARVIS_LAYOUT)) {
            mxmVar = mxm.LANDSCAPE;
        }
        if (mxmVar.d()) {
            this.e.setLevel(0);
            this.d.setLevel(0);
        } else {
            this.e.setLevel(2500);
            this.d.setLevel(2500);
        }
    }

    @Override // defpackage.kro
    protected final int f(ksa ksaVar) {
        if (this.k != 0) {
            nkw nkwVar = nkw.UNINITIALIZED;
            int iOrdinal = ksaVar.ordinal();
            if (iOrdinal == 66) {
                return R.string.four_by_three;
            }
            if (iOrdinal == 67) {
                return R.string.three_by_four;
            }
            throw new IllegalArgumentException("Invalid option: ".concat(String.valueOf(String.valueOf(ksaVar))));
        }
        nkw nkwVar2 = nkw.UNINITIALIZED;
        int iOrdinal2 = ksaVar.ordinal();
        if (iOrdinal2 == 34) {
            return R.string.sixteen_by_nine;
        }
        if (iOrdinal2 == 35) {
            return R.string.three_by_four;
        }
        throw new IllegalArgumentException("Invalid option: ".concat(String.valueOf(String.valueOf(ksaVar))));
    }

    @Override // defpackage.krz
    public final krs h() {
        return this.k != 0 ? krs.IMAGE_ASPECT_RATIO_IMMERSIVE : krs.VIDEO_ASPECT_RATIO;
    }

    @Override // defpackage.krz
    public final owq j() {
        int i = this.k;
        return this.a;
    }

    @Override // defpackage.krz
    public final sbp l() {
        int i = this.k;
        return this.f;
    }

    @Override // defpackage.krz
    public final void n(krj krjVar) {
        if (this.k != 0) {
            ngw ngwVar = this.c;
            ((MainActivityLayout) ngwVar.c).i(this, mxk.DEVICE);
            juf jufVar = new juf(krjVar, 18);
            owf owfVar = this.g;
            sxo sxoVar = sxo.a;
            paq paqVarDK = owfVar.dK(jufVar, sxoVar);
            our ourVar = krjVar.L;
            ourVar.d(paqVarDK);
            ourVar.d(this.b.dK(new juf(krjVar, 19), sxoVar));
            return;
        }
        ngw ngwVar2 = this.c;
        ((MainActivityLayout) ngwVar2.c).i(this, mxk.DEVICE);
        juf jufVar2 = new juf(krjVar, 20);
        owf owfVar2 = this.g;
        sxo sxoVar2 = sxo.a;
        paq paqVarDK2 = owfVar2.dK(jufVar2, sxoVar2);
        our ourVar2 = krjVar.L;
        ourVar2.d(paqVarDK2);
        ourVar2.d(this.b.dK(new kso(krjVar, 1), sxoVar2));
    }

    @Override // defpackage.krz
    public final boolean p(krj krjVar) {
        if (this.k != 0) {
            if (this.j.p(gza.b) && ((Boolean) ((ovx) this.g).d).booleanValue() && !((Boolean) this.b.dL()).booleanValue()) {
                nkw nkwVar = nkw.UNINITIALIZED;
                int iOrdinal = krjVar.d().ordinal();
                if (iOrdinal == 1 || iOrdinal == 6 || iOrdinal == 10 || iOrdinal == 15 || iOrdinal == 16) {
                    return true;
                }
            }
            return false;
        }
        if (this.j.p(gza.b) && ((Boolean) ((ovx) this.g).d).booleanValue() && !((Boolean) this.b.dL()).booleanValue()) {
            nkw nkwVar2 = nkw.UNINITIALIZED;
            int iOrdinal2 = krjVar.d().ordinal();
            if (iOrdinal2 == 2 || iOrdinal2 == 5 || iOrdinal2 == 11 || iOrdinal2 == 13 || iOrdinal2 == 14) {
                return true;
            }
        }
        return false;
    }

    public ksn(luj lujVar, Resources resources, ngw ngwVar, hbj hbjVar, jug jugVar, owf owfVar, owf owfVar2, int i) {
        this.k = i;
        this.c = ngwVar;
        this.b = owfVar2;
        ksa ksaVar = ksa.VIDEO_ASPECT_RATIO_SIXTEEN_BY_NINE;
        ksa ksaVar2 = ksa.VIDEO_ASPECT_RATIO_THREE_BY_FOUR;
        this.f = sbp.m(ksaVar, ksaVar2);
        lus lusVar = luf.f;
        this.a = new krp(lujVar.a(lusVar), (Integer) lusVar.d(hbjVar), Integer.valueOf(qpt.bB(1)), ksaVar, Integer.valueOf(qpt.bB(2)), ksaVar2);
        this.d = resources.getDrawable(R.drawable.ic_ratio_full_rotate, null);
        this.e = resources.getDrawable(R.drawable.ic_ratio_3by4_rotate, null);
        this.j = hbjVar;
        this.g = jugVar.c;
        this.h = owfVar;
    }

    @Override // defpackage.mxl
    public final /* synthetic */ void eH(mxm mxmVar) {
    }
}
