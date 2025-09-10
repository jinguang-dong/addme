package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class apu implements blp {
    public final apv a;
    public final apv b;
    public final apv c;
    public final apv d;

    public apu(apv apvVar, apv apvVar2, apv apvVar3, apv apvVar4) {
        this.a = apvVar;
        this.b = apvVar2;
        this.c = apvVar3;
        this.d = apvVar4;
    }

    public static /* synthetic */ apu c(apu apuVar, apv apvVar, apv apvVar2, apv apvVar3, apv apvVar4, int i) {
        if ((i & 1) != 0) {
            apvVar = apuVar.a;
        }
        if ((i & 2) != 0) {
            apvVar2 = apuVar.b;
        }
        if ((i & 4) != 0) {
            apvVar3 = apuVar.c;
        }
        if ((i & 8) != 0) {
            apvVar4 = apuVar.d;
        }
        return new apz(apvVar, apvVar2, apvVar3, apvVar4);
    }

    @Override // defpackage.blp
    public final blh a(long j, cib cibVar, chq chqVar) {
        apv apvVar = this.d;
        apv apvVar2 = this.c;
        apv apvVar3 = this.b;
        float fA = this.a.a(j, chqVar);
        float fA2 = apvVar3.a(j, chqVar);
        float fA3 = apvVar2.a(j, chqVar);
        float fA4 = apvVar.a(j, chqVar);
        float f = fA + fA4;
        float fA5 = bki.a(j);
        if (f > fA5) {
            float f2 = fA5 / f;
            fA *= f2;
            fA4 *= f2;
        }
        float f3 = fA2 + fA3;
        if (f3 > fA5) {
            float f4 = fA5 / f3;
            fA2 *= f4;
            fA3 *= f4;
        }
        float f5 = fA2;
        if (fA < 0.0f || f5 < 0.0f || fA3 < 0.0f || fA4 < 0.0f) {
            akg.b("Corner size in Px can't be negative(topStart = " + fA + ", topEnd = " + f5 + ", bottomEnd = " + fA3 + ", bottomStart = " + fA4 + ")!");
        }
        return b(j, fA, f5, fA3, fA4, cibVar);
    }

    public abstract blh b(long j, float f, float f2, float f3, float f4, cib cibVar);
}
