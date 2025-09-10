package defpackage;

import android.content.Context;
import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mgh implements ksb {
    public final Context a;
    public final rwc b;
    public dv c;
    private final luj d;

    public mgh(Context context, luj lujVar, rwc rwcVar, fdq fdqVar) {
        this.a = context;
        this.d = lujVar;
        this.b = rwcVar;
        fdqVar.k().d(new khc(this, 10));
    }

    public final boolean a() {
        return b(R.string.turn_off_lsm_dialog_message);
    }

    public final boolean b(int i) {
        boolean zBooleanValue = ((Boolean) this.d.b(luf.an)).booleanValue();
        if (zBooleanValue) {
            Context context = this.a;
            rkc rkcVar = new rkc(context, R.style.Theme_Camera_MaterialAlertDialog);
            rkcVar.t(context.getString(R.string.turn_off_lsm_dialog_title));
            rkcVar.m(context.getString(i));
            rkcVar.r(context.getString(R.string.view_in_settings_button), new fdf(this, 13));
            rkcVar.o(context.getString(android.R.string.cancel), null);
            this.c = rkcVar.c();
        }
        return zBooleanValue;
    }

    public final boolean c(boolean z, int i) {
        return !z && b(i);
    }

    @Override // defpackage.ksb
    public final boolean v(krs krsVar, ksa ksaVar, boolean z) {
        return !z && a();
    }
}
