package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dxf extends ddx {
    public static final dxf c = new dxf();

    private dxf() {
        super(4, 5);
    }

    @Override // defpackage.ddx
    public final void a(dfa dfaVar) {
        dfaVar.g("ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1");
        dfaVar.g("ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1");
    }
}
