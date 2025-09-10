package defpackage;

import android.provider.Settings;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class jch extends ndp {
    final /* synthetic */ jcm a;

    public jch(jcm jcmVar) {
        this.a = jcmVar;
    }

    @Override // defpackage.ndp, defpackage.ndo
    public final void a() throws Settings.SettingNotFoundException {
        jcm jcmVar = this.a;
        jcc jccVar = jcmVar.k;
        if (jccVar.f) {
            jccVar.f = false;
            jcmVar.d();
        } else {
            if (jcmVar.e()) {
                return;
            }
            int i = ((ltw) jcmVar.c.dL()).h;
            if (i <= 0) {
                jcmVar.n();
                return;
            }
            msh mshVar = jccVar.b;
            mshVar.o = jcmVar;
            out.a();
            mshVar.c(i);
        }
    }
}
