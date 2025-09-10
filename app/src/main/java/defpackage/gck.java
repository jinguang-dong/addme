package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gck extends ojl {
    final /* synthetic */ gcm a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gck(gcm gcmVar) {
        super((short[]) null);
        this.a = gcmVar;
    }

    @Override // defpackage.ojl
    public final void dG(peo peoVar, long j) {
        gcm gcmVar = this.a;
        synchronized (gcmVar.c) {
            if (peoVar.equals(gcmVar.j)) {
                ((sgt) gcm.a.c().M(705)).u("onBufferLost in viewfinderStream => frame number: %d", j);
            } else if (peoVar.equals(gcmVar.k)) {
                ((sgt) gcm.a.c().M(704)).u("onBufferLost in recordingStream => frame number: %d", j);
            }
        }
    }
}
