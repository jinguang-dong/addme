package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uhk extends uhp {
    final /* synthetic */ uiu a;
    final /* synthetic */ Object b;
    private int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uhk(uhb uhbVar, uhf uhfVar, uiu uiuVar, Object obj) {
        super(uhbVar, uhfVar);
        this.a = uiuVar;
        this.b = obj;
    }

    @Override // defpackage.uhn
    protected final Object b(Object obj) {
        int i = this.c;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.c = 2;
            rnt.aN(obj);
            return obj;
        }
        this.c = 1;
        rnt.aN(obj);
        uiu uiuVar = this.a;
        ukc.e(uiuVar, 2);
        return uiuVar.a(this.b, this);
    }
}
