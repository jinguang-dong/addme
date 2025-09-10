package defpackage;

import android.content.SharedPreferences;
import com.google.android.material.button.xlT.JvFFEwFNdCrxf;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class lvl {
    public static final sgv a = sgv.g("lvl");
    private final String b;
    private final int c;

    public lvl(String str, int i) {
        this.b = str;
        this.c = i;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [sgt, shi] */
    protected static final String c(SharedPreferences sharedPreferences, String str) {
        String string = null;
        try {
            string = sharedPreferences.getString(str, null);
        } catch (ClassCastException e) {
            ((sgt) ((sgt) a.b().i(e)).M((char) 4452)).s(JvFFEwFNdCrxf.XjMBd);
        }
        sharedPreferences.edit().remove(str).apply();
        return string;
    }

    protected abstract void a(luk lukVar, int i);

    protected int b(luk lukVar) {
        return lukVar.b(this.b, Integer.valueOf(this.c));
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [sgt, shi] */
    public final void d(luk lukVar) {
        try {
            int iB = b(lukVar);
            int i = this.c;
            if (iB != i) {
                a(lukVar, iB);
            }
            lukVar.h(this.b, i);
        } catch (Exception e) {
            ((sgt) ((sgt) a.b().i(e)).M((char) 4453)).s("exception during upgrade");
            throw e;
        }
    }
}
