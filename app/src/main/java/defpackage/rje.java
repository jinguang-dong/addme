package defpackage;

import android.os.Bundle;
import android.view.View;
import com.google.ar.core.ImageMetadata;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class rje extends cnn {
    final /* synthetic */ rjh a;

    public rje(rjh rjhVar) {
        this.a = rjhVar;
    }

    @Override // defpackage.cnn
    public final void c(View view, cpt cptVar) {
        super.c(view, cptVar);
        if (!this.a.d) {
            cptVar.q(false);
        } else {
            cptVar.g(ImageMetadata.SHADING_MODE);
            cptVar.q(true);
        }
    }

    @Override // defpackage.cnn
    public final boolean i(View view, int i, Bundle bundle) {
        if (i == 1048576) {
            rjh rjhVar = this.a;
            if (rjhVar.d) {
                rjhVar.cancel();
                return true;
            }
            i = 1048576;
        }
        return super.i(view, i, bundle);
    }
}
