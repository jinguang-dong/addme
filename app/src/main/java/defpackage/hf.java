package defpackage;

import android.content.Context;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hf extends gk {
    final /* synthetic */ hg d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hf(hg hgVar, Context context, gb gbVar, View view) {
        super(context, gbVar, view, true);
        this.d = hgVar;
        this.b = 8388613;
        e(hgVar.l);
    }

    @Override // defpackage.gk
    public final void c() {
        hg hgVar = this.d;
        gb gbVar = hgVar.c;
        if (gbVar != null) {
            gbVar.close();
        }
        hgVar.i = null;
        super.c();
    }
}
