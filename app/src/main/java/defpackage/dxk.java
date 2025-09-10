package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dxk extends ddx {
    private final Context c;

    public dxk(Context context, int i, int i2) {
        super(i, i2);
        this.c = context;
    }

    @Override // defpackage.ddx
    public final void a(dfa dfaVar) {
        if (this.b >= 10) {
            dfaVar.l(new Object[]{"reschedule_needed", 1});
        } else {
            this.c.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
        }
    }
}
