package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class vk implements vj {
    final /* synthetic */ vm a;
    private final uly b = new uly(false, umc.a);

    public vk(vm vmVar) {
        this.a = vmVar;
    }

    @Override // defpackage.vj
    public final boolean a() {
        return this.b.a();
    }

    @Override // defpackage.vj
    public final void b() {
        if (this.b.b()) {
            vm vmVar = this.a;
            synchronized (vmVar.b) {
                int i = vmVar.c - 1;
                vmVar.c = i;
                if (i == 0 && !vmVar.e) {
                    vmVar.a();
                }
            }
        }
    }
}
