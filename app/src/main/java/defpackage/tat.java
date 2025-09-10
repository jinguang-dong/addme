package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.apps.camera.toast.vvJ.CGlJpiVWrCQOq;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class tat implements sji {
    private final /* synthetic */ int a;
    private final Object b;

    public tat(Context context, uem uemVar, int i) throws PackageManager.NameNotFoundException {
        this.a = i;
        try {
            this.b = new taq(context, new oeg(context, null), uemVar, context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName);
        } catch (PackageManager.NameNotFoundException e) {
            throw new AssertionError(CGlJpiVWrCQOq.pKjjIbZbk, e);
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.sji
    public final sif a(String str) {
        if (this.a != 0) {
            return (sif) this.b;
        }
        int i = sbp.d;
        sbk sbkVar = new sbk();
        int i2 = 0;
        while (true) {
            ?? r2 = this.b;
            if (i2 >= ((sex) r2).c) {
                return new tas(str, sbkVar.g());
            }
            sbkVar.h(((sji) r2.get(i2)).a(str));
            i2++;
        }
    }

    public tat(sji[] sjiVarArr, int i) {
        this.a = i;
        this.b = sbp.k(sjiVarArr);
    }
}
