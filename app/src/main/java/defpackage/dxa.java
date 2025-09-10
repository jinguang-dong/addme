package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dxa extends ddx {
    public static final dxa c = new dxa();

    private dxa() {
        super(12, 13);
    }

    @Override // defpackage.ddx
    public final void a(dfa dfaVar) {
        dfaVar.g("UPDATE workspec SET required_network_type = 0 WHERE required_network_type IS NULL ");
        dfaVar.g("UPDATE workspec SET content_uri_triggers = x'' WHERE content_uri_triggers is NULL");
    }
}
