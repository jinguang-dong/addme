package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lav extends ojl {
    private final owq a;

    public lav(owq owqVar) {
        super((short[]) null);
        this.a = owqVar;
    }

    @Override // defpackage.ojl
    public final synchronized void a(poe poeVar) {
        if (nvm.c == null) {
            return;
        }
        p(poeVar);
    }

    final synchronized void p(poe poeVar) {
        float[] fArr = (float[]) poeVar.a(nvm.c);
        if (fArr != null) {
            owq owqVar = this.a;
            float fFloatValue = ((Float) owqVar.dL()).floatValue();
            float f = fArr[0];
            if (fFloatValue != f) {
                owqVar.a(Float.valueOf(f));
            }
        }
    }
}
