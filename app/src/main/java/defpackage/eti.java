package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eti implements etc {
    private final /* synthetic */ int a;

    public eti(int i) {
        this.a = i;
    }

    @Override // defpackage.etc
    public final /* synthetic */ int a(Object obj) {
        return this.a != 0 ? ((byte[]) obj).length : ((int[]) obj).length;
    }

    @Override // defpackage.etc
    public final int b() {
        return this.a != 0 ? 1 : 4;
    }

    @Override // defpackage.etc
    public final /* synthetic */ Object c(int i) {
        return this.a != 0 ? new byte[i] : new int[i];
    }
}
