package defpackage;

import android.util.Log;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qxm extends qxt {
    public qxm(qxr qxrVar, String str, Double d, boolean z) {
        super(qxrVar, str, d, z);
    }

    @Override // defpackage.qxt
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        if (obj instanceof Double) {
            return (Double) obj;
        }
        if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        }
        if (obj instanceof String) {
            try {
                return Double.valueOf(Double.parseDouble((String) obj));
            } catch (NumberFormatException unused) {
            }
        }
        Log.e("PhenotypeFlag", qwz.f(obj, this, "Invalid double value for "));
        return null;
    }
}
