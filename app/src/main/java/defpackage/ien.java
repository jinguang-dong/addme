package defpackage;

import com.google.android.apps.camera.facemetadata.conversions.jni.HM.oUZhwRhE;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ien implements Runnable {
    public final peo a;
    public final pfu b;
    private final owf c;
    private final owf d;
    private final our e;
    private final Executor f;

    public ien(pfu pfuVar, Map map, owf owfVar, owf owfVar2, our ourVar, Executor executor) {
        this.b = pfuVar;
        peo peoVar = (peo) map.get(lcz.RAW_ULTRAWIDE);
        peoVar.getClass();
        this.a = peoVar;
        this.c = owfVar;
        this.d = owfVar2;
        this.e = ourVar;
        this.f = executor;
    }

    private final void a(owf owfVar, final boolean z, String str) {
        this.e.d(owfVar.dK(new pau() { // from class: iem
            @Override // defpackage.pau
            public final void a(Object obj) {
                if (((Boolean) obj).booleanValue() == z) {
                    ien ienVar = this.a;
                    shl shlVar = shx.a;
                    ienVar.b.i(ienVar.a, false);
                }
            }
        }, this.f));
    }

    @Override // java.lang.Runnable
    public final void run() {
        a(this.c, true, "standby");
        a(this.d, false, oUZhwRhE.JDWkdPOBnNqm);
    }
}
