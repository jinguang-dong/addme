package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bro extends ujq implements uiu {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bro(Object obj, int i) {
        super(2);
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v21, types: [btu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6, types: [ayc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v20, types: [btu, java.lang.Object] */
    @Override // defpackage.uiu
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                return Float.valueOf(bqs.g((btd) obj, true, (btk[]) this.a, ((Number) obj2).floatValue()));
            case 1:
                bik bikVar = (bik) obj;
                bik bikVarU = (bii) obj2;
                if (bikVarU instanceof big) {
                    uiv uivVar = ((big) bikVarU).a;
                    ukc.e(uivVar, 3);
                    ?? r4 = this.a;
                    bikVarU = bay.u(r4, (bik) uivVar.a(bik.c, r4, 0));
                }
                return bikVar.cM(bikVarU);
            case 2:
                return Float.valueOf(bqs.g((btd) obj, false, (btk[]) this.a, ((Number) obj2).floatValue()));
            case 3:
                ((hls) this.a).e().b = (ayk) obj2;
                return ufg.a;
            case 4:
                bsn bsnVarE = ((hls) this.a).e();
                ((bvm) obj).X(new bsi(bsnVarE, (uiu) obj2, bsnVarE.k));
                return ufg.a;
            case 5:
                bvm bvmVar = (bvm) obj;
                bsn bsnVar = bvmVar.u;
                Object obj3 = this.a;
                if (bsnVar == null) {
                    bsn bsnVar2 = new bsn(bvmVar, ((hls) obj3).e);
                    bvmVar.u = bsnVar2;
                    bsnVar = bsnVar2;
                }
                hls hlsVar = (hls) obj3;
                hlsVar.c = bsnVar;
                hlsVar.e().h();
                bsn bsnVarE2 = hlsVar.e();
                ?? r42 = hlsVar.e;
                if (bsnVarE2.c != r42) {
                    bsnVarE2.c = r42;
                    bsnVarE2.i(false);
                    bvm.ar(bsnVarE2.a, false, 7);
                }
                return ufg.a;
            case 6:
                return Float.valueOf(bqs.g((btd) obj, true, (btk[]) this.a, ((Number) obj2).floatValue()));
            case 7:
                return Float.valueOf(bqs.g((btd) obj, false, (btk[]) this.a, ((Number) obj2).floatValue()));
            default:
                ayc aycVar = (ayc) obj;
                int iIntValue = ((Number) obj2).intValue();
                int i = iIntValue & 3;
                if (aycVar.H(i != 2, iIntValue & 1)) {
                    ((bxg) this.a).a(aycVar, 0);
                } else {
                    aycVar.r();
                }
                return ufg.a;
        }
    }
}
