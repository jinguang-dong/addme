package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gov extends dcb {
    @Override // defpackage.dcb
    protected final String a() {
        return "INSERT OR REPLACE INTO `EnumerationErrorCounts` (`errorCode`,`failuresBeforeReboot`,`failuresAfterReboot`,`rebootCount`,`lastFailureTimestamp`) VALUES (?,?,?,?,?)";
    }

    @Override // defpackage.dcb
    protected final /* synthetic */ void b(dey deyVar, Object obj) {
        got.c(deyVar, (gos) obj);
    }
}
