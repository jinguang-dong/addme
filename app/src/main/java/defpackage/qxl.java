package defpackage;

import android.util.Log;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qxl extends qxt {
    public qxl(qxr qxrVar, String str, Boolean bool, boolean z) {
        super(qxrVar, str, bool, z);
    }

    @Override // defpackage.qxt
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (otv.c.matcher(str).matches()) {
                return true;
            }
            if (otv.d.matcher(str).matches()) {
                return false;
            }
        }
        Log.e("PhenotypeFlag", qwz.f(obj, this, "Invalid boolean value for "));
        return null;
    }
}
