package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public class myl implements jhh, jhe, mxl {
    public static final sgv a = sgv.g("myl");
    public final Context b;
    public final out c;
    public final uem d;
    public boolean e = false;
    public nbb f;
    public final luj g;
    public final our h;
    public final mgr i;
    public final rah j;
    public final mwq k;
    private final Executor l;
    private final luj m;

    public myl(Context context, luj lujVar, luj lujVar2, rah rahVar, out outVar, Executor executor, fdq fdqVar, mgr mgrVar, uem uemVar, pbn pbnVar, mwq mwqVar) {
        this.b = context;
        this.c = outVar;
        this.l = new pbs(executor, pbnVar, "Mars");
        this.m = lujVar;
        this.g = lujVar2;
        this.j = rahVar;
        this.h = fdqVar.j();
        this.i = mgrVar;
        this.d = uemVar;
        this.k = mwqVar;
    }

    public static syu a(Executor executor, Context context) {
        return ske.Q(new kbs(context, 5), executor);
    }

    public final void d() {
        out outVar = this.c;
        outVar.getClass();
        outVar.c(new mub(this, 13));
    }

    public final void e(boolean z) {
        nbb nbbVar = this.f;
        if (nbbVar != null) {
            nbbVar.f(z ? ltg.MARS_STORE : ltg.MEDIA_STORE);
        } else {
            this.e = z;
        }
    }

    @Override // defpackage.mxl
    public final void eH(mxm mxmVar) {
        nbb nbbVar = this.f;
        if (nbbVar != null) {
            nbbVar.h(mxmVar);
        }
    }

    @Override // defpackage.jhe
    public final void eb() {
        Executor executor = this.l;
        ske.W(a(executor, this.b), new jcb(this, 13), executor);
        e(((Boolean) this.m.b(luf.aN)).booleanValue());
    }

    public final void f() {
        Executor executor = this.l;
        ske.W(a(executor, this.b), new jcb(this, 14), executor);
    }

    public final boolean g() {
        nbb nbbVar = this.f;
        return nbbVar != null && nbbVar.isShowing();
    }

    @Override // defpackage.mxl
    public final /* synthetic */ void eR(mxj mxjVar, mxm mxmVar) {
    }
}
