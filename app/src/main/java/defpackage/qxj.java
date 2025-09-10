package defpackage;

import android.util.Log;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qxj extends qxt {
    public qxj(qxr qxrVar, String str, Long l, boolean z) {
        super(qxrVar, str, l, z);
    }

    @Override // defpackage.qxt
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        if (obj instanceof Long) {
            return (Long) obj;
        }
        if (obj instanceof String) {
            try {
                return Long.valueOf(Long.parseLong((String) obj));
            } catch (NumberFormatException unused) {
            }
        }
        Log.e("PhenotypeFlag", qwz.f(obj, this, "Invalid long value for "));
        return null;
    }
}
