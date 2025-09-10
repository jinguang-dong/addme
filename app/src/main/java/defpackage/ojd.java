package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ojd extends oet implements oex {
    private static final mwq a;
    private static final ojl l;

    static {
        ojc ojcVar = new ojc();
        l = ojcVar;
        a = new mwq("ClientTelemetry.API", ojcVar, (char[]) null);
    }

    public ojd(Context context, oiw oiwVar) {
        super(context, a, oiwVar, oes.a);
    }

    public final oor a(oiv oivVar) {
        ogw ogwVar = new ogw();
        ogwVar.b = new odl[]{odi.a};
        ogwVar.b();
        ogwVar.a = new ojb(oivVar, 0);
        return e(ogwVar.a());
    }
}
