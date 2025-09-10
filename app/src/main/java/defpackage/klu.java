package defpackage;

import android.hardware.camera2.CaptureResult;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class klu extends ojl {
    public static final sgv a = sgv.g("klu");
    public final pjp b;
    public final pjo c;
    private final owq d;
    private final Executor e;

    public klu(owq owqVar, pjp pjpVar, pjo pjoVar, Executor executor) {
        super((short[]) null);
        this.d = owqVar;
        this.b = pjpVar;
        this.c = pjoVar;
        this.e = executor;
    }

    @Override // defpackage.ojl
    public final void a(poe poeVar) {
        pjo pjoVar = this.c;
        if (!pjoVar.M()) {
            j(pjoVar.g());
            return;
        }
        String str = (String) poeVar.a(CaptureResult.LOGICAL_MULTI_CAMERA_ACTIVE_PHYSICAL_ID);
        if (str == null) {
            j(pjoVar.g());
        } else {
            this.e.execute(new kee(this, str, 4));
        }
    }

    public final void j(int i) {
        owq owqVar = this.d;
        if (i != ((Integer) owqVar.dL()).intValue()) {
            owqVar.dL();
            owqVar.a(Integer.valueOf(i));
        }
    }
}
