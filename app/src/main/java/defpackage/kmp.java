package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kmp extends oww {
    private final sbv a;
    private final sbv b;
    private final lcy c;

    public kmp(owf owfVar, sbv sbvVar, sbv sbvVar2, lcy lcyVar) {
        super(owfVar);
        this.a = sbvVar;
        this.b = sbvVar2;
        this.c = lcyVar;
    }

    @Override // defpackage.oww
    protected final /* bridge */ /* synthetic */ Object d(Object obj) {
        lcy lcyVar = (lcy) this.a.get((String) obj);
        if (lcyVar == null) {
            lcyVar = this.c;
        }
        sbv sbvVar = this.b;
        kmz kmzVar = (kmz) sbvVar.get(lcyVar);
        if (kmzVar == null) {
            kmzVar = (kmz) sbvVar.get(this.c);
        }
        kmzVar.getClass();
        return kmzVar;
    }
}
