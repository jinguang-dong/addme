package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class alr extends bij implements bwv {
    public float a = 1.0f;
    public boolean b = true;

    @Override // defpackage.bwv
    public final /* bridge */ /* synthetic */ Object de(Object obj) {
        alz alzVar = obj instanceof alz ? (alz) obj : null;
        if (alzVar == null) {
            alzVar = new alz(null);
        }
        alzVar.a = this.a;
        alzVar.b = this.b;
        return alzVar;
    }
}
