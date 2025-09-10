package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dxh extends ddx {
    public static final dxh c = new dxh();

    private dxh() {
        super(7, 8);
    }

    @Override // defpackage.ddx
    public final void a(dfa dfaVar) {
        dfaVar.g("\n    CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `workspec`(`period_start_time`)\n    ");
    }
}
