package defpackage;

import android.util.Log;
import com.google.android.apps.camera.ui.hotshot.yElM.PNlJufQ;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pay implements pbc, pbb {
    private final String a;
    private final pax b;

    public pay(String str, pax paxVar) {
        this.a = str;
        this.b = paxVar;
    }

    @Override // defpackage.pbc
    public final void b(String str) {
        this.b.a(this.a, 3);
    }

    @Override // defpackage.pbc
    public final void c(String str, Throwable th) {
        this.b.a(this.a, 3);
    }

    @Override // defpackage.pbc
    public final void d(String str) {
        pax paxVar = this.b;
        String str2 = this.a;
        if (paxVar.a(str2, 6)) {
            Log.e(str2, str);
        }
    }

    @Override // defpackage.pbc
    public final void e(String str, Throwable th) {
        pax paxVar = this.b;
        String str2 = this.a;
        if (paxVar.a(str2, 6)) {
            Log.e(str2, str, th);
        }
    }

    @Override // defpackage.pbc
    public final void f(String str) {
        this.b.a(this.a, 4);
    }

    @Override // defpackage.pbc
    public final void g(String str) {
        this.b.a(this.a, 2);
    }

    @Override // defpackage.pbc
    public final void h(String str) {
        pax paxVar = this.b;
        String str2 = this.a;
        if (paxVar.a(str2, 5)) {
            Log.w(str2, str);
        }
    }

    @Override // defpackage.pbc
    public final void i(String str, Throwable th) {
        pax paxVar = this.b;
        String str2 = this.a;
        if (paxVar.a(str2, 5)) {
            Log.w(str2, str, th);
        }
    }

    @Override // defpackage.pbc, defpackage.pbb
    public final pbc a(String str) {
        pax paxVar = this.b;
        String str2 = paxVar.a;
        int length = str.length();
        String strConcat = str2.concat(String.valueOf(str));
        int i = paxVar.b;
        if (length <= i) {
            return new pay(strConcat, paxVar);
        }
        pay payVar = new pay(strConcat.substring(0, str2.length() + i), paxVar);
        payVar.h(PNlJufQ.QIAuL + str + " is " + (str.length() - i) + " chars longer than limit.");
        return payVar;
    }
}
