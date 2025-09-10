package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import androidx.wear.ambient.AmbientDelegate;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class psj extends nuo implements ServiceConnection {
    public final Executor a;
    public final Context b;
    public int c;
    public int d;
    public nuz e;
    public nuy f;
    public int g;
    public num h;
    public nun i;
    public final AmbientDelegate j;
    private final Executor k;
    private final psd l;

    public psj(Context context, AmbientDelegate ambientDelegate, psd psdVar) {
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new psh(0));
        this.a = new psi(new Handler(Looper.getMainLooper()), 0);
        this.c = 1;
        this.g = 1;
        this.b = context;
        this.j = ambientDelegate;
        this.l = psdVar;
        this.k = executorServiceNewSingleThreadExecutor;
    }

    private static boolean o(int i) {
        return i == 6 || i == 7 || i == 8;
    }

    private static boolean p(int i) {
        return i == 5;
    }

    @Override // defpackage.nup
    public final void b(byte[] bArr, nur nurVar) {
        this.a.execute(new lqd(this, bArr, nurVar, 19, (boolean[]) null));
    }

    public final int c() {
        prh.c();
        prh.d(l(), "Attempted to use lensServiceSession before ready.");
        return this.d;
    }

    public final void d() {
        prh.c();
        if (this.i == null) {
            this.g = 11;
            g(7);
        } else {
            this.g = 11;
            g(8);
        }
    }

    public final void e(byte[] bArr, nur nurVar) {
        prh.c();
        prh.d(k(), "Attempted to use lensServiceSession before ready.");
        nun nunVar = this.i;
        prh.e(nunVar);
        Parcel parcelA = nunVar.a();
        parcelA.writeByteArray(bArr);
        fbj.c(parcelA, nurVar);
        nunVar.B(2, parcelA);
    }

    public final void f() {
        prh.c();
        prh.d(k(), "Attempted to handover when not ready.");
        tpe tpeVar = (tpe) nut.a.m();
        if (!tpeVar.b.C()) {
            tpeVar.o();
        }
        nut nutVar = (nut) tpeVar.b;
        nutVar.c = 99;
        nutVar.b |= 1;
        tql tqlVar = nvb.a;
        tpc tpcVarM = nvc.a.m();
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        nvc nvcVar = (nvc) tpcVarM.b;
        nvcVar.b |= 1;
        nvcVar.c = true;
        tpeVar.aI(tqlVar, (nvc) tpcVarM.l());
        nut nutVar2 = (nut) tpeVar.l();
        try {
            nun nunVar = this.i;
            prh.e(nunVar);
            nunVar.e(nutVar2.h());
        } catch (RemoteException | SecurityException e) {
            Log.e("LensServiceConnImpl", "Unable to stop Lens service session.", e);
        }
        this.g = 12;
        g(8);
    }

    public final void g(int i) {
        prh.c();
        String.format("Transitioning from state %s to %s.", Integer.valueOf(this.c), Integer.valueOf(i));
        int i2 = this.c;
        this.c = i;
        if (p(i) && !p(i2)) {
            AmbientDelegate ambientDelegate = this.j;
            prh.c();
            ambientDelegate.B();
        }
        if (!o(i) || o(i2)) {
            return;
        }
        AmbientDelegate ambientDelegate2 = this.j;
        prh.c();
        ambientDelegate2.B();
    }

    public final boolean h() {
        return this.c == 2;
    }

    public final boolean i() {
        int i = this.c;
        return i == 3 || i == 4 || i == 5 || i == 7 || i == 8;
    }

    public final boolean j() {
        prh.c();
        return o(this.c);
    }

    public final boolean k() {
        prh.c();
        return p(this.c);
    }

    public final boolean l() {
        int i = this.c;
        return i == 5 || i == 8;
    }

    public final void m() {
        prh.c();
        if (h() || i()) {
            return;
        }
        g(2);
        this.l.a(new psb() { // from class: psg
            @Override // defpackage.psb
            public final void a(psk pskVar) {
                int i = pskVar.e;
                int iB = prh.b(i);
                psj psjVar = this.a;
                if (iB == 0 || iB != 2) {
                    int iB2 = prh.b(i);
                    if (iB2 == 0) {
                        iB2 = 1;
                    }
                    psjVar.g = iB2;
                    psjVar.g(6);
                    return;
                }
                Intent intent = new Intent("com.google.android.apps.gsa.publicsearch.IPublicSearchService");
                intent.setPackage("com.google.android.googlequicksearchbox");
                try {
                    if (psjVar.b.bindService(intent, psjVar, 65)) {
                        psjVar.g(3);
                        return;
                    }
                    Log.e("LensServiceConnImpl", "Unable to bind Lens service.");
                    psjVar.g = 11;
                    psjVar.g(7);
                } catch (SecurityException e) {
                    Log.e("LensServiceConnImpl", "Unable to bind Lens service due to security exception.", e);
                    psjVar.g = 11;
                    psjVar.g(7);
                }
            }
        });
    }

    public final int n() {
        prh.c();
        boolean z = true;
        if (!k() && !j()) {
            z = false;
        }
        prh.d(z, "Attempted to use ServerFlags before ready or dead.");
        return this.g;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        num numVar;
        prh.c();
        byte[] bArr = null;
        if (iBinder == null) {
            numVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.gsa.publicsearch.IPublicSearchService");
            numVar = iInterfaceQueryLocalInterface instanceof num ? (num) iInterfaceQueryLocalInterface : new num(iBinder);
        }
        this.h = numVar;
        this.k.execute(new pev(this, numVar, 5, bArr));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        prh.c();
        this.g = 11;
        g(7);
    }
}
