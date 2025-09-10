package defpackage;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ocw extends oet implements ocd {
    public static final AtomicBoolean a = new AtomicBoolean(false);

    public ocw(Context context) {
        mwq mwqVar = occ.l;
        oem oemVar = oen.a;
        oer oerVar = new oer();
        oerVar.b = new ojl();
        super(context, mwqVar, oemVar, oerVar.a());
    }

    public final oor a(oca ocaVar, ocn ocnVar) {
        ocv ocvVar = new ocv(this, ocaVar, this.h, ocnVar);
        super.h(2, ocvVar);
        return ojl.aA(ocvVar, new oin());
    }

    public final void b(ocr ocrVar) {
        if (ocrVar.a.isEmpty()) {
            ojl.Q(Status.a);
            return;
        }
        ogw ogwVar = new ogw();
        ogwVar.a = new ojb(ocrVar, 1);
        ogwVar.b = new odl[]{ock.a};
        ogwVar.b();
        e(ogwVar.a());
    }
}
