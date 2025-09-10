package defpackage;

import android.app.Activity;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gof implements jhh, jgz {
    private dv a;
    private final Activity b;

    public gof(out outVar, jgt jgtVar, Activity activity) {
        outVar.execute(new cmc(this, jgtVar, 7, null));
        this.b = activity;
    }

    public final synchronized boolean b(dv dvVar) {
        out.a();
        dv dvVar2 = this.a;
        if (dvVar2 != null) {
            dvVar2.dismiss();
        }
        this.a = dvVar;
        if (this.b.isFinishing()) {
            return false;
        }
        dvVar.show();
        return true;
    }

    @Override // defpackage.jgz
    public final void et() {
        dv dvVar = this.a;
        if (dvVar != null) {
            dvVar.dismiss();
        }
    }
}
