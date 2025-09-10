package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class nft implements Runnable {
    public final /* synthetic */ nfw a;

    public /* synthetic */ nft(nfw nfwVar) {
        this.a = nfwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final nfw nfwVar = this.a;
        if ((nfwVar.getWidth() > 0 && nfwVar.getHolder().getSurface().isValid()) || !nfwVar.isAttachedToWindow()) {
            nfwVar.post(new Runnable() { // from class: nfv
                @Override // java.lang.Runnable
                public final void run() {
                    nfwVar.b();
                }
            });
            return;
        }
        int i = nfwVar.c;
        if (i > 10) {
            ((sgt) nfw.a.c().M(5352)).v("%s: Giving up layout.", nfwVar.b);
            return;
        }
        nfwVar.c = i + 1;
        ((sgt) nfw.a.c().M(5351)).C("%s.requestLayoutUntilGettingSize: Requesting a relayout (attempts=%d).", nfwVar.b, nfwVar.c);
        nfwVar.invalidate();
        nfwVar.requestLayout();
        nfwVar.getParent().requestLayout();
        nfw.a(new nft(nfwVar));
    }
}
