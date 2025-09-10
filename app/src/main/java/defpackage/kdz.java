package defpackage;

import android.content.res.Resources;
import com.google.ar.core.R;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kdz implements lzh {
    public lzm b;
    public lzl c;
    public final jtc d;
    public final ScheduledExecutorService e;
    public boolean f;
    public ScheduledFuture g;
    public boolean h;
    public final ocq i;
    private final Resources j;
    private final hyh k;
    private paq l;
    private final hyg m = new kdy(this);
    public final AtomicBoolean a = new AtomicBoolean(false);

    public kdz(Resources resources, jtc jtcVar, ScheduledExecutorService scheduledExecutorService, hyh hyhVar, ocq ocqVar) {
        this.j = resources;
        this.d = jtcVar;
        this.e = scheduledExecutorService;
        this.k = hyhVar;
        this.i = ocqVar;
    }

    @Override // defpackage.lzh
    public final void dM() {
        ScheduledFuture scheduledFuture = this.g;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
    }

    @Override // defpackage.lzh
    public final void eZ(lzm lzmVar) {
        this.b = lzmVar;
        Resources resources = this.j;
        lzk lzkVarA = lzl.a();
        lzkVarA.a = resources.getString(R.string.astrophotography_suggestion_text);
        lzkVarA.b = resources.getDrawable(R.drawable.gs_astrophotography_mode_fill1_vd_24, null);
        lzkVarA.c = new kdx(this, 0);
        lzkVarA.f = new kdx(this, 2);
        this.c = lzkVarA.a();
    }

    @Override // defpackage.lzh
    public final void f() {
        this.a.set(false);
        paq paqVar = this.l;
        if (paqVar != null) {
            paqVar.close();
        }
    }

    @Override // defpackage.lzh
    public final void fa() {
        this.l = this.k.f(this.m);
    }
}
