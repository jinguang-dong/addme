package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dyh extends ddx {
    public dyh() {
        super(23, 24);
    }

    @Override // defpackage.ddx
    public final void a(dfa dfaVar) {
        dfaVar.g("ALTER TABLE `WorkSpec` ADD COLUMN `backoff_on_system_interruptions` INTEGER DEFAULT NULL");
    }
}
