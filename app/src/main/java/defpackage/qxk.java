package defpackage;

import android.util.Log;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qxk extends qxt {
    public qxk(qxr qxrVar, String str, Integer num) {
        super(qxrVar, str, num, false);
    }

    @Override // defpackage.qxt
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        if (obj instanceof Integer) {
            return (Integer) obj;
        }
        if (obj instanceof Long) {
            return Integer.valueOf(((Long) obj).intValue());
        }
        if (obj instanceof String) {
            try {
                return Integer.valueOf(Integer.parseInt((String) obj));
            } catch (NumberFormatException unused) {
            }
        }
        Log.e("PhenotypeFlag", qwz.f(obj, this, "Invalid int value for "));
        return null;
    }
}
