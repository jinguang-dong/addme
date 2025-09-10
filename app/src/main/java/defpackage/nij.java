package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class nij implements uiq {
    public final /* synthetic */ float a;
    public final /* synthetic */ mxm b;
    private final /* synthetic */ int c;

    public /* synthetic */ nij(float f, mxm mxmVar, int i) {
        this.c = i;
        this.a = f;
        this.b = mxmVar;
    }

    @Override // defpackage.uiq
    public final Object a(Object obj) {
        if (this.c != 0) {
            blm blmVar = (blm) obj;
            blmVar.getClass();
            blmVar.l(this.a);
            blmVar.r(qpt.aM(this.b));
            return ufg.a;
        }
        blm blmVar2 = (blm) obj;
        blmVar2.getClass();
        blmVar2.l(this.a);
        blmVar2.r(qpt.aM(this.b));
        return ufg.a;
    }
}
