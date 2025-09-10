package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nmc implements jhh, jgw, jfv {
    public final out a;
    public final uem b;
    final nan c;
    public final imi d;
    public final jgt e;
    private final Context f;
    private final ConnectivityManager.NetworkCallback g = new nmb(this);
    private final fdq h;

    public nmc(Context context, out outVar, jgt jgtVar, fdq fdqVar, imi imiVar, uem uemVar) {
        this.f = context;
        this.a = outVar;
        this.e = jgtVar;
        this.h = fdqVar;
        this.d = imiVar;
        this.b = uemVar;
        nao naoVar = new nao();
        naoVar.h = context;
        naoVar.a = true;
        naoVar.j = 2;
        naoVar.e = context.getString(R.string.camera_outdated_chip);
        this.c = naoVar.a();
    }

    private final void a() {
        imi imiVar = this.d;
        nan nanVar = this.c;
        imiVar.f(nanVar);
        if (jsv.E(this.f) == 1) {
            imiVar.a(nanVar);
        }
    }

    @Override // defpackage.jfv
    public final void m(Intent intent) {
        a();
    }

    @Override // defpackage.jgw
    public final void w() {
        this.h.j().d(jsv.D(this.f, this.g));
        a();
    }
}
