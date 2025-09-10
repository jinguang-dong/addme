package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dyf extends ddx {
    public dyf() {
        super(20, 21);
    }

    @Override // defpackage.ddx
    public final void a(dfa dfaVar) {
        dfaVar.g("ALTER TABLE `WorkSpec` ADD COLUMN `required_network_request` BLOB NOT NULL DEFAULT x''");
    }
}
