package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dxe extends ddx {
    public static final dxe c = new dxe();

    private dxe() {
        super(3, 4);
    }

    @Override // defpackage.ddx
    public final void a(dfa dfaVar) {
        dfaVar.g("\n    UPDATE workspec SET schedule_requested_at = 0\n    WHERE state NOT IN (2, 3, 5)\n        AND schedule_requested_at = -1\n        AND interval_duration <> 0\n    ");
    }
}
