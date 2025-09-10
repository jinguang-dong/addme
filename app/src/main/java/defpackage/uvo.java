package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class uvo implements Runnable {
    final /* synthetic */ uvp a;
    private Runnable b;

    public uvo(uvp uvpVar, Runnable runnable) {
        this.a = uvpVar;
        this.b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = 0;
        while (true) {
            try {
                this.b.run();
            } catch (Throwable th) {
                ujo.d(uhg.a, th);
            }
            uvp uvpVar = this.a;
            Runnable runnableE = uvpVar.e();
            if (runnableE == null) {
                return;
            }
            try {
                this.b = runnableE;
                i++;
                if (i >= 16) {
                    una unaVar = uvpVar.a;
                    if (uvh.c(unaVar, uvpVar)) {
                        uvh.b(unaVar, uvpVar, this);
                        return;
                    }
                }
            } catch (Throwable th2) {
                uvp uvpVar2 = this.a;
                synchronized (uvpVar2.c) {
                    uvpVar2.b.a();
                    throw th2;
                }
            }
        }
    }
}
