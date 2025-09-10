package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bfu implements ayy {
    final /* synthetic */ bfv a;
    final /* synthetic */ Object b;
    final /* synthetic */ bga c;

    public bfu(bfv bfvVar, Object obj, bga bgaVar) {
        this.a = bfvVar;
        this.b = obj;
        this.c = bgaVar;
    }

    @Override // defpackage.ayy
    public final void a() {
        bfv bfvVar = this.a;
        zu zuVar = bfvVar.c;
        Object obj = this.b;
        Object objG = zuVar.g(obj);
        bga bgaVar = this.c;
        if (objG == bgaVar) {
            bfvVar.a(bgaVar, bfvVar.a, obj);
        }
    }
}
