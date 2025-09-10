package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class qxi implements rww {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ qxi(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r6v14, types: [java.lang.Object, rww] */
    @Override // defpackage.rww
    public final Object fr() {
        int i = this.b;
        if (i == 0) {
            int i2 = qxt.d;
            return qxa.a((Context) this.a);
        }
        int i3 = 0;
        if (i == 1) {
            Object obj = ((rcf) this.a).f;
            Context context = qxf.a;
            try {
                return rwc.j(((Context) obj).getPackageManager().getApplicationInfo("com.google.android.gms", 0));
            } catch (PackageManager.NameNotFoundException unused) {
                return rvk.a;
            }
        }
        if (i != 2) {
            syx syxVar = (syx) this.a.fr();
            syxVar.getClass();
            return syxVar.schedule(new qbl(7), 10000L, TimeUnit.MILLISECONDS);
        }
        Object obj2 = this.a;
        rak rakVar = (rak) obj2;
        syx syxVar2 = (syx) rakVar.e.fr();
        syxVar2.getClass();
        qqe qqeVar = (qqe) rakVar.d.fr();
        qqeVar.getClass();
        ogw ogwVar = new ogw();
        ogwVar.a = new onj(i3);
        ogwVar.b = new odl[]{onc.i};
        ogwVar.b();
        int i4 = 10;
        syu syuVarI = swz.i(swf.i(syn.v(qqe.d(((oet) qqeVar.a).f(ogwVar.a()))), qya.class, new qpl(i4), syxVar2), new qcj(obj2, i4), syxVar2);
        syuVarI.c(new qly(syuVarI, 13), syxVar2);
        return syuVarI;
    }
}
