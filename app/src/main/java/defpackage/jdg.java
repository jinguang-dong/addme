package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jdg implements tzt {
    private final /* synthetic */ int a;
    private final Object b;

    public jdg(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    public static Context c(qaq qaqVar) {
        Object obj = qaqVar.a;
        obj.getClass();
        return (Context) obj;
    }

    public static Context d(ejt ejtVar) {
        Object obj = ejtVar.a;
        obj.getClass();
        return (Context) obj;
    }

    @Override // defpackage.uem, defpackage.uel
    public final /* synthetic */ Object a() {
        int i = this.a;
        return i != 0 ? i != 1 ? b() : b() : b();
    }

    public final Context b() {
        int i = this.a;
        if (i == 0) {
            return d((ejt) this.b);
        }
        if (i == 1) {
            return (Context) ((hbp) this.b).c;
        }
        qaq qaqVar = (qaq) this.b;
        return i != 2 ? (Context) qaqVar.a : c(qaqVar);
    }
}
