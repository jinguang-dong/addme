package defpackage;

import android.app.Activity;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class jmi implements cnh {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ jmi(Object obj, Object obj2, int i) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, job] */
    @Override // defpackage.cnh
    public final void accept(Object obj) {
        if (this.c == 0) {
            pdo pdoVarB = ((phc) this.b).b();
            if (pdoVarB == null) {
                return;
            }
            this.a.d(pdoVarB.b);
            return;
        }
        dvn dvnVar = (dvn) this.b;
        dvl dvlVar = dvnVar.e;
        if (dvlVar != null) {
            Activity activity = (Activity) this.a;
            dvlVar.a(activity, dvnVar.a(activity));
        }
    }
}
