package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class goz extends dbz {
    @Override // defpackage.dbz
    protected final String a() {
        return "UPDATE OR ABORT `FatalErrorCounts` SET `cameraId` = ?,`failuresBeforeRebootDuringOpen` = ?,`failuresAfterRebootDuringOpen` = ?,`failuresBeforeRebootDuringSession` = ?,`failuresAfterRebootDuringSession` = ?,`lastFatalErrorTimestamp` = ?,`rebootCount` = ? WHERE `cameraId` = ?";
    }

    @Override // defpackage.dbz
    protected final /* bridge */ /* synthetic */ void b(dey deyVar, Object obj) {
        gow gowVar = (gow) obj;
        String str = gowVar.a;
        if (str == null) {
            deyVar.f(1);
        } else {
            deyVar.g(1, str);
        }
        deyVar.e(2, gowVar.b);
        deyVar.e(3, gowVar.c);
        deyVar.e(4, gowVar.d);
        deyVar.e(5, gowVar.e);
        deyVar.e(6, gowVar.f);
        deyVar.e(7, gowVar.g);
        if (str == null) {
            deyVar.f(8);
        } else {
            deyVar.g(8, str);
        }
    }
}
