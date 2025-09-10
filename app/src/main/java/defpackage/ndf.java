package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class ndf implements uiq {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public /* synthetic */ ndf(int i, int i2, zm zmVar, tym tymVar, int i3) {
        this.e = i3;
        this.a = i;
        this.b = i2;
        this.d = zmVar;
        this.c = tymVar;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, uiq] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, uiq] */
    @Override // defpackage.uiq
    public final Object a(Object obj) {
        if (this.e == 0) {
            float fFloatValue = ((Float) obj).floatValue();
            int i = this.a;
            int i2 = this.b;
            Object objEvaluate = ((ndh) this.d).b.evaluate(fFloatValue, Integer.valueOf(i), Integer.valueOf(i2));
            objEvaluate.getClass();
            this.c.a((Integer) objEvaluate);
            return ufg.a;
        }
        nw nwVar = (nw) obj;
        ?? r0 = ((tdy) nwVar.c).c;
        int i3 = nwVar.a;
        int iMax = Math.max(this.a, i3);
        int iMin = Math.min(this.b, (nwVar.b + i3) - 1);
        if (iMax <= iMin) {
            while (true) {
                Object objA = r0.a(Integer.valueOf(iMax - i3));
                Object obj2 = this.c;
                ((zm) this.d).g(objA, iMax);
                tym tymVar = (tym) obj2;
                ((Object[]) tymVar.c)[iMax - tymVar.a] = objA;
                if (iMax == iMin) {
                    break;
                }
                iMax++;
            }
        }
        return ufg.a;
    }

    public /* synthetic */ ndf(uiq uiqVar, ndh ndhVar, int i, int i2, int i3) {
        this.e = i3;
        this.c = uiqVar;
        this.d = ndhVar;
        this.a = i;
        this.b = i2;
    }
}
