package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dxg extends ddx {
    public static final dxg c = new dxg();

    private dxg() {
        super(6, 7);
    }

    @Override // defpackage.ddx
    public final void a(dfa dfaVar) {
        dfaVar.g("\n    CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress`\n    BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`)\n    REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )\n    ");
    }
}
