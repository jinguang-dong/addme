package defpackage;

import android.app.Activity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lwb implements jhh, jgz {
    public final Activity a;
    public dv b;

    public lwb(Activity activity, out outVar, jgt jgtVar) {
        this.a = activity;
        ins.g(outVar, jgtVar, this);
    }

    public final void b() {
        dv dvVar = this.b;
        if (dvVar != null) {
            dvVar.dismiss();
        }
    }

    @Override // defpackage.jgz
    public final void et() {
        b();
    }
}
