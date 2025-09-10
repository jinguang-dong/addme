package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hfb extends dcb {
    @Override // defpackage.dcb
    protected final String a() {
        return "INSERT OR ABORT INTO `shot_log` (`sequence`,`shot_id`,`time_millis`,`message`) VALUES (nullif(?, 0),?,?,?)";
    }

    @Override // defpackage.dcb
    protected final /* bridge */ /* synthetic */ void b(dey deyVar, Object obj) {
        hfd hfdVar = (hfd) obj;
        deyVar.e(1, hfdVar.a);
        deyVar.e(2, hfdVar.b);
        deyVar.e(3, hfdVar.c);
        String str = hfdVar.d;
        if (str == null) {
            deyVar.f(4);
        } else {
            deyVar.g(4, str);
        }
    }
}
