package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import com.google.ar.core.R;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class guk extends lzd {
    public final Context a;
    public final gum b;
    public final boolean c;
    public final View.OnClickListener d;
    public final View.OnClickListener e;
    public rwc f;
    public final lqc g;
    public final mdy h;
    private final Resources i;
    private final hms k;

    public guk(gum gumVar, Context context, lqc lqcVar, rwc rwcVar, mdy mdyVar, ScheduledExecutorService scheduledExecutorService, ocq ocqVar, hbj hbjVar) {
        super(scheduledExecutorService, ocqVar, "selfie_angle_advice_smarts_chip");
        this.d = new fvp(this, 6, null);
        this.e = new fvp(this, 7, null);
        this.f = rvk.a;
        this.b = gumVar;
        this.a = context;
        this.i = context.getResources();
        this.h = mdyVar;
        rnt.L(true);
        this.k = (hms) ((rwg) rwcVar).a;
        this.g = lqcVar;
        this.c = hbjVar.p(gyp.h);
    }

    @Override // defpackage.lzd
    protected final lzc a() {
        Resources resources = this.i;
        olm olmVarA = lzc.a();
        lzk lzkVarA = lzl.a();
        lzkVarA.a = resources.getString(R.string.selfie_angle_message);
        lzkVarA.b = resources.getDrawable(R.drawable.quantum_ic_aspect_ratio_white_24, null);
        gum gumVar = this.b;
        gumVar.getClass();
        lzkVarA.f = new gto(gumVar, 12);
        lzkVarA.f(6000L);
        lzkVarA.g = new gto(this, 13);
        lzkVarA.c = new gto(this, 14);
        gumVar.getClass();
        lzkVarA.h = new gto(gumVar, 15);
        olmVarA.b = lzkVarA.a();
        return olmVarA.e();
    }

    @Override // defpackage.lzd
    protected final boolean b(poe poeVar) {
        hms hmsVar = this.k;
        if (hmsVar.g()) {
            return false;
        }
        jra jraVarA = jra.a(hmsVar.d());
        gum gumVar = this.b;
        gumVar.d(jraVarA.b);
        return gumVar.f();
    }

    @Override // defpackage.lzd, defpackage.lzh
    public final void f() {
        super.f();
        this.b.e();
        if (this.f.h() && this.c) {
            ((iso) this.f.c()).r();
        }
    }
}
