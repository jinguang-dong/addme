package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class kbd implements jzf {
    final /* synthetic */ kbe a;
    private final jzf b;
    private boolean c = false;

    public kbd(kbe kbeVar, jzf jzfVar) {
        this.a = kbeVar;
        this.b = jzfVar;
    }

    @Override // defpackage.jzf
    public final synchronized boolean a(poj pojVar) {
        boolean zA;
        zA = false;
        try {
            try {
                if (this.c) {
                    ((sgt) kbe.a.c().M(3209)).s("Attempting to enqueue image on closed sink!");
                } else {
                    zA = this.b.a(pojVar);
                }
            } catch (RuntimeException e) {
                ((sgt) ((sgt) kbe.a.b().i(e)).M(3210)).s("Could not encode out image");
            }
        } finally {
        }
        return zA;
    }

    @Override // defpackage.jzf, defpackage.paq, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.c) {
            return;
        }
        this.b.close();
        this.c = true;
        this.a.d();
    }
}
