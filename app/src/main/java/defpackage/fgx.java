package defpackage;

import android.content.Context;
import android.content.res.Resources;
import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fgx {
    public final boolean a;
    public final nan b;
    public final nan c;
    public final fhe d;
    public final owf e;
    public final gwx f;
    public final luj g;
    public final luj h;
    public final gsn i;
    private final fft j;
    private final boolean k;
    private final owf l;
    private final imi m;

    public fgx(Resources resources, owf owfVar, fft fftVar, fgn fgnVar, Context context, imi imiVar, luj lujVar, luj lujVar2, fhe fheVar, owf owfVar2, owq owqVar, gwx gwxVar) {
        this.l = owfVar;
        this.j = fftVar;
        this.m = imiVar;
        this.g = lujVar;
        this.h = lujVar2;
        this.d = fheVar;
        this.b = c(resources.getString(R.string.thermal_boba_disabled_chip), context, 2000);
        this.c = c(resources.getString(R.string.boba_tap_on_pip_chip), context, 4000);
        this.k = fgnVar.b();
        this.a = fgnVar.c();
        this.e = owfVar2;
        this.f = gwxVar;
        owqVar.getClass();
        this.i = new gsn();
    }

    private static nan c(String str, Context context, int i) {
        nao naoVar = new nao();
        naoVar.e = str;
        naoVar.h = context;
        naoVar.j = 12;
        naoVar.a = false;
        naoVar.b = i;
        return naoVar.a();
    }

    public final paq a() {
        shl shlVar = shx.a;
        our ourVar = new our();
        ourVar.d(this.d.q());
        fft fftVar = this.j;
        owf owfVarA = owb.a(fftVar);
        fbo fboVar = new fbo(this, 18);
        sxo sxoVar = sxo.a;
        ourVar.d(owfVarA.dK(fboVar, sxoVar));
        if (this.k) {
            ourVar.d(owb.a(owl.c(owl.h(fftVar, new fgb(3)), owl.h(this.l, new fgb(4)))).dK(new fbo(this, 19), sxoVar));
        }
        return ourVar;
    }

    public final void b(nan nanVar) {
        this.m.a(nanVar);
    }
}
