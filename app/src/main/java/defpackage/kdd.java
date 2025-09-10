package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import com.google.ar.core.R;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public class kdd implements jjv {
    public static final sgv a = sgv.g("kdd");
    private final Context c;
    private final owf d;
    private final owf e;
    private final boolean f;
    private nan g;
    private final mtm i;
    private final imi j;
    public final AtomicBoolean b = new AtomicBoolean();
    private boolean h = false;

    public kdd(mtm mtmVar, imi imiVar, Context context, owf owfVar, owf owfVar2, hbj hbjVar) {
        this.i = mtmVar;
        this.j = imiVar;
        this.c = context;
        this.e = owfVar;
        this.d = owfVar2;
        this.f = hbjVar.p(hac.L);
    }

    @Override // defpackage.jjv
    public final paq a(View view) {
        if (this.b.compareAndSet(false, true)) {
            return new iew(this, 15);
        }
        throw new IllegalStateException("Cannot bind multiple times.");
    }

    @Override // defpackage.jjv
    public final void d() {
        this.i.f(true);
        nan nanVar = this.g;
        if (nanVar != null) {
            this.j.f(nanVar);
        }
    }

    @Override // defpackage.mxl
    public final void eR(mxj mxjVar, mxm mxmVar) throws Resources.NotFoundException {
        this.i.eR(mxjVar, mxmVar);
    }

    @Override // defpackage.jjv
    public final void g() throws Resources.NotFoundException {
        this.i.A(true);
        if (((Boolean) this.e.dL()).booleanValue() || this.h || !this.f || this.d.dL() != nkw.NIGHT_SIGHT) {
            return;
        }
        if (this.g == null) {
            nao naoVar = new nao();
            Context context = this.c;
            naoVar.e = context.getResources().getString(R.string.cuttlefish_zoom_advice_text);
            naoVar.h = context;
            naoVar.j = 12;
            naoVar.a = true;
            this.g = naoVar.a();
        }
        this.j.a(this.g);
        this.h = true;
    }

    @Override // defpackage.jjv
    public final void e() {
    }

    @Override // defpackage.mxl
    public final /* synthetic */ void eH(mxm mxmVar) {
    }

    @Override // defpackage.jjv
    public final /* synthetic */ void f(boolean z) {
    }
}
