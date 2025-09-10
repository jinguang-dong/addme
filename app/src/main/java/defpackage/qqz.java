package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qqz implements tzt {
    private final tzx a;
    private final /* synthetic */ int b;

    public qqz(tzx tzxVar, int i) {
        this.b = i;
        this.a = tzxVar;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [sgt, shi] */
    @Override // defpackage.uem, defpackage.uel
    public final /* synthetic */ Object a() throws PackageManager.NameNotFoundException {
        Looper looper;
        int i = this.b;
        if (i == 0) {
            return new qqy((rxc) this.a.a());
        }
        if (i == 1) {
            Context contextB = ((imm) this.a).b();
            PackageManager packageManager = contextB.getPackageManager();
            String packageName = contextB.getPackageName();
            try {
                PackageInfo packageInfo = packageManager.getPackageInfo(packageName, 0);
                return new qqv(packageInfo.versionName, packageInfo.versionCode);
            } catch (PackageManager.NameNotFoundException e) {
                ((sgt) ((sgt) qnj.a.c().i(e)).M((char) 5722)).v("Failed to get PackageInfo for: %s", packageName);
                return new qqv((String) null, 0);
            }
        }
        if (i == 2) {
            return new sfm((qqs) this.a.a());
        }
        if (i != 3) {
            if (i == 4) {
                return new qua(this.a);
            }
            if (i != 5) {
                return new sfm((qqs) this.a.a());
            }
            rwc rwcVar = (rwc) ((tzu) this.a).a;
            rvk rvkVar = rvk.a;
            return (qud) rwcVar.e(new qud(rvkVar, rvkVar));
        }
        rwc rwcVar2 = (rwc) ((tzu) this.a).a;
        if (rwcVar2.h()) {
            looper = (Looper) rwcVar2.c();
        } else {
            HandlerThread handlerThread = new HandlerThread("Primes-Jank", 10);
            handlerThread.start();
            looper = handlerThread.getLooper();
        }
        return new Handler(looper);
    }
}
