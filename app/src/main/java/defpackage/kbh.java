package defpackage;

import android.os.Handler;
import com.google.android.apps.camera.jni.saliency.tLp.KsvNaXS;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class kbh implements kbr {
    public static final sgv a = sgv.g(KsvNaXS.qKQlEnrIqOjibgA);
    public final Handler b;
    private final kbr c;

    public kbh(kbr kbrVar, Handler handler) {
        this.c = kbrVar;
        this.b = handler;
    }

    @Override // defpackage.kbr
    public final int a() {
        return this.c.a();
    }

    @Override // defpackage.kbr
    public final void b(pdk pdkVar, kfl kflVar, int i, kbz kbzVar, kbq kbqVar) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        Object obj = new Object();
        this.b.postDelayed(new jnw(atomicBoolean, kbqVar, 20), obj, 10000L);
        this.c.b(pdkVar, kflVar, i, kbzVar, new kbg(this, obj, atomicBoolean, kbqVar));
    }

    @Override // defpackage.kbr
    public final boolean c(pdk pdkVar, lat latVar) {
        return true;
    }
}
