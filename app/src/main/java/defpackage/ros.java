package defpackage;

import android.os.Bundle;
import android.view.View;
import com.google.ar.core.ImageMetadata;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ros extends cnn {
    final /* synthetic */ row a;

    public ros(row rowVar) {
        this.a = rowVar;
    }

    @Override // defpackage.cnn
    public final void c(View view, cpt cptVar) {
        super.c(view, cptVar);
        cptVar.g(ImageMetadata.SHADING_MODE);
        cptVar.q(true);
    }

    @Override // defpackage.cnn
    public final boolean i(View view, int i, Bundle bundle) {
        if (i != 1048576) {
            return super.i(view, i, bundle);
        }
        this.a.d(3);
        return true;
    }
}
