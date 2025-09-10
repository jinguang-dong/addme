package defpackage;

import com.google.android.apps.camera.ui.hotshot.jni.HotshotObjectDetector;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mwp implements pon {
    public static final sgv a = sgv.g("mwp");
    public final joc b;
    public final owf c;
    public final uem d;
    public HotshotObjectDetector e;
    public paq f;
    private final hpa i;
    private final owq j;
    private final hbj m;
    public int h = 3;
    private long k = 0;
    private long l = 0;
    public boolean g = false;

    public mwp(hpa hpaVar, joc jocVar, owq owqVar, owf owfVar, uem uemVar, our ourVar, hbj hbjVar) {
        this.i = hpaVar;
        this.b = jocVar;
        this.j = owqVar;
        this.c = owfVar;
        this.d = uemVar;
        this.m = hbjVar;
        ourVar.d(owfVar.dK(new mtd(this, 10), sxo.a));
    }

    public final void a() {
        ((Executor) this.d.a()).execute(new mvn(this, 2));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    @Override // defpackage.pon
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void eS() {
        /*
            Method dump skipped, instructions count: 1192
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mwp.eS():void");
    }
}
