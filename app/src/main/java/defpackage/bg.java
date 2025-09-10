package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bg implements pa {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public bg(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [bu, oh] */
    @Override // defpackage.pa
    public final /* synthetic */ Object a() {
        if (this.b == 0) {
            return this.a;
        }
        bm bmVar = (bm) this.a;
        ?? r0 = bmVar.B;
        return r0 instanceof oh ? r0.eq() : bmVar.requireActivity().h;
    }
}
