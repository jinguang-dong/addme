package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aww implements blp {
    final /* synthetic */ awz a;
    private final azr b = new azz(new ukr(1.0f), bap.c);

    public aww(awz awzVar) {
        this.a = awzVar;
    }

    @Override // defpackage.blp
    public final blh a(long j, cib cibVar, chq chqVar) {
        awz awzVar = this.a;
        awzVar.c = j;
        this.b.b(new ukr(Float.intBitsToFloat((int) (j & 4294967295L)) / 2.0f));
        long j2 = awzVar.c;
        chq chqVar2 = awzVar.d;
        abr abrVarA = awzVar.e;
        if (abrVarA == null) {
            abrVarA = abs.a(awzVar.a.a.a(j2, chqVar2));
            awzVar.e = abrVarA;
        }
        float fFloatValue = ((Number) ukc.v(Float.valueOf(((Number) abrVarA.d()).floatValue()), b())).floatValue();
        long j3 = awzVar.c;
        chq chqVar3 = awzVar.d;
        abr abrVarA2 = awzVar.f;
        if (abrVarA2 == null) {
            abrVarA2 = abs.a(awzVar.a.b.a(j3, chqVar3));
            awzVar.f = abrVarA2;
        }
        float fFloatValue2 = ((Number) ukc.v(Float.valueOf(((Number) abrVarA2.d()).floatValue()), b())).floatValue();
        long j4 = awzVar.c;
        chq chqVar4 = awzVar.d;
        abr abrVarA3 = awzVar.g;
        if (abrVarA3 == null) {
            abrVarA3 = abs.a(awzVar.a.d.a(j4, chqVar4));
            awzVar.g = abrVarA3;
        }
        float fFloatValue3 = ((Number) ukc.v(Float.valueOf(((Number) abrVarA3.d()).floatValue()), b())).floatValue();
        long j5 = awzVar.c;
        chq chqVar5 = awzVar.d;
        abr abrVarA4 = awzVar.h;
        if (abrVarA4 == null) {
            abrVarA4 = abs.a(awzVar.a.c.a(j5, chqVar5));
            awzVar.h = abrVarA4;
        }
        float fFloatValue4 = ((Number) ukc.v(Float.valueOf(((Number) abrVarA4.d()).floatValue()), b())).floatValue();
        apz apzVar = aqa.a;
        return new apz(new apy(fFloatValue), new apy(fFloatValue2), new apy(fFloatValue4), new apy(fFloatValue3)).a(j, cibVar, chqVar);
    }

    public final ukr b() {
        return (ukr) this.b.a();
    }
}
