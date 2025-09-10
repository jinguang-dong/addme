package defpackage;

import androidx.wear.ambient.AmbientMode;
import java.util.Collection;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jlo implements paq {
    public final ovx a;
    final Collection b;
    final AmbientMode.AmbientController c;

    public jlo(AmbientMode.AmbientController ambientController, ovx ovxVar, Collection collection) {
        this.c = ambientController;
        this.a = ovxVar;
        this.b = collection;
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        sgk it = ((sbp) this.b).iterator();
        while (it.hasNext()) {
            ((paq) it.next()).close();
        }
    }
}
