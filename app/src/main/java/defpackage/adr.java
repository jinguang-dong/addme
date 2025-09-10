package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adr implements ayy {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public adr(ado adoVar, adi adiVar, int i) {
        this.c = i;
        this.a = adoVar;
        this.b = adiVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [cwr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v11, types: [android.content.ComponentCallbacks, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v12, types: [android.content.ComponentCallbacks, java.lang.Object] */
    @Override // defpackage.ayy
    public final void a() {
        int i = this.c;
        if (i == 0) {
            adh adhVarA = ((adi) this.b).a();
            if (adhVarA != null) {
                Object obj = this.a;
                ((ado) obj).c.remove(adhVarA.a);
                return;
            }
            return;
        }
        if (i == 1) {
            ((ado) this.b).d.remove(this.a);
            return;
        }
        if (i == 2) {
            ((apd) this.b).a.h(this.a);
        } else if (i == 3) {
            ((cwp) this.b).g(this.a);
        } else if (i != 4) {
            ((Context) this.b).getApplicationContext().unregisterComponentCallbacks(this.a);
        } else {
            ((Context) this.b).getApplicationContext().unregisterComponentCallbacks(this.a);
        }
    }

    public adr(Object obj, Object obj2, int i) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
