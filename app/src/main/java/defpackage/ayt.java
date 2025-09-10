package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class ayt implements uiq {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public /* synthetic */ ayt(ayv ayvVar, bfi bfiVar, zm zmVar, int i, int i2) {
        this.e = i2;
        this.b = ayvVar;
        this.c = bfiVar;
        this.d = zmVar;
        this.a = i;
    }

    @Override // defpackage.uiq
    public final Object a(Object obj) {
        int iA;
        if (this.e == 0) {
            if (obj == this.b) {
                throw new IllegalStateException("A derived state calculation cannot read itself");
            }
            if (obj instanceof bhl) {
                int i = this.a;
                zm zmVar = (zm) this.d;
                zmVar.g(obj, Math.min(((bfi) this.c).a - i, zmVar.c(obj, Integer.MAX_VALUE)));
            }
            return ufg.a;
        }
        btd btdVar = (btd) obj;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            bte[] bteVarArr = (bte[]) this.c;
            if (i2 >= bteVarArr.length) {
                return ufg.a;
            }
            bte bteVar = bteVarArr[i2];
            int i4 = i3 + 1;
            bteVar.getClass();
            alz alzVarAC = byi.aC(bteVar);
            ali aliVar = alzVarAC != null ? alzVarAC.c : null;
            int i5 = this.a;
            if (aliVar != null) {
                iA = aliVar.a(i5 - bteVar.b);
            } else {
                iA = ((amb) this.d).a.a(0, i5 - bteVar.b);
            }
            btd.q(btdVar, bteVar, ((int[]) this.b)[i3], iA);
            i2++;
            i3 = i4;
        }
    }

    public /* synthetic */ ayt(bte[] bteVarArr, amb ambVar, int i, int[] iArr, int i2) {
        this.e = i2;
        this.c = bteVarArr;
        this.d = ambVar;
        this.a = i;
        this.b = iArr;
    }
}
