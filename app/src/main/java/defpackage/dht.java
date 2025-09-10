package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class dht extends com {
    protected cmi[] m;
    String n;
    int o;
    int p;

    public dht() {
        this.m = null;
        this.o = 0;
    }

    public cmi[] getPathData() {
        return this.m;
    }

    public String getPathName() {
        return this.n;
    }

    public void setPathData(cmi[] cmiVarArr) {
        cmi[] cmiVarArr2 = this.m;
        if (cmiVarArr2 != null && cmiVarArr != null) {
            if (cmiVarArr2.length == cmiVarArr.length) {
                for (int i = 0; i < cmiVarArr2.length; i++) {
                    cmi cmiVar = cmiVarArr2[i];
                    char c = cmiVar.a;
                    cmi cmiVar2 = cmiVarArr[i];
                    if (c == cmiVar2.a && cmiVar.b.length == cmiVar2.b.length) {
                    }
                }
                cmi[] cmiVarArr3 = this.m;
                for (int i2 = 0; i2 < cmiVarArr.length; i2++) {
                    cmiVarArr3[i2].a = cmiVarArr[i2].a;
                    int i3 = 0;
                    while (true) {
                        float[] fArr = cmiVarArr[i2].b;
                        if (i3 < fArr.length) {
                            cmiVarArr3[i2].b[i3] = fArr[i3];
                            i3++;
                        }
                    }
                }
                return;
            }
        }
        this.m = chx.m(cmiVarArr);
    }

    public boolean z() {
        return false;
    }

    public dht(dht dhtVar) {
        this.m = null;
        this.o = 0;
        this.n = dhtVar.n;
        int i = dhtVar.p;
        this.p = 0;
        this.m = chx.m(dhtVar.m);
    }
}
