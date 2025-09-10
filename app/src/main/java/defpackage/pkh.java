package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class pkh implements pon {
    final /* synthetic */ pkj a;
    private final pon b;

    public pkh(pkj pkjVar, pon ponVar) {
        this.a = pkjVar;
        this.b = ponVar;
    }

    @Override // defpackage.pon
    public final void eS() {
        pkj pkjVar = this.a;
        synchronized (pkjVar.a) {
            if (pkjVar.b) {
                pkjVar.j();
            } else {
                this.b.eS();
            }
        }
    }
}
