package defpackage;

import android.util.Base64;
import android.util.Log;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qxo extends qxt {
    final /* synthetic */ qxq a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qxo(qxr qxrVar, String str, Object obj, qxq qxqVar) {
        super(qxrVar, str, obj, false);
        this.a = qxqVar;
    }

    @Override // defpackage.qxt
    public final Object a(Object obj) {
        if (obj instanceof String) {
            try {
                return this.a.a(Base64.decode((String) obj, 3));
            } catch (IOException | IllegalArgumentException unused) {
            }
        }
        Log.e("PhenotypeFlag", qwz.f(obj, this, "Invalid byte[] value for "));
        return null;
    }
}
