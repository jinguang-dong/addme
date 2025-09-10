package defpackage;

import android.content.Context;
import com.google.ar.core.R;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kcs extends lzb {
    public final rwc a;
    private final Context e;
    private final luj g;
    private final luj h;
    public final AtomicBoolean b = new AtomicBoolean(false);
    public final AtomicBoolean c = new AtomicBoolean(false);
    private lzl f = null;

    public kcs(Context context, rwc rwcVar, luj lujVar, luj lujVar2) {
        this.e = context;
        this.a = rwcVar;
        this.g = lujVar;
        this.h = lujVar2;
    }

    public final void a(boolean z) {
        if (!z) {
            if (this.f != null) {
                k();
                this.f = null;
                return;
            }
            return;
        }
        if (!this.a.h() || this.f != null || this.b.get() || this.c.get()) {
            return;
        }
        luj lujVar = this.g;
        lus lusVar = luf.I;
        int iIntValue = ((Integer) lujVar.b(lusVar)).intValue();
        if (iIntValue < 3) {
            this.h.d(lusVar, Integer.valueOf(iIntValue + 1));
            lzk lzkVarA = lzl.a();
            lzkVarA.e(true);
            Context context = this.e;
            lzkVarA.a = context.getResources().getString(R.string.nightlapse_entered_hint);
            lzkVarA.b = context.getResources().getDrawable(R.drawable.gs_clear_night_vd_theme_24, null);
            lzkVarA.c = new jxr(this, 20);
            lzkVarA.f = new kdx(this, 1);
            lzkVarA.c(true);
            lzl lzlVarA = lzkVarA.a();
            this.f = lzlVarA;
            l(lzlVarA);
        }
    }
}
