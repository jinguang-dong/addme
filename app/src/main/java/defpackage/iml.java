package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iml implements imx {
    final /* synthetic */ Context a;

    public iml(Context context) {
        this.a = context;
    }

    @Override // defpackage.imx
    public final Object a(qzx qzxVar) {
        try {
            return ((Class) qzxVar.b).cast(this.a.getSystemService((String) qzxVar.c));
        } catch (Exception e) {
            throw new RuntimeException("Unable to create or provide ".concat((String) qzxVar.c), e);
        }
    }
}
