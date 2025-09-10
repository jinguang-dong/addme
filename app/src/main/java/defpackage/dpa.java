package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class dpa implements uiq {
    public final /* synthetic */ float a;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ dpa(float f, float f2, dji djiVar, int i) {
        this.d = i;
        this.a = f;
        this.b = f2;
        this.c = djiVar;
    }

    @Override // defpackage.uiq
    public final Object a(Object obj) {
        int i = this.d;
        if (i == 0) {
            blm blmVar = (blm) obj;
            long j = blmVar.p & 4294967295L;
            float f = this.a;
            blmVar.l(ukc.m(((aci) this.c).a((Float.intBitsToFloat((int) j) - f) / (this.b - f)), 0.0f, 1.0f));
            return ufg.a;
        }
        if (i == 1) {
            djj djjVar = ((dji) this.c).a;
            djk djkVar = (djk) obj;
            float f2 = this.b;
            float f3 = this.a;
            if (djjVar != null) {
                float f4 = djkVar.d;
                f3 -= (f2 - f4) * 0.5f;
                f2 = f4;
            }
            djkVar.p(f3, f2);
            return Float.valueOf(djkVar.n());
        }
        bvo bvoVar = (bvo) obj;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (bvoVar.m() & 4294967295L));
        float f5 = this.a;
        float fM = ukc.m(((aci) this.c).a((fIntBitsToFloat - f5) / (this.b - f5)), 0.0f, 1.0f);
        bvoVar.p();
        long jM = bvoVar.m();
        char c = ' ';
        float fMax = Math.max(Float.intBitsToFloat((int) ((jM >> 32) & 2147483647L)), Float.intBitsToFloat((int) (jM & 2147483647L))) / 2.0f;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (bvoVar.m() & 4294967295L)) - fMax;
        long jFloatToRawIntBits = Float.floatToRawIntBits(fMax);
        long jFloatToRawIntBits2 = Float.floatToRawIntBits(fIntBitsToFloat2);
        Float fValueOf = Float.valueOf(0.875f);
        long j2 = bkv.b;
        uev uevVar = new uev(fValueOf, new bkv(bko.k(bkv.d(j2), bkv.c(j2), bkv.b(j2), fM, bkv.f(j2))));
        uev[] uevVarArr = {uevVar, new uev(Float.valueOf(1.0f), new bkv(bkv.e))};
        long j3 = jFloatToRawIntBits2;
        ArrayList arrayList = new ArrayList(2);
        int i2 = 0;
        while (i2 < 2) {
            arrayList.add(new bkv(((bkv) uevVarArr[i2].b).g));
            i2++;
            c = c;
            j3 = j3;
        }
        char c2 = c;
        long j4 = j3;
        ArrayList arrayList2 = new ArrayList(2);
        for (int i3 = 0; i3 < 2; i3++) {
            arrayList2.add(Float.valueOf(((Number) uevVarArr[i3].a).floatValue()));
        }
        byi.J(bvoVar, new blj(arrayList, arrayList2, (jFloatToRawIntBits << c2) | (j4 & 4294967295L), fMax), 13);
        return ufg.a;
    }

    public /* synthetic */ dpa(aci aciVar, float f, float f2, int i) {
        this.d = i;
        this.c = aciVar;
        this.a = f;
        this.b = f2;
    }
}
