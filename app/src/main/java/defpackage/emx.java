package defpackage;

import android.os.Handler;
import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class emx implements emw {
    public final Handler a = new Handler(Looper.getMainLooper());
    public final emw b;

    private emx(emw emwVar) {
        this.b = emwVar;
    }

    public static emx f(Handler handler, emw emwVar) {
        if (handler != null) {
            return new emx(emwVar);
        }
        return null;
    }

    @Override // defpackage.emw
    public final void a(int i) {
        this.a.post(new cmu(this, i, 2));
    }

    @Override // defpackage.emw
    public final void b(ena enaVar) {
        this.a.post(new eao((Object) this, (Object) enaVar, 10, (byte[]) null));
    }

    @Override // defpackage.emw
    public final void c(int i, String str) {
        this.a.post(new ng(this, i, str, 5, (char[]) null));
    }

    @Override // defpackage.emw
    public final void d(int i, String str) {
        this.a.post(new ng(this, i, str, 6, (char[]) null));
    }

    @Override // defpackage.emw
    public final void e(ene eneVar, String str) {
        throw null;
    }
}
