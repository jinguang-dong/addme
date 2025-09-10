package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dxi extends ddx {
    public static final dxi c = new dxi();

    private dxi() {
        super(8, 9);
    }

    @Override // defpackage.ddx
    public final void a(dfa dfaVar) {
        dfaVar.g("ALTER TABLE workspec ADD COLUMN `run_in_foreground` INTEGER NOT NULL DEFAULT 0");
    }
}
