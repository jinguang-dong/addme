package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class et implements gl {
    final /* synthetic */ eu a;
    private boolean b;

    public et(eu euVar) {
        this.a = euVar;
    }

    @Override // defpackage.gl
    public final void a(gb gbVar, boolean z) {
        if (this.b) {
            return;
        }
        this.b = true;
        eu euVar = this.a;
        euVar.c.c();
        euVar.a.onPanelClosed(108, gbVar);
        this.b = false;
    }

    @Override // defpackage.gl
    public final boolean b(gb gbVar) {
        this.a.a.onMenuOpened(108, gbVar);
        return true;
    }
}
