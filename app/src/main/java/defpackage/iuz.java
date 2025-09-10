package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class iuz implements iwo {
    final /* synthetic */ iwo a;
    final /* synthetic */ int b;
    final /* synthetic */ ivb c;

    public iuz(ivb ivbVar, iwo iwoVar, int i) {
        this.a = iwoVar;
        this.b = i;
        this.c = ivbVar;
    }

    @Override // defpackage.iwo
    public final void b(tht thtVar) {
        this.a.b(thtVar);
    }

    @Override // defpackage.iwo
    public final void e(boolean z) {
        this.a.e(false);
        ivb ivbVar = this.c;
        synchronized (ivbVar) {
            ivbVar.f.remove(Integer.valueOf(this.b));
        }
    }
}
