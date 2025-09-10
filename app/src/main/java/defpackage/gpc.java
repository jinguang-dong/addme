package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gpc extends dcb {
    @Override // defpackage.dcb
    protected final String a() {
        return "INSERT OR IGNORE INTO `HardwareHelpDialogCounts` (`reason`,`impressionsBeforeReboot`,`impressionsAfterReboot`,`rebootCount`) VALUES (?,?,?,?)";
    }

    @Override // defpackage.dcb
    protected final /* bridge */ /* synthetic */ void b(dey deyVar, Object obj) {
        got.d(deyVar, obj);
    }
}
