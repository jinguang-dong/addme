package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Collections;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public class oet implements oex {
    public final Context b;
    public final String c;
    public final oen d;
    public final ofl e;
    public final Looper f;
    public final int g;
    public final oew h;
    protected final ogd i;
    public final pfl j;
    public final mwq k;

    /* JADX WARN: Removed duplicated region for block: B:26:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ce A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public oet(android.content.Context r7, android.app.Activity r8, defpackage.mwq r9, defpackage.oen r10, defpackage.oes r11) {
        /*
            Method dump skipped, instructions count: 299
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oet.<init>(android.content.Context, android.app.Activity, mwq, oen, oes):void");
    }

    private final oor a(int i, ogx ogxVar) {
        pfl pflVar = new pfl((byte[]) null, (byte[]) null);
        int i2 = ogxVar.c;
        ogd ogdVar = this.i;
        ogdVar.i(pflVar, i2, this);
        ofi ofiVar = new ofi(i, ogxVar, pflVar);
        Handler handler = ogdVar.n;
        handler.sendMessage(handler.obtainMessage(4, new qzx(ofiVar, ogdVar.j.get(), this)));
        return (oor) pflVar.a;
    }

    public static void k(ord ordVar) {
        ojl.az(ordVar, "channel must not be null");
    }

    @Override // defpackage.oex
    public final ofl c() {
        return this.e;
    }

    public final oho d() {
        GoogleSignInAccount googleSignInAccountA;
        GoogleSignInAccount googleSignInAccountA2;
        oho ohoVar = new oho();
        oen oenVar = this.d;
        boolean z = oenVar instanceof oel;
        Account accountA = null;
        if (z && (googleSignInAccountA2 = ((oel) oenVar).a()) != null) {
            String str = googleSignInAccountA2.c;
            if (str != null) {
                accountA = new Account(str, "com.google");
            }
        } else if (oenVar instanceof oek) {
            accountA = ((oek) oenVar).a();
        }
        ohoVar.a = accountA;
        Set setA = (!z || (googleSignInAccountA = ((oel) oenVar).a()) == null) ? Collections.EMPTY_SET : googleSignInAccountA.a();
        if (ohoVar.b == null) {
            ohoVar.b = new yf();
        }
        ohoVar.b.addAll(setA);
        Context context = this.b;
        ohoVar.d = context.getClass().getName();
        ohoVar.c = context.getPackageName();
        return ohoVar;
    }

    public final oor e(ogx ogxVar) {
        return a(2, ogxVar);
    }

    public final oor f(ogx ogxVar) {
        return a(0, ogxVar);
    }

    public final oor g(ogl oglVar, int i) {
        pfl pflVar = new pfl((byte[]) null, (byte[]) null);
        ogd ogdVar = this.i;
        ogdVar.i(pflVar, i, this);
        ofj ofjVar = new ofj(oglVar, pflVar);
        Handler handler = ogdVar.n;
        handler.sendMessage(handler.obtainMessage(13, new qzx(ofjVar, ogdVar.j.get(), this)));
        return (oor) pflVar.a;
    }

    public final void h(int i, ofo ofoVar) {
        boolean z = true;
        if (!ofoVar.d && !((Boolean) BasePendingResult.b.get()).booleanValue()) {
            z = false;
        }
        ofoVar.d = z;
        ogd ogdVar = this.i;
        qzx qzxVar = new qzx(new ofg(i, ofoVar), ogdVar.j.get(), this);
        Handler handler = ogdVar.n;
        handler.sendMessage(handler.obtainMessage(4, qzxVar));
    }

    public final void i(ogx ogxVar) {
        a(1, ogxVar);
    }

    public final oor j() {
        ogw ogwVar = new ogw();
        ogwVar.a = new onj(3);
        ogwVar.c = 4501;
        return f(ogwVar.a());
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, java.lang.Runnable] */
    public final oor l(gox goxVar) {
        ogr ogrVar = (ogr) goxVar.b;
        ojl.az(ogrVar.a(), "Listener has already been released.");
        pfl pflVar = new pfl((byte[]) null, (byte[]) null);
        int i = ogrVar.d;
        ogd ogdVar = this.i;
        ogdVar.i(pflVar, i, this);
        ofh ofhVar = new ofh(new gox(ogrVar, (rnu) goxVar.c, (Runnable) goxVar.a, (byte[]) null), pflVar);
        Handler handler = ogdVar.n;
        handler.sendMessage(handler.obtainMessage(8, new qzx(ofhVar, ogdVar.j.get(), this)));
        return (oor) pflVar.a;
    }

    public oet(Context context, mwq mwqVar, oen oenVar, oes oesVar) {
        this(context, null, mwqVar, oenVar, oesVar);
    }

    public oet(Context context) {
        this(context, okj.a, oen.a, oes.a);
        ouf.b(context.getApplicationContext());
    }

    public oet(Context context, opj opjVar) {
        this(context, opk.a, opjVar, oes.a);
    }
}
