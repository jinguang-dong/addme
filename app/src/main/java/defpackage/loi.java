package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class loi {
    public final loh[] a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final long f;
    public final ggg[] g;

    public loi(tup tupVar) {
        this.b = tupVar.m;
        tuo tuoVar = tupVar.l;
        float f = (tuoVar == null ? tuo.a : tuoVar).f;
        tuo tuoVar2 = tupVar.l;
        this.c = (tuoVar2 == null ? tuo.a : tuoVar2).h;
        this.d = (tuoVar2 == null ? tuo.a : tuoVar2).g;
        this.e = (tuoVar2 == null ? tuo.a : tuoVar2).i;
        this.f = tupVar.d;
        tto ttoVar = tupVar.g;
        ttoVar = ttoVar == null ? tto.a : ttoVar;
        this.a = new loh[ttoVar.b.size()];
        int i = 0;
        int i2 = 0;
        while (true) {
            loh[] lohVarArr = this.a;
            if (i2 >= lohVarArr.length) {
                break;
            }
            lohVarArr[i2] = new loh((ttn) ttoVar.b.get(i2), tupVar.j);
            i2++;
        }
        tto ttoVar2 = tupVar.h;
        ttoVar2 = ttoVar2 == null ? tto.a : ttoVar2;
        this.g = new ggg[ttoVar2.b.size()];
        while (true) {
            ggg[] gggVarArr = this.g;
            if (i >= gggVarArr.length) {
                return;
            }
            gggVarArr[i] = new ggg((ttn) ttoVar2.b.get(i));
            i++;
        }
    }

    public final sbp a() {
        return sbp.k(this.a);
    }
}
