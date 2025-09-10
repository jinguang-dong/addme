package defpackage;

import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cxl implements cwf {
    private final /* synthetic */ int a;
    private final Object b;

    public cxl(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [cvv, java.lang.Object] */
    @Override // defpackage.cwf
    public final void a(cwh cwhVar, cwa cwaVar) {
        cvv[] cvvVarArr;
        if (this.a == 0) {
            ?? r2 = this.b;
            r2.a();
            r2.a();
            return;
        }
        new HashMap();
        int i = 0;
        while (true) {
            cvvVarArr = (cvv[]) this.b;
            if (i >= cvvVarArr.length) {
                break;
            }
            cvvVarArr[i].a();
            i++;
        }
        for (cvv cvvVar : cvvVarArr) {
            cvvVar.a();
        }
    }
}
