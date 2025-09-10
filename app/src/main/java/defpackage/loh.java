package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class loh {
    public final long a;
    public final rwc b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final rwc i;
    public final float j;
    public final rwc k;
    public final rwc l;

    public loh(ttn ttnVar, boolean z) {
        rwc rwcVarJ;
        rwc rwcVarJ2;
        float f;
        rwc rwcVarJ3;
        tql tqlVar = tuw.j;
        ttnVar.i(tqlVar);
        Object objK = ttnVar.r.k((tpg) tqlVar.c);
        if (objK == null) {
            objK = tqlVar.b;
        } else {
            tqlVar.b(objK);
        }
        tuw tuwVar = (tuw) objK;
        boolean z2 = ((ttnVar.b & 128) == 0 || z) ? false : true;
        this.a = (int) ttnVar.j;
        this.b = z2 ? rwc.j(Long.valueOf(ttnVar.k)) : rvk.a;
        this.c = tuwVar.e;
        this.d = tuwVar.f;
        float f2 = tuwVar.g;
        this.g = Math.max(Math.abs(ttnVar.g), Math.abs(ttnVar.h));
        if ((tuwVar.b & 1) != 0) {
            tut tutVar = tuwVar.c;
            rwcVarJ = rwc.j(sbp.j((tutVar == null ? tut.a : tutVar).b));
        } else {
            rwcVarJ = rvk.a;
        }
        this.l = rwcVarJ;
        if (rwcVarJ.h()) {
            this.e = ((Float) ((sbp) rwcVarJ.c()).get(9)).floatValue();
            this.f = ((Float) ((sbp) rwcVarJ.c()).get(10)).floatValue();
            Math.max(((Float) ((sbp) rwcVarJ.c()).get(16)).floatValue(), ((Float) ((sbp) rwcVarJ.c()).get(17)).floatValue());
            this.h = ((Float) ((sbp) rwcVarJ.c()).get(11)).floatValue();
        } else {
            this.e = -1.0f;
            this.f = -1.0f;
            this.h = -1.0f;
        }
        if ((tuwVar.b & 2) != 0) {
            tut tutVar2 = tuwVar.d;
            rwcVarJ2 = rwc.j(sbp.j((tutVar2 == null ? tut.a : tutVar2).b));
        } else {
            rwcVarJ2 = rvk.a;
        }
        this.k = rwcVarJ2;
        boolean z3 = (tuwVar.b & 64) != 0;
        if (z3) {
            tux tuxVar = tuwVar.i;
            f = (tuxVar == null ? tux.a : tuxVar).d;
        } else {
            f = 0.0f;
        }
        this.j = f;
        if (z3) {
            tux tuxVar2 = tuwVar.i;
            rwcVarJ3 = rwc.j(sbp.j((tuxVar2 == null ? tux.a : tuxVar2).c));
        } else {
            rwcVarJ3 = rvk.a;
        }
        this.i = rwcVarJ3;
    }

    public final float a() {
        float f = this.e;
        float f2 = this.h;
        float f3 = this.f;
        float f4 = this.d;
        float f5 = ((((f * 0.35955f) + (f2 * 0.98606f)) + (f3 * 0.894719f)) + (f4 * 0.46203f)) / 2.702359f;
        return this.g <= 35.0f ? f5 : (float) (f5 * Math.pow(Math.cos(((r6 - 35.0f) * 1.5707963267948966d) / 145.0d), 2.0d));
    }
}
