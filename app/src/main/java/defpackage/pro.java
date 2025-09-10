package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pro {
    public final pre a;
    public final pri b;

    protected pro(Context context, pri priVar) {
        Context context2;
        context.getClass();
        Context applicationContext = context.getApplicationContext();
        prp prpVar = new prp();
        prd prdVar = new prd(null);
        prdVar.a();
        applicationContext.getClass();
        prdVar.a = applicationContext;
        prdVar.c = rwc.j(prpVar);
        prdVar.a();
        if (prdVar.e != 1 || (context2 = prdVar.a) == null) {
            throw new IllegalStateException();
        }
        this.a = new pre(context2, prdVar.b, prdVar.c, prdVar.d);
        this.b = priVar;
    }

    public static pro a(Context context, prc prcVar) {
        return new pro(context, new pri(prcVar));
    }

    public final String toString() {
        return "CollectionBasisLogVerifier{collectionBasisContext=" + this.a + ", basis=" + this.b + "}";
    }
}
