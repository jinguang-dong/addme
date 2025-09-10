package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gcl extends ojl {
    final /* synthetic */ szh a;
    final /* synthetic */ pdk b;
    final /* synthetic */ gcm c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gcl(gcm gcmVar, szh szhVar, pdk pdkVar) {
        super((short[]) null);
        this.a = szhVar;
        this.b = pdkVar;
        this.c = gcmVar;
    }

    @Override // defpackage.ojl
    public final void dI() {
        this.a.a(new IllegalStateException("Snapshot request is aborted"));
        this.b.close();
    }

    @Override // defpackage.ojl
    public final void dJ() {
        gcm gcmVar = this.c;
        synchronized (gcmVar.c) {
            try {
                peo peoVar = gcmVar.m;
                if (peoVar == null) {
                    this.a.a(new IllegalStateException("Snapshot is not available"));
                } else {
                    poj pojVarE = this.b.e(peoVar);
                    if (pojVarE == null) {
                        this.a.a(new IllegalStateException("Snapshot is null"));
                    } else if (!this.a.e(pojVarE)) {
                        pojVarE.close();
                    }
                }
            } finally {
                this.b.close();
            }
        }
    }
}
