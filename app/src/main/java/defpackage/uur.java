package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uur implements uhb, uhq {
    private final uhb a;
    private final uhf b;

    public uur(uhb uhbVar, uhf uhfVar) {
        this.a = uhbVar;
        this.b = uhfVar;
    }

    @Override // defpackage.uhq
    public final uhq cK() {
        uhb uhbVar = this.a;
        if (uhbVar instanceof uhq) {
            return (uhq) uhbVar;
        }
        return null;
    }

    @Override // defpackage.uhb
    public final void fW(Object obj) {
        this.a.fW(obj);
    }

    @Override // defpackage.uhb
    public final uhf q() {
        return this.b;
    }

    @Override // defpackage.uhq
    public final void cL() {
    }
}
