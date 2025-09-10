package defpackage;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.util.Log;
import com.google.android.gms.common.data.DataHolder;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class oql extends osp {
    public final /* synthetic */ oqm a;
    private volatile int b = -1;

    public oql(oqm oqmVar) {
        this.a = oqmVar;
    }

    private final boolean m(Runnable runnable) throws PackageManager.NameNotFoundException {
        int callingUid = Binder.getCallingUid();
        if (callingUid != this.b) {
            oqm oqmVar = this.a;
            if (!ots.a(oqmVar).b() || !lpa.x(oqmVar, callingUid, "com.google.android.wearable.app.cn")) {
                if (lpa.x(oqmVar, callingUid, "com.google.android.gms")) {
                    try {
                        PackageInfo packageInfo = oqmVar.getPackageManager().getPackageInfo("com.google.android.gms", 64);
                        oeg oegVarA = oeg.a(oqmVar);
                        if (packageInfo != null) {
                            if (!oeg.b(packageInfo, false)) {
                                if (oeg.b(packageInfo, true)) {
                                    if (!oef.b(oegVarA.c)) {
                                        Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
                                    }
                                }
                            }
                            this.b = callingUid;
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                }
                Log.e("WearableLS", a.bv(callingUid, "Caller is not GooglePlayServices; caller UID: "));
                return false;
            }
            this.b = callingUid;
        }
        oqm oqmVar2 = this.a;
        synchronized (oqmVar2.c) {
            if (oqmVar2.d) {
                return false;
            }
            oqmVar2.a.post(runnable);
            return true;
        }
    }

    @Override // defpackage.osq
    public final void b(orc orcVar) throws PackageManager.NameNotFoundException {
        m(new nzq(this, orcVar, 15, (char[]) null));
    }

    @Override // defpackage.osq
    public final void c(DataHolder dataHolder) {
        ooc oocVar = new ooc(dataHolder, 4, null);
        try {
            String.valueOf(dataHolder);
            int i = dataHolder.h;
            if (m(oocVar)) {
            }
        } finally {
            dataHolder.close();
        }
    }

    @Override // defpackage.osq
    public final void d(osy osyVar) throws PackageManager.NameNotFoundException {
        m(new nzq(this, osyVar, 14, (char[]) null));
    }

    @Override // defpackage.osq
    public final void e(osz oszVar) {
        ooc oocVar = new ooc(oszVar, 3);
        DataHolder dataHolder = oszVar.b;
        int i = dataHolder.h;
        if (m(oocVar)) {
            return;
        }
        dataHolder.close();
    }

    @Override // defpackage.osq
    public final void f(osy osyVar, osm osmVar) throws PackageManager.NameNotFoundException {
        m(new nzq(osyVar, osmVar, 13));
    }

    @Override // defpackage.osq
    public final void g() throws PackageManager.NameNotFoundException {
        m(new ndk(14));
    }

    @Override // defpackage.osq
    public final void h() throws PackageManager.NameNotFoundException {
        m(new ndk(13));
    }

    @Override // defpackage.osq
    public final void i() throws PackageManager.NameNotFoundException {
        m(new ndk(16));
    }

    @Override // defpackage.osq
    public final void j() throws PackageManager.NameNotFoundException {
        m(new ndk(15));
    }

    @Override // defpackage.osq
    public final void k() throws PackageManager.NameNotFoundException {
        m(new ndk(11));
    }

    @Override // defpackage.osq
    public final void l() throws PackageManager.NameNotFoundException {
        m(new ndk(12));
    }
}
