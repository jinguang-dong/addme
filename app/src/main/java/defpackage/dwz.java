package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dwz extends ddx {
    public static final dwz c = new dwz();

    private dwz() {
        super(11, 12);
    }

    @Override // defpackage.ddx
    public final void a(dfa dfaVar) {
        dfaVar.g("ALTER TABLE workspec ADD COLUMN `out_of_quota_policy` INTEGER NOT NULL DEFAULT 0");
    }
}
