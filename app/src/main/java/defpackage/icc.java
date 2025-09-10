package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class icc implements Supplier {
    public boolean a = false;
    private final iao b;
    private final ibb c;
    private final owf d;
    private final float e;

    public icc(mhq mhqVar, mhp mhpVar, iao iaoVar, ibb ibbVar, owf owfVar, hbj hbjVar, our ourVar) {
        this.b = iaoVar;
        this.c = ibbVar;
        this.d = owfVar;
        this.e = ((Integer) hbjVar.a(gzs.l).orElse(-1)).intValue() <= 0 ? ((Float) hbjVar.e(gzs.Z).orElse(Float.valueOf(999.0f))).floatValue() : 999.0f;
        mhs mhsVar = new mhs();
        mhsVar.c(sxo.a);
        mhsVar.d("TemporalBinning");
        mhsVar.g(mhpVar);
        mhsVar.f(new icb(this, false));
        mhsVar.e(new icb(this, true));
        ourVar.d(mhqVar.d(mhsVar.a()));
    }

    @Override // java.util.function.Supplier
    public final /* bridge */ /* synthetic */ Object get() {
        synchronized (this) {
            if (this.a) {
                return false;
            }
            float fFloatValue = ((Float) this.d.dL()).floatValue();
            if (fFloatValue != -999.0f && fFloatValue >= this.e) {
                return false;
            }
            ibb ibbVar = this.c;
            if (!ibbVar.e()) {
                iao iaoVar = this.b;
                return Boolean.valueOf(iaoVar == iao.REGULAR || iaoVar == iao.PORTRAIT || iaoVar == iao.SERENGETI);
            }
            if (ibbVar.m() && ibbVar.b.i) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }
}
