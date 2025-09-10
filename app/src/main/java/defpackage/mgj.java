package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mgj extends lzb implements jhh, jgw, jfv {
    public final Context a;
    public boolean b;
    public final lqc c;
    public final mdy e;
    private final owq f;
    private final out g;
    private final jgt h;
    private lzl i;
    private long j = -1;
    private final hbj k;
    private final hkk l;

    public mgj(Context context, owq owqVar, lqc lqcVar, hkk hkkVar, mdy mdyVar, out outVar, jgt jgtVar, hbj hbjVar) {
        this.a = context;
        this.f = owqVar;
        this.c = lqcVar;
        this.l = hkkVar;
        this.e = mdyVar;
        this.g = outVar;
        this.h = jgtVar;
        this.k = hbjVar;
    }

    public final void a(mgn mgnVar) {
        if (this.b) {
            gzi gziVar = gzs.a;
            return;
        }
        mgc mgcVarF = this.l.f(mgnVar);
        nkw nkwVar = (nkw) this.f.dL();
        if (((nkwVar != nkw.PHOTO && nkwVar != nkw.PORTRAIT && nkwVar != nkw.NIGHT_SIGHT) || !mgcVarF.c) && (nkwVar != nkw.VIDEO || !mgcVarF.d)) {
            this.j = -1L;
            k();
            return;
        }
        long j = this.j;
        if (j < 0 || mgnVar.b < j) {
            this.j = Math.max(0L, mgnVar.b - 25000000);
            if (this.i == null) {
                Resources resources = this.a.getResources();
                lzk lzkVarA = lzl.a();
                lzkVarA.a = resources.getString(R.string.storage_low_warning_toast);
                lzkVarA.b = resources.getDrawable(R.drawable.quantum_gm_ic_sd_card_alert_white_24, null);
                lzkVarA.f(6000L);
                lzkVarA.c = new man(this, 12);
                lzkVarA.f = new man(this, 13);
                this.i = lzkVarA.a();
            }
            l(this.i);
        }
    }

    @Override // defpackage.lzb, defpackage.lzh
    public final void eZ(lzm lzmVar) {
        super.eZ(lzmVar);
        ins.g(this.g, this.h, this);
    }

    @Override // defpackage.lzb, defpackage.lzh
    public final void f() {
        super.f();
        this.j = -1L;
    }

    @Override // defpackage.jfv
    public final void m(Intent intent) {
        this.b = false;
    }

    @Override // defpackage.jgw
    public final void w() {
        this.b = false;
    }
}
