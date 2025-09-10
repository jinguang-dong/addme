package defpackage;

import android.app.Activity;
import android.view.View;
import androidx.wear.ambient.AmbientMode;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ngb implements jhh, jhf, jhg {
    public final nnv a;
    our b = null;
    public final AtomicReference c = new AtomicReference(null);
    public final AmbientMode.AmbientController d;
    private final Set e;
    private final out f;

    public ngb(final Activity activity, AmbientMode.AmbientController ambientController, Set set, out outVar) {
        this.a = new nnv() { // from class: nga
            @Override // defpackage.nnv
            public final View a(int i) {
                return activity.findViewById(i);
            }
        };
        this.d = ambientController;
        this.e = set;
        this.f = outVar;
    }

    @Override // defpackage.jhf
    public final synchronized void ej() {
        this.b = new our();
        for (owf owfVar : this.e) {
            AtomicBoolean atomicBoolean = new AtomicBoolean(true);
            our ourVar = this.b;
            ourVar.getClass();
            ourVar.d(owfVar.dK(new ktd(this, atomicBoolean, 14, null), this.f));
        }
    }

    @Override // defpackage.jhg
    public final synchronized void eu() {
        our ourVar = this.b;
        if (ourVar != null) {
            ourVar.close();
        }
    }
}
