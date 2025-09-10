package defpackage;

import android.content.Context;
import android.util.Log;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
abstract class qyq implements qzh {
    public final String a;
    public final String b;
    public final qzn c;

    public qyq(String str, String str2, qzn qznVar) {
        this.a = str;
        this.b = str2;
        this.c = qznVar;
    }

    protected abstract Object b(Object obj);

    protected abstract Object c(String str);

    protected Object e() {
        return null;
    }

    protected abstract Object f(qxf qxfVar);

    @Override // defpackage.qzh, defpackage.rww
    public final Object fr() {
        Context context = qxf.a;
        qxh.b = true;
        if (qxh.c == null) {
            qxh.c = new qxg();
        }
        Context context2 = qxf.a;
        if (context2 == null) {
            qxh.a();
            throw new IllegalStateException("Must call PhenotypeContext.setContext() first");
        }
        Object objF = f(qxf.a(context2));
        objF.getClass();
        return objF;
    }

    @Override // defpackage.qzh
    public final Object fs(Context context) {
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        Object objF = f(qxf.a(applicationContext));
        objF.getClass();
        return objF;
    }

    protected final Object ft(String str) {
        try {
            return c(str);
        } catch (IOException | IllegalArgumentException e) {
            Log.e("FilePhenotypeFlags", "Invalid Phenotype flag value for flag ".concat(this.b), e);
            return null;
        }
    }
}
